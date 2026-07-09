package com.google.android.gms.internal.atv_ads_framework;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class a3 implements f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f3[] f39838a;

    a3(f3... f3VarArr) {
        this.f39838a = f3VarArr;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.f3
    public final e3 zzb(Class cls) {
        f3[] f3VarArr = this.f39838a;
        for (int i11 = 0; i11 < 2; i11++) {
            f3 f3Var = f3VarArr[i11];
            if (f3Var.zzc(cls)) {
                return f3Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.f3
    public final boolean zzc(Class cls) {
        f3[] f3VarArr = this.f39838a;
        for (int i11 = 0; i11 < 2; i11++) {
            if (f3VarArr[i11].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
