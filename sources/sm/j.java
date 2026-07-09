package sm;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f127147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f127148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile a f127149c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f127150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f127151b;

        a(Object obj, String str) {
            this.f127150a = obj;
            this.f127151b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f127150a == aVar.f127150a && this.f127151b.equals(aVar.f127151b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f127150a) * 31) + this.f127151b.hashCode();
        }
    }

    j(Looper looper, Object obj, String str) {
        this.f127147a = new an.a(looper);
        this.f127148b = com.google.android.gms.common.internal.n.m(obj, "Listener must not be null");
        this.f127149c = new a(obj, com.google.android.gms.common.internal.n.f(str));
    }
}
