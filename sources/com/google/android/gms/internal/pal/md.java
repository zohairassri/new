package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f41569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f41570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f41571c;

    md(Object obj, Object obj2, Object obj3) {
        this.f41569a = obj;
        this.f41570b = obj2;
        this.f41571c = obj3;
    }

    final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f41569a + "=" + this.f41570b + " and " + this.f41569a + "=" + this.f41571c);
    }
}
