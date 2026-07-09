package gd;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f98485a = new C1135a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f98486b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f98487c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f98488d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f98489e = new e();

    /* JADX INFO: renamed from: gd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class C1135a extends a {
        C1135a() {
        }

        @Override // gd.a
        public boolean a() {
            return true;
        }

        @Override // gd.a
        public boolean b() {
            return true;
        }

        @Override // gd.a
        public boolean c(ed.a aVar) {
            return aVar == ed.a.REMOTE;
        }

        @Override // gd.a
        public boolean d(boolean z11, ed.a aVar, ed.c cVar) {
            return (aVar == ed.a.RESOURCE_DISK_CACHE || aVar == ed.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b extends a {
        b() {
        }

        @Override // gd.a
        public boolean a() {
            return false;
        }

        @Override // gd.a
        public boolean b() {
            return false;
        }

        @Override // gd.a
        public boolean c(ed.a aVar) {
            return false;
        }

        @Override // gd.a
        public boolean d(boolean z11, ed.a aVar, ed.c cVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class c extends a {
        c() {
        }

        @Override // gd.a
        public boolean a() {
            return true;
        }

        @Override // gd.a
        public boolean b() {
            return false;
        }

        @Override // gd.a
        public boolean c(ed.a aVar) {
            return (aVar == ed.a.DATA_DISK_CACHE || aVar == ed.a.MEMORY_CACHE) ? false : true;
        }

        @Override // gd.a
        public boolean d(boolean z11, ed.a aVar, ed.c cVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class d extends a {
        d() {
        }

        @Override // gd.a
        public boolean a() {
            return false;
        }

        @Override // gd.a
        public boolean b() {
            return true;
        }

        @Override // gd.a
        public boolean c(ed.a aVar) {
            return false;
        }

        @Override // gd.a
        public boolean d(boolean z11, ed.a aVar, ed.c cVar) {
            return (aVar == ed.a.RESOURCE_DISK_CACHE || aVar == ed.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class e extends a {
        e() {
        }

        @Override // gd.a
        public boolean a() {
            return true;
        }

        @Override // gd.a
        public boolean b() {
            return true;
        }

        @Override // gd.a
        public boolean c(ed.a aVar) {
            return aVar == ed.a.REMOTE;
        }

        @Override // gd.a
        public boolean d(boolean z11, ed.a aVar, ed.c cVar) {
            return ((z11 && aVar == ed.a.DATA_DISK_CACHE) || aVar == ed.a.LOCAL) && cVar == ed.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(ed.a aVar);

    public abstract boolean d(boolean z11, ed.a aVar, ed.c cVar);
}
