package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class nw4 implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    nw4 f31670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    nw4 f31671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    nw4 f31672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    nw4 f31673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    nw4 f31674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Object f31675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f31676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f31677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f31678i;

    nw4(boolean z11) {
        this.f31675f = null;
        this.f31676g = z11;
        this.f31674e = this;
        this.f31673d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f31675f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f31677h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f31675f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f31677h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f31675f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f31677h;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f31676g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f31677h;
        this.f31677h = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f31675f);
        String strValueOf2 = String.valueOf(this.f31677h);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }

    nw4(boolean z11, nw4 nw4Var, Object obj, nw4 nw4Var2, nw4 nw4Var3) {
        this.f31670a = nw4Var;
        this.f31675f = obj;
        this.f31676g = z11;
        this.f31678i = 1;
        this.f31673d = nw4Var2;
        this.f31674e = nw4Var3;
        nw4Var3.f31673d = this;
        nw4Var2.f31674e = this;
    }
}
