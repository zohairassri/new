package sb0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f126335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f126336b;

    public a(String id2, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f126335a = id2;
        this.f126336b = z11;
    }

    public final String a() {
        return this.f126335a;
    }

    public final boolean b() {
        return this.f126336b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f126335a, aVar.f126335a) && this.f126336b == aVar.f126336b;
    }

    public int hashCode() {
        return (this.f126335a.hashCode() * 31) + Boolean.hashCode(this.f126336b);
    }

    public String toString() {
        return "SessionData(id=" + this.f126335a + ", isForeground=" + this.f126336b + ')';
    }
}
