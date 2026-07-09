package o4;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f120023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f120024b;

        a() {
        }
    }

    private static void a(ArrayList arrayList, char c11, float[] fArr) {
        arrayList.add(new b(c11, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            if (bVarArr[i11].f120025a != bVarArr2[i11].f120025a || bVarArr[i11].f120026b.length != bVarArr2[i11].f120026b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i11 < 0 || i11 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i13 = i12 - i11;
        int iMin = Math.min(i13, length - i11);
        float[] fArr2 = new float[i13];
        System.arraycopy(fArr, i11, fArr2, 0, iMin);
        return fArr2;
    }

    public static b[] d(String str) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 1;
        while (i12 < str.length()) {
            int i13 = i(str, i12);
            String strTrim = str.substring(i11, i13).trim();
            if (!strTrim.isEmpty()) {
                a(arrayList, strTrim.charAt(0), h(strTrim));
            }
            i11 = i13;
            i12 = i13 + 1;
        }
        if (i12 - i11 == 1 && i11 < str.length()) {
            a(arrayList, str.charAt(i11), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    public static Path e(String str) {
        Path path = new Path();
        try {
            b.h(d(str), path);
            return path;
        } catch (RuntimeException e11) {
            throw new RuntimeException("Error in parsing " + str, e11);
        }
    }

    public static b[] f(b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            bVarArr2[i11] = new b(bVarArr[i11]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(java.lang.String r8, int r9, o4.h.a r10) {
        /*
            r0 = 0
            r10.f120024b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.f120024b = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.f120024b = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.f120023a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.h.g(java.lang.String, int, o4.h$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i11 = 1;
            int i12 = 0;
            while (i11 < length) {
                g(str, i11, aVar);
                int i13 = aVar.f120023a;
                if (i11 < i13) {
                    fArr[i12] = Float.parseFloat(str.substring(i11, i13));
                    i12++;
                }
                i11 = aVar.f120024b ? i13 : i13 + 1;
            }
            return c(fArr, 0, i12);
        } catch (NumberFormatException e11) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e11);
        }
    }

    private static int i(String str, int i11) {
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i11++;
        }
        return i11;
    }

    public static void j(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c11 = 'm';
        for (b bVar : bVarArr) {
            b.e(path, fArr, c11, bVar.f120025a, bVar.f120026b);
            c11 = bVar.f120025a;
        }
    }

    public static void k(b[] bVarArr, b[] bVarArr2) {
        for (int i11 = 0; i11 < bVarArr2.length; i11++) {
            bVarArr[i11].f120025a = bVarArr2[i11].f120025a;
            for (int i12 = 0; i12 < bVarArr2[i11].f120026b.length; i12++) {
                bVarArr[i11].f120026b[i12] = bVarArr2[i11].f120026b[i12];
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private char f120025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f120026b;

        b(char c11, float[] fArr) {
            this.f120025a = c11;
            this.f120026b = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void e(Path path, float[] fArr, char c11, char c12, float[] fArr2) {
            int i11;
            int i12;
            boolean z11;
            boolean z12;
            char c13;
            char c14;
            int i13;
            float f11;
            boolean z13;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            boolean z14;
            float f17;
            float f18;
            float f19;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            Path path2 = path;
            boolean z15 = false;
            float f28 = fArr[0];
            boolean z16 = true;
            float f29 = fArr[1];
            char c15 = 2;
            float f31 = fArr[2];
            char c16 = 3;
            float f32 = fArr[3];
            float f33 = fArr[4];
            float f34 = fArr[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i11 = 7;
                    i12 = i11;
                    break;
                case 'C':
                case 'c':
                    i11 = 6;
                    i12 = i11;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i12 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i12 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i12 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f33, f34);
                    f28 = f33;
                    f31 = f28;
                    f29 = f34;
                    f32 = f29;
                    i12 = 2;
                    break;
            }
            float f35 = f28;
            float f36 = f29;
            float f37 = f33;
            float f38 = f34;
            int i14 = 0;
            char c17 = c11;
            while (i14 < fArr2.length) {
                if (c12 == 'A') {
                    float f39 = f35;
                    float f41 = f36;
                    z11 = z15;
                    z12 = z16;
                    c13 = c15;
                    c14 = c16;
                    i13 = i14;
                    int i15 = i13 + 5;
                    float f42 = fArr2[i15];
                    int i16 = i13 + 6;
                    float f43 = fArr2[i16];
                    float f44 = fArr2[i13];
                    float f45 = fArr2[i13 + 1];
                    float f46 = fArr2[i13 + 2];
                    if (fArr2[i13 + 3] != 0.0f) {
                        f11 = 0.0f;
                        z13 = z12;
                    } else {
                        f11 = 0.0f;
                        z13 = z11;
                    }
                    g(path, f39, f41, f42, f43, f44, f45, f46, z13, fArr2[i13 + 4] != f11 ? z12 : z11);
                    f31 = fArr2[i15];
                    f35 = f31;
                    f32 = fArr2[i16];
                    f36 = f32;
                } else if (c12 == 'C') {
                    z11 = z15;
                    z12 = z16;
                    c13 = c15;
                    c14 = c16;
                    i13 = i14;
                    int i17 = i13 + 2;
                    int i18 = i13 + 3;
                    int i19 = i13 + 4;
                    int i21 = i13 + 5;
                    path2.cubicTo(fArr2[i13], fArr2[i13 + 1], fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i21]);
                    float f47 = fArr2[i19];
                    float f48 = fArr2[i21];
                    float f49 = fArr2[i17];
                    float f51 = fArr2[i18];
                    f35 = f47;
                    f36 = f48;
                    f32 = f51;
                    f31 = f49;
                } else if (c12 != 'H') {
                    if (c12 != 'Q') {
                        z11 = z15;
                        if (c12 == 'V') {
                            z12 = z16;
                            c13 = c15;
                            c14 = c16;
                            i13 = i14;
                            path2.lineTo(f35, fArr2[i13]);
                            f14 = fArr2[i13];
                        } else if (c12 != 'a') {
                            if (c12 != 'c') {
                                z12 = z16;
                                if (c12 != 'h') {
                                    if (c12 != 'q') {
                                        c13 = c15;
                                        if (c12 != 'v') {
                                            if (c12 != 'L') {
                                                if (c12 != 'M') {
                                                    c14 = c16;
                                                    if (c12 == 'S') {
                                                        if (c17 == 'c' || c17 == 's' || c17 == 'C' || c17 == 'S') {
                                                            f35 = (f35 * 2.0f) - f31;
                                                            f36 = (f36 * 2.0f) - f32;
                                                        }
                                                        float f52 = f35;
                                                        float f53 = f36;
                                                        int i22 = i14 + 1;
                                                        int i23 = i14 + 2;
                                                        int i24 = i14 + 3;
                                                        path2.cubicTo(f52, f53, fArr2[i14], fArr2[i22], fArr2[i23], fArr2[i24]);
                                                        f12 = fArr2[i14];
                                                        f13 = fArr2[i22];
                                                        f35 = fArr2[i23];
                                                        f36 = fArr2[i24];
                                                        i13 = i14;
                                                    } else if (c12 == 'T') {
                                                        if (c17 == 'q' || c17 == 't' || c17 == 'Q' || c17 == 'T') {
                                                            f35 = (f35 * 2.0f) - f31;
                                                            f36 = (f36 * 2.0f) - f32;
                                                        }
                                                        int i25 = i14 + 1;
                                                        path2.quadTo(f35, f36, fArr2[i14], fArr2[i25]);
                                                        float f54 = fArr2[i14];
                                                        f14 = fArr2[i25];
                                                        f31 = f35;
                                                        f32 = f36;
                                                        i13 = i14;
                                                        f35 = f54;
                                                    } else if (c12 == 'l') {
                                                        int i26 = i14 + 1;
                                                        path2.rLineTo(fArr2[i14], fArr2[i26]);
                                                        f35 += fArr2[i14];
                                                        f21 = fArr2[i26];
                                                    } else if (c12 == 'm') {
                                                        float f55 = fArr2[i14];
                                                        f35 += f55;
                                                        float f56 = fArr2[i14 + 1];
                                                        f36 += f56;
                                                        if (i14 > 0) {
                                                            path2.rLineTo(f55, f56);
                                                        } else {
                                                            path2.rMoveTo(f55, f56);
                                                            f37 = f35;
                                                        }
                                                    } else if (c12 == 's') {
                                                        if (c17 == 'c' || c17 == 's' || c17 == 'C' || c17 == 'S') {
                                                            f24 = f36 - f32;
                                                            f25 = f35 - f31;
                                                        } else {
                                                            f25 = 0.0f;
                                                            f24 = 0.0f;
                                                        }
                                                        int i27 = i14 + 1;
                                                        int i28 = i14 + 2;
                                                        int i29 = i14 + 3;
                                                        path2.rCubicTo(f25, f24, fArr2[i14], fArr2[i27], fArr2[i28], fArr2[i29]);
                                                        f17 = fArr2[i14] + f35;
                                                        f18 = fArr2[i27] + f36;
                                                        f35 += fArr2[i28];
                                                        f19 = fArr2[i29];
                                                    } else if (c12 == 't') {
                                                        if (c17 == 'q' || c17 == 't' || c17 == 'Q' || c17 == 'T') {
                                                            f26 = f35 - f31;
                                                            f27 = f36 - f32;
                                                        } else {
                                                            f27 = 0.0f;
                                                            f26 = 0.0f;
                                                        }
                                                        int i31 = i14 + 1;
                                                        path2.rQuadTo(f26, f27, fArr2[i14], fArr2[i31]);
                                                        float f57 = f26 + f35;
                                                        float f58 = f27 + f36;
                                                        f35 += fArr2[i14];
                                                        f36 += fArr2[i31];
                                                        f32 = f58;
                                                        f31 = f57;
                                                    }
                                                } else {
                                                    c14 = c16;
                                                    f22 = fArr2[i14];
                                                    f23 = fArr2[i14 + 1];
                                                    if (i14 > 0) {
                                                        path2.lineTo(f22, f23);
                                                    } else {
                                                        path2.moveTo(f22, f23);
                                                        f35 = f22;
                                                        f37 = f35;
                                                        f36 = f23;
                                                    }
                                                }
                                                f38 = f36;
                                            } else {
                                                c14 = c16;
                                                int i32 = i14 + 1;
                                                path2.lineTo(fArr2[i14], fArr2[i32]);
                                                f22 = fArr2[i14];
                                                f23 = fArr2[i32];
                                            }
                                            f35 = f22;
                                            f36 = f23;
                                        } else {
                                            c14 = c16;
                                            path2.rLineTo(0.0f, fArr2[i14]);
                                            f21 = fArr2[i14];
                                        }
                                        f36 += f21;
                                    } else {
                                        c13 = c15;
                                        c14 = c16;
                                        int i33 = i14 + 1;
                                        int i34 = i14 + 2;
                                        int i35 = i14 + 3;
                                        path2.rQuadTo(fArr2[i14], fArr2[i33], fArr2[i34], fArr2[i35]);
                                        f17 = fArr2[i14] + f35;
                                        f18 = fArr2[i33] + f36;
                                        f35 += fArr2[i34];
                                        f19 = fArr2[i35];
                                    }
                                    f36 += f19;
                                    f31 = f17;
                                    f32 = f18;
                                } else {
                                    c13 = c15;
                                    c14 = c16;
                                    path2.rLineTo(fArr2[i14], 0.0f);
                                    f35 += fArr2[i14];
                                }
                            } else {
                                z12 = z16;
                                c13 = c15;
                                c14 = c16;
                                int i36 = i14 + 2;
                                int i37 = i14 + 3;
                                int i38 = i14 + 4;
                                int i39 = i14 + 5;
                                path2.rCubicTo(fArr2[i14], fArr2[i14 + 1], fArr2[i36], fArr2[i37], fArr2[i38], fArr2[i39]);
                                float f59 = fArr2[i36] + f35;
                                float f61 = fArr2[i37] + f36;
                                f35 += fArr2[i38];
                                f36 += fArr2[i39];
                                f31 = f59;
                                f32 = f61;
                            }
                            i13 = i14;
                        } else {
                            z12 = z16;
                            c13 = c15;
                            c14 = c16;
                            int i41 = i14 + 5;
                            float f62 = fArr2[i41] + f35;
                            int i42 = i14 + 6;
                            float f63 = fArr2[i42] + f36;
                            float f64 = fArr2[i14];
                            float f65 = fArr2[i14 + 1];
                            float f66 = fArr2[i14 + 2];
                            if (fArr2[i14 + 3] != 0.0f) {
                                f15 = 0.0f;
                                f16 = f36;
                                z14 = z12;
                            } else {
                                f15 = 0.0f;
                                f16 = f36;
                                z14 = z11;
                            }
                            i13 = i14;
                            boolean z17 = fArr2[i14 + 4] != f15 ? z12 : z11;
                            float f67 = f35;
                            g(path, f67, f16, f62, f63, f64, f65, f66, z14, z17);
                            f35 = f67 + fArr2[i41];
                            f36 = f16 + fArr2[i42];
                            f31 = f35;
                            f32 = f36;
                        }
                        f36 = f14;
                    } else {
                        z11 = z15;
                        z12 = z16;
                        c13 = c15;
                        c14 = c16;
                        i13 = i14;
                        int i43 = i13 + 1;
                        int i44 = i13 + 2;
                        int i45 = i13 + 3;
                        path2.quadTo(fArr2[i13], fArr2[i43], fArr2[i44], fArr2[i45]);
                        f12 = fArr2[i13];
                        f13 = fArr2[i43];
                        f35 = fArr2[i44];
                        f36 = fArr2[i45];
                    }
                    f31 = f12;
                    f32 = f13;
                } else {
                    z11 = z15;
                    z12 = z16;
                    c13 = c15;
                    c14 = c16;
                    i13 = i14;
                    path2.lineTo(fArr2[i13], f36);
                    f35 = fArr2[i13];
                }
                i14 = i13 + i12;
                path2 = path;
                c17 = c12;
                z15 = z11;
                z16 = z12;
                c15 = c13;
                c16 = c14;
            }
            fArr[z15 ? 1 : 0] = f35;
            fArr[z16 ? 1 : 0] = f36;
            fArr[c15] = f31;
            fArr[c16] = f32;
            fArr[4] = f37;
            fArr[5] = f38;
        }

        private static void f(Path path, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
            double d21 = d13;
            int iCeil = (int) Math.ceil(Math.abs((d19 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d17);
            double dSin = Math.sin(d17);
            double dCos2 = Math.cos(d18);
            double dSin2 = Math.sin(d18);
            double d22 = -d21;
            double d23 = d22 * dCos;
            double d24 = d14 * dSin;
            double d25 = (d23 * dSin2) - (d24 * dCos2);
            double d26 = d22 * dSin;
            double d27 = d14 * dCos;
            double d28 = (dSin2 * d26) + (dCos2 * d27);
            double d29 = d19 / ((double) iCeil);
            double d31 = d28;
            double d32 = d25;
            int i11 = 0;
            double d33 = d15;
            double d34 = d16;
            double d35 = d18;
            while (i11 < iCeil) {
                double d36 = d35 + d29;
                double dSin3 = Math.sin(d36);
                double dCos3 = Math.cos(d36);
                double d37 = (d11 + ((d21 * dCos) * dCos3)) - (d24 * dSin3);
                int i12 = i11;
                double d38 = d12 + (d13 * dSin * dCos3) + (d27 * dSin3);
                double d39 = (d23 * dSin3) - (d24 * dCos3);
                double d41 = (dSin3 * d26) + (dCos3 * d27);
                double d42 = d36 - d35;
                double dTan = Math.tan(d42 / 2.0d);
                double dSin4 = (Math.sin(d42) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d43 = d33 + (d32 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d43, (float) (d34 + (d31 * dSin4)), (float) (d37 - (dSin4 * d39)), (float) (d38 - (dSin4 * d41)), (float) d37, (float) d38);
                dSin = dSin;
                d29 = d29;
                d33 = d37;
                d26 = d26;
                d35 = d36;
                d31 = d41;
                dCos = dCos;
                d21 = d13;
                d34 = d38;
                i11 = i12 + 1;
                iCeil = iCeil;
                d32 = d39;
            }
        }

        private static void g(Path path, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z11, boolean z12) {
            double d11;
            double d12;
            double radians = Math.toRadians(f17);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d13 = f11;
            double d14 = f12;
            double d15 = f15;
            double d16 = ((d13 * dCos) + (d14 * dSin)) / d15;
            double d17 = f16;
            double d18 = ((((double) (-f11)) * dSin) + (d14 * dCos)) / d17;
            double d19 = f14;
            double d21 = ((((double) f13) * dCos) + (d19 * dSin)) / d15;
            double d22 = ((((double) (-f13)) * dSin) + (d19 * dCos)) / d17;
            double d23 = d16 - d21;
            double d24 = d18 - d22;
            double d25 = (d16 + d21) / 2.0d;
            double d26 = (d18 + d22) / 2.0d;
            double d27 = (d23 * d23) + (d24 * d24);
            if (d27 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d28 = (1.0d / d27) - 0.25d;
            if (d28 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d27);
                float fSqrt = (float) (Math.sqrt(d27) / 1.99999d);
                g(path, f11, f12, f13, f14, f15 * fSqrt, fSqrt * f16, f17, z11, z12);
                return;
            }
            double dSqrt = Math.sqrt(d28);
            double d29 = d23 * dSqrt;
            double d31 = dSqrt * d24;
            if (z11 == z12) {
                d11 = d25 - d31;
                d12 = d26 + d29;
            } else {
                d11 = d25 + d31;
                d12 = d26 - d29;
            }
            double dAtan2 = Math.atan2(d18 - d12, d16 - d11);
            double dAtan22 = Math.atan2(d22 - d12, d21 - d11) - dAtan2;
            if (z12 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d32 = d11 * d15;
            double d33 = d12 * d17;
            f(path, (d32 * dCos) - (d33 * dSin), (d32 * dSin) + (d33 * dCos), d15, d17, d13, d14, radians, dAtan2, dAtan22);
        }

        public static void h(b[] bVarArr, Path path) {
            h.j(bVarArr, path);
        }

        b(b bVar) {
            this.f120025a = bVar.f120025a;
            float[] fArr = bVar.f120026b;
            this.f120026b = h.c(fArr, 0, fArr.length);
        }
    }
}
