package r1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f123428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f123429b;

    public a(Object obj, Object obj2) {
        this.f123428a = obj;
        this.f123429b = obj2;
    }

    public final boolean a() {
        return this.f123429b != s1.c.f125403a;
    }

    public final boolean b() {
        return this.f123428a != s1.c.f125403a;
    }

    public final Object c() {
        return this.f123429b;
    }

    public final Object d() {
        return this.f123428a;
    }

    public final a e(Object obj) {
        return new a(this.f123428a, obj);
    }

    public final a f(Object obj) {
        return new a(obj, this.f123429b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        s1.c cVar = s1.c.f125403a;
        this(cVar, cVar);
    }

    public a(Object obj) {
        this(obj, s1.c.f125403a);
    }
}
