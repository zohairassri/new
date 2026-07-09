package jb0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f105482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f105483b;

    public a(int i11, int i12) {
        this.f105482a = i11;
        this.f105483b = i12;
    }

    public final int a() {
        return this.f105482a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f105482a == aVar.f105482a && this.f105483b == aVar.f105483b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f105482a) * 31) + Integer.hashCode(this.f105483b);
    }

    public String toString() {
        return "DomainCount(requestCount=" + this.f105482a + ", captureLimit=" + this.f105483b + ')';
    }
}
