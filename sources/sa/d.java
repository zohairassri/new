package sa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f126228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f126229b;

    public d(String key, Long l11) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f126228a = key;
        this.f126229b = l11;
    }

    public final String a() {
        return this.f126228a;
    }

    public final Long b() {
        return this.f126229b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f126228a, dVar.f126228a) && Intrinsics.areEqual(this.f126229b, dVar.f126229b);
    }

    public int hashCode() {
        int iHashCode = this.f126228a.hashCode() * 31;
        Long l11 = this.f126229b;
        return iHashCode + (l11 == null ? 0 : l11.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f126228a + ", value=" + this.f126229b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String key, boolean z11) {
        this(key, Long.valueOf(z11 ? 1L : 0L));
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
