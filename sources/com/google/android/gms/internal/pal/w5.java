package com.google.android.gms.internal.pal;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class w5 extends u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41913e;

    public w5(String str) {
        String str2 = QueryKeys.ENGAGED_SECONDS;
        this.f41909a = QueryKeys.ENGAGED_SECONDS;
        this.f41910b = -1L;
        this.f41911c = QueryKeys.ENGAGED_SECONDS;
        this.f41912d = QueryKeys.ENGAGED_SECONDS;
        this.f41913e = QueryKeys.ENGAGED_SECONDS;
        HashMap mapA = u5.a(str);
        if (mapA != null) {
            this.f41909a = mapA.get(0) == null ? QueryKeys.ENGAGED_SECONDS : (String) mapA.get(0);
            this.f41910b = mapA.get(1) != null ? ((Long) mapA.get(1)).longValue() : -1L;
            this.f41911c = mapA.get(2) == null ? QueryKeys.ENGAGED_SECONDS : (String) mapA.get(2);
            this.f41912d = mapA.get(3) == null ? QueryKeys.ENGAGED_SECONDS : (String) mapA.get(3);
            this.f41913e = mapA.get(4) != null ? (String) mapA.get(4) : str2;
        }
    }

    @Override // com.google.android.gms.internal.pal.u5
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f41909a);
        map.put(4, this.f41913e);
        map.put(3, this.f41912d);
        map.put(2, this.f41911c);
        map.put(1, Long.valueOf(this.f41910b));
        return map;
    }
}
