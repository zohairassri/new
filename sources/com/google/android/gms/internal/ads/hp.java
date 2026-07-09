package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class hp extends tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f27860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f27861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f27862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f27863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f27864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f27865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f27866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f27867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f27868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f27869j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Long f27870k;

    public hp(String str) {
        HashMap mapB = tm.b(str);
        if (mapB != null) {
            this.f27860a = (Long) mapB.get(0);
            this.f27861b = (Long) mapB.get(1);
            this.f27862c = (Long) mapB.get(2);
            this.f27863d = (Long) mapB.get(3);
            this.f27864e = (Long) mapB.get(4);
            this.f27865f = (Long) mapB.get(5);
            this.f27866g = (Long) mapB.get(6);
            this.f27867h = (Long) mapB.get(7);
            this.f27868i = (Long) mapB.get(8);
            this.f27869j = (Long) mapB.get(9);
            this.f27870k = (Long) mapB.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.tm
    protected final HashMap a() {
        HashMap map = new HashMap();
        map.put(0, this.f27860a);
        map.put(1, this.f27861b);
        map.put(2, this.f27862c);
        map.put(3, this.f27863d);
        map.put(4, this.f27864e);
        map.put(5, this.f27865f);
        map.put(6, this.f27866g);
        map.put(7, this.f27867h);
        map.put(8, this.f27868i);
        map.put(9, this.f27869j);
        map.put(10, this.f27870k);
        return map;
    }
}
