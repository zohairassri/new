package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class y6 implements e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e7[] f42639a;

    y6(e7... e7VarArr) {
        this.f42639a = e7VarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    public final d7 zzb(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            e7 e7Var = this.f42639a[i11];
            if (e7Var.zzc(cls)) {
                return e7Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    public final boolean zzc(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            if (this.f42639a[i11].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
