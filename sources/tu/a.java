package tu;

import kotlin.jvm.internal.Intrinsics;
import lc.t0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0 f130433a;

    public a(t0 pageViewId) {
        Intrinsics.checkNotNullParameter(pageViewId, "pageViewId");
        this.f130433a = pageViewId;
    }

    public final t0 a() {
        return this.f130433a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f130433a, ((a) obj).f130433a);
    }

    public int hashCode() {
        return this.f130433a.hashCode();
    }

    public String toString() {
        return "ShareCodeOptions(pageViewId=" + this.f130433a + ")";
    }
}
