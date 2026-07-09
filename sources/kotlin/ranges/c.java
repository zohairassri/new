package kotlin.ranges;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class c implements of0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f111757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f111758b;

    public c(float f11, float f12) {
        this.f111757a = f11;
        this.f111758b = f12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // of0.b
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable, Comparable comparable2) {
        return g(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public boolean b(float f11) {
        return f11 >= this.f111757a && f11 <= this.f111758b;
    }

    @Override // of0.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float i() {
        return Float.valueOf(this.f111758b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // of0.b
    public /* bridge */ /* synthetic */ boolean e(Comparable comparable) {
        return b(((Number) comparable).floatValue());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f111757a == cVar.f111757a && this.f111758b == cVar.f111758b;
    }

    @Override // of0.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float d() {
        return Float.valueOf(this.f111757a);
    }

    public boolean g(float f11, float f12) {
        return f11 <= f12;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f111757a) * 31) + Float.hashCode(this.f111758b);
    }

    @Override // of0.b, of0.c
    public boolean isEmpty() {
        return this.f111757a > this.f111758b;
    }

    public String toString() {
        return this.f111757a + ".." + this.f111758b;
    }
}
