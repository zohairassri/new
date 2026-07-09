package ll;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {

        /* JADX INFO: renamed from: ll.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C1405a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList f114554a = new CopyOnWriteArrayList();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: ll.d$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
            static final class C1406a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f114555a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f114556b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f114557c;

                public C1406a(Handler handler, a aVar) {
                    this.f114555a = handler;
                    this.f114556b = aVar;
                }

                public void d() {
                    this.f114557c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                ml.a.e(handler);
                ml.a.e(aVar);
                d(aVar);
                this.f114554a.add(new C1406a(handler, aVar));
            }

            public void c(int i11, long j11, long j12) {
                final int i12;
                final long j13;
                final long j14;
                for (final C1406a c1406a : this.f114554a) {
                    if (c1406a.f114557c) {
                        i12 = i11;
                        j13 = j11;
                        j14 = j12;
                    } else {
                        i12 = i11;
                        j13 = j11;
                        j14 = j12;
                        c1406a.f114555a.post(new Runnable() { // from class: ll.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                c1406a.f114556b.s(i12, j13, j14);
                            }
                        });
                    }
                    i11 = i12;
                    j11 = j13;
                    j12 = j14;
                }
            }

            public void d(a aVar) {
                for (C1406a c1406a : this.f114554a) {
                    if (c1406a.f114556b == aVar) {
                        c1406a.d();
                        this.f114554a.remove(c1406a);
                    }
                }
            }
        }

        void s(int i11, long j11, long j12);
    }

    y a();

    void b(Handler handler, a aVar);

    void e(a aVar);
}
