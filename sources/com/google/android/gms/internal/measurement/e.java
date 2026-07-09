package com.google.android.gms.internal.measurement;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.common.collect.a0 f40246d = com.google.common.collect.a0.D("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f40247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f40248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f40249c;

    public e(String str, long j11, Map map) {
        this.f40247a = str;
        this.f40248b = j11;
        HashMap map2 = new HashMap();
        this.f40249c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        if (f40246d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith(QueryKeys.END_MARKER)) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else {
            if (obj instanceof Double) {
                return obj2;
            }
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final long a() {
        return this.f40248b;
    }

    public final Object b(String str) {
        if (this.f40249c.containsKey(str)) {
            return this.f40249c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new e(this.f40247a, this.f40248b, new HashMap(this.f40249c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f40249c.remove(str);
        } else {
            this.f40249c.put(str, c(str, this.f40249c.get(str), obj));
        }
    }

    public final String e() {
        return this.f40247a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f40248b == eVar.f40248b && this.f40247a.equals(eVar.f40247a)) {
            return this.f40249c.equals(eVar.f40249c);
        }
        return false;
    }

    public final void f(String str) {
        this.f40247a = str;
    }

    public final Map g() {
        return this.f40249c;
    }

    public final int hashCode() {
        int iHashCode = this.f40247a.hashCode() * 31;
        long j11 = this.f40248b;
        return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f40249c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f40247a + "', timestamp=" + this.f40248b + ", params=" + String.valueOf(this.f40249c) + "}";
    }
}
