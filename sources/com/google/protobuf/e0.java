package com.google.protobuf;

import com.google.protobuf.b0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class e0 implements d0 {
    e0() {
    }

    private static int f(int i11, Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        b0 b0Var = (b0) obj2;
        int iA = 0;
        if (c0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : c0Var.entrySet()) {
            iA += b0Var.a(i11, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static c0 g(Object obj, Object obj2) {
        c0 c0VarQ = (c0) obj;
        c0 c0Var = (c0) obj2;
        if (!c0Var.isEmpty()) {
            if (!c0VarQ.m()) {
                c0VarQ = c0VarQ.q();
            }
            c0VarQ.o(c0Var);
        }
        return c0VarQ;
    }

    @Override // com.google.protobuf.d0
    public Object a(Object obj, Object obj2) {
        return g(obj, obj2);
    }

    @Override // com.google.protobuf.d0
    public b0.a b(Object obj) {
        return ((b0) obj).c();
    }

    @Override // com.google.protobuf.d0
    public Map c(Object obj) {
        return (c0) obj;
    }

    @Override // com.google.protobuf.d0
    public Object d(Object obj) {
        ((c0) obj).n();
        return obj;
    }

    @Override // com.google.protobuf.d0
    public int e(int i11, Object obj, Object obj2) {
        return f(i11, obj, obj2);
    }
}
