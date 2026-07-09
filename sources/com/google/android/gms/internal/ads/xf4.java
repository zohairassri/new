package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class xf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f37950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f37951b;

    /* synthetic */ xf4(Map map, Map map2, byte[] bArr) {
        this.f37950a = map;
        this.f37951b = map2;
    }

    public static wf4 a() {
        return new wf4(null);
    }

    public final Enum b(Object obj) throws GeneralSecurityException {
        Enum r12 = (Enum) this.f37951b.get(obj);
        if (r12 != null) {
            return r12;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object c(Enum r22) throws GeneralSecurityException {
        Object obj = this.f37950a.get(r22);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r22)));
    }
}
