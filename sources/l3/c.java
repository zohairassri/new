package l3;

import io.agora.base.internal.video.FactorBitrateAdjuster;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f113091b;

    public c(int i11) {
        this.f113091b = i11;
    }

    @Override // l3.n0
    public d0 d(d0 d0Var) {
        int i11 = this.f113091b;
        return (i11 == 0 || i11 == Integer.MAX_VALUE) ? d0Var : new d0(kotlin.ranges.g.n(d0Var.p() + this.f113091b, 1, FactorBitrateAdjuster.FACTOR_BASE));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f113091b == ((c) obj).f113091b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f113091b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f113091b + ')';
    }
}
