package xp;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class t implements vq.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f137949c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f137950a = f137949c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile vq.b f137951b;

    public t(vq.b bVar) {
        this.f137951b = bVar;
    }

    @Override // vq.b
    public Object get() {
        Object obj;
        Object obj2 = this.f137950a;
        Object obj3 = f137949c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f137950a;
                if (obj == obj3) {
                    obj = this.f137951b.get();
                    this.f137950a = obj;
                    this.f137951b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
