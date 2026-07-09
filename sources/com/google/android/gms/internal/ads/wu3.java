package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class wu3 extends yv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37612c;

    /* synthetic */ wu3(int i11, String str, int i12, byte[] bArr) {
        this.f37610a = i11;
        this.f37611b = str;
        this.f37612c = i12;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final int a() {
        return this.f37610a;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final String b() {
        return this.f37611b;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final int c() {
        return this.f37612c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof yv3) {
            yv3 yv3Var = (yv3) obj;
            if (this.f37610a == yv3Var.a() && ((str = this.f37611b) != null ? str.equals(yv3Var.b()) : yv3Var.b() == null) && this.f37612c == yv3Var.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f37611b;
        return this.f37612c ^ (((str == null ? 0 : str.hashCode()) ^ ((this.f37610a ^ 1000003) * 1000003)) * 1000003);
    }

    public final String toString() {
        int i11 = this.f37610a;
        int length = String.valueOf(i11).length();
        String str = this.f37611b;
        int length2 = String.valueOf(str).length();
        int i12 = this.f37612c;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i12).length() + 1);
        sb2.append("OverlayDisplayState{statusCode=");
        sb2.append(i11);
        sb2.append(", sessionToken=");
        sb2.append(str);
        sb2.append(", uiMode=");
        sb2.append(i12);
        sb2.append("}");
        return sb2.toString();
    }
}
