package com.google.android.tv.ads;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.tv.ads.$AutoValue_IconClickFallbackImages, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class C$AutoValue_IconClickFallbackImages extends IconClickFallbackImages {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f45813a;

    C$AutoValue_IconClickFallbackImages(List list) {
        if (list == null) {
            throw new NullPointerException("Null iconClickFallbackImageList");
        }
        this.f45813a = list;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImages
    public List b() {
        return this.f45813a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IconClickFallbackImages) {
            return this.f45813a.equals(((IconClickFallbackImages) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f45813a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "IconClickFallbackImages{iconClickFallbackImageList=" + this.f45813a.toString() + "}";
    }
}
