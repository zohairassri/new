package yf0;

import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class h0 {
    public static final int a(String str, int i11, int i12, int i13) {
        return (int) f0.c(str, i11, i12, i13);
    }

    public static final long b(String str, long j11, long j12, long j13) {
        String strD = f0.d(str);
        if (strD == null) {
            return j11;
        }
        Long lX = StringsKt.x(strD);
        if (lX == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
        }
        long jLongValue = lX.longValue();
        if (j12 <= jLongValue && jLongValue <= j13) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j12 + ".." + j13 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String strD = f0.d(str);
        return strD == null ? str2 : strD;
    }

    public static final boolean d(String str, boolean z11) {
        String strD = f0.d(str);
        return strD != null ? Boolean.parseBoolean(strD) : z11;
    }

    public static /* synthetic */ int e(String str, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i12 = 1;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return f0.b(str, i11, i12, i13);
    }

    public static /* synthetic */ long f(String str, long j11, long j12, long j13, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j12 = 1;
        }
        long j14 = j12;
        if ((i11 & 8) != 0) {
            j13 = LongCompanionObject.MAX_VALUE;
        }
        return f0.c(str, j11, j14, j13);
    }
}
