package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class lo extends tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f30365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30366b;

    public lo(String str) {
        this.f30365a = -1L;
        this.f30366b = -1L;
        HashMap mapB = tm.b(str);
        if (mapB != null) {
            this.f30365a = ((Long) mapB.get(0)).longValue();
            this.f30366b = ((Long) mapB.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.tm
    protected final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.f30365a));
        map.put(1, Long.valueOf(this.f30366b));
        return map;
    }
}
