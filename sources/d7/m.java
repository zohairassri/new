package d7;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f89379a = new a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements m {
        a() {
        }

        @Override // d7.m
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // d7.m
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // d7.m
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
