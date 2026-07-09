package qo;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sn.i f122903a;

    t() {
        this.f122903a = null;
    }

    protected abstract void a();

    final sn.i b() {
        return this.f122903a;
    }

    public final void c(Exception exc) {
        sn.i iVar = this.f122903a;
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

    public t(sn.i iVar) {
        this.f122903a = iVar;
    }
}
