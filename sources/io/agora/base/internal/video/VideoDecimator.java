package io.agora.base.internal.video;

import io.agora.base.internal.Logging;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class VideoDecimator {
    private static int FrameCountHistorySize = 90;
    private static int FrameShitoryWindowMs = 2000;
    private static final String TAG = "VideoDecimator";
    private int dropCount;
    private float incomingFrameRate;
    private int keepCount;
    private float overshootModifier;
    private float targetFrameRate;
    private int maxFrameRate = 90;
    private boolean enableTemoralDecimation = true;
    private boolean dropNextFrame = false;
    private long[] incomingFrameTimes = new long[FrameCountHistorySize];

    private void processIncomingFramerate(long j11) {
        int i11 = 0;
        int i12 = 1;
        while (i12 < FrameCountHistorySize - 1) {
            long j12 = this.incomingFrameTimes[i12];
            if (j12 <= 0 || j11 - j12 > FrameShitoryWindowMs) {
                break;
            }
            i11++;
            i12++;
        }
        if (i12 <= 1) {
            this.incomingFrameRate = i11 * 1.0f;
            return;
        }
        long j13 = j11 - this.incomingFrameTimes[i12 - 1];
        this.incomingFrameRate = 1.0f;
        if (j13 > 0) {
            this.incomingFrameRate = (i11 * 1000.0f) / (j13 * 1.0f);
        }
    }

    public int decimatedFramerate() {
        processIncomingFramerate(System.currentTimeMillis());
        return !this.enableTemoralDecimation ? Math.round(this.incomingFrameRate) : Math.min((int) this.targetFrameRate, Math.round(this.incomingFrameRate));
    }

    public boolean dropFrame() {
        if (!this.enableTemoralDecimation) {
            return false;
        }
        float f11 = this.incomingFrameRate;
        if (f11 <= 0.0f) {
            return false;
        }
        int iRound = Math.round(f11);
        float f12 = this.targetFrameRate;
        if (f12 == 0.0f) {
            return true;
        }
        float f13 = iRound;
        if (f13 > f12) {
            int i11 = (int) (this.overshootModifier + (f13 - f12));
            if (i11 < 0) {
                this.overshootModifier = 0.0f;
                i11 = 0;
            }
            if (i11 != 0 && i11 * 2 < iRound) {
                if (this.dropCount != 0) {
                    this.dropCount = 0;
                    return true;
                }
                int i12 = iRound / i11;
                int i13 = this.keepCount;
                if (i13 <= i12) {
                    this.keepCount = i13 + 1;
                    return false;
                }
                this.overshootModifier = (-(iRound % i11)) / 3.0f;
                this.keepCount = 1;
                return true;
            }
            this.keepCount = 0;
            float f14 = i11;
            int i14 = (int) (f14 / f12);
            int i15 = this.dropCount;
            if (i15 < i14) {
                this.dropCount = i15 + 1;
                return true;
            }
            this.overshootModifier = f14 - (((int) (f14 / f12)) * f12);
            this.dropCount = 0;
        }
        return false;
    }

    public boolean dropNextFrame() {
        return this.dropNextFrame;
    }

    public void enableTemporalDecimation(boolean z11) {
        this.enableTemoralDecimation = z11;
    }

    public int getTargetFrameRate() {
        return (int) this.targetFrameRate;
    }

    public int inputFramerate() {
        processIncomingFramerate(System.currentTimeMillis());
        return Math.round(this.incomingFrameRate);
    }

    public boolean needDropNextFrame(boolean z11) {
        this.dropNextFrame = z11;
        return z11;
    }

    public void reset() {
        this.overshootModifier = 0.0f;
        this.dropCount = 0;
        this.keepCount = 0;
        this.targetFrameRate = 30.0f;
        this.incomingFrameRate = 0.0f;
        this.maxFrameRate = 90;
        this.enableTemoralDecimation = true;
        this.incomingFrameTimes = new long[FrameCountHistorySize];
    }

    public int setMaxFramerate(int i11) {
        if (i11 <= 0) {
            Logging.w(TAG, "setMaxFramerate invalid max frame rate");
            return -1;
        }
        this.maxFrameRate = i11;
        float f11 = i11;
        if (this.targetFrameRate <= f11) {
            return 0;
        }
        this.targetFrameRate = f11;
        return 0;
    }

    public int setTargetFramerate(float f11) {
        if (f11 < 0.1d) {
            Logging.w(TAG, "setTargetFramerate invalid frame rate ");
            return -1;
        }
        int i11 = this.maxFrameRate;
        if (f11 > i11) {
            this.targetFrameRate = i11;
            return 0;
        }
        this.targetFrameRate = f11;
        return 0;
    }

    public void updateIncomingFramerate() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.incomingFrameTimes[0] != 0) {
            for (int i11 = FrameCountHistorySize - 2; i11 >= 0; i11--) {
                long[] jArr = this.incomingFrameTimes;
                jArr[i11 + 1] = jArr[i11];
            }
        }
        this.incomingFrameTimes[0] = jCurrentTimeMillis;
        processIncomingFramerate(jCurrentTimeMillis);
    }
}
