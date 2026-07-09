package io.agora.base.internal;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class JniCommon {
    public static native void nativeAddRef(long j11);

    public static native ByteBuffer nativeAllocateByteBuffer(int i11);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j11);
}
