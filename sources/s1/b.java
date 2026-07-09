package s1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f125402a;

    public b(int i11) {
        this.f125402a = i11;
    }

    public final int a() {
        return this.f125402a;
    }

    public final void b(int i11) {
        this.f125402a += i11;
    }

    public final void c(int i11) {
        this.f125402a = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f125402a == ((b) obj).f125402a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f125402a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f125402a + ')';
    }

    public /* synthetic */ b(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
