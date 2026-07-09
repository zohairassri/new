package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class g24 extends i24 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final g24 f26798a = new g24();

    private g24() {
    }

    @Override // com.google.android.gms.internal.ads.i24
    public final i24 a() {
        return r24.f33968a;
    }

    @Override // com.google.android.gms.internal.ads.i24, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
