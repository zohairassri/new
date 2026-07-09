package tf0;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class i1 extends j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f129984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f129985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private kotlin.collections.m f129986d;

    public static /* synthetic */ void a1(i1 i1Var, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        i1Var.W0(z11);
    }

    private final long b1(boolean z11) {
        return z11 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void p1(i1 i1Var, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        i1Var.i1(z11);
    }

    public final boolean A1() {
        z0 z0Var;
        kotlin.collections.m mVar = this.f129986d;
        if (mVar == null || (z0Var = (z0) mVar.A()) == null) {
            return false;
        }
        z0Var.run();
        return true;
    }

    public boolean C1() {
        return false;
    }

    @Override // tf0.j0
    public final j0 K0(int i11, String str) {
        yf0.l.a(i11);
        return yf0.l.b(this, str);
    }

    public final void W0(boolean z11) {
        long jB1 = this.f129984b - b1(z11);
        this.f129984b = jB1;
        if (jB1 <= 0 && this.f129985c) {
            shutdown();
        }
    }

    public final void d1(z0 z0Var) {
        kotlin.collections.m mVar = this.f129986d;
        if (mVar == null) {
            mVar = new kotlin.collections.m();
            this.f129986d = mVar;
        }
        mVar.addLast(z0Var);
    }

    protected long g1() {
        kotlin.collections.m mVar = this.f129986d;
        if (mVar == null || mVar.isEmpty()) {
            return LongCompanionObject.MAX_VALUE;
        }
        return 0L;
    }

    public final void i1(boolean z11) {
        this.f129984b += b1(z11);
        if (z11) {
            return;
        }
        this.f129985c = true;
    }

    public abstract void shutdown();

    public final boolean v1() {
        return this.f129984b >= b1(true);
    }

    public final boolean w1() {
        kotlin.collections.m mVar = this.f129986d;
        if (mVar != null) {
            return mVar.isEmpty();
        }
        return true;
    }

    public abstract long z1();
}
