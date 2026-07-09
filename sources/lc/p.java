package lc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f114110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f114111b;

    public p(String name, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f114110a = name;
        this.f114111b = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f114110a, pVar.f114110a) && this.f114111b == pVar.f114111b;
    }

    public int hashCode() {
        return (this.f114110a.hashCode() * 31) + Boolean.hashCode(this.f114111b);
    }

    public String toString() {
        return "CompiledCondition(name=" + this.f114110a + ", inverted=" + this.f114111b + ')';
    }
}
