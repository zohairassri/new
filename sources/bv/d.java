package bv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f15169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f15170c;

    public d(int i11, c alias, f keystoreType) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(keystoreType, "keystoreType");
        this.f15168a = i11;
        this.f15169b = alias;
        this.f15170c = keystoreType;
    }

    public final String a() {
        return this.f15169b.b();
    }

    public final int b() {
        return this.f15168a;
    }

    public final f c() {
        return this.f15170c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f15168a == dVar.f15168a && Intrinsics.areEqual(this.f15169b, dVar.f15169b) && this.f15170c == dVar.f15170c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f15168a) * 31) + this.f15169b.hashCode()) * 31) + this.f15170c.hashCode();
    }

    public String toString() {
        return "KeyConfiguration(keystoreId=" + this.f15168a + ", alias=" + this.f15169b + ", keystoreType=" + this.f15170c + ")";
    }
}
