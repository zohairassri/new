package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class us3 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r75 f36318a;

    private us3(r75 r75Var) {
        this.f36318a = r75Var;
    }

    public static us3 a(r75 r75Var) {
        return new us3(r75Var);
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.f36318a.zzb(), "ocs"), "pcbc");
    }
}
