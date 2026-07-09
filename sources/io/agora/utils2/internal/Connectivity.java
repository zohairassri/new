package io.agora.utils2.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class Connectivity {
    public static final int Network_2G = 3;
    public static final int Network_3G = 4;
    public static final int Network_4G = 5;
    public static final int Network_5G = 6;
    public static final int Network_DISCONNECTED = 0;
    public static final int Network_LAN = 1;
    public static final int Network_SubType_WIFI_2P4G = 100;
    public static final int Network_SubType_WIFI_5G = 101;
    public static final int Network_UNKNOWN = -1;
    public static final int Network_WIFI = 2;
    private static final String TAG = "Connectivity";

    public static int VPNBehindAddress(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            Logging.d(TAG, "VPNBehindAddress NetworkCapabilities is null");
            return 0;
        }
        boolean zHasTransport = networkCapabilities.hasTransport(4);
        Logging.d(TAG, "VPNBehindAddress vpnInUse is " + zHasTransport);
        return zHasTransport ? 1 : 0;
    }

    public static ArrayList<String> getDnsList() {
        Logging.d(TAG, "getDnsList()");
        return null;
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e11) {
            Logging.e(TAG, "getNetworkInfo exception:  " + e11.getMessage());
            return null;
        }
    }

    public static int getNetworkType(Context context) {
        return getNetworkType(getNetworkInfo(context));
    }

    public static int getNetworkTypeFromTelephonyNetworkType(int i11) {
        if (i11 == 20) {
            return 6;
        }
        switch (i11) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return -1;
        }
    }

    public static boolean isConnected(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isConnected();
    }

    public static int getNetworkType(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 0;
        }
        int type = networkInfo.getType();
        if (type == 1) {
            return 2;
        }
        if (type == 9) {
            return 1;
        }
        if (type != 0) {
            return -1;
        }
        return getNetworkTypeFromTelephonyNetworkType(networkInfo.getSubtype());
    }
}
