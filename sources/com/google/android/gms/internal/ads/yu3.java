package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class yu3 extends bw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38858b;

    /* synthetic */ yu3(String str, String str2, byte[] bArr) {
        this.f38857a = str;
        this.f38858b = str2;
    }

    @Override // com.google.android.gms.internal.ads.bw3
    public final String a() {
        return this.f38857a;
    }

    @Override // com.google.android.gms.internal.ads.bw3
    public final String b() {
        return this.f38858b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bw3) {
            bw3 bw3Var = (bw3) obj;
            String str = this.f38857a;
            if (str != null ? str.equals(bw3Var.a()) : bw3Var.a() == null) {
                String str2 = this.f38858b;
                if (str2 != null ? str2.equals(bw3Var.b()) : bw3Var.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f38857a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f38858b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f38857a;
        int length = String.valueOf(str).length();
        String str2 = this.f38858b;
        StringBuilder sb2 = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        sb2.append("OverlayDisplayUpdateRequest{sessionToken=");
        sb2.append(str);
        sb2.append(", appId=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
