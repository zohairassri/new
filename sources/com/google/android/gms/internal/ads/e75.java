package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class e75 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f25634a;

    e75(Map map) {
        this.f25634a = Collections.unmodifiableMap(map);
    }

    final Map a() {
        return this.f25634a;
    }
}
