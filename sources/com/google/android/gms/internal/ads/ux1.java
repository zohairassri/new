package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ux1 extends yx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f36498c;

    ux1() {
    }

    @Override // com.google.android.gms.internal.ads.yx1
    public final yx1 a(long j11) {
        this.f36496a = j11;
        this.f36498c = (byte) (this.f36498c | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yx1
    public final yx1 b(int i11) {
        this.f36497b = i11;
        this.f36498c = (byte) (this.f36498c | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yx1
    public final zx1 c() {
        if (this.f36498c == 3) {
            return new vx1(this.f36496a, this.f36497b, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f36498c & 1) == 0) {
            sb2.append(" id");
        }
        if ((this.f36498c & 2) == 0) {
            sb2.append(" eventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
