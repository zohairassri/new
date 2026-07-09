package com.google.android.gms.internal.pal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class o2 extends q2 {
    /* synthetic */ o2(n2 n2Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.pal.q2
    final List a(Object obj, long j11) {
        g2 g2Var = (g2) d4.k(obj, j11);
        if (g2Var.zzc()) {
            return g2Var;
        }
        int size = g2Var.size();
        g2 g2VarZzd = g2Var.zzd(size == 0 ? 10 : size + size);
        d4.x(obj, j11, g2VarZzd);
        return g2VarZzd;
    }

    @Override // com.google.android.gms.internal.pal.q2
    final void b(Object obj, long j11) {
        ((g2) d4.k(obj, j11)).zzb();
    }

    @Override // com.google.android.gms.internal.pal.q2
    final void c(Object obj, Object obj2, long j11) {
        g2 g2VarZzd = (g2) d4.k(obj, j11);
        g2 g2Var = (g2) d4.k(obj2, j11);
        int size = g2VarZzd.size();
        int size2 = g2Var.size();
        if (size > 0 && size2 > 0) {
            if (!g2VarZzd.zzc()) {
                g2VarZzd = g2VarZzd.zzd(size2 + size);
            }
            g2VarZzd.addAll(g2Var);
        }
        if (size > 0) {
            g2Var = g2VarZzd;
        }
        d4.x(obj, j11, g2Var);
    }
}
