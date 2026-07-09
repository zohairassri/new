package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class x05 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f37717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f37718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ b15 f37719c;

    x05(b15 b15Var, Comparable comparable, Object obj) {
        Objects.requireNonNull(b15Var);
        this.f37719c = b15Var;
        this.f37717a = comparable;
        this.f37718b = obj;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f37717a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f37717a.compareTo(((x05) obj).f37717a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return b(this.f37717a, entry.getKey()) && b(this.f37718b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f37717a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f37718b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f37717a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f37718b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f37719c.j();
        Object obj2 = this.f37718b;
        this.f37718b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f37717a);
        String strValueOf2 = String.valueOf(this.f37718b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
