package x1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class s extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f136530a;

    public s(String str) {
        super(str);
        this.f136530a = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f136530a;
    }
}
