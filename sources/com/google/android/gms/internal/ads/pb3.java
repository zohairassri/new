package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class pb3 extends mb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f32822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f32823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f32824f;

    pb3() {
    }

    @Override // com.google.android.gms.internal.ads.mb3
    public final mb3 a(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.f32819a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mb3
    public final mb3 b(boolean z11) {
        this.f32820b = z11;
        this.f32824f = (byte) (this.f32824f | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mb3
    public final mb3 c(boolean z11) {
        this.f32821c = true;
        this.f32824f = (byte) (this.f32824f | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mb3
    public final mb3 d(boolean z11) {
        this.f32824f = (byte) (this.f32824f | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mb3
    public final mb3 e(long j11) {
        this.f32822d = 100L;
        this.f32824f = (byte) (this.f32824f | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mb3
    public final mb3 f(boolean z11) {
        this.f32824f = (byte) (this.f32824f | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mb3
    public final mb3 g(long j11) {
        this.f32823e = 300L;
        this.f32824f = (byte) (this.f32824f | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mb3
    public final nb3 h() {
        String str;
        if (this.f32824f == 63 && (str = this.f32819a) != null) {
            return new qb3(str, this.f32820b, this.f32821c, false, this.f32822d, false, this.f32823e, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f32819a == null) {
            sb2.append(" clientVersion");
        }
        if ((this.f32824f & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.f32824f & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f32824f & 4) == 0) {
            sb2.append(" enableQuerySignalsTimeout");
        }
        if ((this.f32824f & 8) == 0) {
            sb2.append(" querySignalsTimeoutMs");
        }
        if ((this.f32824f & 16) == 0) {
            sb2.append(" enableQuerySignalsCache");
        }
        if ((this.f32824f & 32) == 0) {
            sb2.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
