package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class z7 extends u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f42265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f42266b;

    public z7(String str) {
        HashMap mapA = u5.a(str);
        if (mapA != null) {
            this.f42265a = (Long) mapA.get(0);
            this.f42266b = (Long) mapA.get(1);
        }
    }

    @Override // com.google.android.gms.internal.pal.u5
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f42265a);
        map.put(1, this.f42266b);
        return map;
    }
}
