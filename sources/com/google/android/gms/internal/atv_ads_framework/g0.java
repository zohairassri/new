package com.google.android.gms.internal.atv_ads_framework;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f39912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f39913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f39914c;

    g0(Object obj, Object obj2, Object obj3) {
        this.f39912a = obj;
        this.f39913b = obj2;
        this.f39914c = obj3;
    }

    final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.f39912a) + "=" + String.valueOf(this.f39913b) + " and " + String.valueOf(this.f39912a) + "=" + String.valueOf(this.f39914c));
    }
}
