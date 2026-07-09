package nj;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f119294b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f119295a;

    private c(Object obj) {
        this.f119295a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // ve0.a
    public Object get() {
        return this.f119295a;
    }
}
