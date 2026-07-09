package e3;

import android.graphics.Region;
import f2.o1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class k implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Region f91159a = new Region();

    @Override // e3.f0
    public void a(z3.p pVar) {
        this.f91159a.set(pVar.g(), pVar.j(), pVar.h(), pVar.d());
    }

    @Override // e3.f0
    public boolean b(z3.p pVar) {
        return this.f91159a.op(pVar.g(), pVar.j(), pVar.h(), pVar.d(), Region.Op.DIFFERENCE);
    }

    @Override // e3.f0
    public boolean c(f0 f0Var) {
        Region region = this.f91159a;
        Intrinsics.checkNotNull(f0Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticRegionImpl");
        return region.op(((k) f0Var).f91159a, Region.Op.INTERSECT);
    }

    @Override // e3.f0
    public z3.p getBounds() {
        return o1.d(this.f91159a.getBounds());
    }

    @Override // e3.f0
    public boolean isEmpty() {
        return this.f91159a.isEmpty();
    }
}
