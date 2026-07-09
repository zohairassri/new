package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class v6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v6 f43563c = new v6(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f43564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43565b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43571a;

        a(String str) {
            this.f43571a = str;
        }
    }

    private v6(EnumMap enumMap, int i11) {
        EnumMap enumMap2 = new EnumMap(a.class);
        this.f43564a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f43565b = i11;
    }

    static char a(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public static v6 c(Bundle bundle, int i11) {
        if (bundle == null) {
            return new v6(null, null, i11);
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : u6.STORAGE.f43515a) {
            enumMap.put(aVar, q(bundle.getString(aVar.f43571a)));
        }
        return new v6(enumMap, i11);
    }

    public static v6 e(String str) {
        return f(str, 100);
    }

    public static v6 f(String str, int i11) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str != null) {
            a[] aVarArrA = u6.STORAGE.a();
            for (int i12 = 0; i12 < aVarArrA.length; i12++) {
                a aVar = aVarArrA[i12];
                int i13 = i12 + 2;
                if (i13 < str.length()) {
                    enumMap.put(aVar, g(str.charAt(i13)));
                }
            }
        }
        return new v6(enumMap, i11);
    }

    static Boolean g(char c11) {
        if (c11 == '0') {
            return Boolean.FALSE;
        }
        if (c11 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    static String h(int i11) {
        return i11 != -20 ? i11 != -10 ? i11 != 0 ? i11 != 30 ? i11 != 90 ? i11 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API";
    }

    public static String i(Bundle bundle) {
        String string;
        for (a aVar : u6.STORAGE.f43515a) {
            if (bundle.containsKey(aVar.f43571a) && (string = bundle.getString(aVar.f43571a)) != null && q(string) == null) {
                return string;
            }
        }
        return null;
    }

    static String j(boolean z11) {
        return z11 ? "granted" : "denied";
    }

    public static boolean k(int i11, int i12) {
        return i11 <= i12;
    }

    private static int n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    static Boolean q(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final int b() {
        return this.f43565b;
    }

    public final v6 d(v6 v6Var) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : u6.STORAGE.f43515a) {
            Boolean boolValueOf = (Boolean) this.f43564a.get(aVar);
            Boolean bool = (Boolean) v6Var.f43564a.get(aVar);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put(aVar, boolValueOf);
        }
        return new v6(enumMap, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        for (a aVar : u6.STORAGE.f43515a) {
            if (n((Boolean) this.f43564a.get(aVar)) != n((Boolean) v6Var.f43564a.get(aVar))) {
                return false;
            }
        }
        return this.f43565b == v6Var.f43565b;
    }

    public final int hashCode() {
        int iN = this.f43565b * 17;
        Iterator it = this.f43564a.values().iterator();
        while (it.hasNext()) {
            iN = (iN * 31) + n((Boolean) it.next());
        }
        return iN;
    }

    public final boolean l(a aVar) {
        Boolean bool = (Boolean) this.f43564a.get(aVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean m(v6 v6Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!v6Var.l(aVar) && l(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f43564a.entrySet()) {
            Boolean bool = (Boolean) entry.getValue();
            if (bool != null) {
                bundle.putString(((a) entry.getKey()).f43571a, j(bool.booleanValue()));
            }
        }
        return bundle;
    }

    public final v6 p(v6 v6Var) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : u6.STORAGE.f43515a) {
            Boolean bool = (Boolean) this.f43564a.get(aVar);
            if (bool == null) {
                bool = (Boolean) v6Var.f43564a.get(aVar);
            }
            enumMap.put(aVar, bool);
        }
        return new v6(enumMap, this.f43565b);
    }

    public final boolean r(v6 v6Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            Boolean bool = (Boolean) this.f43564a.get(aVar);
            Boolean bool2 = (Boolean) v6Var.f43564a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final Boolean s() {
        return (Boolean) this.f43564a.get(a.AD_STORAGE);
    }

    public final boolean t(v6 v6Var) {
        return r(v6Var, (a[]) this.f43564a.keySet().toArray(new a[0]));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(h(this.f43565b));
        for (a aVar : u6.STORAGE.f43515a) {
            sb2.append(",");
            sb2.append(aVar.f43571a);
            sb2.append("=");
            Boolean bool = (Boolean) this.f43564a.get(aVar);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                sb2.append(bool.booleanValue() ? "granted" : "denied");
            }
        }
        return sb2.toString();
    }

    public final Boolean u() {
        return (Boolean) this.f43564a.get(a.ANALYTICS_STORAGE);
    }

    public final String v() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (a aVar : u6.STORAGE.a()) {
            sb2.append(a((Boolean) this.f43564a.get(aVar)));
        }
        return sb2.toString();
    }

    public final String w() {
        StringBuilder sb2 = new StringBuilder("G2");
        for (a aVar : u6.STORAGE.a()) {
            Boolean bool = (Boolean) this.f43564a.get(aVar);
            sb2.append(bool == null ? 'g' : bool.booleanValue() ? 'G' : 'D');
        }
        return sb2.toString();
    }

    public final boolean x() {
        return l(a.AD_STORAGE);
    }

    public final boolean y() {
        return l(a.ANALYTICS_STORAGE);
    }

    public final boolean z() {
        Iterator it = this.f43564a.values().iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    public v6(Boolean bool, Boolean bool2, int i11) {
        EnumMap enumMap = new EnumMap(a.class);
        this.f43564a = enumMap;
        enumMap.put(a.AD_STORAGE, bool);
        enumMap.put(a.ANALYTICS_STORAGE, bool2);
        this.f43565b = i11;
    }
}
