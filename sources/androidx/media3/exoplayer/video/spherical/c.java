package androidx.media3.exoplayer.video.spherical;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f10857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f10858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10860d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b[] f10861a;

        public a(b... bVarArr) {
            this.f10861a = bVarArr;
        }

        public b a(int i11) {
            return this.f10861a[i11];
        }

        public int b() {
            return this.f10861a.length;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f10864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f10865d;

        public b(int i11, float[] fArr, float[] fArr2, int i12) {
            this.f10862a = i11;
            k6.a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f10864c = fArr;
            this.f10865d = fArr2;
            this.f10863b = i12;
        }

        public int a() {
            return this.f10864c.length / 3;
        }
    }

    public c(a aVar, int i11) {
        this(aVar, aVar, i11);
    }

    public static c a(float f11, int i11, int i12, float f12, float f13, int i13) {
        int i14;
        int i15 = i11;
        k6.a.a(f11 > 0.0f);
        k6.a.a(i15 >= 1);
        k6.a.a(i12 >= 1);
        k6.a.a(f12 > 0.0f && f12 <= 180.0f);
        k6.a.a(f13 > 0.0f && f13 <= 360.0f);
        float radians = (float) Math.toRadians(f12);
        float radians2 = (float) Math.toRadians(f13);
        float f14 = radians / i15;
        float f15 = radians2 / i12;
        int i16 = i12 + 1;
        int i17 = ((i16 * 2) + 2) * i15;
        float[] fArr = new float[i17 * 3];
        float[] fArr2 = new float[i17 * 2];
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        while (i18 < i15) {
            float f16 = radians / 2.0f;
            float f17 = (i18 * f14) - f16;
            int i22 = i18 + 1;
            float f18 = (i22 * f14) - f16;
            int i23 = 0;
            while (i23 < i16) {
                float f19 = radians;
                float f21 = radians2;
                int i24 = 0;
                int i25 = 2;
                while (i24 < i25) {
                    float f22 = f14;
                    float f23 = i23 * f15;
                    float f24 = f15;
                    float f25 = f17;
                    double d11 = f11;
                    double d12 = (f23 + 3.1415927f) - (f21 / 2.0f);
                    double d13 = i24 == 0 ? f17 : f18;
                    fArr[i19] = -((float) (Math.cos(d13) * Math.sin(d12) * d11));
                    fArr[i19 + 1] = (float) (d11 * Math.sin(d13));
                    int i26 = i19 + 3;
                    fArr[i19 + 2] = (float) (d11 * Math.cos(d12) * Math.cos(d13));
                    fArr2[i21] = f23 / f21;
                    int i27 = i21 + 2;
                    fArr2[i21 + 1] = ((i18 + i24) * f22) / f19;
                    if ((i23 == 0 && i24 == 0) || (i23 == i12 && i24 == 1)) {
                        System.arraycopy(fArr, i19, fArr, i26, 3);
                        i19 += 6;
                        i14 = 2;
                        System.arraycopy(fArr2, i21, fArr2, i27, 2);
                        i21 += 4;
                    } else {
                        i14 = 2;
                        i19 = i26;
                        i21 = i27;
                    }
                    i24++;
                    i25 = i14;
                    f14 = f22;
                    f15 = f24;
                    f17 = f25;
                }
                i23++;
                radians2 = f21;
                radians = f19;
                f14 = f14;
            }
            i15 = i11;
            i18 = i22;
        }
        return new c(new a(new b(0, fArr, fArr2, 1)), i13);
    }

    public static c b(int i11) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i11);
    }

    public c(a aVar, a aVar2, int i11) {
        this.f10857a = aVar;
        this.f10858b = aVar2;
        this.f10859c = i11;
        this.f10860d = aVar == aVar2;
    }
}
