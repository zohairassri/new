package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.v;
import java.util.Collections;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f7654b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile n f7656d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7658a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f7655c = c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final n f7657e = new n(true);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f7659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7660b;

        a(Object obj, int i11) {
            this.f7659a = obj;
            this.f7660b = i11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7659a == aVar.f7659a && this.f7660b == aVar.f7660b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f7659a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f7660b;
        }
    }

    n(boolean z11) {
    }

    public static n b() {
        n nVarA;
        n nVar = f7656d;
        if (nVar != null) {
            return nVar;
        }
        synchronized (n.class) {
            try {
                nVarA = f7656d;
                if (nVarA == null) {
                    nVarA = f7654b ? m.a() : f7657e;
                    f7656d = nVarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVarA;
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public v.c a(m0 m0Var, int i11) {
        android.support.v4.media.a.a(this.f7658a.get(new a(m0Var, i11)));
        return null;
    }
}
