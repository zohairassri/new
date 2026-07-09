package androidx.transition;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f12965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f12966b = new float[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12967c = 0;

    g0() {
        long[] jArr = new long[20];
        this.f12965a = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float c(float f11) {
        return (float) (((double) Math.signum(f11)) * Math.sqrt(Math.abs(f11) * 2.0f));
    }

    public void a(long j11, float f11) {
        int i11 = (this.f12967c + 1) % 20;
        this.f12967c = i11;
        this.f12965a[i11] = j11;
        this.f12966b[i11] = f11;
    }

    float b() {
        int i11 = this.f12967c;
        if (i11 == 0 && this.f12965a[i11] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j11 = this.f12965a[i11];
        int i12 = 0;
        long j12 = j11;
        while (true) {
            long j13 = this.f12965a[i11];
            if (j13 == Long.MIN_VALUE) {
                break;
            }
            float f11 = j11 - j13;
            float fAbs = Math.abs(j13 - j12);
            if (f11 > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i11 == 0) {
                i11 = 20;
            }
            i11--;
            i12++;
            if (i12 >= 20) {
                break;
            }
            j12 = j13;
        }
        if (i12 < 2) {
            return 0.0f;
        }
        if (i12 == 2) {
            int i13 = this.f12967c;
            int i14 = i13 == 0 ? 19 : i13 - 1;
            long[] jArr = this.f12965a;
            float f12 = jArr[i13] - jArr[i14];
            if (f12 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f12966b;
            return ((fArr[i13] - fArr[i14]) / f12) * 1000.0f;
        }
        int i15 = this.f12967c;
        int i16 = ((i15 - i12) + 21) % 20;
        int i17 = (i15 + 21) % 20;
        long j14 = this.f12965a[i16];
        float f13 = this.f12966b[i16];
        int i18 = i16 + 1;
        float fC = 0.0f;
        for (int i19 = i18 % 20; i19 != i17; i19 = (i19 + 1) % 20) {
            long j15 = this.f12965a[i19];
            float f14 = j15 - j14;
            if (f14 != 0.0f) {
                float f15 = this.f12966b[i19];
                float f16 = (f15 - f13) / f14;
                fC += (f16 - c(fC)) * Math.abs(f16);
                if (i19 == i18) {
                    fC *= 0.5f;
                }
                f13 = f15;
                j14 = j15;
            }
        }
        return c(fC) * 1000.0f;
    }
}
