package o5;

import java.util.Map;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f120050a;

        public a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f120050a = name;
        }

        public final String a() {
            return this.f120050a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.areEqual(this.f120050a, ((a) obj).f120050a);
            }
            return false;
        }

        public int hashCode() {
            return this.f120050a.hashCode();
        }

        public String toString() {
            return this.f120050a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {
    }

    public abstract Map a();

    public abstract boolean b(a aVar);

    public abstract Object c(a aVar);

    public final o5.a d() {
        return new o5.a(y0.C(a()), false);
    }

    public final d e() {
        return new o5.a(y0.C(a()), true);
    }
}
