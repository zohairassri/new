package com.google.android.gms.internal.atv_ads_framework;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class v2 extends x2 {
    /* synthetic */ v2(t2 t2Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.x2
    final void a(Object obj, long j11) {
        ((m2) g4.k(obj, j11)).zzb();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.x2
    final void b(Object obj, Object obj2, long j11) {
        m2 m2VarZzg = (m2) g4.k(obj, j11);
        m2 m2Var = (m2) g4.k(obj2, j11);
        int size = m2VarZzg.size();
        int size2 = m2Var.size();
        if (size > 0 && size2 > 0) {
            if (!m2VarZzg.zzc()) {
                m2VarZzg = m2VarZzg.zzg(size2 + size);
            }
            m2VarZzg.addAll(m2Var);
        }
        if (size > 0) {
            m2Var = m2VarZzg;
        }
        g4.x(obj, j11, m2Var);
    }
}
