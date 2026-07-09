package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzba {
    public abstract zzbb build();

    public abstract zzba height(int i11);

    public abstract zzba left(int i11);

    public zzba locationOnScreenOfView(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return left(iArr[0]).top(iArr[1]).height(view.getHeight()).width(view.getWidth());
    }

    public abstract zzba top(int i11);

    public abstract zzba width(int i11);
}
