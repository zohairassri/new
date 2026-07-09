package com.google.android.tv.ads;

import com.google.android.tv.ads.IconClickFallbackImage;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class g extends IconClickFallbackImage.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f45831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f45832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f45833f;

    g() {
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage.a
    public final IconClickFallbackImage a() {
        if (this.f45833f == 3) {
            return new zzd(this.f45828a, this.f45829b, this.f45830c, this.f45831d, this.f45832e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f45833f & 1) == 0) {
            sb2.append(" width");
        }
        if ((this.f45833f & 2) == 0) {
            sb2.append(" height");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage.a
    public final IconClickFallbackImage.a b(String str) {
        this.f45830c = str;
        return this;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage.a
    public final IconClickFallbackImage.a c(String str) {
        this.f45831d = str;
        return this;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage.a
    public final IconClickFallbackImage.a d(int i11) {
        this.f45829b = i11;
        this.f45833f = (byte) (this.f45833f | 2);
        return this;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage.a
    public final IconClickFallbackImage.a e(String str) {
        this.f45832e = str;
        return this;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage.a
    public final IconClickFallbackImage.a f(int i11) {
        this.f45828a = i11;
        this.f45833f = (byte) (this.f45833f | 1);
        return this;
    }
}
