package io.agora.base.internal.video;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
interface MediaCodecWrapper {
    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11);

    Surface createInputSurface();

    int dequeueInputBuffer(long j11);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j11);

    void flush();

    MediaCodecInfo.CodecCapabilities getCodecInfo(String str);

    ByteBuffer[] getInputBuffers();

    ByteBuffer[] getOutputBuffers();

    MediaFormat getOutputFormat();

    void queueInputBuffer(int i11, int i12, int i13, long j11, int i14);

    void release();

    void releaseOutputBuffer(int i11, boolean z11);

    void setParameters(Bundle bundle);

    void signalEndOfInputStream();

    void start();

    void stop();
}
