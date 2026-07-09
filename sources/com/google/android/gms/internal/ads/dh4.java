package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class dh4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dh4 f25056b = new dh4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f25057a = new HashMap();

    public static dh4 a() {
        return f25056b;
    }

    public final synchronized void b(ch4 ch4Var, Class cls) {
        try {
            Map map = this.f25057a;
            ch4 ch4Var2 = (ch4) map.get(cls);
            if (ch4Var2 != null && !ch4Var2.equals(ch4Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, ch4Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
