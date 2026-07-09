package t2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f127896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f127897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f127898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f127899d;

    public b(float f11, float f12, long j11, int i11) {
        this.f127896a = f11;
        this.f127897b = f12;
        this.f127898c = j11;
        this.f127899d = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f127896a == this.f127896a && bVar.f127897b == this.f127897b && bVar.f127898c == this.f127898c && bVar.f127899d == this.f127899d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f127896a) * 31) + Float.hashCode(this.f127897b)) * 31) + Long.hashCode(this.f127898c)) * 31) + Integer.hashCode(this.f127899d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f127896a + ",horizontalScrollPixels=" + this.f127897b + ",uptimeMillis=" + this.f127898c + ",deviceId=" + this.f127899d + ')';
    }
}
