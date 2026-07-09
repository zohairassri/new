package z3;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class u implements a4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f141759a;

    public u(float f11) {
        this.f141759a = f11;
    }

    @Override // a4.a
    public float a(float f11) {
        return f11 / this.f141759a;
    }

    @Override // a4.a
    public float b(float f11) {
        return f11 * this.f141759a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Float.compare(this.f141759a, ((u) obj).f141759a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f141759a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f141759a + ')';
    }
}
