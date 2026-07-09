package v2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f132387b;

    public i(float f11) {
        this.f132387b = f11;
    }

    @Override // v2.f
    public long a(long j11, long j12) {
        float f11 = this.f132387b;
        return q0.a((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Float.compare(this.f132387b, ((i) obj).f132387b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f132387b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f132387b + ')';
    }
}
