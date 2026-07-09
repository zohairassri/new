package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@zzps(zza = zzz.class)
public abstract class zzbk {
    public static zzbk create(int i11, int i12, String str, String str2, String str3) {
        return new zzz(i11, i12, str, str2, str3);
    }

    public abstract String alternateText();

    public abstract String creativeType();

    public String getAlternateText() {
        return alternateText();
    }

    public String getCreativeType() {
        return creativeType();
    }

    public int getHeight() {
        return height();
    }

    public String getResourceUri() {
        return imageUrl();
    }

    public int getWidth() {
        return width();
    }

    public abstract int height();

    public abstract String imageUrl();

    public final String toString() {
        return "IconClickFallbackImageMsgData [width=" + width() + ", height=" + height() + ", imageUrl=" + imageUrl() + ", alternateText=" + alternateText() + ", creativeType=" + creativeType() + "]";
    }

    public abstract int width();
}
