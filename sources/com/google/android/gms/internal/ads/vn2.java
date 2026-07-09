package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class vn2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f36915a;

    public vn2(Boolean bool) {
        this.f36915a = bool;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Boolean bool = this.f36915a;
        f81 f81Var = (f81) obj;
        if (bool != null) {
            f81Var.f26097a.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
