package ck;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f17782c = new a0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17784b;

    public a0(long j11, long j12) {
        this.f17783a = j11;
        this.f17784b = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f17783a == a0Var.f17783a && this.f17784b == a0Var.f17784b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f17783a) * 31) + ((int) this.f17784b);
    }

    public String toString() {
        return "[timeUs=" + this.f17783a + ", position=" + this.f17784b + "]";
    }
}
