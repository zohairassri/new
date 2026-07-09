package we0;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class t implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f135193b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f135194a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f135195a;

        public b(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f135195a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && Intrinsics.areEqual(this.f135195a, ((b) obj).f135195a);
        }

        public int hashCode() {
            return this.f135195a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f135195a + ')';
        }
    }

    private /* synthetic */ t(Object obj) {
        this.f135194a = obj;
    }

    public static final /* synthetic */ t a(Object obj) {
        return new t(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof t) && Intrinsics.areEqual(obj, ((t) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f135195a;
        }
        return null;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(Object obj) {
        return obj instanceof b;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof b);
    }

    public static String i(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f135194a, obj);
    }

    public int hashCode() {
        return f(this.f135194a);
    }

    public final /* synthetic */ Object j() {
        return this.f135194a;
    }

    public String toString() {
        return i(this.f135194a);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
