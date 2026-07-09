package com.iterable.iterableapi;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static y f47900c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f47902b = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            x.g("NetworkConnectivityManager", "Network Connected");
            y.this.f47901a = true;
            ArrayList arrayList = new ArrayList(y.this.f47902b);
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((b) obj).e();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            x.g("NetworkConnectivityManager", "Network Disconnected");
            int i11 = 0;
            y.this.f47901a = false;
            ArrayList arrayList = new ArrayList(y.this.f47902b);
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((b) obj).c();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        void c();

        void e();
    }

    private y(Context context) {
        if (context == null) {
            return;
        }
        f(context);
    }

    static y e(Context context) {
        if (f47900c == null) {
            f47900c = new y(context);
        }
        return f47900c;
    }

    private void f(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        if (connectivityManager != null) {
            try {
                connectivityManager.registerNetworkCallback(builder.build(), new a());
            } catch (SecurityException e11) {
                x.b("NetworkConnectivityManager", e11.getLocalizedMessage());
            }
        }
    }

    synchronized void c(b bVar) {
        this.f47902b.add(bVar);
    }

    boolean d() {
        return this.f47901a;
    }
}
