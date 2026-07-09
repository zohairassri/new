package d4;

import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b f89207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int[] f89208b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected float[] f89209c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f89210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f89211e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {
        static void a(int[] iArr, float[] fArr, int i11, int i12) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i12;
            iArr2[1] = i11;
            int i13 = 2;
            while (i13 > 0) {
                int i14 = iArr2[i13 - 1];
                int i15 = i13 - 2;
                int i16 = iArr2[i15];
                if (i14 < i16) {
                    int iB = b(iArr, fArr, i14, i16);
                    iArr2[i15] = iB - 1;
                    iArr2[i13 - 1] = i14;
                    int i17 = i13 + 1;
                    iArr2[i13] = i16;
                    i13 += 2;
                    iArr2[i17] = iB + 1;
                } else {
                    i13 = i15;
                }
            }
        }

        private static int b(int[] iArr, float[] fArr, int i11, int i12) {
            int i13 = iArr[i12];
            int i14 = i11;
            while (i11 < i12) {
                if (iArr[i11] <= i13) {
                    c(iArr, fArr, i14, i11);
                    i14++;
                }
                i11++;
            }
            c(iArr, fArr, i14, i12);
            return i14;
        }

        private static void c(int[] iArr, float[] fArr, int i11, int i12) {
            int i13 = iArr[i11];
            iArr[i11] = iArr[i12];
            iArr[i12] = i13;
            float f11 = fArr[i11];
            fArr[i11] = fArr[i12];
            fArr[i12] = f11;
        }
    }

    public float a(float f11) {
        return (float) this.f89207a.c(f11, 0);
    }

    public float b(float f11) {
        return (float) this.f89207a.f(f11, 0);
    }

    public void c(int i11, float f11) {
        int[] iArr = this.f89208b;
        if (iArr.length < this.f89210d + 1) {
            this.f89208b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f89209c;
            this.f89209c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f89208b;
        int i12 = this.f89210d;
        iArr2[i12] = i11;
        this.f89209c[i12] = f11;
        this.f89210d = i12 + 1;
    }

    public void d(String str) {
        this.f89211e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(int r10) {
        /*
            r9 = this;
            int r0 = r9.f89210d
            if (r0 != 0) goto L5
            return
        L5:
            int[] r1 = r9.f89208b
            float[] r2 = r9.f89209c
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            d4.j.a.a(r1, r2, r4, r0)
            r0 = r3
            r1 = r0
        L11:
            int r2 = r9.f89210d
            if (r0 >= r2) goto L24
            int[] r2 = r9.f89208b
            int r5 = r0 + (-1)
            r5 = r2[r5]
            r2 = r2[r0]
            if (r5 == r2) goto L21
            int r1 = r1 + 1
        L21:
            int r0 = r0 + 1
            goto L11
        L24:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r2 = new int[r2]
            r2[r3] = r3
            r2[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            double[][] r1 = (double[][]) r1
            r2 = r4
            r3 = r2
        L37:
            int r5 = r9.f89210d
            if (r2 >= r5) goto L63
            if (r2 <= 0) goto L48
            int[] r5 = r9.f89208b
            r6 = r5[r2]
            int r7 = r2 + (-1)
            r5 = r5[r7]
            if (r6 != r5) goto L48
            goto L60
        L48:
            int[] r5 = r9.f89208b
            r5 = r5[r2]
            double r5 = (double) r5
            r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r5 = r5 * r7
            r0[r3] = r5
            r5 = r1[r3]
            float[] r6 = r9.f89209c
            r6 = r6[r2]
            double r6 = (double) r6
            r5[r4] = r6
            int r3 = r3 + 1
        L60:
            int r2 = r2 + 1
            goto L37
        L63:
            d4.b r10 = d4.b.a(r10, r0, r1)
            r9.f89207a = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.j.e(int):void");
    }

    public String toString() {
        String str = this.f89211e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.f89210d; i11++) {
            str = str + "[" + this.f89208b[i11] + " , " + decimalFormat.format(this.f89209c[i11]) + "] ";
        }
        return str;
    }
}
