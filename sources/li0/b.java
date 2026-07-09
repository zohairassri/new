package li0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends rx.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final rx.c f114363a;

    public b(rx.c cVar) {
        this.f114363a = cVar;
    }

    @Override // rx.c
    public void onCompleted() {
        this.f114363a.onCompleted();
    }

    @Override // rx.c
    public void onError(Throwable th2) {
        this.f114363a.onError(th2);
    }

    @Override // rx.c
    public void onNext(Object obj) {
        this.f114363a.onNext(obj);
    }
}
