package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.v6;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u f43492f = new u((Boolean) null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f43495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f43496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumMap f43497e;

    u(Boolean bool, int i11) {
        this(bool, i11, (Boolean) null, (String) null);
    }

    public static u b(Bundle bundle, int i11) {
        if (bundle == null) {
            return new u((Boolean) null, i11);
        }
        EnumMap enumMap = new EnumMap(v6.a.class);
        for (v6.a aVar : u6.DMA.a()) {
            enumMap.put(aVar, v6.q(bundle.getString(aVar.f43571a)));
        }
        return new u(enumMap, i11, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static u c(String str) {
        if (str == null || str.length() <= 0) {
            return f43492f;
        }
        String[] strArrSplit = str.split(":");
        int i11 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(v6.a.class);
        v6.a[] aVarArrA = u6.DMA.a();
        int length = aVarArrA.length;
        int i12 = 1;
        int i13 = 0;
        while (i13 < length) {
            enumMap.put(aVarArrA[i13], v6.g(strArrSplit[i12].charAt(0)));
            i13++;
            i12++;
        }
        return new u(enumMap, i11);
    }

    public static Boolean d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return v6.q(bundle.getString("ad_personalization"));
    }

    private final String k() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43493a);
        for (v6.a aVar : u6.DMA.a()) {
            sb2.append(":");
            sb2.append(v6.a((Boolean) this.f43497e.get(aVar)));
        }
        return sb2.toString();
    }

    public final int a() {
        return this.f43493a;
    }

    public final Bundle e() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f43497e.entrySet()) {
            Boolean bool = (Boolean) entry.getValue();
            if (bool != null) {
                bundle.putString(((v6.a) entry.getKey()).f43571a, v6.j(bool.booleanValue()));
            }
        }
        Boolean bool2 = this.f43495c;
        if (bool2 != null) {
            bundle.putString("is_dma_region", bool2.toString());
        }
        String str = this.f43496d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f43494b.equalsIgnoreCase(uVar.f43494b) && on.c.a(this.f43495c, uVar.f43495c)) {
            return on.c.a(this.f43496d, uVar.f43496d);
        }
        return false;
    }

    public final Boolean f() {
        return (Boolean) this.f43497e.get(v6.a.AD_USER_DATA);
    }

    public final Boolean g() {
        return this.f43495c;
    }

    public final String h() {
        return this.f43496d;
    }

    public final int hashCode() {
        Boolean bool = this.f43495c;
        int i11 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f43496d;
        return this.f43494b.hashCode() + (i11 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String i() {
        return this.f43494b;
    }

    public final boolean j() {
        Iterator it = this.f43497e.values().iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(v6.h(this.f43493a));
        for (v6.a aVar : u6.DMA.a()) {
            sb2.append(",");
            sb2.append(aVar.f43571a);
            sb2.append("=");
            Boolean bool = (Boolean) this.f43497e.get(aVar);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                sb2.append(bool.booleanValue() ? "granted" : "denied");
            }
        }
        if (this.f43495c != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(this.f43495c);
        }
        if (this.f43496d != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(this.f43496d);
        }
        return sb2.toString();
    }

    private u(EnumMap enumMap, int i11) {
        this(enumMap, i11, (Boolean) null, (String) null);
    }

    u(Boolean bool, int i11, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(v6.a.class);
        this.f43497e = enumMap;
        enumMap.put(v6.a.AD_USER_DATA, bool);
        this.f43493a = i11;
        this.f43494b = k();
        this.f43495c = bool2;
        this.f43496d = str;
    }

    private u(EnumMap enumMap, int i11, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(v6.a.class);
        this.f43497e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f43493a = i11;
        this.f43494b = k();
        this.f43495c = bool;
        this.f43496d = str;
    }
}
