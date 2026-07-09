package sd;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import sd.b;
import zd.f;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile r f126458d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f126459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f126460b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f126461c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f126462a;

        a(Context context) {
            this.f126462a = context;
        }

        @Override // zd.f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f126462a.getSystemService("connectivity");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b implements b.a {
        b() {
        }

        @Override // sd.b.a
        public void a(boolean z11) {
            ArrayList arrayList;
            zd.l.b();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f126460b);
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((b.a) obj).a(z11);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private interface c {
        boolean A();

        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f126465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b.a f126466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f.b f126467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f126468d = new a();

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: sd.r$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
            class RunnableC1705a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f126470a;

                RunnableC1705a(boolean z11) {
                    this.f126470a = z11;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f126470a);
                }
            }

            a() {
            }

            private void b(boolean z11) {
                zd.l.w(new RunnableC1705a(z11));
            }

            void a(boolean z11) {
                zd.l.b();
                d dVar = d.this;
                boolean z12 = dVar.f126465a;
                dVar.f126465a = z11;
                if (z12 != z11) {
                    dVar.f126466b.a(z11);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        d(f.b bVar, b.a aVar) {
            this.f126467c = bVar;
            this.f126466b = aVar;
        }

        @Override // sd.r.c
        public boolean A() {
            this.f126465a = ((ConnectivityManager) this.f126467c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f126467c.get()).registerDefaultNetworkCallback(this.f126468d);
                return true;
            } catch (RuntimeException e11) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e11);
                }
                return false;
            }
        }

        @Override // sd.r.c
        public void a() {
            ((ConnectivityManager) this.f126467c.get()).unregisterNetworkCallback(this.f126468d);
        }
    }

    private r(Context context) {
        this.f126459a = new d(zd.f.a(new a(context)), new b());
    }

    static r a(Context context) {
        if (f126458d == null) {
            synchronized (r.class) {
                try {
                    if (f126458d == null) {
                        f126458d = new r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f126458d;
    }

    private void b() {
        if (this.f126461c || this.f126460b.isEmpty()) {
            return;
        }
        this.f126461c = this.f126459a.A();
    }

    private void c() {
        if (this.f126461c && this.f126460b.isEmpty()) {
            this.f126459a.a();
            this.f126461c = false;
        }
    }

    synchronized void d(b.a aVar) {
        this.f126460b.add(aVar);
        b();
    }

    synchronized void e(b.a aVar) {
        this.f126460b.remove(aVar);
        c();
    }
}
