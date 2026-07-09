package p1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f120937c;

    public k(Object obj, int i11) {
        super(i11, 1);
        this.f120937c = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        a();
        f(d() + 1);
        return this.f120937c;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        c();
        f(d() - 1);
        return this.f120937c;
    }
}
