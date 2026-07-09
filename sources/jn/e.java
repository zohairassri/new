package jn;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sn.i f105826a;

    e() {
        this.f105826a = null;
    }

    public void a(Exception exc) {
        sn.i iVar = this.f105826a;
        if (iVar != null) {
            iVar.d(exc);
        }
    }

    protected abstract void b();

    final sn.i c() {
        return this.f105826a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e11) {
            a(e11);
        }
    }

    public e(sn.i iVar) {
        this.f105826a = iVar;
    }
}
