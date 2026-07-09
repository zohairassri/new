package or;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f120650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f120651b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f120650a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f120651b = str2;
    }

    @Override // or.f
    public String b() {
        return this.f120650a;
    }

    @Override // or.f
    public String c() {
        return this.f120651b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f120650a.equals(fVar.b()) && this.f120651b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f120651b.hashCode() ^ ((this.f120650a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f120650a + ", version=" + this.f120651b + "}";
    }
}
