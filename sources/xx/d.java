package xx;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qx.e f138220a;

    public d(qx.e scale) {
        Intrinsics.checkNotNullParameter(scale, "scale");
        this.f138220a = scale;
    }

    public final qx.e a() {
        return this.f138220a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f138220a == ((d) obj).f138220a;
    }

    public int hashCode() {
        return this.f138220a.hashCode();
    }

    public String toString() {
        return "SystemTheme(scale=" + this.f138220a + ")";
    }

    public /* synthetic */ d(qx.e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? qx.e.f123212d : eVar);
    }
}
