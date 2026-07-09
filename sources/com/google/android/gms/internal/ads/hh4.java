package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class hh4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final hh4 f27744b = new hh4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f27745a = new HashMap();

    hh4() {
    }

    public static hh4 a() {
        return f27744b;
    }

    public final synchronized void b(String str, n84 n84Var) {
        try {
            Map map = this.f27745a;
            if (!map.containsKey(str)) {
                map.put(str, n84Var);
                return;
            }
            if (((n84) map.get(str)).equals(n84Var)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(n84Var);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb2.append("Parameters object with name ");
            sb2.append(str);
            sb2.append(" already exists (");
            sb2.append(strValueOf);
            sb2.append("), cannot insert ");
            sb2.append(strValueOf2);
            throw new GeneralSecurityException(sb2.toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized n84 c(String str) {
        Map map;
        map = this.f27745a;
        if (!map.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (n84) map.get("AES128_GCM");
    }

    public final synchronized void d(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            b((String) entry.getKey(), (n84) entry.getValue());
        }
    }
}
