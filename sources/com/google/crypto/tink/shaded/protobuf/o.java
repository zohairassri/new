package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.w;
import java.util.Collections;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f46243b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile o f46244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final o f46245d = new o(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f46246a = Collections.EMPTY_MAP;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f46247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f46248b;

        a(Object obj, int i11) {
            this.f46247a = obj;
            this.f46248b = i11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f46247a == aVar.f46247a && this.f46248b == aVar.f46248b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f46247a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f46248b;
        }
    }

    o(boolean z11) {
    }

    public static o b() {
        o oVarA;
        o oVar = f46244c;
        if (oVar != null) {
            return oVar;
        }
        synchronized (o.class) {
            try {
                oVarA = f46244c;
                if (oVarA == null) {
                    oVarA = f46243b ? n.a() : f46245d;
                    f46244c = oVarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVarA;
    }

    public w.c a(m0 m0Var, int i11) {
        android.support.v4.media.a.a(this.f46246a.get(new a(m0Var, i11)));
        return null;
    }
}
