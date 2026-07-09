package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ox3 extends hx3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f32139a;

    ox3(Object obj) {
        this.f32139a = obj;
    }

    @Override // com.google.android.gms.internal.ads.hx3
    public final Object a(Object obj) {
        return this.f32139a;
    }

    @Override // com.google.android.gms.internal.ads.hx3
    public final hx3 b(ax3 ax3Var) {
        Object objApply = ax3Var.apply(this.f32139a);
        jx3.k(objApply, "the Function passed to Optional.transform() must not return null.");
        return new ox3(objApply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ox3) {
            return this.f32139a.equals(((ox3) obj).f32139a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32139a.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.f32139a.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
