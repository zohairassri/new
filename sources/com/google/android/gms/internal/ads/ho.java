package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ho extends tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f27847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f27848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f27849c;

    public ho(String str) {
        HashMap mapB = tm.b(str);
        if (mapB != null) {
            this.f27847a = (Long) mapB.get(0);
            this.f27848b = (Long) mapB.get(1);
            this.f27849c = (Long) mapB.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.tm
    protected final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, this.f27847a);
        map.put(1, this.f27848b);
        map.put(2, this.f27849c);
        return map;
    }
}
