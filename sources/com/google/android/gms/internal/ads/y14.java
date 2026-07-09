package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class y14 extends c24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f38278a;

    y14(Comparator comparator) {
        this.f38278a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.c24
    final Map a() {
        return new TreeMap(this.f38278a);
    }
}
