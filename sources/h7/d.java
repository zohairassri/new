package h7;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {

        /* JADX INFO: renamed from: h7.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C1183a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList f100475a = new CopyOnWriteArrayList();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: h7.d$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
            static final class C1184a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f100476a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f100477b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f100478c;

                public C1184a(Handler handler, a aVar) {
                    this.f100476a = handler;
                    this.f100477b = aVar;
                }

                public void d() {
                    this.f100478c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                k6.a.e(handler);
                k6.a.e(aVar);
                d(aVar);
                this.f100475a.add(new C1184a(handler, aVar));
            }

            public void c(int i11, long j11, long j12) {
                final int i12;
                final long j13;
                final long j14;
                for (final C1184a c1184a : this.f100475a) {
                    if (c1184a.f100478c) {
                        i12 = i11;
                        j13 = j11;
                        j14 = j12;
                    } else {
                        i12 = i11;
                        j13 = j11;
                        j14 = j12;
                        c1184a.f100476a.post(new Runnable() { // from class: h7.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                c1184a.f100477b.s(i12, j13, j14);
                            }
                        });
                    }
                    i11 = i12;
                    j11 = j13;
                    j12 = j14;
                }
            }

            public void d(a aVar) {
                for (C1184a c1184a : this.f100475a) {
                    if (c1184a.f100477b == aVar) {
                        c1184a.d();
                        this.f100475a.remove(c1184a);
                    }
                }
            }
        }

        void s(int i11, long j11, long j12);
    }

    n6.m a();

    void b(Handler handler, a aVar);

    default long d() {
        return -9223372036854775807L;
    }

    long f();

    void g(a aVar);
}
