package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.f0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class i0 implements h0 {
    i0() {
    }

    private static int i(int i11, Object obj, Object obj2) {
        g0 g0Var = (g0) obj;
        android.support.v4.media.a.a(obj2);
        if (g0Var.isEmpty()) {
            return 0;
        }
        Iterator it = g0Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    private static g0 j(Object obj, Object obj2) {
        g0 g0VarQ = (g0) obj;
        g0 g0Var = (g0) obj2;
        if (!g0Var.isEmpty()) {
            if (!g0VarQ.m()) {
                g0VarQ = g0VarQ.q();
            }
            g0VarQ.o(g0Var);
        }
        return g0VarQ;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public f0.a b(Object obj) {
        android.support.v4.media.a.a(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Map c(Object obj) {
        return (g0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Object d(Object obj) {
        ((g0) obj).n();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public int e(int i11, Object obj, Object obj2) {
        return i(i11, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Map f(Object obj) {
        return (g0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Object g(Object obj) {
        return g0.g().q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public boolean h(Object obj) {
        return !((g0) obj).m();
    }
}
