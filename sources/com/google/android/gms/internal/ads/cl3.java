package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class cl3 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r75 f24618a;

    private cl3(r75 r75Var) {
        this.f24618a = r75Var;
    }

    public static cl3 a(r75 r75Var) {
        return new cl3(r75Var);
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final /* bridge */ /* synthetic */ Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.f24618a.zzb()).getResources().getDisplayMetrics();
        q75.b(displayMetrics);
        return displayMetrics;
    }
}
