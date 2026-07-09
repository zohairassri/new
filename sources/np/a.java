package np;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f119489b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f119490a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HashMap f119491a = new HashMap();

        public a a() {
            if (this.f119491a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            a aVar = new a(Collections.unmodifiableMap(this.f119491a));
            this.f119491a = null;
            return aVar;
        }
    }

    public static b a() {
        return new b();
    }

    public Map b() {
        return this.f119490a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f119490a.equals(((a) obj).f119490a);
        }
        return false;
    }

    public int hashCode() {
        return this.f119490a.hashCode();
    }

    public String toString() {
        return this.f119490a.toString();
    }

    private a(Map map) {
        this.f119490a = map;
    }
}
