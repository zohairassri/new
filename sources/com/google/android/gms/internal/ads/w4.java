package com.google.android.gms.internal.ads;

import com.amazonaws.services.s3.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class w4 {
    public static List a(byte[] bArr) {
        long jE = e(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(h(i(jE)));
        arrayList.add(h(i(3840L)));
        return arrayList;
    }

    public static int b(ByteBuffer byteBuffer) {
        int i11;
        if ((byteBuffer.get(5) & 2) == 0) {
            i11 = 0;
        } else {
            byte b11 = byteBuffer.get(26);
            int i12 = 28;
            int i13 = 28;
            for (int i14 = 0; i14 < b11; i14++) {
                i13 += byteBuffer.get(i14 + 27);
            }
            byte b12 = byteBuffer.get(i13 + 26);
            for (int i15 = 0; i15 < b12; i15++) {
                i12 += byteBuffer.get(i13 + 27 + i15);
            }
            i11 = i13 + i12;
        }
        int i16 = byteBuffer.get(i11 + 26) + 27 + i11;
        return (int) ((g(byteBuffer.get(i16), byteBuffer.limit() - i16 > 1 ? byteBuffer.get(i16 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int c(ByteBuffer byteBuffer) {
        return (int) ((g(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long d(byte[] bArr) {
        return g(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int e(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean f(long j11, long j12) {
        return j11 - j12 <= i(3840L) / 1000;
    }

    private static long g(byte b11, byte b12) {
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

    private static byte[] h(long j11) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j11).array();
    }

    private static long i(long j11) {
        return (j11 * 1000000000) / 48000;
    }
}
