package com.google.android.gms.internal.ads;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class wm extends tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f37441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37444e;

    public wm(String str) {
        String str2 = QueryKeys.ENGAGED_SECONDS;
        this.f37440a = QueryKeys.ENGAGED_SECONDS;
        this.f37441b = -1L;
        this.f37442c = QueryKeys.ENGAGED_SECONDS;
        this.f37443d = QueryKeys.ENGAGED_SECONDS;
        this.f37444e = QueryKeys.ENGAGED_SECONDS;
        HashMap mapB = tm.b(str);
        if (mapB != null) {
            this.f37440a = mapB.get(0) == null ? QueryKeys.ENGAGED_SECONDS : (String) mapB.get(0);
            this.f37441b = mapB.get(1) != null ? ((Long) mapB.get(1)).longValue() : -1L;
            this.f37442c = mapB.get(2) == null ? QueryKeys.ENGAGED_SECONDS : (String) mapB.get(2);
            this.f37443d = mapB.get(3) == null ? QueryKeys.ENGAGED_SECONDS : (String) mapB.get(3);
            this.f37444e = mapB.get(4) != null ? (String) mapB.get(4) : str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.tm
    protected final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, this.f37440a);
        map.put(4, this.f37444e);
        map.put(3, this.f37443d);
        map.put(2, this.f37442c);
        map.put(1, Long.valueOf(this.f37441b));
        return map;
    }
}
