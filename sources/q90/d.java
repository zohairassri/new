package q90;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f122554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f122555b;

    public d(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f122554a = key;
        this.f122555b = value;
    }

    public final String a() {
        return this.f122554a;
    }

    public final String b() {
        return this.f122555b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f122554a, dVar.f122554a) && Intrinsics.areEqual(this.f122555b, dVar.f122555b);
    }

    public int hashCode() {
        return (this.f122554a.hashCode() * 31) + this.f122555b.hashCode();
    }

    public String toString() {
        return "SpanAttributeData(key=" + this.f122554a + ", value=" + this.f122555b + ')';
    }
}
