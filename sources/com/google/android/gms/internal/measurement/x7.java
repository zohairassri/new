package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.j8;
import java.util.Collections;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class x7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile x7 f40914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final x7 f40915c = new x7(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f40916a = Collections.EMPTY_MAP;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f40917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f40918b;

        a(Object obj, int i11) {
            this.f40917a = obj;
            this.f40918b = i11;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f40917a == aVar.f40917a && this.f40918b == aVar.f40918b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f40917a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f40918b;
        }
    }

    private x7(boolean z11) {
    }

    public static x7 a() {
        x7 x7Var = f40914b;
        if (x7Var != null) {
            return x7Var;
        }
        synchronized (x7.class) {
            try {
                x7 x7Var2 = f40914b;
                if (x7Var2 != null) {
                    return x7Var2;
                }
                x7 x7VarA = i8.a(x7.class);
                f40914b = x7VarA;
                return x7VarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final j8.d b(r9 r9Var, int i11) {
        android.support.v4.media.a.a(this.f40916a.get(new a(r9Var, i11)));
        return null;
    }
}
