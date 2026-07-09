package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.f0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class i0 implements h0 {
    i0() {
    }

    private static int i(int i11, Object obj, Object obj2) {
        g0 g0Var = (g0) obj;
        f0 f0Var = (f0) obj2;
        int iA = 0;
        if (g0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : g0Var.entrySet()) {
            iA += f0Var.a(i11, entry.getKey(), entry.getValue());
        }
        return iA;
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

    @Override // androidx.datastore.preferences.protobuf.h0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public f0.a b(Object obj) {
        return ((f0) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public Map c(Object obj) {
        return (g0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public Object d(Object obj) {
        ((g0) obj).n();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public int e(int i11, Object obj, Object obj2) {
        return i(i11, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public Map f(Object obj) {
        return (g0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public Object g(Object obj) {
        return g0.g().q();
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public boolean h(Object obj) {
        return !((g0) obj).m();
    }
}
