package yf0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f140466e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f140467f = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f140468g = AtomicLongFieldUpdater.newUpdater(q.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e0 f140469h = new e0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f140470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f140471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f140472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f140473d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j11) {
            return (j11 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j11, int i11) {
            return d(j11, 1073741823L) | ((long) i11);
        }

        public final long c(long j11, int i11) {
            return d(j11, 1152921503533105152L) | (((long) i11) << 30);
        }

        public final long d(long j11, long j12) {
            return j11 & (~j12);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f140474a;

        public b(int i11) {
            this.f140474a = i11;
        }
    }

    public q(int i11, boolean z11) {
        this.f140470a = i11;
        this.f140471b = z11;
        int i12 = i11 - 1;
        this.f140472c = i12;
        this.f140473d = new AtomicReferenceArray(i11);
        if (i12 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i11 & i12) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final q b(long j11) {
        q qVar = new q(this.f140470a * 2, this.f140471b);
        int i11 = (int) (1073741823 & j11);
        int i12 = (int) ((1152921503533105152L & j11) >> 30);
        while (true) {
            int i13 = this.f140472c;
            if ((i11 & i13) == (i13 & i12)) {
                f140468g.set(qVar, f140466e.d(j11, 1152921504606846976L));
                return qVar;
            }
            Object bVar = f().get(this.f140472c & i11);
            if (bVar == null) {
                bVar = new b(i11);
            }
            qVar.f().set(qVar.f140472c & i11, bVar);
            i11++;
        }
    }

    private final q c(long j11) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f140467f;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar != null) {
                return qVar;
            }
            androidx.concurrent.futures.b.a(f140467f, this, null, b(j11));
        }
    }

    private final q e(int i11, Object obj) {
        Object obj2 = f().get(this.f140472c & i11);
        if (!(obj2 instanceof b) || ((b) obj2).f140474a != i11) {
            return null;
        }
        f().set(i11 & this.f140472c, obj);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray f() {
        return this.f140473d;
    }

    private final long k() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f140468g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if ((j11 & 1152921504606846976L) != 0) {
                return j11;
            }
            long j12 = 1152921504606846976L | j11;
            q qVar = this;
            if (atomicLongFieldUpdater.compareAndSet(qVar, j11, j12)) {
                return j12;
            }
            this = qVar;
        }
    }

    private final q n(int i11, int i12) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f140468g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            int i13 = (int) (1073741823 & j11);
            if ((1152921504606846976L & j11) != 0) {
                return this.l();
            }
            q qVar = this;
            if (f140468g.compareAndSet(qVar, j11, f140466e.b(j11, i12))) {
                qVar.f().set(qVar.f140472c & i13, null);
                return null;
            }
            this = qVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = i()
        L4:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L18
            yf0.q$a r12 = yf0.q.f140466e
            int r12 = r12.a(r3)
            return r12
        L18:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f140472c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L32
            return r6
        L32:
            boolean r2 = r12.f140471b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L53
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f()
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L53
            int r2 = r12.f140470a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L52
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L4
        L52:
            return r6
        L53:
            int r1 = r9 + 1
            r1 = r1 & r5
            r2 = r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = i()
            yf0.q$a r5 = yf0.q.f140466e
            long r5 = r5.c(r3, r2)
            r2 = r12
            boolean r12 = r1.compareAndSet(r2, r3, r5)
            if (r12 == 0) goto L8d
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r2.f()
            r0 = r9 & r10
            r12.set(r0, r13)
            r12 = r2
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = i()
            long r0 = r0.get(r12)
            r2 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r0 & r2
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L8b
            yf0.q r12 = r12.l()
            yf0.q r12 = r12.e(r9, r13)
            if (r12 != 0) goto L72
        L8b:
            r12 = 0
            return r12
        L8d:
            r12 = r2
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: yf0.q.a(java.lang.Object):int");
    }

    public final boolean d() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f140468g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if ((j11 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j11) != 0) {
                return false;
            }
            q qVar = this;
            if (atomicLongFieldUpdater.compareAndSet(qVar, j11, 2305843009213693952L | j11)) {
                return true;
            }
            this = qVar;
        }
    }

    public final int g() {
        long j11 = f140468g.get(this);
        return 1073741823 & (((int) ((j11 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j11)));
    }

    public final boolean j() {
        long j11 = f140468g.get(this);
        return ((int) (1073741823 & j11)) == ((int) ((j11 & 1152921503533105152L) >> 30));
    }

    public final q l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f140468g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j11) != 0) {
                return f140469h;
            }
            int i11 = (int) (1073741823 & j11);
            int i12 = this.f140472c;
            if ((((int) ((1152921503533105152L & j11) >> 30)) & i12) == (i12 & i11)) {
                return null;
            }
            Object obj = this.f().get(this.f140472c & i11);
            if (obj == null) {
                if (this.f140471b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i13 = (i11 + 1) & 1073741823;
                q qVar = this;
                if (f140468g.compareAndSet(qVar, j11, f140466e.b(j11, i13))) {
                    qVar.f().set(qVar.f140472c & i11, null);
                    return obj;
                }
                if (qVar.f140471b) {
                    q qVarN = qVar;
                    do {
                        qVarN = qVarN.n(i11, i13);
                    } while (qVarN != null);
                    return obj;
                }
                this = qVar;
            }
        }
    }
}
