package ak;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f971a;

    public final void f(int i11) {
        this.f971a = i11 | this.f971a;
    }

    public void g() {
        this.f971a = 0;
    }

    public final void h(int i11) {
        this.f971a = (~i11) & this.f971a;
    }

    protected final boolean j(int i11) {
        return (this.f971a & i11) == i11;
    }

    public final boolean k() {
        return j(268435456);
    }

    public final boolean l() {
        return j(IntCompanionObject.MIN_VALUE);
    }

    public final boolean n() {
        return j(4);
    }

    public final boolean o() {
        return j(134217728);
    }

    public final boolean p() {
        return j(1);
    }

    public final boolean q() {
        return j(536870912);
    }

    public final void r(int i11) {
        this.f971a = i11;
    }
}
