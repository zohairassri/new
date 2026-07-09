package s1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f125404a = new d();

    private d() {
    }

    public static final void a(int i11, int i12) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
        }
    }

    public static final void b(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
        }
    }

    public static final void c(int i11, int i12, int i13) {
        if (i11 < 0 || i12 > i13) {
            throw new IndexOutOfBoundsException("fromIndex: " + i11 + ", toIndex: " + i12 + ", size: " + i13);
        }
        if (i11 <= i12) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i11 + " > toIndex: " + i12);
    }
}
