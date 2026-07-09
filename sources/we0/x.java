package we0;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class x implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f135204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f135205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f135206c;

    public x(Object obj, Object obj2, Object obj3) {
        this.f135204a = obj;
        this.f135205b = obj2;
        this.f135206c = obj3;
    }

    public final Object a() {
        return this.f135204a;
    }

    public final Object b() {
        return this.f135205b;
    }

    public final Object c() {
        return this.f135206c;
    }

    public final Object d() {
        return this.f135204a;
    }

    public final Object e() {
        return this.f135205b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.areEqual(this.f135204a, xVar.f135204a) && Intrinsics.areEqual(this.f135205b, xVar.f135205b) && Intrinsics.areEqual(this.f135206c, xVar.f135206c);
    }

    public final Object f() {
        return this.f135206c;
    }

    public int hashCode() {
        Object obj = this.f135204a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f135205b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f135206c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f135204a + ", " + this.f135205b + ", " + this.f135206c + ')';
    }
}
