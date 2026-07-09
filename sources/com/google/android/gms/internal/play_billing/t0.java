package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class t0 extends v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t0 f42590b = new t0();

    private t0() {
        super("");
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final int a(v0 v0Var) {
        return v0Var == this ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    final void b(StringBuilder sb2) {
        throw new AssertionError();
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    final void c(StringBuilder sb2) {
        sb2.append("+∞)");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((v0) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.v0
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }
}
