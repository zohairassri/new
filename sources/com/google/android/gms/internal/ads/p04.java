package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class p04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f32605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f32606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f32607c;

    p04(Object obj, Object obj2, Object obj3) {
        this.f32605a = obj;
        this.f32606b = obj2;
        this.f32607c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f32607c;
        Object obj2 = this.f32606b;
        Object obj3 = this.f32605a;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(obj3);
        String strValueOf4 = String.valueOf(obj);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 33 + length2 + 5 + strValueOf3.length() + 1 + strValueOf4.length());
        sb2.append("Multiple entries with same key: ");
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        sb2.append(" and ");
        sb2.append(strValueOf3);
        sb2.append("=");
        sb2.append(strValueOf4);
        return new IllegalArgumentException(sb2.toString());
    }
}
