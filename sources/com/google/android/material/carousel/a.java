package com.google.android.material.carousel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f44227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f44228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f44229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f44230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f44231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f44232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f44233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f44234h;

    a(int i11, float f11, float f12, float f13, int i12, float f14, int i13, float f15, int i14, float f16) {
        this.f44227a = i11;
        this.f44228b = r4.a.a(f11, f12, f13);
        this.f44229c = i12;
        this.f44231e = f14;
        this.f44230d = i13;
        this.f44232f = f15;
        this.f44233g = i14;
        d(f16, f12, f13, f15);
        this.f44234h = b(f15);
    }

    private float a(float f11, int i11, float f12, int i12, int i13) {
        if (i11 <= 0) {
            f12 = 0.0f;
        }
        float f13 = i11;
        float f14 = i12 / 2.0f;
        return (f11 - ((f13 + f14) * f12)) / (i13 + f14);
    }

    private float b(float f11) {
        if (g()) {
            return Math.abs(f11 - this.f44232f) * this.f44227a;
        }
        return Float.MAX_VALUE;
    }

    static a c(float f11, float f12, float f13, float f14, int[] iArr, float f15, int[] iArr2, float f16, int[] iArr3) {
        a aVar = null;
        int i11 = 1;
        for (int i12 : iArr3) {
            int length = iArr2.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = iArr2[i13];
                int length2 = iArr.length;
                int i15 = 0;
                while (i15 < length2) {
                    int i16 = length;
                    int i17 = i13;
                    int i18 = i11;
                    int i19 = length2;
                    int i21 = i15;
                    a aVar2 = new a(i18, f12, f13, f14, iArr[i15], f15, i14, f16, i12, f11);
                    if (aVar == null || aVar2.f44234h < aVar.f44234h) {
                        if (aVar2.f44234h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i22 = i18 + 1;
                    i15 = i21 + 1;
                    i13 = i17;
                    i11 = i22;
                    length = i16;
                    length2 = i19;
                }
                i13++;
                i11 = i11;
                length = length;
            }
        }
        return aVar;
    }

    private void d(float f11, float f12, float f13, float f14) {
        float f15 = f11 - f();
        int i11 = this.f44229c;
        if (i11 > 0 && f15 > 0.0f) {
            float f16 = this.f44228b;
            this.f44228b = f16 + Math.min(f15 / i11, f13 - f16);
        } else if (i11 > 0 && f15 < 0.0f) {
            float f17 = this.f44228b;
            this.f44228b = f17 + Math.max(f15 / i11, f12 - f17);
        }
        int i12 = this.f44229c;
        float f18 = i12 > 0 ? this.f44228b : 0.0f;
        this.f44228b = f18;
        float fA = a(f11, i12, f18, this.f44230d, this.f44233g);
        this.f44232f = fA;
        float f19 = (this.f44228b + fA) / 2.0f;
        this.f44231e = f19;
        int i13 = this.f44230d;
        if (i13 <= 0 || fA == f14) {
            return;
        }
        float f21 = (f14 - fA) * this.f44233g;
        float fMin = Math.min(Math.abs(f21), f19 * 0.1f * i13);
        if (f21 > 0.0f) {
            this.f44231e -= fMin / this.f44230d;
            this.f44232f += fMin / this.f44233g;
        } else {
            this.f44231e += fMin / this.f44230d;
            this.f44232f -= fMin / this.f44233g;
        }
    }

    private float f() {
        return (this.f44232f * this.f44233g) + (this.f44231e * this.f44230d) + (this.f44228b * this.f44229c);
    }

    private boolean g() {
        int i11 = this.f44233g;
        if (i11 <= 0 || this.f44229c <= 0 || this.f44230d <= 0) {
            return i11 <= 0 || this.f44229c <= 0 || this.f44232f > this.f44228b;
        }
        float f11 = this.f44232f;
        float f12 = this.f44231e;
        return f11 > f12 && f12 > this.f44228b;
    }

    int e() {
        return this.f44229c + this.f44230d + this.f44233g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f44227a + ", smallCount=" + this.f44229c + ", smallSize=" + this.f44228b + ", mediumCount=" + this.f44230d + ", mediumSize=" + this.f44231e + ", largeCount=" + this.f44233g + ", largeSize=" + this.f44232f + ", cost=" + this.f44234h + "]";
    }
}
