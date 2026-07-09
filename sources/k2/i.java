package k2;

import java.util.ArrayList;
import java.util.List;
import k2.h;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final void a(char c11, ArrayList arrayList, float[] fArr, int i11) {
        int i12 = 0;
        switch (c11) {
            case 'A':
                int i13 = i11 - 7;
                for (int i14 = 0; i14 <= i13; i14 += 7) {
                    arrayList.add(new h.a(fArr[i14], fArr[i14 + 1], fArr[i14 + 2], Float.compare(fArr[i14 + 3], 0.0f) != 0, Float.compare(fArr[i14 + 4], 0.0f) != 0, fArr[i14 + 5], fArr[i14 + 6]));
                }
                return;
            case 'C':
                int i15 = i11 - 6;
                while (i12 <= i15) {
                    arrayList.add(new h.c(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3], fArr[i12 + 4], fArr[i12 + 5]));
                    i12 += 6;
                }
                return;
            case 'H':
                int i16 = i11 - 1;
                while (i12 <= i16) {
                    arrayList.add(new h.d(fArr[i12]));
                    i12++;
                }
                return;
            case 'L':
                int i17 = i11 - 2;
                while (i12 <= i17) {
                    arrayList.add(new h.e(fArr[i12], fArr[i12 + 1]));
                    i12 += 2;
                }
                return;
            case 'M':
                b(arrayList, fArr, i11);
                return;
            case 'Q':
                int i18 = i11 - 4;
                while (i12 <= i18) {
                    arrayList.add(new h.g(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3]));
                    i12 += 4;
                }
                return;
            case 'S':
                int i19 = i11 - 4;
                while (i12 <= i19) {
                    arrayList.add(new h.C1312h(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3]));
                    i12 += 4;
                }
                return;
            case 'T':
                int i21 = i11 - 2;
                while (i12 <= i21) {
                    arrayList.add(new h.i(fArr[i12], fArr[i12 + 1]));
                    i12 += 2;
                }
                return;
            case 'V':
                int i22 = i11 - 1;
                while (i12 <= i22) {
                    arrayList.add(new h.s(fArr[i12]));
                    i12++;
                }
                return;
            case 'Z':
            case 'z':
                arrayList.add(h.b.f107244c);
                return;
            case 'a':
                int i23 = i11 - 7;
                for (int i24 = 0; i24 <= i23; i24 += 7) {
                    arrayList.add(new h.j(fArr[i24], fArr[i24 + 1], fArr[i24 + 2], Float.compare(fArr[i24 + 3], 0.0f) != 0, Float.compare(fArr[i24 + 4], 0.0f) != 0, fArr[i24 + 5], fArr[i24 + 6]));
                }
                return;
            case 'c':
                int i25 = i11 - 6;
                while (i12 <= i25) {
                    arrayList.add(new h.k(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3], fArr[i12 + 4], fArr[i12 + 5]));
                    i12 += 6;
                }
                return;
            case 'h':
                int i26 = i11 - 1;
                while (i12 <= i26) {
                    arrayList.add(new h.l(fArr[i12]));
                    i12++;
                }
                return;
            case 'l':
                int i27 = i11 - 2;
                while (i12 <= i27) {
                    arrayList.add(new h.m(fArr[i12], fArr[i12 + 1]));
                    i12 += 2;
                }
                return;
            case 'm':
                c(arrayList, fArr, i11);
                return;
            case 'q':
                int i28 = i11 - 4;
                while (i12 <= i28) {
                    arrayList.add(new h.o(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3]));
                    i12 += 4;
                }
                return;
            case 's':
                int i29 = i11 - 4;
                while (i12 <= i29) {
                    arrayList.add(new h.p(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3]));
                    i12 += 4;
                }
                return;
            case 't':
                int i31 = i11 - 2;
                while (i12 <= i31) {
                    arrayList.add(new h.q(fArr[i12], fArr[i12 + 1]));
                    i12 += 2;
                }
                return;
            case 'v':
                int i32 = i11 - 1;
                while (i12 <= i32) {
                    arrayList.add(new h.r(fArr[i12]));
                    i12++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c11);
        }
    }

    private static final void b(List list, float[] fArr, int i11) {
        int i12 = i11 - 2;
        if (i12 >= 0) {
            list.add(new h.f(fArr[0], fArr[1]));
            for (int i13 = 2; i13 <= i12; i13 += 2) {
                list.add(new h.e(fArr[i13], fArr[i13 + 1]));
            }
        }
    }

    private static final void c(List list, float[] fArr, int i11) {
        int i12 = i11 - 2;
        if (i12 >= 0) {
            list.add(new h.n(fArr[0], fArr[1]));
            for (int i13 = 2; i13 <= i12; i13 += 2) {
                list.add(new h.m(fArr[i13], fArr[i13 + 1]));
            }
        }
    }
}
