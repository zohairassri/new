package io.agora.base.internal.video;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i11);
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        @TargetApi(18)
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public int dequeueInputBuffer(long j11) {
            return this.mediaCodec.dequeueInputBuffer(j11);
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j11) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j11);
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public MediaCodecInfo.CodecCapabilities getCodecInfo(String str) {
            MediaCodecInfo codecInfo = this.mediaCodec.getCodecInfo();
            if (codecInfo != null) {
                return codecInfo.getCapabilitiesForType(str);
            }
            return null;
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public ByteBuffer[] getInputBuffers() {
            return this.mediaCodec.getInputBuffers();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public ByteBuffer[] getOutputBuffers() {
            return this.mediaCodec.getOutputBuffers();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void queueInputBuffer(int i11, int i12, int i13, long j11, int i14) {
            this.mediaCodec.queueInputBuffer(i11, i12, i13, j11, i14);
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void release() {
            this.mediaCodec.release();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void releaseOutputBuffer(int i11, boolean z11) {
            this.mediaCodec.releaseOutputBuffer(i11, z11);
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        @TargetApi(19)
        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        @TargetApi(18)
        public void signalEndOfInputStream() {
            this.mediaCodec.signalEndOfInputStream();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void start() {
            this.mediaCodec.start();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void stop() {
            this.mediaCodec.stop();
        }
    }

    MediaCodecWrapperFactoryImpl() {
    }

    @Override // io.agora.base.internal.video.MediaCodecWrapperFactory
    public MediaCodecWrapper createByCodecName(String str) throws IOException {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}
