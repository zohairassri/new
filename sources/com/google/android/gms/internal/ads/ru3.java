package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ru3 extends zu3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34345b;

    ru3() {
    }

    @Override // com.google.android.gms.internal.ads.zu3
    public final zu3 a(String str) {
        this.f34344a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zu3
    public final zu3 b(String str) {
        this.f34345b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zu3
    public final av3 c() {
        return new su3(this.f34344a, this.f34345b, null);
    }
}
