package ea;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f91591a;

    public k(List displayFeatures) {
        Intrinsics.checkNotNullParameter(displayFeatures, "displayFeatures");
        this.f91591a = displayFeatures;
    }

    public final List a() {
        return this.f91591a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(k.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f91591a, ((k) obj).f91591a);
    }

    public int hashCode() {
        return this.f91591a.hashCode();
    }

    public String toString() {
        return CollectionsKt.B0(this.f91591a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
