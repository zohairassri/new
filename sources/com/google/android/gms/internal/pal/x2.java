package com.google.android.gms.internal.pal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class x2 {
    x2() {
    }

    public static final int a(int i11, Object obj, Object obj2) {
        v2 v2Var = (v2) obj;
        android.support.v4.media.a.a(obj2);
        if (v2Var.isEmpty()) {
            return 0;
        }
        Iterator it = v2Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean b(Object obj) {
        return !((v2) obj).h();
    }

    public static final Object c(Object obj, Object obj2) {
        v2 v2VarD = (v2) obj;
        v2 v2Var = (v2) obj2;
        if (!v2Var.isEmpty()) {
            if (!v2VarD.h()) {
                v2VarD = v2VarD.d();
            }
            v2VarD.g(v2Var);
        }
        return v2VarD;
    }
}
