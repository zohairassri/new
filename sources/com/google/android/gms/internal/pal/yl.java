package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class yl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap f42249a = new HashMap();

    public final bm a() {
        if (this.f42249a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        bm bmVar = new bm(Collections.unmodifiableMap(this.f42249a), null);
        this.f42249a = null;
        return bmVar;
    }
}
