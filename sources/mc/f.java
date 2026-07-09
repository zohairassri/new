package mc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f116023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f116024b;

    public f(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f116023a = name;
        this.f116024b = value;
    }

    public final String a() {
        return this.f116023a;
    }

    public final String b() {
        return this.f116024b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f116023a, fVar.f116023a) && Intrinsics.areEqual(this.f116024b, fVar.f116024b);
    }

    public int hashCode() {
        return (this.f116023a.hashCode() * 31) + this.f116024b.hashCode();
    }

    public String toString() {
        return "HttpHeader(name=" + this.f116023a + ", value=" + this.f116024b + ')';
    }
}
