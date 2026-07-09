package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zu f24807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f24808b;

    public d(zu zuVar, int[] iArr, int i11) {
        if (iArr.length == 0) {
            y22.f("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f24807a = zuVar;
        this.f24808b = iArr;
    }
}
