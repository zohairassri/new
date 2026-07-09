package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class xf1 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf1 f37942a;

    private xf1(kf1 kf1Var) {
        this.f37942a = kf1Var;
    }

    public static xf1 a(kf1 kf1Var) {
        return new xf1(kf1Var);
    }

    public static Set b(kf1 kf1Var) {
        return kf1Var.m();
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final /* synthetic */ Object zzb() {
        return this.f37942a.m();
    }
}
