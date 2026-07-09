package io.agora.base.internal.video;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class GPUPBOUtil {
    private long nativeHandle;

    public GPUPBOUtil(boolean z11) {
        this.nativeHandle = nativeObjectInit(z11);
    }

    private native long nativeObjectInit(boolean z11);

    private native boolean nativeReadFrame(long j11, int i11, int i12, int i13, int i14, boolean z11, int i15, int i16, ByteBuffer byteBuffer, boolean z12);

    private native void nativeRelease(long j11);

    public boolean readFrame(int i11, int i12, int i13, int i14, boolean z11, int i15, int i16, ByteBuffer byteBuffer, boolean z12) {
        long j11 = this.nativeHandle;
        if (j11 == 0) {
            return false;
        }
        return nativeReadFrame(j11, i11, i12, i13, i14, z11, i15, i16, byteBuffer, z12);
    }

    public void release() {
        long j11 = this.nativeHandle;
        if (j11 != 0) {
            nativeRelease(j11);
            this.nativeHandle = 0L;
        }
    }
}
