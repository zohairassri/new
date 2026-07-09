package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class j7 extends u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f41482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f41483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f41484c;

    public j7(String str) {
        HashMap mapA = u5.a(str);
        if (mapA != null) {
            this.f41482a = (Long) mapA.get(0);
            this.f41483b = (Long) mapA.get(1);
            this.f41484c = (Long) mapA.get(2);
        }
    }

    @Override // com.google.android.gms.internal.pal.u5
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f41482a);
        map.put(1, this.f41483b);
        map.put(2, this.f41484c);
        return map;
    }
}
