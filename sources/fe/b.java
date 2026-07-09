package fe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f94191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f94192b;

    public b(int i11, Integer num) {
        this.f94191a = i11;
        this.f94192b = num;
    }

    public final int a() {
        return this.f94191a;
    }

    public final Integer b() {
        return this.f94192b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f94191a == bVar.f94191a && Intrinsics.areEqual(this.f94192b, bVar.f94192b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f94191a) * 31;
        Integer num = this.f94192b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "RequestExecutionContext(attemptNumber=" + this.f94191a + ", previousResponseCode=" + this.f94192b + ")";
    }
}
