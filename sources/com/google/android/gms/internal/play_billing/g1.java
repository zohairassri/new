package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f42413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f42414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f42415c;

    g1(Object obj, Object obj2, Object obj3) {
        this.f42413a = obj;
        this.f42414b = obj2;
        this.f42415c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f42415c;
        Object obj2 = this.f42414b;
        Object obj3 = this.f42413a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
