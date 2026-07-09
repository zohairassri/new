package f0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final int a(y yVar) {
        List listI = yVar.i();
        int size = listI.size();
        int iA = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iA += ((o) listI.get(i11)).a();
        }
        return (iA / listI.size()) + yVar.h();
    }
}
