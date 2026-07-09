package fq;

import fq.g0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class e0 extends g0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f94706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f94707c;

    e0(String str, String str2, boolean z11) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f94705a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f94706b = str2;
        this.f94707c = z11;
    }

    @Override // fq.g0.c
    public boolean b() {
        return this.f94707c;
    }

    @Override // fq.g0.c
    public String c() {
        return this.f94706b;
    }

    @Override // fq.g0.c
    public String d() {
        return this.f94705a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.c) {
            g0.c cVar = (g0.c) obj;
            if (this.f94705a.equals(cVar.d()) && this.f94706b.equals(cVar.c()) && this.f94707c == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f94707c ? 1231 : 1237) ^ ((((this.f94705a.hashCode() ^ 1000003) * 1000003) ^ this.f94706b.hashCode()) * 1000003);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f94705a + ", osCodeName=" + this.f94706b + ", isRooted=" + this.f94707c + "}";
    }
}
