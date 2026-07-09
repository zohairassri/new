package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class mn2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f30913a;

    public mn2(Integer num) {
        this.f30913a = num;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.f30913a;
        f81 f81Var = (f81) obj;
        if (num != null) {
            f81Var.f26097a.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
