package ce0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class e extends d {
    @Override // sd0.t
    public void onError(Throwable th2) {
        if (this.f17567a == null) {
            this.f17568b = th2;
        }
        countDown();
    }

    @Override // sd0.t
    public void onNext(Object obj) {
        if (this.f17567a == null) {
            this.f17567a = obj;
            this.f17569c.dispose();
            countDown();
        }
    }
}
