package k6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import k6.x;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static x f107685f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f107686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f107687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f107688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f107689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f107690e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final x f107691a;

            public a(x xVar) {
                this.f107691a = xVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f107691a.m(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, x xVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) k6.a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(xVar);
                telephonyManager.registerTelephonyCallback(xVar.f107686a, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                xVar.m(5);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface c {
        void a(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f107692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f107693b;

        public d(c cVar, Executor executor) {
            this.f107692a = new WeakReference(cVar);
            this.f107693b = executor;
        }

        public static /* synthetic */ void a(d dVar) {
            c cVar = (c) dVar.f107692a.get();
            if (cVar != null) {
                cVar.a(x.this.g());
            }
        }

        public void b() {
            this.f107693b.execute(new Runnable() { // from class: k6.y
                @Override // java.lang.Runnable
                public final void run() {
                    x.d.a(this.f107696a);
                }
            });
        }

        public boolean c() {
            return this.f107692a.get() == null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            x.this.f107686a.execute(new Runnable() { // from class: k6.z
                @Override // java.lang.Runnable
                public final void run() {
                    x.this.i(context);
                }
            });
        }
    }

    private x(final Context context) {
        Executor executorA = k6.c.a();
        this.f107686a = executorA;
        this.f107687b = new CopyOnWriteArrayList();
        this.f107688c = new Object();
        this.f107689d = 0;
        executorA.execute(new Runnable() { // from class: k6.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f107683a.j(context);
            }
        });
    }

    public static synchronized x e(Context context) {
        try {
            if (f107685f == null) {
                f107685f = new x(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f107685f;
    }

    private static int f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return 9;
        }
    }

    private static int h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i11 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i11 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return f(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context) {
        int iH = h(context);
        if (Build.VERSION.SDK_INT < 31 || iH != 5) {
            m(iH);
        } else {
            b.a(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new e(), intentFilter);
    }

    private void l() {
        for (d dVar : this.f107687b) {
            if (dVar.c()) {
                this.f107687b.remove(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i11) {
        l();
        synchronized (this.f107688c) {
            try {
                if (this.f107690e && this.f107689d == i11) {
                    return;
                }
                this.f107690e = true;
                this.f107689d = i11;
                Iterator it = this.f107687b.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int g() {
        int i11;
        synchronized (this.f107688c) {
            i11 = this.f107689d;
        }
        return i11;
    }

    public void k(c cVar, Executor executor) {
        boolean z11;
        l();
        d dVar = new d(cVar, executor);
        synchronized (this.f107688c) {
            this.f107687b.add(dVar);
            z11 = this.f107690e;
        }
        if (z11) {
            dVar.b();
        }
    }
}
