package com.google.protobuf;

import com.google.protobuf.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c0 f47325b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47326a;

    static {
        c0 c0Var = new c0();
        f47325b = c0Var;
        c0Var.n();
    }

    private c0() {
        this.f47326a = true;
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
            return s.d((byte[]) obj);
        }
        if (obj instanceof s.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void f(Map map) {
        for (Object obj : map.keySet()) {
            s.a(obj);
            s.a(map.get(obj));
        }
    }

    public static c0 g() {
        return f47325b;
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
        return this.f47326a;
    }

    public void n() {
        this.f47326a = false;
    }

    public void o(c0 c0Var) {
        h();
        if (c0Var.isEmpty()) {
            return;
        }
        putAll(c0Var);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        h();
        s.a(obj);
        s.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        h();
        f(map);
        super.putAll(map);
    }

    public c0 q() {
        return isEmpty() ? new c0() : new c0(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        return super.remove(obj);
    }

    private c0(Map map) {
        super(map);
        this.f47326a = true;
    }
}
