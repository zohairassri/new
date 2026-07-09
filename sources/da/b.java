package da;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f89517b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f89518c = new b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f89519d = new b(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f89520e = new b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f89521a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(float f11) {
            if (f11 >= 0.0f) {
                return f11 < 600.0f ? b.f89518c : f11 < 840.0f ? b.f89519d : b.f89520e;
            }
            throw new IllegalArgumentException(("Width must be positive, received " + f11).toString());
        }

        private a() {
        }
    }

    private b(int i11) {
        this.f89521a = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && b.class == obj.getClass() && this.f89521a == ((b) obj).f89521a;
    }

    public int hashCode() {
        return this.f89521a;
    }

    public String toString() {
        return "WindowWidthSizeClass: " + (Intrinsics.areEqual(this, f89518c) ? "COMPACT" : Intrinsics.areEqual(this, f89519d) ? "MEDIUM" : Intrinsics.areEqual(this, f89520e) ? "EXPANDED" : "UNKNOWN");
    }
}
