package io.agora.base.internal.video;

import io.agora.rtc2.Constants;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class YuvHelper {
    public static void I420Copy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15) {
        int i16 = (i14 + 1) / 2;
        int i17 = i14 * i15;
        int i18 = ((i15 + 1) / 2) * i16;
        int i19 = (i18 * 2) + i17;
        if (byteBuffer4.capacity() < i19) {
            throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i19 + " was " + byteBuffer4.capacity());
        }
        byteBuffer4.position(0);
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        byteBuffer4.position(i17);
        ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
        byteBuffer4.position(i18 + i17);
        nativeI420Copy(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBufferSlice, i14, byteBufferSlice2, i16, byteBuffer4.slice(), i16, i14, i15);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16) {
        int i17 = i16 % Constants.VIDEO_ORIENTATION_180;
        int i18 = i17 == 0 ? i14 : i15;
        int i19 = i17 == 0 ? i15 : i14;
        int i21 = (i19 + 1) / 2;
        int i22 = (i18 + 1) / 2;
        int i23 = i19 * i18;
        int i24 = i21 * i22;
        int i25 = (i24 * 2) + i23;
        if (byteBuffer4.capacity() < i25) {
            throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i25 + " was " + byteBuffer4.capacity());
        }
        byteBuffer4.position(0);
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        byteBuffer4.position(i23);
        ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
        byteBuffer4.position(i24 + i23);
        nativeI420Rotate(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBufferSlice, i18, byteBufferSlice2, i22, byteBuffer4.slice(), i22, i14, i15, i16);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15) {
        int i16 = (i14 + 1) / 2;
        int i17 = i14 * i15;
        int i18 = (((i15 + 1) / 2) * i16 * 2) + i17;
        if (byteBuffer4.capacity() >= i18) {
            byteBuffer4.position(0);
            ByteBuffer byteBufferSlice = byteBuffer4.slice();
            byteBuffer4.position(i17);
            nativeI420ToNV12(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBufferSlice, i14, byteBuffer4.slice(), i16 * 2, i14, i15);
            return;
        }
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i18 + " was " + byteBuffer4.capacity());
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14) {
        nativeCopyPlane(byteBuffer, i11, byteBuffer2, i12, i13, i14);
    }

    public static void copyPlane16(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14) {
        nativeCopyPlane16(byteBuffer, i11, byteBuffer2, i12, i13, i14);
    }

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14);

    private static native void nativeCopyPlane16(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, ByteBuffer byteBuffer6, int i16, int i17, int i18);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, ByteBuffer byteBuffer6, int i16, int i17, int i18, int i19);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, int i16, int i17);

    public static native int nativeRgbaToI420(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16);

    public static void I420ToNV12(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, int i16, int i17) {
        nativeI420ToNV12(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, byteBuffer5, i15, i16, i17);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, ByteBuffer byteBuffer6, int i16, int i17, int i18) {
        nativeI420Copy(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, byteBuffer5, i15, byteBuffer6, i16, i17, i18);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, ByteBuffer byteBuffer6, int i16, int i17, int i18, int i19) {
        nativeI420Rotate(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, byteBuffer5, i15, byteBuffer6, i16, i17, i18, i19);
    }
}
