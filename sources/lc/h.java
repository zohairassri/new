package lc;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f114076a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Set possibleTypes) {
        super(null);
        Intrinsics.checkNotNullParameter(possibleTypes, "possibleTypes");
        this.f114076a = possibleTypes;
    }

    public final Set a() {
        return this.f114076a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.areEqual(this.f114076a, ((h) obj).f114076a);
    }

    public int hashCode() {
        return this.f114076a.hashCode();
    }

    public String toString() {
        return "BPossibleTypes(possibleTypes=" + this.f114076a + ')';
    }
}
