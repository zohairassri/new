package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class bq2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f24088e;

    public bq2(String str, String str2, String str3, String str4, Long l11) {
        this.f24084a = str;
        this.f24085b = str2;
        this.f24086c = str3;
        this.f24087d = str4;
        this.f24088e = l11;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((f81) obj).f26097a;
        xz2.e(bundle, "gmp_app_id", this.f24084a);
        xz2.e(bundle, "fbs_aiid", this.f24085b);
        xz2.e(bundle, "fbs_aeid", this.f24086c);
        xz2.e(bundle, "apm_id_origin", this.f24087d);
        Long l11 = this.f24088e;
        if (l11 != null) {
            bundle.putLong("sai_timeout", l11.longValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        xz2.e(((f81) obj).f26098b, "fbs_aeid", this.f24086c);
    }
}
