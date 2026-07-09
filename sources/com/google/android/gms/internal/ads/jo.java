package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class jo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkCapabilities f29135a;

    jo(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new io(this));
            } catch (RuntimeException unused) {
                synchronized (jo.class) {
                    this.f29135a = null;
                }
            }
        }
    }

    public static jo a(Context context) {
        if (context != null) {
            return new jo((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final NetworkCapabilities b() {
        return this.f29135a;
    }

    public final long c() {
        synchronized (jo.class) {
            try {
                NetworkCapabilities networkCapabilities = this.f29135a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.f29135a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.f29135a.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void d(NetworkCapabilities networkCapabilities) {
        this.f29135a = networkCapabilities;
    }
}
