package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class i8 extends u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f41457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f41458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f41459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f41460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f41461e;

    public i8(String str) {
        HashMap mapA = u5.a(str);
        if (mapA != null) {
            this.f41457a = (Long) mapA.get(0);
            this.f41458b = (Long) mapA.get(1);
            this.f41459c = (Long) mapA.get(2);
            this.f41460d = (Long) mapA.get(3);
            this.f41461e = (Long) mapA.get(4);
        }
    }

    @Override // com.google.android.gms.internal.pal.u5
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f41457a);
        map.put(1, this.f41458b);
        map.put(2, this.f41459c);
        map.put(3, this.f41460d);
        map.put(4, this.f41461e);
        return map;
    }
}
