package fq;

import fq.g0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class d0 extends g0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f94692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f94693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f94694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f94695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f94696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f94697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f94698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f94699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f94700i;

    d0(int i11, String str, int i12, long j11, long j12, boolean z11, int i13, String str2, String str3) {
        this.f94692a = i11;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f94693b = str;
        this.f94694c = i12;
        this.f94695d = j11;
        this.f94696e = j12;
        this.f94697f = z11;
        this.f94698g = i13;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f94699h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f94700i = str3;
    }

    @Override // fq.g0.b
    public int a() {
        return this.f94692a;
    }

    @Override // fq.g0.b
    public int b() {
        return this.f94694c;
    }

    @Override // fq.g0.b
    public long d() {
        return this.f94696e;
    }

    @Override // fq.g0.b
    public boolean e() {
        return this.f94697f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.b) {
            g0.b bVar = (g0.b) obj;
            if (this.f94692a == bVar.a() && this.f94693b.equals(bVar.g()) && this.f94694c == bVar.b() && this.f94695d == bVar.j() && this.f94696e == bVar.d() && this.f94697f == bVar.e() && this.f94698g == bVar.i() && this.f94699h.equals(bVar.f()) && this.f94700i.equals(bVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // fq.g0.b
    public String f() {
        return this.f94699h;
    }

    @Override // fq.g0.b
    public String g() {
        return this.f94693b;
    }

    @Override // fq.g0.b
    public String h() {
        return this.f94700i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f94692a ^ 1000003) * 1000003) ^ this.f94693b.hashCode()) * 1000003) ^ this.f94694c) * 1000003;
        long j11 = this.f94695d;
        int i11 = (iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f94696e;
        return this.f94700i.hashCode() ^ ((((((((i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ (this.f94697f ? 1231 : 1237)) * 1000003) ^ this.f94698g) * 1000003) ^ this.f94699h.hashCode()) * 1000003);
    }

    @Override // fq.g0.b
    public int i() {
        return this.f94698g;
    }

    @Override // fq.g0.b
    public long j() {
        return this.f94695d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f94692a + ", model=" + this.f94693b + ", availableProcessors=" + this.f94694c + ", totalRam=" + this.f94695d + ", diskSpace=" + this.f94696e + ", isEmulator=" + this.f94697f + ", state=" + this.f94698g + ", manufacturer=" + this.f94699h + ", modelClass=" + this.f94700i + "}";
    }
}
