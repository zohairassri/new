package de;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f89674a;

    public g(boolean z11) {
        this.f89674a = z11;
    }

    public final boolean a() {
        return this.f89674a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f89674a == ((g) obj).f89674a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f89674a);
    }

    public String toString() {
        return "ProcessInfo(isMainProcess=" + this.f89674a + ")";
    }
}
