package ck;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class n {
    public static void a(boolean z11, String str) throws ParserException {
        if (!z11) {
            throw ParserException.a(str, null);
        }
    }

    public static boolean b(l lVar, byte[] bArr, int i11, int i12, boolean z11) throws EOFException {
        try {
            return lVar.b(bArr, i11, i12, z11);
        } catch (EOFException e11) {
            if (z11) {
                return false;
            }
            throw e11;
        }
    }

    public static int c(l lVar, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int i14 = lVar.i(bArr, i11 + i13, i12 - i13);
            if (i14 == -1) {
                break;
            }
            i13 += i14;
        }
        return i13;
    }

    public static boolean d(l lVar, byte[] bArr, int i11, int i12) {
        try {
            lVar.readFully(bArr, i11, i12);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(l lVar, int i11) {
        try {
            lVar.j(i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
