package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ai4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f23310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f23311b;

    /* synthetic */ ai4(di4 di4Var, byte[] bArr) {
        this.f23310a = new HashMap(di4Var.d());
        this.f23311b = new HashMap(di4Var.e());
    }

    public final ai4 a(zh4 zh4Var) throws GeneralSecurityException {
        if (zh4Var == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        bi4 bi4Var = new bi4(zh4Var.b(), zh4Var.c(), null);
        Map map = this.f23310a;
        if (!map.containsKey(bi4Var)) {
            map.put(bi4Var, zh4Var);
            return this;
        }
        zh4 zh4Var2 = (zh4) map.get(bi4Var);
        if (zh4Var2.equals(zh4Var) && zh4Var.equals(zh4Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(bi4Var.toString()));
    }

    public final ai4 b(gi4 gi4Var) throws GeneralSecurityException {
        Map map = this.f23311b;
        Class clsZza = gi4Var.zza();
        if (!map.containsKey(clsZza)) {
            map.put(clsZza, gi4Var);
            return this;
        }
        gi4 gi4Var2 = (gi4) map.get(clsZza);
        if (gi4Var2.equals(gi4Var) && gi4Var.equals(gi4Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
    }

    public final di4 c() {
        return new di4(this, null);
    }

    final /* synthetic */ Map d() {
        return this.f23310a;
    }

    final /* synthetic */ Map e() {
        return this.f23311b;
    }

    /* synthetic */ ai4(byte[] bArr) {
        this.f23310a = new HashMap();
        this.f23311b = new HashMap();
    }
}
