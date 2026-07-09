package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ly4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ly4 f30487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final ly4 f30488c = new ly4(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30489a = Collections.EMPTY_MAP;

    ly4(boolean z11) {
    }

    public static ly4 a() {
        int i11 = kx4.f29903a;
        return f30488c;
    }

    public static ly4 b() {
        ly4 ly4Var = f30487b;
        if (ly4Var != null) {
            return ly4Var;
        }
        synchronized (ly4.class) {
            try {
                ly4 ly4Var2 = f30487b;
                if (ly4Var2 != null) {
                    return ly4Var2;
                }
                int i11 = kx4.f29903a;
                ly4 ly4VarA = ty4.a(ly4.class);
                f30487b = ly4VarA;
                return ly4VarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final xy4 c(c05 c05Var, int i11) {
        android.support.v4.media.a.a(this.f30489a.get(new ky4(c05Var, i11)));
        return null;
    }
}
