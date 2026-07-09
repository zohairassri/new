package hd0;

import hd0.t;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class b extends t.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f100715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f100716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f100717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f100718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f100719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f100720g;

    b(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f100715b = i11;
        this.f100716c = i12;
        this.f100717d = i13;
        this.f100718e = i14;
        this.f100719f = i15;
        this.f100720g = i16;
    }

    @Override // hd0.t.a, hd0.t
    public int c() {
        return this.f100720g;
    }

    @Override // hd0.t
    public int d() {
        return this.f100715b;
    }

    @Override // hd0.t
    public int e() {
        return this.f100718e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t.a) {
            t.a aVar = (t.a) obj;
            if (this.f100715b == aVar.d() && this.f100716c == aVar.g() && this.f100717d == aVar.h() && this.f100718e == aVar.e() && this.f100719f == aVar.f() && this.f100720g == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // hd0.t
    public int f() {
        return this.f100719f;
    }

    @Override // hd0.t
    public int g() {
        return this.f100716c;
    }

    @Override // hd0.t
    public int h() {
        return this.f100717d;
    }

    public int hashCode() {
        return this.f100720g ^ ((((((((((this.f100715b ^ 1000003) * 1000003) ^ this.f100716c) * 1000003) ^ this.f100717d) * 1000003) ^ this.f100718e) * 1000003) ^ this.f100719f) * 1000003);
    }

    public String toString() {
        return "SpanLimitsValue{maxNumberOfAttributes=" + this.f100715b + ", maxNumberOfEvents=" + this.f100716c + ", maxNumberOfLinks=" + this.f100717d + ", maxNumberOfAttributesPerEvent=" + this.f100718e + ", maxNumberOfAttributesPerLink=" + this.f100719f + ", maxAttributeValueLength=" + this.f100720g + "}";
    }
}
