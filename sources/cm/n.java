package cm;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class n extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f17989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17990d;

    n(int i11, int i12, double d11, boolean z11) {
        this.f17987a = i11;
        this.f17988b = i12;
        this.f17989c = d11;
        this.f17990d = z11;
    }

    @Override // cm.w
    public final int a() {
        return this.f17987a;
    }

    @Override // cm.w
    public final int b() {
        return this.f17988b;
    }

    @Override // cm.w
    public final double c() {
        return this.f17989c;
    }

    @Override // cm.w
    public final boolean d() {
        return this.f17990d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f17987a == wVar.a() && this.f17988b == wVar.b() && Double.doubleToLongBits(this.f17989c) == Double.doubleToLongBits(wVar.c()) && this.f17990d == wVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d11 = this.f17989c;
        return ((((this.f17988b ^ ((this.f17987a ^ 1000003) * 1000003)) * 1000003) ^ ((int) (Double.doubleToLongBits(d11) ^ (Double.doubleToLongBits(d11) >>> 32)))) * 1000003) ^ (true != this.f17990d ? 1237 : 1231);
    }

    public final String toString() {
        int i11 = this.f17987a;
        int length = String.valueOf(i11).length();
        int i12 = this.f17988b;
        int length2 = String.valueOf(i12).length();
        double d11 = this.f17989c;
        int length3 = String.valueOf(d11).length();
        boolean z11 = this.f17990d;
        StringBuilder sb2 = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z11).length() + 1);
        sb2.append("PingStrategy{maxAttempts=");
        sb2.append(i11);
        sb2.append(", initialBackoffMs=");
        sb2.append(i12);
        sb2.append(", backoffMultiplier=");
        sb2.append(d11);
        sb2.append(", bufferAfterMaxAttempts=");
        sb2.append(z11);
        sb2.append("}");
        return sb2.toString();
    }
}
