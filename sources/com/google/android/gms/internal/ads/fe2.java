package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class fe2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static fe2 f26269f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f26270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f26271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f26272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26274e;

    private fe2(final Context context) {
        Executor executorA = ef1.a();
        this.f26270a = executorA;
        this.f26271b = new CopyOnWriteArrayList();
        this.f26272c = new Object();
        this.f26273d = 0;
        executorA.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.eb2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new ed2(this.f25678a, null), intentFilter);
            }
        });
    }

    public static synchronized fe2 a(Context context) {
        try {
            if (f26269f == null) {
                f26269f = new fe2(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f26269f;
    }

    private final void g() {
        CopyOnWriteArrayList<da2> copyOnWriteArrayList = this.f26271b;
        for (da2 da2Var : copyOnWriteArrayList) {
            if (da2Var.a()) {
                copyOnWriteArrayList.remove(da2Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void e(int i11) {
        g();
        synchronized (this.f26272c) {
            try {
                if (this.f26274e && this.f26273d == i11) {
                    return;
                }
                this.f26274e = true;
                this.f26273d = i11;
                Iterator it = this.f26271b.iterator();
                while (it.hasNext()) {
                    ((da2) it.next()).b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(c82 c82Var, Executor executor) {
        boolean z11;
        g();
        da2 da2Var = new da2(this, c82Var, executor);
        synchronized (this.f26272c) {
            this.f26271b.add(da2Var);
            z11 = this.f26274e;
        }
        if (z11) {
            da2Var.b();
        }
    }

    public final int c() {
        int i11;
        synchronized (this.f26272c) {
            i11 = this.f26273d;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void d(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r9.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r1 = 0
            r2 = 5
            if (r0 != 0) goto Ld
            goto L47
        Ld:
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L47
            r1 = 1
            if (r0 == 0) goto L47
            boolean r3 = r0.isConnected()
            if (r3 != 0) goto L1b
            goto L47
        L1b:
            int r3 = r0.getType()
            r4 = 2
            r5 = 9
            r6 = 6
            r7 = 4
            if (r3 == 0) goto L39
            if (r3 == r1) goto L37
            if (r3 == r7) goto L39
            if (r3 == r2) goto L39
            if (r3 == r6) goto L35
            if (r3 == r5) goto L33
            r1 = 8
            goto L47
        L33:
            r1 = 7
            goto L47
        L35:
            r1 = r2
            goto L47
        L37:
            r1 = r4
            goto L47
        L39:
            int r0 = r0.getSubtype()
            switch(r0) {
                case 1: goto L46;
                case 2: goto L46;
                case 3: goto L44;
                case 4: goto L44;
                case 5: goto L44;
                case 6: goto L44;
                case 7: goto L44;
                case 8: goto L44;
                case 9: goto L44;
                case 10: goto L44;
                case 11: goto L44;
                case 12: goto L44;
                case 13: goto L35;
                case 14: goto L44;
                case 15: goto L44;
                case 16: goto L40;
                case 17: goto L44;
                case 18: goto L37;
                case 19: goto L40;
                case 20: goto L42;
                default: goto L40;
            }
        L40:
            r1 = r6
            goto L47
        L42:
            r1 = r5
            goto L47
        L44:
            r1 = r7
            goto L47
        L46:
            r1 = 3
        L47:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r0 < r3) goto L6d
            if (r1 != r2) goto L6d
            java.lang.String r0 = "phone"
            java.lang.Object r9 = r9.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L69
            android.telephony.TelephonyManager r9 = (android.telephony.TelephonyManager) r9     // Catch: java.lang.RuntimeException -> L69
            if (r9 == 0) goto L67
            com.google.android.gms.internal.ads.b72 r0 = new com.google.android.gms.internal.ads.b72     // Catch: java.lang.RuntimeException -> L69
            r0.<init>(r8)     // Catch: java.lang.RuntimeException -> L69
            java.util.concurrent.Executor r1 = r8.f26270a     // Catch: java.lang.RuntimeException -> L69
            r9.registerTelephonyCallback(r1, r0)     // Catch: java.lang.RuntimeException -> L69
            r9.unregisterTelephonyCallback(r0)     // Catch: java.lang.RuntimeException -> L69
            return
        L67:
            r9 = 0
            throw r9     // Catch: java.lang.RuntimeException -> L69
        L69:
            r8.e(r2)
            return
        L6d:
            r8.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fe2.d(android.content.Context):void");
    }

    final /* synthetic */ Executor f() {
        return this.f26270a;
    }
}
