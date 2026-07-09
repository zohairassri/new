package io.agora.base;

import android.graphics.Matrix;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.JniCommon;
import io.agora.base.internal.RefCounted;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.WrappedNativeColorSpace;
import io.agora.rtc2.Constants;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class VideoFrame implements RefCounted {
    private ByteBuffer alphaBuffer;
    private AlphaStitchMode alphaStitchMode;
    private Buffer buffer;
    private ColorSpace colorSpace;
    private VideoFrameMetaInfo metaInfo;
    private long nativeAlphaBuffer;
    private long renderStartTimeMs;
    private int rotation;
    private float sampleAspectRatio;
    private SourceType sourceType;
    private long timestampNs;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum AlphaStitchMode {
        ALPHA_NO_STITCH(0),
        ALPHA_STITCH_UP(1),
        ALPHA_STITCH_BELOW(2),
        ALPHA_STITCH_LEFT(3),
        ALPHA_STITCH_RIGHT(4);

        private final int stitchMode;

        AlphaStitchMode(int i11) {
            this.stitchMode = i11;
        }

        public int value() {
            return this.stitchMode;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface Buffer extends RefCounted {
        @CalledByNative("Buffer")
        Buffer cropAndScale(int i11, int i12, int i13, int i14, int i15, int i16);

        @CalledByNative("Buffer")
        int getHeight();

        @CalledByNative("Buffer")
        int getWidth();

        @CalledByNative("Buffer")
        Buffer mirror(int i11);

        @Override // io.agora.base.internal.RefCounted
        @CalledByNative("Buffer")
        void release();

        @Override // io.agora.base.internal.RefCounted
        @CalledByNative("Buffer")
        void retain();

        @CalledByNative("Buffer")
        Buffer rotate(int i11);

        @CalledByNative("Buffer")
        I420Buffer toI420();

        @CalledByNative("Buffer")
        Buffer transform(int i11, int i12, int i13, int i14, int i15, int i16, int i17);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface ColorSpace {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public enum Matrix {
            RGB(0),
            BT709(1),
            Unspecified(2),
            FCC(4),
            BT470BG(5),
            SMPTE170M(6),
            SMPTE240M(7),
            YCOCG(8),
            BT2020_NCL(9),
            BT2020_CL(10),
            SMPTE2085(11),
            CDNCLS(12),
            CDCLS(13),
            BT2100_ICTCP(14);

            private final int matrix;

            Matrix(int i11) {
                this.matrix = i11;
            }

            public int getMatrix() {
                return this.matrix;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public enum Primary {
            BT709(1),
            Unspecified(2),
            BT470M(4),
            BT470BG(5),
            kSMPTE170M(6),
            kSMPTE240M(7),
            kFILM(8),
            kBT2020(9),
            kSMPTEST428(10),
            kSMPTEST431(11),
            kSMPTEST432(12),
            kJEDECP22(22);

            private final int primary;

            Primary(int i11) {
                this.primary = i11;
            }

            public int getPrimary() {
                return this.primary;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public enum Range {
            Invalid(0),
            Limited(1),
            Full(2);

            private final int range;

            Range(int i11) {
                this.range = i11;
            }

            public int getRange() {
                return this.range;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public enum Transfer {
            BT709(1),
            Unspecified(2),
            GAMMA22(4),
            GAMMA28(5),
            SMPTE170M(6),
            SMPTE240M(7),
            LINEAR(8),
            LOG(9),
            LOG_SQRT(10),
            IEC61966_2_4(11),
            BT1361_ECG(12),
            IEC61966_2_1(13),
            BT2020_10(14),
            BT2020_12(15),
            SMPTEST2084(16),
            SMPTEST428(17),
            ARIB_STD_B67(18);

            private final int transfer;

            Transfer(int i11) {
                this.transfer = i11;
            }

            public int getTransfer() {
                return this.transfer;
            }
        }

        HdrMetadata getHdrMetadata();

        Matrix getMatrix();

        Primary getPrimary();

        Range getRange();

        Transfer getTransfer();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface HdrMetadata {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static class Chromaticity {

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f103942x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f103943y;

            public Chromaticity(int i11, int i12) {
                this.f103942x = i11;
                this.f103943y = i12;
            }
        }

        int getLuminanceMax();

        int getLuminanceMin();

        int getMaxContentLightLevel();

        int getMaxFrameAverageLightLevel();

        Chromaticity getWhitePoint();

        Chromaticity getprimaryB();

        Chromaticity getprimaryG();

        Chromaticity getprimaryR();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface I010Buffer extends Buffer {
        @CalledByNative("I010Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I010Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I010Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I010Buffer")
        int getStrideU();

        @CalledByNative("I010Buffer")
        int getStrideV();

        @CalledByNative("I010Buffer")
        int getStrideY();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface I420Buffer extends Buffer {
        @CalledByNative("I420Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I420Buffer")
        int getStrideU();

        @CalledByNative("I420Buffer")
        int getStrideV();

        @CalledByNative("I420Buffer")
        int getStrideY();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface I422Buffer extends Buffer {
        @CalledByNative("I422Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I422Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I422Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I422Buffer")
        int getStrideU();

        @CalledByNative("I422Buffer")
        int getStrideV();

        @CalledByNative("I422Buffer")
        int getStrideY();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface RgbaBuffer extends Buffer {
        @CalledByNative("RgbaBuffer")
        ByteBuffer getData();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum SourceType {
        kFrontCamera,
        kBackCamera,
        kUnspecified
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface TextureBuffer extends Buffer {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public enum ContextType {
            EGL_CONTEXT_10,
            EGL_CONTEXT_14
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public enum Type {
            OES(36197),
            RGB(3553);

            private final int glTarget;

            Type(int i11) {
                this.glTarget = i11;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        @CalledByNative("TextureBuffer")
        EglBase.Context getEglBaseContext();

        @CalledByNative("TextureBuffer")
        int getEglContextType();

        @CalledByNative("TextureBuffer")
        long getFenceObject();

        @CalledByNative("TextureBuffer")
        long getNativeEglContext();

        @CalledByNative("TextureBuffer")
        int getSequence();

        @CalledByNative("TextureBuffer")
        Object getSourceTexturePool();

        @CalledByNative("TextureBuffer")
        int getTextureId();

        Matrix getTransformMatrix();

        @CalledByNative("TextureBuffer")
        float[] getTransformMatrixArray();

        Type getType();

        @CalledByNative("TextureBuffer")
        boolean is10BitTexture();

        @CalledByNative("TextureBuffer")
        I010Buffer toI010();
    }

    public VideoFrame(Buffer buffer, int i11, long j11) {
        this(buffer, i11, j11, new WrappedNativeColorSpace(), null, 0L, 1.0f, SourceType.kUnspecified.ordinal(), System.currentTimeMillis());
    }

    @CalledByNative
    private int getColorSpaceMatrix() {
        ColorSpace colorSpace = this.colorSpace;
        return colorSpace == null ? ColorSpace.Matrix.Unspecified.getMatrix() : colorSpace.getMatrix().getMatrix();
    }

    @CalledByNative
    private int getColorSpacePrimary() {
        ColorSpace colorSpace = this.colorSpace;
        return colorSpace == null ? ColorSpace.Primary.Unspecified.getPrimary() : colorSpace.getPrimary().getPrimary();
    }

    @CalledByNative
    private int getColorSpaceRange() {
        ColorSpace colorSpace = this.colorSpace;
        return colorSpace == null ? ColorSpace.Range.Invalid.getRange() : colorSpace.getRange().getRange();
    }

    @CalledByNative
    private int getColorSpaceTransfer() {
        ColorSpace colorSpace = this.colorSpace;
        return colorSpace == null ? ColorSpace.Transfer.Unspecified.getTransfer() : colorSpace.getTransfer().getTransfer();
    }

    public void fillAlphaData(ByteBuffer byteBuffer) {
        this.alphaBuffer = byteBuffer;
    }

    @CalledByNative
    public ByteBuffer getAlphaBuffer() {
        return this.alphaBuffer;
    }

    @CalledByNative
    public int getAlphaStitchMode() {
        return this.alphaStitchMode.value();
    }

    @CalledByNative
    public Buffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    public ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @CalledByNative
    public VideoFrameMetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    public long getRenderStartTimeMs() {
        return this.renderStartTimeMs;
    }

    public int getRotatedHeight() {
        if (this.rotation % Constants.VIDEO_ORIENTATION_180 == 0) {
            AlphaStitchMode alphaStitchMode = this.alphaStitchMode;
            return (alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_UP || alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_BELOW) ? this.buffer.getHeight() / 2 : this.buffer.getHeight();
        }
        AlphaStitchMode alphaStitchMode2 = this.alphaStitchMode;
        return (alphaStitchMode2 == AlphaStitchMode.ALPHA_STITCH_LEFT || alphaStitchMode2 == AlphaStitchMode.ALPHA_STITCH_RIGHT) ? this.buffer.getWidth() / 2 : this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        if (this.rotation % Constants.VIDEO_ORIENTATION_180 == 0) {
            AlphaStitchMode alphaStitchMode = this.alphaStitchMode;
            return (alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_LEFT || alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_RIGHT) ? this.buffer.getWidth() / 2 : this.buffer.getWidth();
        }
        AlphaStitchMode alphaStitchMode2 = this.alphaStitchMode;
        return (alphaStitchMode2 == AlphaStitchMode.ALPHA_STITCH_UP || alphaStitchMode2 == AlphaStitchMode.ALPHA_STITCH_BELOW) ? this.buffer.getHeight() / 2 : this.buffer.getHeight();
    }

    @CalledByNative
    public int getRotation() {
        return this.rotation;
    }

    public float getSampleAspectRatio() {
        return this.sampleAspectRatio;
    }

    @CalledByNative
    public SourceType getSourceType() {
        return this.sourceType;
    }

    @CalledByNative
    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // io.agora.base.internal.RefCounted
    @CalledByNative
    public void release() {
        this.buffer.release();
    }

    public void releaseAlphaBuffer() {
        JniCommon.nativeReleaseRef(this.nativeAlphaBuffer);
    }

    public void replaceBuffer(Buffer buffer, int i11, long j11) {
        release();
        this.buffer = buffer;
        this.rotation = i11;
        this.timestampNs = j11;
    }

    @Override // io.agora.base.internal.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    public void retainAlphaBuffer() {
        JniCommon.nativeAddRef(this.nativeAlphaBuffer);
    }

    @CalledByNative
    public void setAlphaStitchMode(int i11) {
        this.alphaStitchMode = AlphaStitchMode.values()[i11];
    }

    public void setColorSpace(ColorSpace colorSpace) {
        this.colorSpace = colorSpace;
    }

    @CalledByNative
    public VideoFrame(Buffer buffer, int i11, long j11, ColorSpace colorSpace, ByteBuffer byteBuffer, long j12, float f11, int i12, long j13) {
        this.alphaStitchMode = AlphaStitchMode.ALPHA_NO_STITCH;
        this.metaInfo = new VideoFrameMetaInfo();
        if (buffer != null) {
            if (i11 % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i11;
                this.timestampNs = j11;
                this.colorSpace = colorSpace;
                this.alphaBuffer = byteBuffer;
                this.nativeAlphaBuffer = j12;
                this.sampleAspectRatio = f11;
                this.sourceType = SourceType.values()[i12];
                this.renderStartTimeMs = j13;
                return;
            }
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        throw new IllegalArgumentException("buffer not allowed to be null");
    }
}
