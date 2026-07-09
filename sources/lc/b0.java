package lc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f114021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f114022b;

    public b0(List path, String str) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f114021a = path;
        this.f114022b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.areEqual(this.f114021a, b0Var.f114021a) && Intrinsics.areEqual(this.f114022b, b0Var.f114022b);
    }

    public int hashCode() {
        int iHashCode = this.f114021a.hashCode() * 31;
        String str = this.f114022b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeferredFragmentIdentifier(path=" + this.f114021a + ", label=" + this.f114022b + ')';
    }
}
