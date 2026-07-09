package sn;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f127263a;

    w(x xVar) {
        this.f127263a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f127263a.f127265b) {
            try {
                x xVar = this.f127263a;
                if (xVar.f127266c != null) {
                    xVar.f127266c.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
