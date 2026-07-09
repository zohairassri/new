package d90;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements g90.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f89505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f89506b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f89507c;

    public d(e eVar) {
        this.f89507c = eVar;
    }

    @Override // g90.b
    public Object k() {
        if (this.f89505a == null) {
            synchronized (this.f89506b) {
                try {
                    if (this.f89505a == null) {
                        this.f89505a = this.f89507c.get();
                    }
                } finally {
                }
            }
        }
        return this.f89505a;
    }
}
