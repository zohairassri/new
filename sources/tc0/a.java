package tc0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f129811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f129812c;

    a(int i11, int i12) {
        this.f129811b = i11;
        this.f129812c = i12;
    }

    @Override // tc0.c
    public int c() {
        return this.f129812c;
    }

    @Override // tc0.c
    public int d() {
        return this.f129811b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f129811b == cVar.d() && this.f129812c == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f129812c ^ ((this.f129811b ^ 1000003) * 1000003);
    }

    public String toString() {
        return "LogLimits{maxNumberOfAttributes=" + this.f129811b + ", maxAttributeValueLength=" + this.f129812c + "}";
    }
}
