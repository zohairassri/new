package com.google.android.tv.ads;

import com.google.android.tv.ads.IconClickFallbackImages;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class h extends IconClickFallbackImages.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f45834a;

    h() {
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImages.a
    public final IconClickFallbackImages a() {
        List list = this.f45834a;
        if (list != null) {
            return new zzf(list);
        }
        throw new IllegalStateException("Missing required properties: iconClickFallbackImageList");
    }

    public final IconClickFallbackImages.a b(List list) {
        if (list == null) {
            throw new NullPointerException("Null iconClickFallbackImageList");
        }
        this.f45834a = list;
        return this;
    }
}
