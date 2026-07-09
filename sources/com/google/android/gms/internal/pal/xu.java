package com.google.android.gms.internal.pal;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class xu implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    xu f42218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    xu f42219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    xu f42220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    xu f42221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    xu f42222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Object f42223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f42224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f42225h;

    xu() {
        this.f42223f = null;
        this.f42222e = this;
        this.f42221d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f42223f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f42224g;
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
        return this.f42223f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f42224g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f42223f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f42224g;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f42224g;
        this.f42224g = obj;
        return obj2;
    }

    public final String toString() {
        return this.f42223f + "=" + this.f42224g;
    }

    xu(xu xuVar, Object obj, xu xuVar2, xu xuVar3) {
        this.f42218a = xuVar;
        this.f42223f = obj;
        this.f42225h = 1;
        this.f42221d = xuVar2;
        this.f42222e = xuVar3;
        xuVar3.f42221d = this;
        xuVar2.f42222e = this;
    }
}
