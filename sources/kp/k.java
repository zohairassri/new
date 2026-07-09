package kp;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f111981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f111982b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f111983c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f111983c = bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
    }

    /* synthetic */ k(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static k a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.f111981a;
    }

    public Class c() {
        return this.f111982b;
    }

    private k(Class cls, Class cls2) {
        this.f111981a = cls;
        this.f111982b = cls2;
    }
}
