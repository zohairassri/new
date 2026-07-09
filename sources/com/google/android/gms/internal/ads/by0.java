package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class by0 implements zx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bm.m1 f24271a;

    public by0(bm.m1 m1Var) {
        this.f24271a = m1Var;
    }

    @Override // com.google.android.gms.internal.ads.zx0
    public final void a(Map map) {
        this.f24271a.z0(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
