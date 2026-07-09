package en;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f92780a;

    /* synthetic */ j(l lVar, i iVar) {
        this.f92780a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jA = this.f92780a.a();
        if (jA == -1 || com.google.android.gms.common.util.i.c().a() <= jA) {
            return;
        }
        l.f(this.f92780a.f92782a);
    }
}
