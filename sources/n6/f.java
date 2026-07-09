package n6;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static void a(androidx.media3.datasource.a aVar) {
        if (aVar != null) {
            try {
                aVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(androidx.media3.datasource.a aVar) {
        byte[] bArrCopyOf = new byte[1024];
        int i11 = 0;
        int i12 = 0;
        while (i11 != -1) {
            if (i12 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i11 = aVar.read(bArrCopyOf, i12, bArrCopyOf.length - i12);
            if (i11 != -1) {
                i12 += i11;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i12);
    }
}
