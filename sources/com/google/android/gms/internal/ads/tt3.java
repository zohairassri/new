package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class tt3 implements gt3, aj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f35741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NetworkCapabilities f35742c = null;

    tt3(Context context, ExecutorService executorService) {
        this.f35740a = context;
        this.f35741b = executorService;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035 A[Catch: all -> 0x0019, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x000a, B:9:0x000e, B:11:0x0015, B:15:0x001b, B:17:0x0024, B:19:0x0028, B:21:0x0031, B:23:0x0035), top: B:34:0x000a }] */
    @Override // com.google.android.gms.internal.ads.gt3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.Map r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.net.NetworkCapabilities r0 = r2.f35742c     // Catch: java.lang.Throwable -> L44
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "ntc"
            r3.put(r1, r0)
            monitor-enter(r2)
            android.net.NetworkCapabilities r0 = r2.f35742c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L35
            r1 = 4
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0 = 2
            goto L38
        L19:
            r3 = move-exception
            goto L42
        L1b:
            android.net.NetworkCapabilities r0 = r2.f35742c     // Catch: java.lang.Throwable -> L19
            r1 = 1
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L28
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0 = 1
            goto L38
        L28:
            android.net.NetworkCapabilities r0 = r2.f35742c     // Catch: java.lang.Throwable -> L19
            r1 = 0
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L35
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0 = 0
            goto L38
        L35:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0 = -1
        L38:
            java.lang.String r2 = "nt"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r2, r0)
            return
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
        L44:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tt3.b(java.util.Map):void");
    }

    final /* synthetic */ void d() {
        rt3 rt3Var = new rt3(this);
        try {
            Object systemService = this.f35740a.getSystemService("connectivity");
            if (systemService == null) {
                throw null;
            }
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(rt3Var);
        } catch (Throwable unused) {
        }
    }

    final /* synthetic */ void e(NetworkCapabilities networkCapabilities) {
        this.f35742c = networkCapabilities;
    }

    @Override // com.google.android.gms.internal.ads.aj3
    public final com.google.common.util.concurrent.e zza() {
        return k64.e(new Runnable() { // from class: com.google.android.gms.internal.ads.st3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f35051a.d();
            }
        }, this.f35741b);
    }

    @Override // com.google.android.gms.internal.ads.gt3
    public final void a(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.gt3
    public final void c(Map map, Context context, View view) {
    }
}
