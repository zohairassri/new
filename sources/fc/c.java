package fc;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f94152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ub.a f94153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Object f94154c;

    public c() {
        this.f94152a = new b();
        this.f94154c = null;
    }

    public Object a(b bVar) {
        return this.f94154c;
    }

    public final Object b(float f11, float f12, Object obj, Object obj2, float f13, float f14, float f15) {
        return a(this.f94152a.h(f11, f12, obj, obj2, f13, f14, f15));
    }

    public final void c(ub.a aVar) {
        this.f94153b = aVar;
    }

    public c(Object obj) {
        this.f94152a = new b();
        this.f94154c = obj;
    }
}
