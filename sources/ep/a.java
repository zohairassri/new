package ep;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f92796a = e(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static void a(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = iArr[i11] + iArr[i12];
        iArr[i11] = i15;
        int iB = b(i15 ^ iArr[i14], 16);
        iArr[i14] = iB;
        int i16 = iArr[i13] + iB;
        iArr[i13] = i16;
        int iB2 = b(iArr[i12] ^ i16, 12);
        iArr[i12] = iB2;
        int i17 = iArr[i11] + iB2;
        iArr[i11] = i17;
        int iB3 = b(iArr[i14] ^ i17, 8);
        iArr[i14] = iB3;
        int i18 = iArr[i13] + iB3;
        iArr[i13] = i18;
        iArr[i12] = b(iArr[i12] ^ i18, 7);
    }

    private static int b(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    static void c(int[] iArr, int[] iArr2) {
        int[] iArr3 = f92796a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void d(int[] iArr) {
        for (int i11 = 0; i11 < 10; i11++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    static int[] e(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
