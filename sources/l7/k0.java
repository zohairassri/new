package l7;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f113529c = new k0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f113530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f113531b;

    public k0(long j11, long j12) {
        this.f113530a = j11;
        this.f113531b = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f113530a == k0Var.f113530a && this.f113531b == k0Var.f113531b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f113530a) * 31) + ((int) this.f113531b);
    }

    public String toString() {
        return "[timeUs=" + this.f113530a + ", position=" + this.f113531b + "]";
    }
}
