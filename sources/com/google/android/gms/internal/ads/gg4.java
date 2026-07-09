package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class gg4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f27008c = Logger.getLogger(gg4.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final gg4 f27009d = new gg4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f27010a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f27011b = new ConcurrentHashMap();

    public static gg4 a() {
        return f27009d;
    }

    private final synchronized y74 g(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = this.f27010a;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 98);
            sb2.append("No key manager found for key type ");
            sb2.append(str);
            sb2.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb2.toString());
        }
        return (y74) concurrentMap.get(str);
    }

    private final synchronized void h(y74 y74Var, boolean z11, boolean z12) {
        try {
            String strZzb = y74Var.zzb();
            if (z12) {
                ConcurrentMap concurrentMap = this.f27011b;
                if (concurrentMap.containsKey(strZzb) && !((Boolean) concurrentMap.get(strZzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
                }
            }
            ConcurrentMap concurrentMap2 = this.f27010a;
            y74 y74Var2 = (y74) concurrentMap2.get(strZzb);
            if (y74Var2 != null && !y74Var2.getClass().equals(y74Var.getClass())) {
                f27008c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzb, y74Var2.getClass().getName(), y74Var.getClass().getName()));
            }
            concurrentMap2.putIfAbsent(strZzb, y74Var);
            this.f27011b.put(strZzb, Boolean.valueOf(z12));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(y74 y74Var, boolean z11) {
        f(y74Var, 1, z11);
    }

    public final y74 c(String str, Class cls) throws GeneralSecurityException {
        y74 y74VarG = g(str);
        if (y74VarG.zzc().equals(cls)) {
            return y74VarG;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(y74VarG.getClass());
        String string = y74VarG.zzc().toString();
        StringBuilder sb2 = new StringBuilder(name.length() + 53 + strValueOf.length() + 23 + string.length());
        sb2.append("Primitive type ");
        sb2.append(name);
        sb2.append(" not supported by key manager of type ");
        sb2.append(strValueOf);
        sb2.append(", which only supports: ");
        sb2.append(string);
        throw new GeneralSecurityException(sb2.toString());
    }

    public final y74 d(String str) {
        return g(str);
    }

    public final boolean e(String str) {
        return ((Boolean) this.f27011b.get(str)).booleanValue();
    }

    public final synchronized void f(y74 y74Var, int i11, boolean z11) {
        if (!gf4.a(i11)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        h(y74Var, false, z11);
    }
}
