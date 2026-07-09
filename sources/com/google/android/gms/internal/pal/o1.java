package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile o1 f41614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final o1 f41615c = new o1(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f41616a = Collections.EMPTY_MAP;

    o1(boolean z11) {
    }

    public static o1 a() {
        o1 o1Var;
        o1 o1Var2 = f41614b;
        if (o1Var2 != null) {
            return o1Var2;
        }
        synchronized (o1.class) {
            try {
                o1Var = f41614b;
                if (o1Var == null) {
                    o1Var = f41615c;
                    f41614b = o1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o1Var;
    }

    public final y1 b(c3 c3Var, int i11) {
        android.support.v4.media.a.a(this.f41616a.get(new n1(c3Var, i11)));
        return null;
    }
}
