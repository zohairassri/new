package kp;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f111984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f111985b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f111986c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f111986c = bVar;
        }

        @Override // kp.l
        public Object a(cp.g gVar) {
            return this.f111986c.a(gVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        Object a(cp.g gVar);
    }

    /* synthetic */ l(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static l b(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract Object a(cp.g gVar);

    public Class c() {
        return this.f111984a;
    }

    public Class d() {
        return this.f111985b;
    }

    private l(Class cls, Class cls2) {
        this.f111984a = cls;
        this.f111985b = cls2;
    }
}
