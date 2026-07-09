package r2;

import io.agora.rtc2.internal.AudioRoutingController;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f123587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f123588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f123589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f123590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f123591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f123592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f123593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f123594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f123595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f123596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f123597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f123598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f123599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f123600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private x f123601o;

    public /* synthetic */ x(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, z11, f11, j14, j15, z12, z13, i11, j16);
    }

    public static /* synthetic */ x c(x xVar, long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, int i11, List list, long j16, int i12, Object obj) {
        long j17;
        long j18 = (i12 & 1) != 0 ? xVar.f123587a : j11;
        long j19 = (i12 & 2) != 0 ? xVar.f123588b : j12;
        long j21 = (i12 & 4) != 0 ? xVar.f123589c : j13;
        boolean z13 = (i12 & 8) != 0 ? xVar.f123590d : z11;
        long j22 = (i12 & 16) != 0 ? xVar.f123592f : j14;
        long j23 = (i12 & 32) != 0 ? xVar.f123593g : j15;
        boolean z14 = (i12 & 64) != 0 ? xVar.f123594h : z12;
        int i13 = (i12 & 128) != 0 ? xVar.f123595i : i11;
        if ((i12 & AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER) != 0) {
            j17 = xVar.f123596j;
            j18 = j18;
        } else {
            j17 = j16;
        }
        return xVar.b(j18, j19, j21, z13, j22, j23, z14, i13, list, j17);
    }

    public final void a() {
        x xVar = this.f123601o;
        if (xVar == null) {
            this.f123599m = true;
            this.f123600n = true;
        } else if (xVar != null) {
            xVar.a();
        }
    }

    public final x b(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, int i11, List list, long j16) {
        x xVar = this;
        x xVarD = xVar.d(j11, j12, j13, z11, xVar.f123591e, j14, j15, z12, i11, list, j16);
        x xVar2 = xVar.f123601o;
        if (xVar2 != null) {
            xVar = xVar2;
        }
        xVarD.f123601o = xVar;
        return xVarD;
    }

    public final x d(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, int i11, List list, long j16) {
        x xVar = this;
        x xVar2 = new x(j11, j12, j13, z11, f11, j14, j15, z12, false, i11, list, j16, xVar.f123598l, null);
        x xVar3 = xVar.f123601o;
        if (xVar3 != null) {
            xVar = xVar3;
        }
        xVar2.f123601o = xVar;
        return xVar2;
    }

    public final List e() {
        List list = this.f123597k;
        return list == null ? CollectionsKt.o() : list;
    }

    public final long f() {
        return this.f123587a;
    }

    public final long g() {
        return this.f123598l;
    }

    public final long h() {
        return this.f123589c;
    }

    public final boolean i() {
        return this.f123590d;
    }

    public final float j() {
        return this.f123591e;
    }

    public final long k() {
        return this.f123593g;
    }

    public final boolean l() {
        return this.f123594h;
    }

    public final long m() {
        return this.f123596j;
    }

    public final int n() {
        return this.f123595i;
    }

    public final long o() {
        return this.f123588b;
    }

    public final boolean p() {
        x xVar = this.f123601o;
        return xVar != null ? xVar.p() : this.f123599m || this.f123600n;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) w.d(this.f123587a)) + ", uptimeMillis=" + this.f123588b + ", position=" + ((Object) e2.f.s(this.f123589c)) + ", pressed=" + this.f123590d + ", pressure=" + this.f123591e + ", previousUptimeMillis=" + this.f123592f + ", previousPosition=" + ((Object) e2.f.s(this.f123593g)) + ", previousPressed=" + this.f123594h + ", isConsumed=" + p() + ", type=" + ((Object) k0.i(this.f123595i)) + ", historical=" + e() + ",scrollDelta=" + ((Object) e2.f.s(this.f123596j)) + ')';
    }

    public /* synthetic */ x(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, List list, long j16, long j17, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, z11, f11, j14, j15, z12, z13, i11, list, j16, j17);
    }

    private x(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, long j16) {
        this.f123587a = j11;
        this.f123588b = j12;
        this.f123589c = j13;
        this.f123590d = z11;
        this.f123591e = f11;
        this.f123592f = j14;
        this.f123593g = j15;
        this.f123594h = z12;
        this.f123595i = i11;
        this.f123596j = j16;
        this.f123598l = e2.f.f90920b.c();
        this.f123599m = z13;
        this.f123600n = z13;
    }

    public /* synthetic */ x(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, long j16, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, z11, f11, j14, j15, z12, z13, (i12 & AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER) != 0 ? k0.f123523a.d() : i11, (i12 & 1024) != 0 ? e2.f.f90920b.c() : j16, null);
    }

    private x(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, List list, long j16, long j17) {
        this(j11, j12, j13, z11, f11, j14, j15, z12, z13, i11, j16, null);
        this.f123597k = list;
        this.f123598l = j17;
    }
}
