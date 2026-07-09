package com.google.android.gms.internal.pal;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkCapabilities f41534a;

    l7(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new k7(this));
            } catch (RuntimeException unused) {
                synchronized (l7.class) {
                    this.f41534a = null;
                }
            }
        }
    }

    public final NetworkCapabilities a() {
        return this.f41534a;
    }
}
