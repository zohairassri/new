package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class a41 implements b41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f23064a;

    a41(Map map) {
        this.f23064a = map;
    }

    @Override // com.google.android.gms.internal.ads.b41
    public final k92 i(int i11, String str) {
        return (k92) this.f23064a.get(str);
    }
}
