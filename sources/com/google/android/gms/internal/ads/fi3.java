package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class fi3 implements zh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f26359b;

    fi3(int i11, byte[] bArr) {
        this.f26358a = i11;
        this.f26359b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zh3
    public final int zza() {
        return this.f26358a;
    }

    @Override // com.google.android.gms.internal.ads.zh3
    public final String zzb() {
        return new String(this.f26359b);
    }
}
