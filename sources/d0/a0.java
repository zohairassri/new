package d0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f87686a;

    public a0(float f11) {
        this.f87686a = f11;
    }

    public final float a() {
        return this.f87686a;
    }

    public final void b(float f11) {
        this.f87686a = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Float.compare(this.f87686a, ((a0) obj).f87686a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f87686a);
    }

    public String toString() {
        return "FlowLayoutData(fillCrossAxisFraction=" + this.f87686a + ')';
    }
}
