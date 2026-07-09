package wo;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sn.i f135854a;

    j() {
        this.f135854a = null;
    }

    protected abstract void a();

    final sn.i b() {
        return this.f135854a;
    }

    public final void c(Exception exc) {
        sn.i iVar = this.f135854a;
        if (iVar != null) {
            iVar.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e11) {
            c(e11);
        }
    }

    public j(sn.i iVar) {
        this.f135854a = iVar;
    }
}
