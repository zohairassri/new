package tr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f130372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f130373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f130375d;

    public t(String processName, int i11, int i12, boolean z11) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.f130372a = processName;
        this.f130373b = i11;
        this.f130374c = i12;
        this.f130375d = z11;
    }

    public final int a() {
        return this.f130374c;
    }

    public final int b() {
        return this.f130373b;
    }

    public final String c() {
        return this.f130372a;
    }

    public final boolean d() {
        return this.f130375d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f130372a, tVar.f130372a) && this.f130373b == tVar.f130373b && this.f130374c == tVar.f130374c && this.f130375d == tVar.f130375d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((this.f130372a.hashCode() * 31) + Integer.hashCode(this.f130373b)) * 31) + Integer.hashCode(this.f130374c)) * 31;
        boolean z11 = this.f130375d;
        ?? r22 = z11;
        if (z11) {
            r22 = 1;
        }
        return iHashCode + r22;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f130372a + ", pid=" + this.f130373b + ", importance=" + this.f130374c + ", isDefaultProcess=" + this.f130375d + ')';
    }
}
