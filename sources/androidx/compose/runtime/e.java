package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f4445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f4446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f4447c = e4.f4452a;

    public final boolean a(int i11) {
        int i12;
        if (i11 < 64) {
            return ((1 << i11) & this.f4445a) != 0;
        }
        if (i11 < 128) {
            return ((1 << (i11 - 64)) & this.f4446b) != 0;
        }
        long[] jArr = this.f4447c;
        int length = jArr.length;
        if (length != 0 && (i11 / 64) - 2 < length) {
            return ((1 << (i11 % 64)) & jArr[i12]) != 0;
        }
        return false;
    }

    public final int b() {
        return (this.f4447c.length + 2) * 64;
    }

    public final int c(int i11) {
        int iNumberOfTrailingZeros;
        if (i11 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.f4445a) >>> i11) << i11)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i11 < 128) {
            int i12 = i11 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.f4446b) >>> i12) << i12);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i11, 128);
        int i13 = (iMax / 64) - 2;
        long[] jArr = this.f4447c;
        int length = jArr.length;
        for (int i14 = i13; i14 < length; i14++) {
            long j11 = ~jArr[i14];
            if (i14 == i13) {
                int i15 = iMax % 64;
                j11 = (j11 >>> i15) << i15;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j11);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i14 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final void d(int i11, boolean z11) {
        if (i11 < 64) {
            this.f4445a = ((z11 ? 1L : 0L) << i11) | ((~(1 << i11)) & this.f4445a);
            return;
        }
        if (i11 < 128) {
            this.f4446b = ((z11 ? 1L : 0L) << i11) | ((~(1 << (i11 - 64))) & this.f4446b);
            return;
        }
        int i12 = i11 / 64;
        int i13 = i12 - 2;
        int i14 = i11 % 64;
        long j11 = 1 << i14;
        long[] jArrCopyOf = this.f4447c;
        if (i13 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i12 - 1);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f4447c = jArrCopyOf;
        }
        jArrCopyOf[i13] = ((z11 ? 1L : 0L) << i14) | ((~j11) & jArrCopyOf[i13]);
    }

    public final void e(int i11, int i12) {
        long j11 = i11 < i12 ? -1L : 0L;
        this.f4445a = (((((long) (i11 < 64 ? 1 : 0)) * j11) >>> (64 - (Math.min(64, i12) - i11))) << i11) | this.f4445a;
        if (i12 > 64) {
            int iMax = Math.max(i11, 64);
            this.f4446b = (((j11 * ((long) (iMax < 128 ? 1 : 0))) >>> (128 - (Math.min(128, i12) - iMax))) << iMax) | this.f4446b;
            if (i12 > 128) {
                for (int iMax2 = Math.max(iMax, 128); iMax2 < i12; iMax2++) {
                    d(iMax2, true);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BitVector [");
        int iB = b();
        boolean z11 = true;
        for (int i11 = 0; i11 < iB; i11++) {
            if (a(i11)) {
                if (!z11) {
                    sb2.append(", ");
                }
                sb2.append(i11);
                z11 = false;
            }
        }
        sb2.append(']');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
