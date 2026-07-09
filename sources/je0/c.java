package je0;

import be0.g;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import ne0.p;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f105585i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f105586l = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f105588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f105589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f105590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    AtomicReferenceArray f105591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f105592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    AtomicReferenceArray f105593g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicLong f105587a = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final AtomicLong f105594h = new AtomicLong();

    public c(int i11) {
        int iA = p.a(Math.max(8, i11));
        int i12 = iA - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iA + 1);
        this.f105591e = atomicReferenceArray;
        this.f105590d = i12;
        a(iA);
        this.f105593g = atomicReferenceArray;
        this.f105592f = i12;
        this.f105589c = iA - 2;
        t(0L);
    }

    private void a(int i11) {
        this.f105588b = Math.min(i11 / 4, f105585i);
    }

    private static int d(long j11, int i11) {
        return c(((int) j11) & i11);
    }

    private long e() {
        return this.f105594h.get();
    }

    private long f() {
        return this.f105587a.get();
    }

    private long g() {
        return this.f105594h.get();
    }

    private static Object h(AtomicReferenceArray atomicReferenceArray, int i11) {
        return atomicReferenceArray.get(i11);
    }

    private AtomicReferenceArray i(AtomicReferenceArray atomicReferenceArray, int i11) {
        int iC = c(i11);
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) h(atomicReferenceArray, iC);
        r(atomicReferenceArray, iC, null);
        return atomicReferenceArray2;
    }

    private long j() {
        return this.f105587a.get();
    }

    private Object k(AtomicReferenceArray atomicReferenceArray, long j11, int i11) {
        this.f105593g = atomicReferenceArray;
        return h(atomicReferenceArray, d(j11, i11));
    }

    private Object l(AtomicReferenceArray atomicReferenceArray, long j11, int i11) {
        this.f105593g = atomicReferenceArray;
        int iD = d(j11, i11);
        Object objH = h(atomicReferenceArray, iD);
        if (objH != null) {
            r(atomicReferenceArray, iD, null);
            q(j11 + 1);
        }
        return objH;
    }

    private void o(AtomicReferenceArray atomicReferenceArray, long j11, int i11, Object obj, long j12) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f105591e = atomicReferenceArray2;
        this.f105589c = (j12 + j11) - 1;
        r(atomicReferenceArray2, i11, obj);
        s(atomicReferenceArray, atomicReferenceArray2);
        r(atomicReferenceArray, i11, f105586l);
        t(j11 + 1);
    }

    private void q(long j11) {
        this.f105594h.lazySet(j11);
    }

    private static void r(AtomicReferenceArray atomicReferenceArray, int i11, Object obj) {
        atomicReferenceArray.lazySet(i11, obj);
    }

    private void s(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        r(atomicReferenceArray, c(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void t(long j11) {
        this.f105587a.lazySet(j11);
    }

    private boolean u(AtomicReferenceArray atomicReferenceArray, Object obj, long j11, int i11) {
        r(atomicReferenceArray, i11, obj);
        t(j11 + 1);
        return true;
    }

    @Override // be0.h
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // be0.h
    public boolean isEmpty() {
        return j() == g();
    }

    public boolean m(Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f105591e;
        long j11 = j();
        int i11 = this.f105590d;
        long j12 = 2 + j11;
        if (h(atomicReferenceArray, d(j12, i11)) == null) {
            int iD = d(j11, i11);
            r(atomicReferenceArray, iD + 1, obj2);
            r(atomicReferenceArray, iD, obj);
            t(j12);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f105591e = atomicReferenceArray2;
        int iD2 = d(j11, i11);
        r(atomicReferenceArray2, iD2 + 1, obj2);
        r(atomicReferenceArray2, iD2, obj);
        s(atomicReferenceArray, atomicReferenceArray2);
        r(atomicReferenceArray, iD2, f105586l);
        t(j12);
        return true;
    }

    public Object n() {
        AtomicReferenceArray atomicReferenceArray = this.f105593g;
        long jE = e();
        int i11 = this.f105592f;
        Object objH = h(atomicReferenceArray, d(jE, i11));
        return objH == f105586l ? k(i(atomicReferenceArray, i11 + 1), jE, i11) : objH;
    }

    @Override // be0.h
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f105591e;
        long jF = f();
        int i11 = this.f105590d;
        int iD = d(jF, i11);
        if (jF < this.f105589c) {
            return u(atomicReferenceArray, obj, jF, iD);
        }
        long j11 = ((long) this.f105588b) + jF;
        if (h(atomicReferenceArray, d(j11, i11)) == null) {
            this.f105589c = j11 - 1;
            return u(atomicReferenceArray, obj, jF, iD);
        }
        if (h(atomicReferenceArray, d(jF + 1, i11)) == null) {
            return u(atomicReferenceArray, obj, jF, iD);
        }
        o(atomicReferenceArray, jF, iD, obj, i11);
        return true;
    }

    public int p() {
        long jG = g();
        while (true) {
            long j11 = j();
            long jG2 = g();
            if (jG == jG2) {
                return (int) (j11 - jG2);
            }
            jG = jG2;
        }
    }

    @Override // be0.g, be0.h
    public Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f105593g;
        long jE = e();
        int i11 = this.f105592f;
        int iD = d(jE, i11);
        Object objH = h(atomicReferenceArray, iD);
        boolean z11 = objH == f105586l;
        if (objH == null || z11) {
            if (z11) {
                return l(i(atomicReferenceArray, i11 + 1), jE, i11);
            }
            return null;
        }
        r(atomicReferenceArray, iD, null);
        q(jE + 1);
        return objH;
    }

    private static int c(int i11) {
        return i11;
    }
}
