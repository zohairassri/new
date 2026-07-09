package s3;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i11, int i12, int i13) {
        return i11 | (i12 << 8) | (i13 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(int i11) {
        return i11 & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i11) {
        return (i11 >> 8) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i11) {
        return (i11 >> 16) & 255;
    }
}
