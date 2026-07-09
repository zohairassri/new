package f3;

import java.util.Arrays;
import kf0.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f93502a = new long[192];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f93503b = new long[192];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f93504c;

    private final void h(int i11, int i12, long[] jArr) {
        int iMax = Math.max(i11 * 2, i12 + 3);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        this.f93502a = jArrCopyOf;
        long[] jArrCopyOf2 = Arrays.copyOf(this.f93503b, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf2, "copyOf(...)");
        this.f93503b = jArrCopyOf2;
    }

    private final void k(long j11, int i11, int i12) {
        int i13;
        char c11;
        char c12;
        long[] jArr = this.f93502a;
        long[] jArr2 = this.f93503b;
        int iC = c();
        jArr2[0] = j11;
        int i14 = 1;
        while (i14 > 0) {
            i14--;
            long j12 = jArr2[i14];
            int i15 = 67108863;
            int i16 = ((int) j12) & 67108863;
            char c13 = 26;
            int i17 = ((int) (j12 >> 26)) & 67108863;
            char c14 = '4';
            int i18 = ((int) (j12 >> 52)) & 511;
            int i19 = i18 == 511 ? iC : i18 + i17;
            if (i17 < 0) {
                return;
            }
            while (i17 < jArr.length - 2 && i17 < i19) {
                int i21 = i17 + 2;
                long j13 = jArr[i21];
                if ((((int) (j13 >> c13)) & i15) == i16) {
                    long j14 = jArr[i17];
                    int i22 = i17 + 1;
                    i13 = i15;
                    c11 = c13;
                    long j15 = jArr[i22];
                    c12 = c14;
                    jArr[i17] = (((long) (((int) j14) + i12)) & 4294967295L) | (((long) (((int) (j14 >> 32)) + i11)) << 32);
                    jArr[i22] = (((long) (((int) j15) + i12)) & 4294967295L) | (((long) (((int) (j15 >> 32)) + i11)) << 32);
                    jArr[i21] = 2305843009213693952L | j13;
                    if ((((int) (j13 >> c12)) & 511) > 0) {
                        jArr2[i14] = ((-4503599560261633L) & j13) | (((long) ((i17 + 3) & i13)) << c11);
                        i14++;
                    }
                } else {
                    i13 = i15;
                    c11 = c13;
                    c12 = c14;
                }
                i17 += 3;
                i15 = i13;
                c13 = c11;
                c14 = c12;
            }
        }
    }

    public final void a() {
        long[] jArr = this.f93502a;
        int i11 = this.f93504c;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            int i13 = i12 + 2;
            jArr[i13] = jArr[i13] & (-2305843009213693953L);
        }
    }

    public final void b() {
        long[] jArr = this.f93502a;
        int i11 = this.f93504c;
        long[] jArr2 = this.f93503b;
        int i12 = 0;
        for (int i13 = 0; i13 < jArr.length - 2 && i12 < jArr2.length - 2 && i13 < i11; i13 += 3) {
            int i14 = i13 + 2;
            if (jArr[i14] != 2305843009213693951L) {
                jArr2[i12] = jArr[i13];
                jArr2[i12 + 1] = jArr[i13 + 1];
                jArr2[i12 + 2] = jArr[i14];
                i12 += 3;
            }
        }
        this.f93504c = i12;
        this.f93502a = jArr2;
        this.f93503b = jArr;
    }

    public final int c() {
        return this.f93504c / 3;
    }

    public final void d(int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, boolean z12) {
        long[] jArr = this.f93502a;
        int i17 = this.f93504c;
        int i18 = i17 + 3;
        this.f93504c = i18;
        int length = jArr.length;
        if (length <= i18) {
            h(length, i17, jArr);
        }
        long[] jArr2 = this.f93502a;
        jArr2[i17] = (((long) i12) << 32) | (((long) i13) & 4294967295L);
        jArr2[i17 + 1] = (((long) i14) << 32) | (((long) i15) & 4294967295L);
        int i19 = i16 & 67108863;
        jArr2[i17 + 2] = ((z12 ? 1L : 0L) << 63) | ((z11 ? 1L : 0L) << 62) | (((long) 1) << 61) | (((long) 0) << 52) | (((long) i19) << 26) | ((long) (i11 & 67108863));
        if (i16 < 0) {
            return;
        }
        for (int i21 = i17 - 3; i21 >= 0; i21 -= 3) {
            int i22 = i21 + 2;
            long j11 = jArr2[i22];
            if ((((int) j11) & 67108863) == i19) {
                jArr2[i22] = (j11 & (-2301339409586323457L)) | (((long) ((i17 - i21) & 511)) << 52);
                return;
            }
        }
    }

    public final void e(int i11) {
        int i12 = i11 & 67108863;
        long[] jArr = this.f93502a;
        int i13 = this.f93504c;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            int i15 = i14 + 2;
            long j11 = jArr[i15];
            if ((((int) j11) & 67108863) == i12) {
                jArr[i15] = 2305843009213693952L | j11;
                return;
            }
        }
    }

    public final boolean f(int i11, int i12, int i13, int i14, int i15) {
        int i16 = i11 & 67108863;
        long[] jArr = this.f93502a;
        int i17 = this.f93504c;
        for (int i18 = 0; i18 < jArr.length - 2 && i18 < i17; i18 += 3) {
            int i19 = i18 + 2;
            long j11 = jArr[i19];
            if ((((int) j11) & 67108863) == i16) {
                long j12 = jArr[i18];
                jArr[i18] = (((long) i13) & 4294967295L) | (((long) i12) << 32);
                int i21 = i18;
                jArr[i18 + 1] = (((long) i15) & 4294967295L) | (((long) i14) << 32);
                jArr[i19] = 2305843009213693952L | j11;
                int i22 = i12 - ((int) (j12 >> 32));
                int i23 = i13 - ((int) j12);
                if ((i22 != 0) | (i23 != 0)) {
                    k(((-4503599560261633L) & j11) | (((long) ((i21 + 3) & 67108863)) << 26), i22, i23);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean g(int i11) {
        int i12 = i11 & 67108863;
        long[] jArr = this.f93502a;
        int i13 = this.f93504c;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            int i15 = i14 + 2;
            if ((((int) jArr[i15]) & 67108863) == i12) {
                jArr[i14] = -1;
                jArr[i14 + 1] = -1;
                jArr[i15] = 2305843009213693951L;
                return true;
            }
        }
        return false;
    }

    public final boolean i(int i11, int i12, int i13, int i14, int i15) {
        int i16 = i11 & 67108863;
        long[] jArr = this.f93502a;
        int i17 = this.f93504c;
        for (int i18 = 0; i18 < jArr.length - 2 && i18 < i17; i18 += 3) {
            int i19 = i18 + 2;
            long j11 = jArr[i19];
            if ((((int) j11) & 67108863) == i16) {
                jArr[i18] = (((long) i12) << 32) | (((long) i13) & 4294967295L);
                jArr[i18 + 1] = (((long) i14) << 32) | (4294967295L & ((long) i15));
                jArr[i19] = 2305843009213693952L | j11;
                return true;
            }
        }
        return false;
    }

    public final boolean j(int i11, boolean z11, boolean z12) {
        int i12 = i11 & 67108863;
        long[] jArr = this.f93502a;
        int i13 = this.f93504c;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            int i15 = i14 + 2;
            long j11 = jArr[i15];
            if ((((int) j11) & 67108863) == i12) {
                jArr[i15] = (4611686018427387903L & j11) | ((z11 ? 1L : 0L) * 4611686018427387904L) | ((z12 ? 1L : 0L) * Long.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    public final boolean l(int i11, o oVar) {
        int i12 = i11 & 67108863;
        long[] jArr = this.f93502a;
        int i13 = this.f93504c;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            if ((((int) jArr[i14 + 2]) & 67108863) == i12) {
                long j11 = jArr[i14];
                long j12 = jArr[i14 + 1];
                oVar.invoke(Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11), Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) j12));
                return true;
            }
        }
        return false;
    }
}
