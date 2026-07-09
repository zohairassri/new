package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class rz4 implements a05 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a05[] f34435a;

    rz4(a05... a05VarArr) {
        this.f34435a = a05VarArr;
    }

    @Override // com.google.android.gms.internal.ads.a05
    public final boolean zzb(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            if (this.f34435a[i11].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.a05
    public final yz4 zzc(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            a05 a05Var = this.f34435a[i11];
            if (a05Var.zzb(cls)) {
                return a05Var.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
