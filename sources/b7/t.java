package b7;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface t {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class a implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f13888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f13889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f13890c;

        public a(int i11) {
            this(i11, new Random());
        }

        private static int[] h(int i11, Random random) {
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                int iNextInt = random.nextInt(i13);
                iArr[i12] = iArr[iNextInt];
                iArr[iNextInt] = i12;
                i12 = i13;
            }
            return iArr;
        }

        @Override // b7.t
        public t a(int i11, int i12) {
            int i13 = i12 - i11;
            int[] iArr = new int[this.f13889b.length - i13];
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int[] iArr2 = this.f13889b;
                if (i14 >= iArr2.length) {
                    return new a(iArr, new Random(this.f13888a.nextLong()));
                }
                int i16 = iArr2[i14];
                if (i16 < i11 || i16 >= i12) {
                    int i17 = i14 - i15;
                    if (i16 >= i11) {
                        i16 -= i13;
                    }
                    iArr[i17] = i16;
                } else {
                    i15++;
                }
                i14++;
            }
        }

        @Override // b7.t
        public int b(int i11) {
            int i12 = this.f13890c[i11] - 1;
            if (i12 >= 0) {
                return this.f13889b[i12];
            }
            return -1;
        }

        @Override // b7.t
        public int c(int i11) {
            int i12 = this.f13890c[i11] + 1;
            int[] iArr = this.f13889b;
            if (i12 < iArr.length) {
                return iArr[i12];
            }
            return -1;
        }

        @Override // b7.t
        public int d() {
            int[] iArr = this.f13889b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // b7.t
        public t e() {
            return new a(0, new Random(this.f13888a.nextLong()));
        }

        @Override // b7.t
        public int f() {
            int[] iArr = this.f13889b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // b7.t
        public t g(int i11, int i12) {
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int i13 = 0;
            int i14 = 0;
            while (i14 < i12) {
                iArr[i14] = this.f13888a.nextInt(this.f13889b.length + 1);
                int i15 = i14 + 1;
                int iNextInt = this.f13888a.nextInt(i15);
                iArr2[i14] = iArr2[iNextInt];
                iArr2[iNextInt] = i14 + i11;
                i14 = i15;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f13889b.length + i12];
            int i16 = 0;
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f13889b;
                if (i13 >= iArr4.length + i12) {
                    return new a(iArr3, new Random(this.f13888a.nextLong()));
                }
                if (i16 >= i12 || i17 != iArr[i16]) {
                    int i18 = i17 + 1;
                    int i19 = iArr4[i17];
                    iArr3[i13] = i19;
                    if (i19 >= i11) {
                        iArr3[i13] = i19 + i12;
                    }
                    i17 = i18;
                } else {
                    iArr3[i13] = iArr2[i16];
                    i16++;
                }
                i13++;
            }
        }

        @Override // b7.t
        public int getLength() {
            return this.f13889b.length;
        }

        private a(int i11, Random random) {
            this(h(i11, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f13889b = iArr;
            this.f13888a = random;
            this.f13890c = new int[iArr.length];
            for (int i11 = 0; i11 < iArr.length; i11++) {
                this.f13890c[iArr[i11]] = i11;
            }
        }
    }

    t a(int i11, int i12);

    int b(int i11);

    int c(int i11);

    int d();

    t e();

    int f();

    t g(int i11, int i12);

    int getLength();
}
