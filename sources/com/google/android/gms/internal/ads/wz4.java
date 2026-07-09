package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class wz4 {
    wz4() {
    }

    public static final boolean a(Object obj) {
        return !((vz4) obj).h();
    }

    public static final Object b(Object obj, Object obj2) {
        vz4 vz4VarF = (vz4) obj;
        vz4 vz4Var = (vz4) obj2;
        if (!vz4Var.isEmpty()) {
            if (!vz4VarF.h()) {
                vz4VarF = vz4VarF.f();
            }
            vz4VarF.d(vz4Var);
        }
        return vz4VarF;
    }
}
