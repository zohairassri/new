package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class cp2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f24663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f24666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f24667f;

    public cp2(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f24662a = str;
        this.f24663b = num;
        this.f24664c = str2;
        this.f24665d = str3;
        this.f24666e = str4;
        this.f24667f = str5;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((f81) obj).f26097a;
        xz2.e(bundle, "pn", this.f24662a);
        xz2.h(bundle, "vc", this.f24663b);
        xz2.e(bundle, "vnm", this.f24664c);
        xz2.e(bundle, "dl", this.f24665d);
        xz2.e(bundle, "ins_pn", this.f24666e);
        xz2.e(bundle, "ini_pn", this.f24667f);
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((f81) obj).f26098b;
        xz2.e(bundle, "pn", this.f24662a);
        xz2.e(bundle, "dl", this.f24665d);
    }
}
