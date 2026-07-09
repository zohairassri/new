package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class nf1 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kf1 f31362a;

    private nf1(kf1 kf1Var) {
        this.f31362a = kf1Var;
    }

    public static nf1 a(kf1 kf1Var) {
        return new nf1(kf1Var);
    }

    public static Set b(kf1 kf1Var) {
        Set set = Collections.EMPTY_SET;
        q75.b(set);
        return set;
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final /* synthetic */ Object zzb() {
        return b(this.f31362a);
    }
}
