package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class c0 extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45743b;

    /* synthetic */ c0(int i11, boolean z11, b0 b0Var) {
        this.f45742a = i11;
        this.f45743b = z11;
    }

    @Override // com.google.android.play.core.appupdate.d
    public final boolean a() {
        return this.f45743b;
    }

    @Override // com.google.android.play.core.appupdate.d
    public final int b() {
        return this.f45742a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f45742a == dVar.b() && this.f45743b == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f45743b ? 1237 : 1231) ^ ((this.f45742a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f45742a + ", allowAssetPackDeletion=" + this.f45743b + "}";
    }
}
