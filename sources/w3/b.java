package w3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f134032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f134033b;

    public b(Object obj, Object obj2) {
        this.f134032a = obj;
        this.f134033b = obj2;
    }

    public final Object a() {
        return this.f134032a;
    }

    public final Object b() {
        return this.f134033b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f134032a, bVar.f134032a) && Intrinsics.areEqual(this.f134033b, bVar.f134033b);
    }

    public int hashCode() {
        Object obj = this.f134032a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f134033b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "TargetState(initial=" + this.f134032a + ", target=" + this.f134033b + ')';
    }
}
