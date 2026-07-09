package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class nz4 {
    nz4() {
    }

    public static final List a(Object obj, long j11) {
        iz4 iz4Var = (iz4) k15.u(obj, j11);
        if (iz4Var.zza()) {
            return iz4Var;
        }
        int size = iz4Var.size();
        iz4 iz4VarZzh = iz4Var.zzh(size == 0 ? 10 : size + size);
        k15.v(obj, j11, iz4VarZzh);
        return iz4VarZzh;
    }
}
