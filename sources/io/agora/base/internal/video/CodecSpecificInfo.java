package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class CodecSpecificInfo {
    private ByteBuffer compressed_alpha_buffer;
    public long elapsedRealtime;
    private final ByteBuffer metadata;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public class CodecSpecificInfoHEVC extends CodecSpecificInfo {
        private VideoCodecProfile profile;

        public CodecSpecificInfoHEVC(VideoCodecProfile videoCodecProfile) {
            this.profile = videoCodecProfile;
        }

        @Override // io.agora.base.internal.video.CodecSpecificInfo
        public VideoCodecProfile getVideoCodecProfile() {
            return this.profile;
        }

        @Override // io.agora.base.internal.video.CodecSpecificInfo
        public VideoCodecType getVideoCodecType() {
            return VideoCodecType.H265;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    @CalledByNative
    public CodecSpecificInfo() {
        this((ByteBuffer) null, (ByteBuffer) null);
    }

    @CalledByNative
    public ByteBuffer getCompressedAlphadata() {
        return this.compressed_alpha_buffer;
    }

    @CalledByNative
    public ByteBuffer getMetadata() {
        return this.metadata;
    }

    public VideoCodecProfile getVideoCodecProfile() {
        return VideoCodecProfile.UNKNOWN;
    }

    public VideoCodecType getVideoCodecType() {
        return VideoCodecType.UNKNOWN;
    }

    @CalledByNative
    public CodecSpecificInfo(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.metadata = byteBuffer;
        this.compressed_alpha_buffer = byteBuffer2;
    }

    public CodecSpecificInfo(ByteBuffer byteBuffer, long j11) {
        this.metadata = byteBuffer;
        this.elapsedRealtime = j11;
    }
}
