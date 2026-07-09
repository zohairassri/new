package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class l9 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l9 f40505b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40506a;

    static {
        l9 l9Var = new l9();
        f40505b = l9Var;
        l9Var.f40506a = false;
    }

    private l9() {
        this.f40506a = true;
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return l8.d((byte[]) obj);
        }
        if (obj instanceof p8) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static l9 d() {
        return f40505b;
    }

    private final void k() {
        if (!this.f40506a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        k();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r6 = (java.util.Map) r6
            r0 = 1
            if (r5 == r6) goto L59
            int r2 = r5.size()
            int r3 = r6.size()
            if (r2 == r3) goto L16
        L14:
            r5 = r1
            goto L5a
        L16:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r6.containsKey(r3)
            if (r3 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r3 = r2.getValue()
            java.lang.Object r2 = r2.getKey()
            java.lang.Object r2 = r6.get(r2)
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L52
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L52
            byte[] r3 = (byte[]) r3
            byte[] r2 = (byte[]) r2
            boolean r2 = java.util.Arrays.equals(r3, r2)
            goto L56
        L52:
            boolean r2 = r3.equals(r2)
        L56:
            if (r2 != 0) goto L1e
            goto L14
        L59:
            r5 = r0
        L5a:
            if (r5 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.l9.equals(java.lang.Object):boolean");
    }

    public final void f(l9 l9Var) {
        k();
        if (l9Var.isEmpty()) {
            return;
        }
        putAll(l9Var);
    }

    public final l9 g() {
        return isEmpty() ? new l9() : new l9(this);
    }

    public final void h() {
        this.f40506a = false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iC = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iC += c(entry.getValue()) ^ c(entry.getKey());
        }
        return iC;
    }

    public final boolean i() {
        return this.f40506a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        k();
        l8.e(obj);
        l8.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        k();
        for (Object obj : map.keySet()) {
            l8.e(obj);
            l8.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        k();
        return super.remove(obj);
    }

    private l9(Map map) {
        super(map);
        this.f40506a = true;
    }
}
