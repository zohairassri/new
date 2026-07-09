package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class sh0 extends uh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34824b;

    public sh0(String str, int i11) {
        this.f34823a = str;
        this.f34824b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sh0)) {
            return false;
        }
        sh0 sh0Var = (sh0) obj;
        if (com.google.android.gms.common.internal.m.a(this.f34823a, sh0Var.f34823a)) {
            if (com.google.android.gms.common.internal.m.a(Integer.valueOf(this.f34824b), Integer.valueOf(sh0Var.f34824b))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vh0
    public final String zzb() {
        return this.f34823a;
    }

    @Override // com.google.android.gms.internal.ads.vh0
    public final int zzc() {
        return this.f34824b;
    }
}
