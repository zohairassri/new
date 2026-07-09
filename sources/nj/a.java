package nj;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements ve0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f119291c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ve0.a f119292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f119293b = f119291c;

    private a(ve0.a aVar) {
        this.f119292a = aVar;
    }

    public static ve0.a a(ve0.a aVar) {
        d.b(aVar);
        return aVar instanceof a ? aVar : new a(aVar);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f119291c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ve0.a
    public Object get() {
        Object obj;
        Object obj2 = this.f119293b;
        Object obj3 = f119291c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f119293b;
                if (obj == obj3) {
                    obj = this.f119292a.get();
                    this.f119293b = b(this.f119293b, obj);
                    this.f119292a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
