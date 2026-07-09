package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class jp extends tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f29144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f29145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f29146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f29147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f29148e;

    public jp(String str) {
        HashMap mapB = tm.b(str);
        if (mapB != null) {
            this.f29144a = (Long) mapB.get(0);
            this.f29145b = (Long) mapB.get(1);
            this.f29146c = (Long) mapB.get(2);
            this.f29147d = (Long) mapB.get(3);
            this.f29148e = (Long) mapB.get(4);
        }
    }

    @Override // com.google.android.gms.internal.ads.tm
    protected final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, this.f29144a);
        map.put(1, this.f29145b);
        map.put(2, this.f29146c);
        map.put(3, this.f29147d);
        map.put(4, this.f29148e);
        return map;
    }
}
