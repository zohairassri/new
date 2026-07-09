package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class xu3 extends aw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38196b;

    xu3() {
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final aw3 a(String str) {
        this.f38195a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final aw3 b(String str) {
        this.f38196b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final bw3 c() {
        return new yu3(this.f38195a, this.f38196b, null);
    }
}
