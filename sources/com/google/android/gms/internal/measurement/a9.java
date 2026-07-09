package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class a9 extends z8 {
    private static s8 e(Object obj, long j11) {
        return (s8) lb.B(obj, j11);
    }

    @Override // com.google.android.gms.internal.measurement.z8
    final void b(Object obj, Object obj2, long j11) {
        s8 s8VarE = e(obj, j11);
        s8 s8VarE2 = e(obj2, j11);
        int size = s8VarE.size();
        int size2 = s8VarE2.size();
        if (size > 0 && size2 > 0) {
            if (!s8VarE.zzc()) {
                s8VarE = s8VarE.zza(size2 + size);
            }
            s8VarE.addAll(s8VarE2);
        }
        if (size > 0) {
            s8VarE2 = s8VarE;
        }
        lb.j(obj, j11, s8VarE2);
    }

    @Override // com.google.android.gms.internal.measurement.z8
    final void d(Object obj, long j11) {
        e(obj, j11).e2();
    }

    private a9() {
        super();
    }
}
