package io.agora.utils2.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.RouteInfo;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Process;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import com.amazonaws.services.s3.internal.Constants;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class ConnectivityUtility {
    private static final boolean DEBUG = false;
    public static final String PREFERENCE_ACCESS_NETWORK_PERMISSION_KEY = "rtc_access_network_state_permission";
    public static final String PREFERENCE_CHANGE_NETWORK_PERMISSION_KEY = "rtc_change_network_state_permission";
    private static final String TAG = "ConnectivityUtility";
    private static Method getTransportTypesMethod;
    private BroadcastReceiver connectionRecevier;
    private ConnectivityManager connectivityManager;
    private AgoraNetworkInfo defaultNetworkInfo;
    private SharedPreferences rtcSharedPreferences;
    private TelephonyManager telephonyManager;
    private WifiManager wifiManager;
    private CustomNetworkCallback callback = null;
    private VpnNetworkCallback vpnCallback = null;
    private ConnectivityManager.NetworkCallback cellularNetworkCallback = null;
    private Boolean vpnEnabled = null;
    private Boolean hasChangeNetworkStatePermission = null;
    private Boolean hasAccessNetworkStatePermission = null;
    private HashMap<String, AgoraNetworkInfo> activeNetworkInfoHashMap = new HashMap<>();
    private HashMap<Integer, AgoraNetworkInfo> networkInfoByCategoryHashMap = new HashMap<>();
    private CopyOnWriteArrayList<NetworkListener> networkListeners = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: io.agora.utils2.internal.ConnectivityUtility$1, reason: invalid class name */
    class AnonymousClass1 extends BroadcastReceiver {
        AnonymousClass1() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ConnectivityUtility.logD("onReceive: CONNECTIVITY_ACTION + " + intent.getBooleanExtra("FAILOVER_CONNECTION", false) + " EXTRA_NO_CONNECTIVITY " + intent.getBooleanExtra("EXTRA_NO_CONNECTIVITY", false));
            Bundle extras = intent.getExtras();
            if (extras != null) {
                NetworkInfo networkInfo = (NetworkInfo) extras.getParcelable("networkInfo");
                ConnectivityUtility.logD("onReceive:  networkInfo " + networkInfo.toString());
                AgoraNetworkInfo agoraNetworkInfoBuildFromNetworkInfo = AgoraNetworkInfo.buildFromNetworkInfo(networkInfo);
                synchronized (ConnectivityUtility.this.activeNetworkInfoHashMap) {
                    ConnectivityUtility.this.activeNetworkInfoHashMap.put(agoraNetworkInfoBuildFromNetworkInfo.networkInfo.getTypeName(), agoraNetworkInfoBuildFromNetworkInfo);
                }
                Logging.i(ConnectivityUtility.TAG, "Network onReceive " + agoraNetworkInfoBuildFromNetworkInfo.toString());
            }
        }
    }

    public static class AgoraNetworkInfo {
        public String gatewayIp;
        public String interfaceName;
        public String localAddressIpV4;
        public String localAddressIpV6;
        public Network network;
        public NetworkInfo networkInfo;
        public int transportType;
        public int rssi = 0;
        public int signalLevel = 0;
        public int linkSpeed = 0;
        public int frequency = 0;
        public int networkSubtype = 0;
        public int networkType = 0;

        public AgoraNetworkInfo() {
        }

        public static AgoraNetworkInfo buildFromNetwork(@NonNull ConnectivityManager connectivityManager, @NonNull TelephonyManager telephonyManager, @NonNull Network network) {
            AgoraNetworkInfo agoraNetworkInfo = new AgoraNetworkInfo();
            agoraNetworkInfo.network = network;
            int transportType = ConnectivityUtility.getTransportType(connectivityManager.getNetworkCapabilities(network));
            agoraNetworkInfo.transportType = transportType;
            agoraNetworkInfo.networkType = determineNetworkType(telephonyManager, transportType);
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties != null) {
                agoraNetworkInfo.updateLinkProperties(linkProperties);
            }
            return agoraNetworkInfo;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[Catch: SocketException -> 0x0087, TryCatch #0 {SocketException -> 0x0087, blocks: (B:13:0x0032, B:15:0x0041, B:17:0x0058, B:19:0x0064, B:21:0x0068, B:22:0x006f, B:24:0x0073, B:26:0x0077, B:27:0x007e, B:29:0x0082), top: B:34:0x0032 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static io.agora.utils2.internal.ConnectivityUtility.AgoraNetworkInfo buildFromNetworkInfo(@androidx.annotation.NonNull android.net.NetworkInfo r9) {
            /*
                io.agora.utils2.internal.ConnectivityUtility$AgoraNetworkInfo r0 = new io.agora.utils2.internal.ConnectivityUtility$AgoraNetworkInfo
                r0.<init>()
                r0.networkInfo = r9
                int r1 = r9.getSubtype()
                r0.networkSubtype = r1
                int r9 = r9.getType()
                r1 = 0
                if (r9 == 0) goto L29
                r2 = 1
                if (r9 == r2) goto L25
                r3 = 9
                if (r9 == r3) goto L1f
                r9 = -1
            L1c:
                r0.networkType = r9
                goto L32
            L1f:
                r9 = 3
                r0.transportType = r9
                r0.networkType = r2
                goto L32
            L25:
                r0.transportType = r2
                r9 = 2
                goto L1c
            L29:
                r0.transportType = r1
                int r9 = r0.networkSubtype
                int r9 = io.agora.utils2.internal.Connectivity.getNetworkTypeFromTelephonyNetworkType(r9)
                goto L1c
            L32:
                java.util.Enumeration r9 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L87
                java.util.ArrayList r9 = java.util.Collections.list(r9)     // Catch: java.net.SocketException -> L87
                int r2 = r9.size()     // Catch: java.net.SocketException -> L87
                r3 = r1
            L3f:
                if (r3 >= r2) goto L86
                java.lang.Object r4 = r9.get(r3)     // Catch: java.net.SocketException -> L87
                int r3 = r3 + 1
                java.net.NetworkInterface r4 = (java.net.NetworkInterface) r4     // Catch: java.net.SocketException -> L87
                java.util.Enumeration r4 = r4.getInetAddresses()     // Catch: java.net.SocketException -> L87
                java.util.ArrayList r4 = java.util.Collections.list(r4)     // Catch: java.net.SocketException -> L87
                int r5 = r4.size()     // Catch: java.net.SocketException -> L87
                r6 = r1
            L56:
                if (r6 >= r5) goto L7e
                java.lang.Object r7 = r4.get(r6)     // Catch: java.net.SocketException -> L87
                int r6 = r6 + 1
                java.net.InetAddress r7 = (java.net.InetAddress) r7     // Catch: java.net.SocketException -> L87
                java.lang.String r8 = r0.localAddressIpV4     // Catch: java.net.SocketException -> L87
                if (r8 != 0) goto L6f
                boolean r8 = r7 instanceof java.net.Inet4Address     // Catch: java.net.SocketException -> L87
                if (r8 == 0) goto L6f
                java.lang.String r7 = r7.getHostAddress()     // Catch: java.net.SocketException -> L87
                r0.localAddressIpV4 = r7     // Catch: java.net.SocketException -> L87
                goto L56
            L6f:
                java.lang.String r8 = r0.localAddressIpV6     // Catch: java.net.SocketException -> L87
                if (r8 != 0) goto L56
                boolean r8 = r7 instanceof java.net.Inet6Address     // Catch: java.net.SocketException -> L87
                if (r8 == 0) goto L56
                java.lang.String r7 = r7.getHostAddress()     // Catch: java.net.SocketException -> L87
                r0.localAddressIpV6 = r7     // Catch: java.net.SocketException -> L87
                goto L56
            L7e:
                java.lang.String r4 = r0.localAddressIpV4     // Catch: java.net.SocketException -> L87
                if (r4 == 0) goto L3f
                java.lang.String r4 = r0.localAddressIpV6     // Catch: java.net.SocketException -> L87
                if (r4 == 0) goto L3f
            L86:
                return r0
            L87:
                java.lang.String r9 = io.agora.utils2.internal.ConnectivityUtility.access$000()
                java.lang.String r1 = "get inetaddress failed"
                io.agora.utils2.internal.Logging.e(r9, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.internal.ConnectivityUtility.AgoraNetworkInfo.buildFromNetworkInfo(android.net.NetworkInfo):io.agora.utils2.internal.ConnectivityUtility$AgoraNetworkInfo");
        }

        public static int determineNetworkType(TelephonyManager telephonyManager, int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return i11 != 3 ? -1 : 1;
                }
                return 2;
            }
            try {
                int networkType = telephonyManager.getNetworkType();
                if (networkType == 0) {
                    Logging.e(ConnectivityUtility.TAG, "seems app has no permission to get network type, use LTE as default");
                    networkType = 13;
                }
                return Connectivity.getNetworkTypeFromTelephonyNetworkType(networkType);
            } catch (Exception e11) {
                Logging.e(ConnectivityUtility.TAG, "Failed to get cellular network type return 4G by default", e11);
                return 5;
            }
        }

        public String toString() {
            return "AgoraNetworkInfo{network=" + this.network + ", networkInfo=" + this.networkInfo + ", transportType=" + this.transportType + ", localAddressIpV4='" + this.localAddressIpV4 + "', localAddressIpV6='" + this.localAddressIpV6 + "', rssi=" + this.rssi + ", signalLevel=" + this.signalLevel + ", linkSpeed=" + this.linkSpeed + ", frequency=" + this.frequency + ", networkSubtype=" + this.networkSubtype + ", networkType=" + this.networkType + ", interfaceName='" + this.interfaceName + "', gatewayIp='" + this.gatewayIp + "'}";
        }

        public void updateLinkProperties(@NonNull LinkProperties linkProperties) {
            if (linkProperties == null) {
                return;
            }
            List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
            if (linkAddresses != null) {
                Iterator<LinkAddress> it = linkAddresses.iterator();
                while (it.hasNext()) {
                    InetAddress address = it.next().getAddress();
                    if (address != null) {
                        if (this.localAddressIpV4 == null && (address instanceof Inet4Address)) {
                            this.localAddressIpV4 = address.getHostAddress();
                        } else if (this.localAddressIpV6 == null && (address instanceof Inet6Address)) {
                            this.localAddressIpV6 = address.getHostAddress();
                        }
                    }
                }
            }
            List<RouteInfo> routes = linkProperties.getRoutes();
            if (routes != null && !routes.isEmpty() && routes.get(0).getGateway() != null) {
                this.gatewayIp = routes.get(0).getGateway().getHostAddress();
            }
            this.interfaceName = linkProperties.getInterfaceName();
        }

        public void updateNetworkCapabilities(@NonNull NetworkCapabilities networkCapabilities, WifiInfo wifiInfo) {
            if (this.transportType == 1) {
                TransportInfo transportInfo = networkCapabilities.getTransportInfo();
                if (transportInfo instanceof WifiInfo) {
                    updateWifiInfo((WifiInfo) transportInfo);
                }
            }
        }

        public void updateWifiInfo(@NonNull WifiInfo wifiInfo) {
            int i11;
            ConnectivityUtility.logD("updateWifiInfo");
            if (wifiInfo != null) {
                this.rssi = wifiInfo.getRssi();
                this.linkSpeed = wifiInfo.getLinkSpeed();
                int frequency = wifiInfo.getFrequency();
                this.frequency = frequency;
                if (frequency < 5000) {
                    i11 = frequency >= 2400 ? 100 : 101;
                    this.signalLevel = WifiManager.calculateSignalLevel(this.rssi, 5);
                    ConnectivityUtility.logD(String.format("updateWifiInfo: rssi=%d linkSpeed=%d frequency=%d networkSubtype=%d signalLevel=%d", Integer.valueOf(this.rssi), Integer.valueOf(this.linkSpeed), Integer.valueOf(this.frequency), Integer.valueOf(this.networkSubtype), Integer.valueOf(this.signalLevel)));
                }
                this.networkSubtype = i11;
                this.signalLevel = WifiManager.calculateSignalLevel(this.rssi, 5);
                ConnectivityUtility.logD(String.format("updateWifiInfo: rssi=%d linkSpeed=%d frequency=%d networkSubtype=%d signalLevel=%d", Integer.valueOf(this.rssi), Integer.valueOf(this.linkSpeed), Integer.valueOf(this.frequency), Integer.valueOf(this.networkSubtype), Integer.valueOf(this.signalLevel)));
            }
        }

        public AgoraNetworkInfo(Network network, int i11, String str, String str2) {
            this.network = network;
            this.transportType = i11;
            this.localAddressIpV4 = str;
            this.localAddressIpV6 = str2;
        }
    }

    public interface CellularNetworkChangeListener {
        void onCellularNetworkChanged(int i11);
    }

    public class CustomNetworkCallback extends ConnectivityManager.NetworkCallback {
        public CustomNetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            super.onAvailable(network);
            ConnectivityUtility.logD("onAvailable: " + ConnectivityUtility.this.getNetworkDescription(network));
            AgoraNetworkInfo agoraNetworkInfoBuildFromNetwork = AgoraNetworkInfo.buildFromNetwork(ConnectivityUtility.this.connectivityManager, ConnectivityUtility.this.telephonyManager, network);
            synchronized (ConnectivityUtility.this.activeNetworkInfoHashMap) {
                try {
                    if (!ConnectivityUtility.this.activeNetworkInfoHashMap.containsKey(network.toString())) {
                        ConnectivityUtility.this.activeNetworkInfoHashMap.put(network.toString(), agoraNetworkInfoBuildFromNetwork);
                    }
                    if (ConnectivityUtility.this.defaultNetworkInfo == null || agoraNetworkInfoBuildFromNetwork.transportType > ConnectivityUtility.this.defaultNetworkInfo.transportType) {
                        ConnectivityUtility.this.defaultNetworkInfo = agoraNetworkInfoBuildFromNetwork;
                    }
                } finally {
                }
            }
            Logging.i(ConnectivityUtility.TAG, "Network onAvailable: " + agoraNetworkInfoBuildFromNetwork.toString());
            synchronized (ConnectivityUtility.this.networkListeners) {
                try {
                    for (NetworkListener networkListener : ConnectivityUtility.this.networkListeners) {
                        Logging.i(ConnectivityUtility.TAG, "Network onDefaultNetworkChanged: " + agoraNetworkInfoBuildFromNetwork.toString());
                        networkListener.onDefaultNetworkChanged();
                    }
                } finally {
                }
            }
            synchronized (ConnectivityUtility.this.networkInfoByCategoryHashMap) {
                ConnectivityUtility.this.networkInfoByCategoryHashMap.put(Integer.valueOf(agoraNetworkInfoBuildFromNetwork.transportType), agoraNetworkInfoBuildFromNetwork);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            ConnectivityUtility.logD("onCapabilitiesChanged: " + networkCapabilities.toString());
            synchronized (ConnectivityUtility.this.activeNetworkInfoHashMap) {
                try {
                    if (ConnectivityUtility.this.activeNetworkInfoHashMap.containsKey(network.toString())) {
                        ((AgoraNetworkInfo) ConnectivityUtility.this.activeNetworkInfoHashMap.get(network.toString())).updateNetworkCapabilities(networkCapabilities, null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(@NonNull Network network, @NonNull LinkProperties linkProperties) {
            super.onLinkPropertiesChanged(network, linkProperties);
            ConnectivityUtility.logD("onLinkPropertiesChanged: " + network.toString() + " properties " + linkProperties.toString());
            synchronized (ConnectivityUtility.this.activeNetworkInfoHashMap) {
                try {
                    if (ConnectivityUtility.this.activeNetworkInfoHashMap.containsKey(network.toString())) {
                        ((AgoraNetworkInfo) ConnectivityUtility.this.activeNetworkInfoHashMap.get(network.toString())).updateLinkProperties(linkProperties);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            AgoraNetworkInfo agoraNetworkInfo;
            boolean z11;
            super.onLost(network);
            Logging.i(ConnectivityUtility.TAG, "Network onLost: " + ConnectivityUtility.this.getNetworkDescription(network));
            synchronized (ConnectivityUtility.this.activeNetworkInfoHashMap) {
                try {
                    if (ConnectivityUtility.this.activeNetworkInfoHashMap.containsKey(network.toString())) {
                        agoraNetworkInfo = (AgoraNetworkInfo) ConnectivityUtility.this.activeNetworkInfoHashMap.get(network.toString());
                        ConnectivityUtility.this.activeNetworkInfoHashMap.remove(network.toString());
                        Logging.i(ConnectivityUtility.TAG, "Network onLost: " + agoraNetworkInfo.toString());
                    } else {
                        agoraNetworkInfo = null;
                    }
                    AgoraNetworkInfo agoraNetworkInfo2 = ConnectivityUtility.this.activeNetworkInfoHashMap.size() > 0 ? (AgoraNetworkInfo) ConnectivityUtility.this.activeNetworkInfoHashMap.values().iterator().next() : null;
                    if ((ConnectivityUtility.this.defaultNetworkInfo == null || (agoraNetworkInfo2 != null && ConnectivityUtility.this.defaultNetworkInfo.transportType == agoraNetworkInfo2.transportType)) && (ConnectivityUtility.this.defaultNetworkInfo != null || agoraNetworkInfo2 == null)) {
                        z11 = false;
                    } else {
                        ConnectivityUtility.this.defaultNetworkInfo = agoraNetworkInfo2;
                        String str = ConnectivityUtility.TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Network onDefaultNetworkChanged: ");
                        sb2.append(ConnectivityUtility.this.defaultNetworkInfo != null ? ConnectivityUtility.this.defaultNetworkInfo.toString() : Constants.NULL_VERSION_ID);
                        Logging.i(str, sb2.toString());
                        z11 = true;
                    }
                } finally {
                }
            }
            if (z11) {
                synchronized (ConnectivityUtility.this.networkListeners) {
                    try {
                        Iterator it = ConnectivityUtility.this.networkListeners.iterator();
                        while (it.hasNext()) {
                            ((NetworkListener) it.next()).onDefaultNetworkChanged();
                        }
                    } finally {
                    }
                }
            }
            if (agoraNetworkInfo == null || agoraNetworkInfo.transportType == 0) {
                return;
            }
            synchronized (ConnectivityUtility.this.networkInfoByCategoryHashMap) {
                try {
                    if (ConnectivityUtility.this.networkInfoByCategoryHashMap.containsKey(Integer.valueOf(agoraNetworkInfo.transportType))) {
                        ConnectivityUtility.this.networkInfoByCategoryHashMap.remove(Integer.valueOf(agoraNetworkInfo.transportType));
                    }
                } finally {
                }
            }
        }
    }

    public interface NetworkListener {
        void onDefaultNetworkChanged();
    }

    public class VpnNetworkCallback extends ConnectivityManager.NetworkCallback {
        public VpnNetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            super.onAvailable(network);
            NetworkCapabilities networkCapabilities = ConnectivityUtility.this.connectivityManager.getNetworkCapabilities(network);
            ConnectivityUtility.this.vpnEnabled = Boolean.valueOf(networkCapabilities == null ? false : networkCapabilities.hasTransport(4));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            super.onLost(network);
            ConnectivityUtility.this.vpnEnabled = Boolean.FALSE;
        }
    }

    public ConnectivityUtility(Context context) {
        initialize(context);
    }

    private boolean checkPermission(Context context, Boolean bool, String str, String str2) {
        if (bool == null) {
            if (this.rtcSharedPreferences.contains(str)) {
                bool = Boolean.valueOf(this.rtcSharedPreferences.getBoolean(str, false));
            } else {
                boolean z11 = context.checkPermission(str2, Process.myPid(), Process.myUid()) == 0;
                bool = Boolean.valueOf(z11);
                SharedPreferences.Editor editorEdit = this.rtcSharedPreferences.edit();
                editorEdit.putBoolean(str, z11);
                editorEdit.apply();
            }
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getNetworkDescription(Network network) {
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities == null) {
            return "id:" + network.toString();
        }
        return "id:" + network.toString() + " capabilities:" + networkCapabilities.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getTransportType(NetworkCapabilities networkCapabilities) {
        String str;
        String str2;
        if (networkCapabilities == null) {
            str = TAG;
            str2 = "NetworkCapabilities is null, returning TRANSPORT_WIFI by default";
        } else {
            int[] iArr = {3, 1, 0};
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (networkCapabilities.hasTransport(i12)) {
                    return i12;
                }
            }
            str = TAG;
            str2 = "No transport type found, returning TRANSPORT_WIFI by default";
        }
        Logging.e(str, str2);
        return 1;
    }

    private void initialize(Context context) {
        if (context == null) {
            return;
        }
        this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.telephonyManager = (TelephonyManager) context.getSystemService("phone");
        this.rtcSharedPreferences = context.getSharedPreferences("shengwang_rtc_sdk", 0);
        this.wifiManager = (WifiManager) context.getSystemService("wifi");
        if (!checkAccessNetworkStatePermission(context)) {
            Logging.e(TAG, "startMonitor has no ACCESS_NETWORK_STATE permission");
            return;
        }
        if (this.telephonyManager == null || this.connectivityManager == null || this.wifiManager == null) {
            Logging.e(TAG, "startMonitor get system service failed");
        } else {
            this.rtcSharedPreferences = context.getSharedPreferences("shengwang_rtc_sdk", 0);
            updateNetworkInfo(this.connectivityManager.getActiveNetwork());
        }
    }

    private void updateNetworkInfo(Network network) {
        AgoraNetworkInfo agoraNetworkInfoBuildFromNetwork;
        if (network == null || (agoraNetworkInfoBuildFromNetwork = AgoraNetworkInfo.buildFromNetwork(this.connectivityManager, this.telephonyManager, network)) == null) {
            return;
        }
        agoraNetworkInfoBuildFromNetwork.networkType = AgoraNetworkInfo.determineNetworkType(this.telephonyManager, agoraNetworkInfoBuildFromNetwork.transportType);
        updateNetworkMaps(network, agoraNetworkInfoBuildFromNetwork);
        if (agoraNetworkInfoBuildFromNetwork.transportType == 1) {
            updateWifiCapabilities(network, agoraNetworkInfoBuildFromNetwork);
        }
        synchronized (this.activeNetworkInfoHashMap) {
            this.defaultNetworkInfo = agoraNetworkInfoBuildFromNetwork;
        }
    }

    private void updateNetworkMaps(Network network, AgoraNetworkInfo agoraNetworkInfo) {
        synchronized (this.activeNetworkInfoHashMap) {
            logD("startMonitor: put active network to map " + network.toString());
            this.activeNetworkInfoHashMap.put(network.toString(), agoraNetworkInfo);
        }
        synchronized (this.networkInfoByCategoryHashMap) {
            this.networkInfoByCategoryHashMap.put(Integer.valueOf(agoraNetworkInfo.transportType), agoraNetworkInfo);
        }
    }

    private void updateWifiCapabilities(Network network, AgoraNetworkInfo agoraNetworkInfo) {
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities == null) {
            return;
        }
        TransportInfo transportInfo = networkCapabilities.getTransportInfo();
        if (transportInfo instanceof WifiInfo) {
            agoraNetworkInfo.updateWifiInfo((WifiInfo) transportInfo);
        }
    }

    public void addNetworkListener(NetworkListener networkListener) {
        if (networkListener != null) {
            this.networkListeners.addIfAbsent(networkListener);
        }
    }

    public boolean checkAccessNetworkStatePermission(Context context) {
        return checkPermission(context, this.hasAccessNetworkStatePermission, PREFERENCE_ACCESS_NETWORK_PERMISSION_KEY, "android.permission.ACCESS_NETWORK_STATE");
    }

    public boolean checkChangeNetworkStatePermission(Context context) {
        return checkPermission(context, this.hasChangeNetworkStatePermission, PREFERENCE_CHANGE_NETWORK_PERMISSION_KEY, "android.permission.CHANGE_NETWORK_STATE");
    }

    public List<AgoraNetworkInfo> getCurrentActiveInfo() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.activeNetworkInfoHashMap) {
            arrayList.addAll(this.activeNetworkInfoHashMap.values());
        }
        logD("getCurrentActiveInfo: " + arrayList.toString());
        return arrayList;
    }

    public int getNetworkType() {
        int i11;
        synchronized (this.activeNetworkInfoHashMap) {
            try {
                AgoraNetworkInfo agoraNetworkInfo = this.defaultNetworkInfo;
                i11 = agoraNetworkInfo != null ? agoraNetworkInfo.networkType : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    public boolean isVpnEnabled() {
        Boolean bool = this.vpnEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(this.connectivityManager.getActiveNetwork());
        Boolean boolValueOf = Boolean.valueOf(networkCapabilities == null ? false : networkCapabilities.hasTransport(4));
        this.vpnEnabled = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public void removeNetworkListener(NetworkListener networkListener) {
        if (networkListener != null) {
            this.networkListeners.remove(networkListener);
        }
    }

    public void requestCellularNetwork() {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(0);
        builder.addCapability(12);
        if (this.cellularNetworkCallback == null) {
            this.cellularNetworkCallback = new ConnectivityManager.NetworkCallback() { // from class: io.agora.utils2.internal.ConnectivityUtility.2
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(@NonNull Network network) {
                    super.onAvailable(network);
                }
            };
        }
        this.connectivityManager.requestNetwork(builder.build(), this.cellularNetworkCallback);
    }

    public void startMonitor(Context context) {
        logD("startMonitor: ");
        if (this.connectivityManager == null || this.wifiManager == null || this.telephonyManager == null) {
            return;
        }
        if (this.callback == null) {
            this.callback = new CustomNetworkCallback();
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            try {
                this.connectivityManager.registerNetworkCallback(builder.build(), this.callback);
            } catch (Exception unused) {
                Logging.e(TAG, "startMonitor: register network callback failed");
            }
        }
        if (this.vpnCallback == null) {
            NetworkRequest.Builder builder2 = new NetworkRequest.Builder();
            builder2.addTransportType(4);
            builder2.removeCapability(15);
            this.vpnCallback = new VpnNetworkCallback();
            try {
                this.connectivityManager.registerNetworkCallback(builder2.build(), this.vpnCallback);
            } catch (Exception unused2) {
                Logging.e(TAG, "startMonitor: register vpn network callback failed");
            }
        }
    }

    public void stopMonitor(Context context) {
        if (this.connectivityManager != null) {
            try {
                if (this.callback != null) {
                    logD("stopMonitor: unregisterNetworkCallback callback");
                    this.connectivityManager.unregisterNetworkCallback(this.callback);
                    this.callback = null;
                }
                if (this.cellularNetworkCallback != null) {
                    logD("stopMonitor: unregisterNetworkCallback cellularNetworkCallback");
                    this.connectivityManager.unregisterNetworkCallback(this.cellularNetworkCallback);
                    this.cellularNetworkCallback = null;
                }
                if (this.vpnCallback != null) {
                    logD("stopMonitor: unregisterNetworkCallback vpnCallback");
                    this.connectivityManager.unregisterNetworkCallback(this.vpnCallback);
                    this.vpnCallback = null;
                }
            } catch (IllegalArgumentException e11) {
                Logging.e(TAG, "Failed to unregister network callbacks", e11);
            }
        }
        synchronized (this.activeNetworkInfoHashMap) {
            this.activeNetworkInfoHashMap.clear();
        }
        synchronized (this.networkInfoByCategoryHashMap) {
            this.networkInfoByCategoryHashMap.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logD(String str) {
    }
}
