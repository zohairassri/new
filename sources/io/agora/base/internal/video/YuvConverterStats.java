package io.agora.base.internal.video;

import io.agora.base.internal.Logging;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class YuvConverterStats {
    private static final float CONFIDENCE_LEVEL_99_Z = 2.576f;
    private static final long STATS_SAMPLE_COUNT = 240;
    private static final String TAG = "YuvConverterStats";
    private final FallbackReason fallback;
    private final int height;
    private final YuvConvertMethod method;
    private final int width;
    private final List<Integer> timeSpentUsCache = new ArrayList();
    private float calLowerBound = 0.0f;
    private float calUpperBound = 0.0f;
    private int calAvgUs = 0;
    private int calMaxUs = 0;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum FallbackReason {
        NONE(-1),
        HARDWARE_BUFFER_PREPARE_FAILED(10),
        HARDWARE_BUFFER_UPLOAD_FAILED(11),
        HARDWARE_BUFFER_READ_FAILED(12),
        HARDWARE_BUFFER_CHECK_FAILED(13),
        HARDWARE_BUFFER_IN_BLACK_LIST(14),
        HARDWARE_BUFFER_UNSUPPORT(15),
        PBO_UPLOAD_FAILED(20),
        PBO_READ_FAILED(21),
        PBO_CHECK_FAILED(22);

        final int value;

        FallbackReason(int i11) {
            this.value = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum YuvConvertMethod {
        GL_READ_PIXELS(0),
        PBO(1),
        HARDWARE_BUFFER(2),
        SINGLE_PBO(3);

        final int value;

        YuvConvertMethod(int i11) {
            this.value = i11;
        }
    }

    YuvConverterStats(int i11, int i12, YuvConvertMethod yuvConvertMethod, FallbackReason fallbackReason) {
        this.width = i11;
        this.height = i12;
        this.method = yuvConvertMethod;
        this.fallback = fallbackReason;
    }

    private static float[] CalculateConfidenceBound(int[] iArr) {
        float fCalculateMean = CalculateMean(iArr);
        float fCalculateStandardDeviation = (float) ((((double) CalculateStandardDeviation(iArr, fCalculateMean)) / Math.sqrt(iArr.length)) * 2.5759999752044678d);
        return new float[]{fCalculateMean - fCalculateStandardDeviation, fCalculateMean + fCalculateStandardDeviation};
    }

    private static int CalculateMax(int[] iArr) {
        int iMax = 0;
        for (int i11 : iArr) {
            iMax = Math.max(iMax, i11);
        }
        return iMax;
    }

    private static float CalculateMean(int[] iArr) {
        long j11 = 0;
        for (int i11 : iArr) {
            j11 += (long) i11;
        }
        return (j11 * 1.0f) / iArr.length;
    }

    private static float CalculateStandardDeviation(int[] iArr, float f11) {
        long jPow = 0;
        for (int i11 : iArr) {
            jPow += (long) Math.pow(i11 - f11, 2.0d);
        }
        return (float) Math.sqrt((jPow * 1.0f) / (iArr.length - 1));
    }

    int getAvgUs() {
        return this.calAvgUs;
    }

    int getFallback() {
        return this.fallback.value;
    }

    int getHeight() {
        return this.height;
    }

    int getMaxUs() {
        return this.calMaxUs;
    }

    int getMethod() {
        return this.method.value;
    }

    int getWidth() {
        return this.width;
    }

    boolean stats(int i11) {
        this.timeSpentUsCache.add(Integer.valueOf(i11));
        boolean z11 = false;
        if (this.timeSpentUsCache.size() >= STATS_SAMPLE_COUNT) {
            int[] iArr = new int[this.timeSpentUsCache.size()];
            for (int i12 = 0; i12 < this.timeSpentUsCache.size(); i12++) {
                iArr[i12] = this.timeSpentUsCache.get(i12).intValue();
            }
            float fCalculateMean = CalculateMean(iArr);
            int iCalculateMax = CalculateMax(iArr);
            if (fCalculateMean < this.calLowerBound || fCalculateMean > this.calUpperBound) {
                float[] fArrCalculateConfidenceBound = CalculateConfidenceBound(iArr);
                this.calLowerBound = fArrCalculateConfidenceBound[0];
                z11 = true;
                this.calUpperBound = fArrCalculateConfidenceBound[1];
                this.calAvgUs = (int) fCalculateMean;
                this.calMaxUs = iCalculateMax;
                Logging.i(TAG, "method=" + this.method + ", calAvgUs=" + this.calAvgUs + ", calMaxUs=" + this.calMaxUs + ", fallback=" + this.fallback);
            }
            this.timeSpentUsCache.clear();
        }
        return z11;
    }
}
