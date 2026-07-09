package eq;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f92814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f92815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f92816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f92817f;

    b(String str, String str2, String str3, String str4, long j11) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f92813b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f92814c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f92815d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f92816e = str4;
        this.f92817f = j11;
    }

    @Override // eq.i
    public String c() {
        return this.f92814c;
    }

    @Override // eq.i
    public String d() {
        return this.f92815d;
    }

    @Override // eq.i
    public String e() {
        return this.f92813b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f92813b.equals(iVar.e()) && this.f92814c.equals(iVar.c()) && this.f92815d.equals(iVar.d()) && this.f92816e.equals(iVar.g()) && this.f92817f == iVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // eq.i
    public long f() {
        return this.f92817f;
    }

    @Override // eq.i
    public String g() {
        return this.f92816e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f92813b.hashCode() ^ 1000003) * 1000003) ^ this.f92814c.hashCode()) * 1000003) ^ this.f92815d.hashCode()) * 1000003) ^ this.f92816e.hashCode()) * 1000003;
        long j11 = this.f92817f;
        return ((int) (j11 ^ (j11 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f92813b + ", parameterKey=" + this.f92814c + ", parameterValue=" + this.f92815d + ", variantId=" + this.f92816e + ", templateVersion=" + this.f92817f + "}";
    }
}
