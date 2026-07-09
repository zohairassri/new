package xp;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f137885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f137886b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private @interface a {
    }

    public a0(Class cls, Class cls2) {
        this.f137885a = cls;
        this.f137886b = cls2;
    }

    public static a0 a(Class cls, Class cls2) {
        return new a0(cls, cls2);
    }

    public static a0 b(Class cls) {
        return new a0(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f137886b.equals(a0Var.f137886b)) {
            return this.f137885a.equals(a0Var.f137885a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f137886b.hashCode() * 31) + this.f137885a.hashCode();
    }

    public String toString() {
        if (this.f137885a == a.class) {
            return this.f137886b.getName();
        }
        return "@" + this.f137885a.getName() + " " + this.f137886b.getName();
    }
}
