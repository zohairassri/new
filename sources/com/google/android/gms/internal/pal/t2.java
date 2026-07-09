package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class t2 implements a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a3[] f41821a;

    t2(a3... a3VarArr) {
        this.f41821a = a3VarArr;
    }

    @Override // com.google.android.gms.internal.pal.a3
    public final z2 zzb(Class cls) {
        a3[] a3VarArr = this.f41821a;
        for (int i11 = 0; i11 < 2; i11++) {
            a3 a3Var = a3VarArr[i11];
            if (a3Var.zzc(cls)) {
                return a3Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.pal.a3
    public final boolean zzc(Class cls) {
        a3[] a3VarArr = this.f41821a;
        for (int i11 = 0; i11 < 2; i11++) {
            if (a3VarArr[i11].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
