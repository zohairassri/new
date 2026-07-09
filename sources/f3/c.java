package f3;

import z3.n;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(float[] fArr) {
        int i11 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i12 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i11 = 1;
        }
        return (i12 << 1) | i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j11) {
        return !n.j(j11, n.f141742b.a());
    }
}
