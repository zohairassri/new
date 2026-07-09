package vf;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f133002a;

    public c(Set types) {
        Intrinsics.checkNotNullParameter(types, "types");
        this.f133002a = types;
    }

    public final Set a() {
        return this.f133002a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f133002a, ((c) obj).f133002a);
    }

    public int hashCode() {
        return this.f133002a.hashCode();
    }

    public String toString() {
        return "TracingHeaderTypesSet(types=" + this.f133002a + ")";
    }
}
