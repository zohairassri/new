package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class vu3 extends xv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f37025d;

    vu3() {
    }

    @Override // com.google.android.gms.internal.ads.xv3
    public final xv3 a(int i11) {
        this.f37022a = i11;
        this.f37025d = (byte) (this.f37025d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xv3
    public final xv3 b(String str) {
        this.f37023b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xv3
    public final xv3 c(int i11) {
        this.f37024c = i11;
        this.f37025d = (byte) (this.f37025d | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xv3
    public final yv3 d() {
        if (this.f37025d == 3) {
            return new wu3(this.f37022a, this.f37023b, this.f37024c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f37025d & 1) == 0) {
            sb2.append(" statusCode");
        }
        if ((this.f37025d & 2) == 0) {
            sb2.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
