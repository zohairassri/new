package xc0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f137409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f137410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f137411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f137412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f137413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f137414f;

    b(f fVar, String str, String str2, String str3, String str4, String str5) {
        this.f137409a = fVar;
        this.f137410b = str;
        this.f137411c = str2;
        this.f137412d = str3;
        this.f137413e = str4;
        this.f137414f = str5;
    }

    @Override // xc0.d
    public String c() {
        return this.f137410b;
    }

    @Override // xc0.d
    public f d() {
        return this.f137409a;
    }

    @Override // xc0.d
    public String e() {
        return this.f137411c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            f fVar = this.f137409a;
            if (fVar != null ? fVar.equals(dVar.d()) : dVar.d() == null) {
                String str = this.f137410b;
                if (str != null ? str.equals(dVar.c()) : dVar.c() == null) {
                    String str2 = this.f137411c;
                    if (str2 != null ? str2.equals(dVar.e()) : dVar.e() == null) {
                        String str3 = this.f137412d;
                        if (str3 != null ? str3.equals(dVar.f()) : dVar.f() == null) {
                            String str4 = this.f137413e;
                            if (str4 != null ? str4.equals(dVar.h()) : dVar.h() == null) {
                                String str5 = this.f137414f;
                                if (str5 != null ? str5.equals(dVar.g()) : dVar.g() == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // xc0.d
    public String f() {
        return this.f137412d;
    }

    @Override // xc0.d
    public String g() {
        return this.f137414f;
    }

    @Override // xc0.d
    public String h() {
        return this.f137413e;
    }

    public int hashCode() {
        f fVar = this.f137409a;
        int iHashCode = ((fVar == null ? 0 : fVar.hashCode()) ^ 1000003) * 1000003;
        String str = this.f137410b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f137411c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f137412d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f137413e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f137414f;
        return iHashCode5 ^ (str5 != null ? str5.hashCode() : 0);
    }
}
