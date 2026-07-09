package tf0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class h1 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f129982a;

    public h1(boolean z11) {
        this.f129982a = z11;
    }

    @Override // tf0.u1
    public boolean a() {
        return this.f129982a;
    }

    @Override // tf0.u1
    public j2 c() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(a() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
