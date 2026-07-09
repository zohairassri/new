package kp;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rp.a f111978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f111979b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f111980c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(rp.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f111980c = bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
    }

    /* synthetic */ j(rp.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static j a(b bVar, rp.a aVar, Class cls) {
        return new a(aVar, cls, bVar);
    }

    public final rp.a b() {
        return this.f111978a;
    }

    public final Class c() {
        return this.f111979b;
    }

    private j(rp.a aVar, Class cls) {
        this.f111978a = aVar;
        this.f111979b = cls;
    }
}
