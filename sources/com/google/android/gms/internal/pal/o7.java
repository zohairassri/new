package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class o7 extends u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41618b;

    public o7(String str) {
        this.f41617a = -1L;
        this.f41618b = -1L;
        HashMap mapA = u5.a(str);
        if (mapA != null) {
            this.f41617a = ((Long) mapA.get(0)).longValue();
            this.f41618b = ((Long) mapA.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.pal.u5
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.f41617a));
        map.put(1, Long.valueOf(this.f41618b));
        return map;
    }
}
