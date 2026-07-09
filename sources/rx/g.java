package rx;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final li0.h f125222a = new li0.h();

    public final void a(i iVar) {
        this.f125222a.a(iVar);
    }

    public abstract void b(Throwable th2);

    public abstract void c(Object obj);

    @Override // rx.i
    public final boolean isUnsubscribed() {
        return this.f125222a.isUnsubscribed();
    }

    @Override // rx.i
    public final void unsubscribe() {
        this.f125222a.unsubscribe();
    }
}
