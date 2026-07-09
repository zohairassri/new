package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class g8 extends u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f41354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f41355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f41356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f41357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f41358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f41359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f41360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f41361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f41362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f41363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Long f41364k;

    public g8(String str) {
        HashMap mapA = u5.a(str);
        if (mapA != null) {
            this.f41354a = (Long) mapA.get(0);
            this.f41355b = (Long) mapA.get(1);
            this.f41356c = (Long) mapA.get(2);
            this.f41357d = (Long) mapA.get(3);
            this.f41358e = (Long) mapA.get(4);
            this.f41359f = (Long) mapA.get(5);
            this.f41360g = (Long) mapA.get(6);
            this.f41361h = (Long) mapA.get(7);
            this.f41362i = (Long) mapA.get(8);
            this.f41363j = (Long) mapA.get(9);
            this.f41364k = (Long) mapA.get(10);
        }
    }

    @Override // com.google.android.gms.internal.pal.u5
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f41354a);
        map.put(1, this.f41355b);
        map.put(2, this.f41356c);
        map.put(3, this.f41357d);
        map.put(4, this.f41358e);
        map.put(5, this.f41359f);
        map.put(6, this.f41360g);
        map.put(7, this.f41361h);
        map.put(8, this.f41362i);
        map.put(9, this.f41363j);
        map.put(10, this.f41364k);
        return map;
    }
}
