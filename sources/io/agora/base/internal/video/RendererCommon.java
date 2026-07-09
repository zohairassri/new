package io.agora.base.internal.video;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;
import io.agora.base.VideoFrame;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    /* JADX INFO: renamed from: io.agora.base.internal.video.RendererCommon$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$base$internal$video$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[ScalingType.values().length];
            $SwitchMap$io$agora$base$internal$video$RendererCommon$ScalingType = iArr;
            try {
                iArr[ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface GlDrawer {
        void drawAlpha(int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17);

        void drawAlphaStitchGraph(int[] iArr, int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, VideoFrame.ColorSpace colorSpace, int i18, int i19);

        void drawOes(int i11, int i12, float[] fArr, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

        void drawOes(int i11, int i12, float[] fArr, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21);

        void drawRgb(int i11, int i12, float[] fArr, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

        void drawRgb(int i11, int i12, float[] fArr, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21);

        void drawRgb(int i11, int i12, float[] fArr, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11, int i19, int i21);

        void drawRgb(int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17);

        void drawYuv(int[] iArr, int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

        void drawYuv(int[] iArr, int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, VideoFrame.ColorSpace colorSpace, int i18);

        void release();

        void setLut10Texture(byte[] bArr);

        void setTextureCropCoord(FloatBuffer floatBuffer);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface RendererEvents {
        void onFirstFrameRendered(int i11, int i12, int i13);

        void onFrameDrawn(long j11, long j12);

        void onFrameDropped();

        void onFrameResolutionChanged(int i11, int i12, int i13);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    private static void adjustOrigin(float[] fArr) {
        float f11 = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f11;
        float f12 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f12;
        fArr[12] = f11 + 0.5f;
        fArr[13] = f12 + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    private static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int i11 = AnonymousClass1.$SwitchMap$io$agora$base$internal$video$RendererCommon$ScalingType[scalingType.ordinal()];
        if (i11 == 1) {
            return 1.0f;
        }
        if (i11 == 2) {
            return 0.0f;
        }
        if (i11 == 3) {
            return BALANCED_VISIBLE_FRACTION;
        }
        throw new IllegalArgumentException();
    }

    public static Point getDisplaySize(ScalingType scalingType, float f11, int i11, int i12) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f11, i11, i12);
    }

    public static float[] getLayoutMatrix(boolean z11, float f11, float f12) {
        float f13;
        float f14;
        if (f12 > f11) {
            f14 = f11 / f12;
            f13 = 1.0f;
        } else {
            f13 = f12 / f11;
            f14 = 1.0f;
        }
        if (z11) {
            f13 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f13, f14, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class VideoLayoutMeasure {
        private ScalingType scalingTypeMatchOrientation;
        private ScalingType scalingTypeMismatchOrientation;

        public VideoLayoutMeasure() {
            ScalingType scalingType = ScalingType.SCALE_ASPECT_BALANCED;
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType;
        }

        public Point measure(int i11, int i12, int i13, int i14) {
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i11);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i12);
            if (i13 == 0 || i14 == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new Point(defaultSize, defaultSize2);
            }
            float f11 = i13 / i14;
            Point displaySize = RendererCommon.getDisplaySize(((f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1)) > 0) == (((float) defaultSize) / ((float) defaultSize2) > 1.0f) ? this.scalingTypeMatchOrientation : this.scalingTypeMismatchOrientation, f11, defaultSize, defaultSize2);
            if (View.MeasureSpec.getMode(i11) == 1073741824) {
                displaySize.x = defaultSize;
            }
            if (View.MeasureSpec.getMode(i12) == 1073741824) {
                displaySize.y = defaultSize2;
            }
            return displaySize;
        }

        public void setScalingType(ScalingType scalingType) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType2;
        }
    }

    private static Point getDisplaySize(float f11, float f12, int i11, int i12) {
        return (f11 == 0.0f || f12 == 0.0f) ? new Point(i11, i12) : new Point(Math.min(i11, Math.round((i12 / f11) * f12)), Math.min(i12, Math.round((i11 / f11) / f12)));
    }
}
