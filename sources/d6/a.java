package d6;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0944a f89293b = new C0944a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f89294a = new LinkedHashMap();

    /* JADX INFO: renamed from: d6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C0944a {
        public /* synthetic */ C0944a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0944a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f89295c = new b();

        private b() {
        }

        @Override // d6.a
        public Object a(c key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface c {
    }

    public abstract Object a(c cVar);

    public final Map b() {
        return this.f89294a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && Intrinsics.areEqual(this.f89294a, ((a) obj).f89294a);
    }

    public int hashCode() {
        return this.f89294a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.f89294a + ')';
    }
}
