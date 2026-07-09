package io.agora.rtc2.video;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import io.agora.base.internal.video.FactorBitrateAdjuster;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class CoordinatesTransform {
    public static Rect calculateFocusArea(float f11, float f12, float f13) {
        int i11 = (int) ((f11 * 2000.0f) - 1000.0f);
        int i12 = (int) ((f12 * 2000.0f) - 1000.0f);
        int iIntValue = Float.valueOf(f13 * 300.0f).intValue() / 2;
        RectF rectF = new RectF(clamp(i11 - iIntValue, -1000, FactorBitrateAdjuster.FACTOR_BASE), clamp(i12 - iIntValue, -1000, FactorBitrateAdjuster.FACTOR_BASE), clamp(i11 + iIntValue, -1000, FactorBitrateAdjuster.FACTOR_BASE), clamp(i12 + iIntValue, -1000, FactorBitrateAdjuster.FACTOR_BASE));
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public static Rect calculateMeteringArea(float f11, float f12, int i11, int i12, float f13) {
        int i13 = (int) ((f11 * i11) - (i11 / 2));
        int i14 = (int) ((f12 * i12) - (i12 / 2));
        int iIntValue = Float.valueOf(f13 * 300.0f).intValue() / 2;
        RectF rectF = new RectF(clamp(i13 - iIntValue, 0, i11), clamp(i14 - iIntValue, 0, i12), clamp(i13 + iIntValue, 0, i11), clamp(i14 + iIntValue, 0, i12));
        Rect rect = new Rect();
        rectF.round(rect);
        return (rect.width() == 0 || rect.height() == 0) ? new Rect(0, 0, 0, 0) : rect;
    }

    public static RectF cameraToNormalized(@NonNull RectF rectF) {
        if (rectF == null || rectF.left < -1000.0f || rectF.top < -1000.0f || rectF.right > 1000.0f || rectF.bottom > 1000.0f) {
            return null;
        }
        RectF rectF2 = new RectF(rectF);
        Matrix matrix = new Matrix();
        matrix.postScale(5.0E-4f, 5.0E-4f);
        matrix.postTranslate(0.5f, 0.5f);
        matrix.mapRect(rectF2);
        return rectF2;
    }

    static float clamp(float f11, float f12, float f13) {
        return Math.max(f12, Math.min(f13, f11));
    }

    public static RectF normalizedFaceRect(Rect rect, int i11, boolean z11) {
        Matrix matrix = new Matrix();
        prepareMatrix(matrix, z11, i11);
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        return rectF;
    }

    public static RectF normalizedToCamera(@NonNull RectF rectF) {
        if (rectF == null || rectF.left < 0.0f || rectF.top < 0.0f || rectF.width() > 1.0f || rectF.height() > 1.0f) {
            return null;
        }
        RectF rectF2 = new RectF(rectF);
        Matrix matrix = new Matrix();
        matrix.postScale(2000.0f, 2000.0f);
        matrix.postTranslate(-1000.0f, -1000.0f);
        matrix.mapRect(rectF2);
        return rectF2;
    }

    public static RectF normalizedToSensor(@NonNull RectF rectF, int i11, int i12, int i13, int i14, int i15, boolean z11) {
        RectF rectF2 = null;
        if (rectF == null) {
            return null;
        }
        if (rectF.left >= 0.0f && rectF.top >= 0.0f && rectF.width() <= 1.0f && rectF.height() <= 1.0f) {
            rectF2 = new RectF(rectF);
            Matrix matrix = new Matrix();
            if (z11) {
                float f11 = i13;
                float f12 = f11 / i11;
                float f13 = i14;
                float f14 = f13 / i12;
                float f15 = f12 / f14;
                if (f15 > 1.0f) {
                    matrix.postTranslate((f15 - 1.0f) / 2.0f, 0.0f);
                    i13 = (int) ((f11 * f14) / f12);
                } else if (f15 < 1.0f) {
                    matrix.postTranslate(0.0f, ((f14 / f12) - 1.0f) / 2.0f);
                    i14 = (int) ((f13 * f12) / f14);
                }
                matrix.mapRect(rectF2);
            }
            matrix.setScale(i13, i14);
            matrix.mapRect(rectF2);
        }
        return rectF2;
    }

    public static RectF normalizedToView(@NonNull RectF rectF, int i11, int i12, int i13, int i14, boolean z11, int i15, int i16) {
        RectF rectF2 = null;
        if (rectF == null) {
            return null;
        }
        if (rectF.left >= 0.0f && rectF.top >= 0.0f && rectF.right <= 1.0f && rectF.bottom <= 1.0f && i15 % 90 == 0) {
            int i17 = i15 > 0 ? i15 % 360 : (i15 % 360) + 360;
            rectF2 = new RectF(rectF);
            Matrix matrix = new Matrix();
            if (z11) {
                float f11 = rectF2.left;
                rectF2.left = 1.0f - rectF2.right;
                rectF2.right = 1.0f - f11;
            }
            matrix.setRotate(-i17);
            if (i17 == 90) {
                matrix.postTranslate(0.0f, 1.0f);
            } else if (i17 == 180) {
                matrix.postTranslate(1.0f, 1.0f);
            } else if (i17 == 270) {
                matrix.postTranslate(1.0f, 0.0f);
            }
            float f12 = i11;
            float f13 = i12;
            matrix.postScale(f12, f13);
            matrix.mapRect(rectF2);
            float f14 = (i17 == 90 || i17 == 270) ? i14 : i13;
            float f15 = (i17 == 90 || i17 == 270) ? i13 : i14;
            float f16 = f12 / f14;
            float f17 = f13 / f15;
            if (i16 != 1) {
                if (i16 != 2) {
                    return rectF2;
                }
                if (f16 > f17) {
                    matrix.setScale(f17 / f16, 1.0f, i11 / 2, i12 / 2);
                    matrix.mapRect(rectF2);
                    rectF2.right = clamp(rectF2.right, 0.0f, f12);
                    rectF2.left = clamp(rectF2.left, 0.0f, f12);
                    return rectF2;
                }
                matrix.setScale(1.0f, f16 / f17, i11 / 2, i12 / 2);
                matrix.mapRect(rectF2);
                rectF2.top = clamp(rectF2.top, 0.0f, f13);
                rectF2.bottom = clamp(rectF2.bottom, 0.0f, f13);
                return rectF2;
            }
            if (f16 > f17) {
                matrix.setScale(1.0f, f16 / f17, i11 / 2, i12 / 2);
                matrix.mapRect(rectF2);
                rectF2.top = clamp(rectF2.top, 0.0f, f13);
                rectF2.bottom = clamp(rectF2.bottom, 0.0f, f13);
                return rectF2;
            }
            matrix.setScale(f17 / f16, 1.0f, i11 / 2, i12 / 2);
            matrix.mapRect(rectF2);
            rectF2.right = clamp(rectF2.right, 0.0f, f12);
            rectF2.left = clamp(rectF2.left, 0.0f, f12);
        }
        return rectF2;
    }

    private static void prepareMatrix(Matrix matrix, boolean z11, int i11) {
        matrix.setScale(z11 ? -1.0f : 1.0f, 1.0f);
        matrix.postRotate(i11);
        matrix.postScale(5.0E-4f, 5.0E-4f);
        matrix.postTranslate(0.5f, 0.5f);
    }

    public static RectF sensorToNormalized(@NonNull RectF rectF, int i11, int i12, int i13, int i14, boolean z11) {
        RectF rectF2 = null;
        if (rectF == null) {
            return null;
        }
        if (rectF.left >= 0.0f && rectF.top >= 0.0f) {
            float f11 = i11;
            if (rectF.width() <= f11) {
                float f12 = i12;
                if (rectF.height() <= f12) {
                    rectF2 = new RectF(rectF);
                    Matrix matrix = new Matrix();
                    if (z11) {
                        float f13 = f11 / i13;
                        float f14 = f12 / i14;
                        float f15 = f13 / f14;
                        if (f15 > 1.0f) {
                            matrix.postTranslate((((f14 / f13) - 1.0f) * f11) / 2.0f, 0.0f);
                            i11 = (int) ((f11 * f14) / f13);
                        } else if (f15 < 1.0f) {
                            matrix.postTranslate(0.0f, ((f15 - 1.0f) * f12) / 2.0f);
                            i12 = (int) ((f12 * f13) / f14);
                        }
                        matrix.mapRect(rectF2);
                    }
                    matrix.setScale(1.0f / i11, 1.0f / i12);
                    matrix.mapRect(rectF2);
                    rectF2.left = clamp(rectF2.left, 0.0f, 1.0f);
                    rectF2.right = clamp(rectF2.right, 0.0f, 1.0f);
                    rectF2.top = clamp(rectF2.top, 0.0f, 1.0f);
                    rectF2.bottom = clamp(rectF2.bottom, 0.0f, 1.0f);
                }
            }
        }
        return rectF2;
    }

    public static Rect sensorToNormalizedPreview(Rect rect, int i11, int i12, Rect rect2) {
        double d11;
        double d12;
        if (i11 > i12) {
            d11 = i11;
            d12 = i12;
        } else {
            d11 = i12;
            d12 = i11;
        }
        double d13 = d11 / d12;
        double dWidth = ((double) rect2.width()) / ((double) rect2.height());
        int iWidth = rect2.width();
        int iHeight = rect2.height();
        if (d13 > dWidth) {
            iHeight = (int) (((double) iWidth) / d13);
        } else {
            iWidth = (int) (((double) iHeight) * d13);
        }
        int iAbs = Math.abs(iWidth - rect2.width());
        int iAbs2 = Math.abs(iHeight - rect2.height());
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.postTranslate((-rect2.left) - (iAbs / 2), (-rect2.top) - (iAbs2 / 2));
        matrix.postTranslate((-iWidth) / 2, (-iHeight) / 2);
        matrix.postScale(2000.0f / iWidth, 2000.0f / iHeight);
        matrix.mapRect(rectF);
        Rect rect3 = new Rect();
        rectF.round(rect3);
        return rect3;
    }

    public static RectF viewToNormalized(@NonNull RectF rectF, int i11, int i12, int i13, int i14, boolean z11, int i15, int i16) {
        RectF rectF2 = null;
        if (rectF == null) {
            return null;
        }
        if (i11 > 0 && i12 > 0 && rectF.left >= 0.0f && rectF.top >= 0.0f) {
            float f11 = i11;
            if (rectF.right <= f11) {
                float f12 = i12;
                if (rectF.bottom <= f12 && i15 % 90 == 0) {
                    int i17 = i15 > 0 ? i15 % 360 : (i15 % 360) + 360;
                    rectF2 = new RectF(rectF);
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i17);
                    float f13 = (i17 == 90 || i17 == 270) ? f12 : f11;
                    if (i17 != 90 && i17 != 270) {
                        f11 = f12;
                    }
                    float f14 = f13 / i13;
                    float f15 = f11 / i14;
                    matrix.postScale(1.0f / f13, 1.0f / f11);
                    if (i17 == 90) {
                        matrix.postTranslate(1.0f, 0.0f);
                    } else if (i17 == 180) {
                        matrix.postTranslate(1.0f, 1.0f);
                    } else if (i17 == 270) {
                        matrix.postTranslate(0.0f, 1.0f);
                    }
                    if (i16 != 1) {
                        if (i16 == 2) {
                            if (f14 > f15) {
                                matrix.postScale(f14 / f15, 1.0f, 0.5f, 0.0f);
                                matrix.mapRect(rectF2);
                                rectF2.right = clamp(rectF2.right, 0.0f, 1.0f);
                                rectF2.left = clamp(rectF2.left, 0.0f, 1.0f);
                            } else {
                                matrix.postScale(1.0f, f15 / f14);
                                matrix.mapRect(rectF2);
                                rectF2.top = clamp(rectF2.top, 0.0f, 1.0f);
                                rectF2.bottom = clamp(rectF2.bottom, 0.0f, 1.0f);
                            }
                        }
                    } else if (f14 > f15) {
                        matrix.postScale(1.0f, f15 / f14, 0.0f, 0.5f);
                        matrix.mapRect(rectF2);
                        rectF2.top = clamp(rectF2.top, 0.0f, 1.0f);
                        rectF2.bottom = clamp(rectF2.bottom, 0.0f, 1.0f);
                    } else {
                        matrix.postScale(f14 / f15, 1.0f, 0.5f, 0.0f);
                        matrix.mapRect(rectF2);
                        rectF2.right = clamp(rectF2.right, 0.0f, 1.0f);
                        rectF2.left = clamp(rectF2.left, 0.0f, 1.0f);
                    }
                    if (z11) {
                        float f16 = rectF2.left;
                        rectF2.left = 1.0f - rectF2.right;
                        rectF2.right = 1.0f - f16;
                    }
                }
            }
        }
        return rectF2;
    }

    static int clamp(int i11, int i12, int i13) {
        return Math.max(i12, Math.min(i13, i11));
    }
}
