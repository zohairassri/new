package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class su3 extends av3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35064b;

    /* synthetic */ su3(String str, String str2, byte[] bArr) {
        this.f35063a = str;
        this.f35064b = str2;
    }

    @Override // com.google.android.gms.internal.ads.av3
    public final String a() {
        return this.f35063a;
    }

    @Override // com.google.android.gms.internal.ads.av3
    public final String b() {
        return this.f35064b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof av3) {
            av3 av3Var = (av3) obj;
            String str = this.f35063a;
            if (str != null ? str.equals(av3Var.a()) : av3Var.a() == null) {
                String str2 = this.f35064b;
                if (str2 != null ? str2.equals(av3Var.b()) : av3Var.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f35063a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f35064b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f35063a;
        int length = String.valueOf(str).length();
        String str2 = this.f35064b;
        StringBuilder sb2 = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        sb2.append("OverlayDisplayDismissRequest{sessionToken=");
        sb2.append(str);
        sb2.append(", appId=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
