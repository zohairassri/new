package n1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(List list, int i11) {
        int size = list.size();
        if (i11 < 0 || i11 >= size) {
            c(i11, size);
        }
    }

    public static final void b(List list, int i11, int i12) {
        if (i11 > i12) {
            f(i11, i12);
        }
        if (i11 < 0) {
            d(i11);
        }
        if (i12 > list.size()) {
            e(i12, list.size());
        }
    }

    private static final void c(int i11, int i12) {
        throw new IndexOutOfBoundsException("Index " + i11 + " is out of bounds. The list has " + i12 + " elements.");
    }

    private static final void d(int i11) {
        throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than 0.");
    }

    private static final void e(int i11, int i12) {
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + i12 + ')');
    }

    private static final void f(int i11, int i12) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
    }
}
