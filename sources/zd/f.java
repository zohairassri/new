package zd;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile Object f142255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f142256b;

        a(b bVar) {
            this.f142256b = bVar;
        }

        @Override // zd.f.b
        public Object get() {
            if (this.f142255a == null) {
                synchronized (this) {
                    try {
                        if (this.f142255a == null) {
                            this.f142255a = k.d(this.f142256b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f142255a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
