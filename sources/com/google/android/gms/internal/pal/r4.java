package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class r4 {
    static {
        Math.log(10.0d);
    }

    public static void a(StringBuffer stringBuffer, long j11) {
        int i11 = (int) j11;
        if (i11 != j11) {
            stringBuffer.append(Long.toString(j11));
            return;
        }
        if (i11 < 0) {
            stringBuffer.append('-');
            if (i11 == Integer.MIN_VALUE) {
                stringBuffer.append("2147483648");
                return;
            }
            i11 = -i11;
        }
        if (i11 < 10) {
            stringBuffer.append((char) (i11 + 48));
        } else {
            if (i11 >= 100) {
                stringBuffer.append(Integer.toString(i11));
                return;
            }
            int i12 = ((i11 + 1) * 13421772) >> 27;
            stringBuffer.append((char) (i12 + 48));
            stringBuffer.append((char) (((i11 - (i12 << 3)) - (i12 + i12)) + 48));
        }
    }
}
