package x1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f136525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f136526b;

    public p(int i11, Integer num) {
        this.f136525a = i11;
        this.f136526b = num;
    }

    public final int a() {
        return this.f136525a;
    }

    public final Integer b() {
        return this.f136526b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f136525a == pVar.f136525a && Intrinsics.areEqual(this.f136526b, pVar.f136526b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f136525a) * 31;
        Integer num = this.f136526b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ObjectLocation(group=" + this.f136525a + ", dataOffset=" + this.f136526b + ')';
    }
}
