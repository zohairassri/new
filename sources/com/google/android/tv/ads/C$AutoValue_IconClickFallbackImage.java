package com.google.android.tv.ads;

/* JADX INFO: renamed from: com.google.android.tv.ads.$AutoValue_IconClickFallbackImage, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class C$AutoValue_IconClickFallbackImage extends IconClickFallbackImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f45811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f45812e;

    C$AutoValue_IconClickFallbackImage(int i11, int i12, String str, String str2, String str3) {
        this.f45808a = i11;
        this.f45809b = i12;
        this.f45810c = str;
        this.f45811d = str2;
        this.f45812e = str3;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage
    public String b() {
        return this.f45810c;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage
    public String c() {
        return this.f45811d;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage
    public String d() {
        return this.f45812e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IconClickFallbackImage) {
            IconClickFallbackImage iconClickFallbackImage = (IconClickFallbackImage) obj;
            if (this.f45808a == iconClickFallbackImage.getWidth() && this.f45809b == iconClickFallbackImage.getHeight() && ((str = this.f45810c) != null ? str.equals(iconClickFallbackImage.b()) : iconClickFallbackImage.b() == null) && ((str2 = this.f45811d) != null ? str2.equals(iconClickFallbackImage.c()) : iconClickFallbackImage.c() == null) && ((str3 = this.f45812e) != null ? str3.equals(iconClickFallbackImage.d()) : iconClickFallbackImage.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage
    public int getHeight() {
        return this.f45809b;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage
    public int getWidth() {
        return this.f45808a;
    }

    public final int hashCode() {
        int i11 = ((this.f45808a ^ 1000003) * 1000003) ^ this.f45809b;
        String str = this.f45810c;
        int iHashCode = ((i11 * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f45811d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f45812e;
        return iHashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "IconClickFallbackImage{width=" + this.f45808a + ", height=" + this.f45809b + ", altText=" + this.f45810c + ", creativeType=" + this.f45811d + ", staticResourceUri=" + this.f45812e + "}";
    }
}
