package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class bu4 {
    public static byte[] a(byte[]... bArr) throws GeneralSecurityException {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= bArr.length) {
                byte[] bArr2 = new byte[i12];
                int i13 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i13, length);
                    i13 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i11].length;
            if (i12 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i12 += length2;
            i11++;
        }
    }

    public static final byte[] b(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        if (bArr.length - 16 < i11) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i14 = 0; i14 < 16; i14++) {
            bArr3[i14] = (byte) (bArr[i14 + i11] ^ bArr2[i14]);
        }
        return bArr3;
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i11) {
        if (i11 < 0 || byteBuffer2.remaining() < i11 || byteBuffer3.remaining() < i11 || byteBuffer.remaining() < i11) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }
}
