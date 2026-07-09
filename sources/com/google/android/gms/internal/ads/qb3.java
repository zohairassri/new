package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class qb3 extends nb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f33525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f33526e;

    /* synthetic */ qb3(String str, boolean z11, boolean z12, boolean z13, long j11, boolean z14, long j12, byte[] bArr) {
        this.f33522a = str;
        this.f33523b = z11;
        this.f33524c = z12;
        this.f33525d = j11;
        this.f33526e = j12;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final String a() {
        return this.f33522a;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final boolean b() {
        return this.f33523b;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final boolean c() {
        return this.f33524c;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final long e() {
        return this.f33525d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nb3) {
            nb3 nb3Var = (nb3) obj;
            if (this.f33522a.equals(nb3Var.a()) && this.f33523b == nb3Var.b() && this.f33524c == nb3Var.c()) {
                nb3Var.d();
                if (this.f33525d == nb3Var.e()) {
                    nb3Var.f();
                    if (this.f33526e == nb3Var.g()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final long g() {
        return this.f33526e;
    }

    public final int hashCode() {
        return ((int) this.f33526e) ^ ((((((((((((this.f33522a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f33523b ? 1237 : 1231)) * 1000003) ^ (true != this.f33524c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f33525d)) * 1000003) ^ 1237) * 1000003);
    }

    public final String toString() {
        boolean z11 = this.f33523b;
        int length = String.valueOf(z11).length();
        boolean z12 = this.f33524c;
        int length2 = String.valueOf(z12).length();
        long j11 = this.f33525d;
        int length3 = String.valueOf(j11).length();
        long j12 = this.f33526e;
        int length4 = String.valueOf(j12).length();
        String str = this.f33522a;
        StringBuilder sb2 = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb2.append("AdShield2Options{clientVersion=");
        sb2.append(str);
        sb2.append(", shouldGetAdvertisingId=");
        sb2.append(z11);
        sb2.append(", isGooglePlayServicesAvailable=");
        sb2.append(z12);
        sb2.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb2.append(j11);
        sb2.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb2.append(j12);
        sb2.append("}");
        return sb2.toString();
    }
}
