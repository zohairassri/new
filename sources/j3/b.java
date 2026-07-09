package j3;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {
    @Override // j3.d
    public int a(int i11) {
        int iE = e(i11);
        if (iE == -1 || e(iE) == -1) {
            return -1;
        }
        return iE;
    }

    @Override // j3.d
    public int b(int i11) {
        return f(i11);
    }

    @Override // j3.d
    public int c(int i11) {
        return e(i11);
    }

    @Override // j3.d
    public int d(int i11) {
        int iF = f(i11);
        if (iF == -1 || f(iF) == -1) {
            return -1;
        }
        return iF;
    }

    public abstract int e(int i11);

    public abstract int f(int i11);
}
