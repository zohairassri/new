package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f26764a;

    public g(e eVar) {
        this.f26764a = eVar;
    }

    public final e a() {
        return this.f26764a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f26764a.equals(((g) obj).f26764a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.j
    public final int f(int i11) {
        return this.f26764a.f(i11);
    }

    public int hashCode() {
        return this.f26764a.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.j
    public final int zze() {
        return this.f26764a.zze();
    }

    @Override // com.google.android.gms.internal.ads.j
    public final int zzg(int i11) {
        return this.f26764a.zzg(i11);
    }

    @Override // com.google.android.gms.internal.ads.e
    public final int zzh() {
        return this.f26764a.zzh();
    }
}
