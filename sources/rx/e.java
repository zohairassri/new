package rx;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f125197a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a implements i {

        /* JADX INFO: renamed from: rx.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class C1680a implements ii0.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f125198a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            long f125199b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f125200c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f125201d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f125202e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ qi0.c f125203f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ii0.a f125204g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ long f125205h;

            C1680a(long j11, long j12, qi0.c cVar, ii0.a aVar, long j13) {
                this.f125201d = j11;
                this.f125202e = j12;
                this.f125203f = cVar;
                this.f125204g = aVar;
                this.f125205h = j13;
                this.f125199b = j11;
                this.f125200c = j12;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
            @Override // ii0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void call() {
                /*
                    r10 = this;
                    qi0.c r0 = r10.f125203f
                    boolean r0 = r0.isUnsubscribed()
                    if (r0 != 0) goto L57
                    ii0.a r0 = r10.f125204g
                    r0.call()
                    java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                    rx.e$a r1 = rx.e.a.this
                    long r1 = r1.a()
                    long r0 = r0.toNanos(r1)
                    long r2 = rx.e.f125197a
                    long r4 = r0 + r2
                    long r6 = r10.f125199b
                    int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    r8 = 1
                    if (r4 < 0) goto L38
                    long r4 = r10.f125205h
                    long r6 = r6 + r4
                    long r6 = r6 + r2
                    int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                    if (r2 < 0) goto L2e
                    goto L38
                L2e:
                    long r2 = r10.f125200c
                    long r6 = r10.f125198a
                    long r6 = r6 + r8
                    r10.f125198a = r6
                    long r6 = r6 * r4
                    long r2 = r2 + r6
                    goto L47
                L38:
                    long r2 = r10.f125205h
                    long r4 = r0 + r2
                    long r6 = r10.f125198a
                    long r6 = r6 + r8
                    r10.f125198a = r6
                    long r2 = r2 * r6
                    long r2 = r4 - r2
                    r10.f125200c = r2
                    r2 = r4
                L47:
                    r10.f125199b = r0
                    long r2 = r2 - r0
                    qi0.c r0 = r10.f125203f
                    rx.e$a r1 = rx.e.a.this
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
                    rx.i r10 = r1.c(r10, r2, r4)
                    r0.a(r10)
                L57:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: rx.e.a.C1680a.call():void");
            }
        }

        public long a() {
            return System.currentTimeMillis();
        }

        public abstract i b(ii0.a aVar);

        public abstract i c(ii0.a aVar, long j11, TimeUnit timeUnit);

        public i d(ii0.a aVar, long j11, long j12, TimeUnit timeUnit) {
            long nanos = timeUnit.toNanos(j12);
            long nanos2 = TimeUnit.MILLISECONDS.toNanos(a());
            long nanos3 = nanos2 + timeUnit.toNanos(j11);
            qi0.c cVar = new qi0.c();
            C1680a c1680a = new C1680a(nanos2, nanos3, cVar, aVar, nanos);
            qi0.c cVar2 = new qi0.c();
            cVar.a(cVar2);
            cVar2.a(c(c1680a, j11, timeUnit));
            return cVar;
        }
    }

    public abstract a a();
}
