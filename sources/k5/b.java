package k5;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class b extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f107439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f107440b;

    public b(Object obj, int i11) {
        super(null);
        this.f107439a = obj;
        this.f107440b = i11;
    }

    public final void a() {
        Object obj = this.f107439a;
        if (!((obj != null ? obj.hashCode() : 0) == this.f107440b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object b() {
        return this.f107439a;
    }
}
