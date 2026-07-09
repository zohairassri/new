package com.google.android.gms.internal.ads;

import io.agora.rtc2.internal.Marshallable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class o34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31757a = 0;

    static {
        new m34();
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iHighestOneBit = Integer.highestOneBit(0);
        int iMin = Math.min(Marshallable.PROTO_PACKET_SIZE, Math.max(128, iHighestOneBit + iHighestOneBit));
        int i11 = 0;
        while (i11 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i11);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i12 = 0;
            while (i12 < iMin2) {
                int i13 = inputStream.read(bArr, i12, iMin2 - i12);
                if (i13 == -1) {
                    return c(arrayDeque, i11);
                }
                i12 += i13;
                i11 += i13;
            }
            iMin = i44.b(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static InputStream b(InputStream inputStream, long j11) {
        return new n34(inputStream, j11);
    }

    private static byte[] c(Queue queue, int i11) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i11) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
        int i12 = i11 - length;
        while (i12 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i12, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i11 - i12, iMin);
            i12 -= iMin;
        }
        return bArrCopyOf;
    }
}
