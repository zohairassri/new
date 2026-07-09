package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class g0 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g0 f46124b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f46125a;

    static {
        g0 g0Var = new g0();
        f46124b = g0Var;
        g0Var.n();
    }

    private g0() {
        this.f46125a = true;
    }

    static int c(Map map) {
        int iD = 0;
        for (Map.Entry entry : map.entrySet()) {
            iD += d(entry.getValue()) ^ d(entry.getKey());
        }
        return iD;
    }

    private static int d(Object obj) {
        if (obj instanceof byte[]) {
            return y.d((byte[]) obj);
        }
        if (obj instanceof y.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void f(Map map) {
        for (Object obj : map.keySet()) {
            y.a(obj);
            y.a(map.get(obj));
        }
    }

    public static g0 g() {
        return f46124b;
    }

    private void h() {
        if (!m()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean i(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean k(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !i(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && k(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return c(this);
    }

    public boolean m() {
        return this.f46125a;
    }

    public void n() {
        this.f46125a = false;
    }

    public void o(g0 g0Var) {
        h();
        if (g0Var.isEmpty()) {
            return;
        }
        putAll(g0Var);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        h();
        y.a(obj);
        y.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        h();
        f(map);
        super.putAll(map);
    }

    public g0 q() {
        return isEmpty() ? new g0() : new g0(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        return super.remove(obj);
    }

    private g0(Map map) {
        super(map);
        this.f46125a = true;
    }
}
