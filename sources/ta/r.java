package ta;

import android.net.NetworkRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f129543b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f129544c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f129545a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return r.f129544c;
        }

        private a() {
        }
    }

    static {
        String strI = androidx.work.z.i("NetworkRequestCompat");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"NetworkRequestCompat\")");
        f129544c = strI;
    }

    public r(Object obj) {
        this.f129545a = obj;
    }

    public final NetworkRequest b() {
        return (NetworkRequest) this.f129545a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.areEqual(this.f129545a, ((r) obj).f129545a);
    }

    public int hashCode() {
        Object obj = this.f129545a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f129545a + ')';
    }

    public /* synthetic */ r(Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : obj);
    }
}
