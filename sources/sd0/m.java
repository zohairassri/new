package sd0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final m f126480b = new m(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f126481a;

    private m(Object obj) {
        this.f126481a = obj;
    }

    public static m a() {
        return f126480b;
    }

    public static m b(Throwable th2) {
        ae0.b.e(th2, "error is null");
        return new m(ne0.m.f(th2));
    }

    public static m c(Object obj) {
        ae0.b.e(obj, "value is null");
        return new m(obj);
    }

    public Throwable d() {
        Object obj = this.f126481a;
        if (ne0.m.k(obj)) {
            return ne0.m.g(obj);
        }
        return null;
    }

    public Object e() {
        Object obj = this.f126481a;
        if (obj == null || ne0.m.k(obj)) {
            return null;
        }
        return this.f126481a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return ae0.b.c(this.f126481a, ((m) obj).f126481a);
        }
        return false;
    }

    public boolean f() {
        return this.f126481a == null;
    }

    public boolean g() {
        return ne0.m.k(this.f126481a);
    }

    public boolean h() {
        Object obj = this.f126481a;
        return (obj == null || ne0.m.k(obj)) ? false : true;
    }

    public int hashCode() {
        Object obj = this.f126481a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f126481a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (ne0.m.k(obj)) {
            return "OnErrorNotification[" + ne0.m.g(obj) + "]";
        }
        return "OnNextNotification[" + this.f126481a + "]";
    }
}
