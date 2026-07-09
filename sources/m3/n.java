package m3;

import h3.c3;
import h3.d3;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final long a(long j11, long j12) {
        int iJ;
        int iL = c3.l(j11);
        int iK = c3.k(j11);
        if (c3.p(j12, j11)) {
            if (c3.d(j12, j11)) {
                iL = c3.l(j12);
                iK = iL;
            } else {
                if (c3.d(j11, j12)) {
                    iJ = c3.j(j12);
                } else if (c3.e(j12, iL)) {
                    iL = c3.l(j12);
                    iJ = c3.j(j12);
                } else {
                    iK = c3.l(j12);
                }
                iK -= iJ;
            }
        } else if (iK > c3.l(j12)) {
            iL -= c3.j(j12);
            iJ = c3.j(j12);
            iK -= iJ;
        }
        return d3.b(iL, iK);
    }
}
