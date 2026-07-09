package zo;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class r extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f142480a;

    r(Object obj) {
        this.f142480a = obj;
    }

    @Override // zo.l
    public Object b() {
        return this.f142480a;
    }

    @Override // zo.l
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f142480a.equals(((r) obj).f142480a);
        }
        return false;
    }

    public int hashCode() {
        return this.f142480a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f142480a + ")";
    }
}
