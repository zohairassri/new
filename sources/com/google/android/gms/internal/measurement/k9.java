package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class k9 implements s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s9[] f40478a;

    k9(s9... s9VarArr) {
        this.f40478a = s9VarArr;
    }

    @Override // com.google.android.gms.internal.measurement.s9
    public final p9 zza(Class cls) {
        for (s9 s9Var : this.f40478a) {
            if (s9Var.zzb(cls)) {
                return s9Var.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.s9
    public final boolean zzb(Class cls) {
        for (s9 s9Var : this.f40478a) {
            if (s9Var.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
