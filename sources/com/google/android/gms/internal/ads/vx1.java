package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class vx1 extends zx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f37053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37054b;

    /* synthetic */ vx1(long j11, int i11, byte[] bArr) {
        this.f37053a = j11;
        this.f37054b = i11;
    }

    @Override // com.google.android.gms.internal.ads.zx1
    public final long a() {
        return this.f37053a;
    }

    @Override // com.google.android.gms.internal.ads.zx1
    public final int b() {
        return this.f37054b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zx1) {
            zx1 zx1Var = (zx1) obj;
            if (this.f37053a == zx1Var.a() && this.f37054b == zx1Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f37053a;
        return this.f37054b ^ ((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j11 = this.f37053a;
        int length = String.valueOf(j11).length();
        int i11 = this.f37054b;
        StringBuilder sb2 = new StringBuilder(length + 34 + String.valueOf(i11).length() + 1);
        sb2.append("OnDeviceStorageKey{id=");
        sb2.append(j11);
        sb2.append(", eventType=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }
}
