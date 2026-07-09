package x4;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f137141a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f137142b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f137143c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f137144d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f137145e = 0;

    p0() {
    }

    private void b() {
        this.f137144d = 0;
        this.f137143c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j11;
        int i11 = this.f137144d;
        if (i11 < 2) {
            return 0.0f;
        }
        int i12 = this.f137145e;
        int i13 = ((i12 + 20) - (i11 - 1)) % 20;
        long j12 = this.f137142b[i12];
        while (true) {
            jArr = this.f137142b;
            j11 = jArr[i13];
            if (j12 - j11 <= 100) {
                break;
            }
            this.f137144d--;
            i13 = (i13 + 1) % 20;
        }
        int i14 = this.f137144d;
        if (i14 < 2) {
            return 0.0f;
        }
        if (i14 == 2) {
            int i15 = (i13 + 1) % 20;
            if (j11 == jArr[i15]) {
                return 0.0f;
            }
            return this.f137141a[i15] / (r2 - j11);
        }
        float fAbs = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < this.f137144d - 1; i17++) {
            int i18 = i17 + i13;
            long[] jArr2 = this.f137142b;
            long j13 = jArr2[i18 % 20];
            int i19 = (i18 + 1) % 20;
            if (jArr2[i19] != j13) {
                i16++;
                float f11 = f(fAbs);
                float f12 = this.f137141a[i19] / (this.f137142b[i19] - j13);
                fAbs += (f12 - f11) * Math.abs(f12);
                if (i16 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }

    private static float f(float f11) {
        return (f11 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f11) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f137144d != 0 && eventTime - this.f137142b[this.f137145e] > 40) {
            b();
        }
        int i11 = (this.f137145e + 1) % 20;
        this.f137145e = i11;
        int i12 = this.f137144d;
        if (i12 != 20) {
            this.f137144d = i12 + 1;
        }
        this.f137141a[i11] = motionEvent.getAxisValue(26);
        this.f137142b[this.f137145e] = eventTime;
    }

    void c(int i11, float f11) {
        float fE = e() * i11;
        this.f137143c = fE;
        if (fE < (-Math.abs(f11))) {
            this.f137143c = -Math.abs(f11);
        } else if (this.f137143c > Math.abs(f11)) {
            this.f137143c = Math.abs(f11);
        }
    }

    float d(int i11) {
        if (i11 != 26) {
            return 0.0f;
        }
        return this.f137143c;
    }
}
