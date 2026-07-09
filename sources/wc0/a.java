package wc0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements uc0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hc0.a f135114a;

    private a(hc0.a aVar) {
        this.f135114a = aVar;
    }

    public static uc0.a b(hc0.a aVar) {
        return new a(aVar);
    }

    @Override // uc0.a
    public String a() {
        return this.f135114a.a();
    }

    public String toString() {
        return "AnyValueBody{" + a() + "}";
    }
}
