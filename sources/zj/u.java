package zj;

import com.amazonaws.services.s3.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class u {
    public static List a(byte[] bArr) {
        long jH = h(f(bArr));
        long jH2 = h(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(jH));
        arrayList.add(b(jH2));
        return arrayList;
    }

    private static byte[] b(long j11) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j11).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static long d(byte b11, byte b12) {
        int i11;
        int i12 = b11 & 255;
        int i13 = b11 & 3;
        if (i13 != 0) {
            i11 = 2;
            if (i13 != 1 && i13 != 2) {
                i11 = b12 & 63;
            }
        } else {
            i11 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        return ((long) i11) * ((long) (i14 >= 16 ? 2500 << i15 : i14 >= 12 ? Constants.MAXIMUM_UPLOAD_PARTS << (i14 & 1) : i15 == 3 ? 60000 : Constants.MAXIMUM_UPLOAD_PARTS << i15));
    }

    public static long e(byte[] bArr) {
        return d(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    private static int f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int g(ByteBuffer byteBuffer) {
        return (int) ((d(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    private static long h(long j11) {
        return (j11 * 1000000000) / 48000;
    }
}
