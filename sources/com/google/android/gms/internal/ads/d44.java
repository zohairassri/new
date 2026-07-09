package com.google.android.gms.internal.ads;

import com.chartbeat.androidsdk.QueryKeys;
import java.math.RoundingMode;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d44 {
    public static long a(long j11, long j12, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j13 = j11 / j12;
        long j14 = j11 - (j12 * j13);
        if (j14 == 0) {
            return j13;
        }
        int i11 = ((int) ((j11 ^ j12) >> 63)) | 1;
        switch (c44.f24382a[roundingMode.ordinal()]) {
            case 1:
                e44.b(false);
                return j13;
            case 2:
                return j13;
            case 3:
                if (i11 >= 0) {
                    return j13;
                }
                break;
            case 4:
                break;
            case 5:
                if (i11 <= 0) {
                    return j13;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j14);
                long jAbs2 = jAbs - (Math.abs(j12) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j13) == 0)) {
                        return j13;
                    }
                } else if (jAbs2 <= 0) {
                    return j13;
                }
            default:
                throw new AssertionError();
        }
        return j13 + ((long) i11);
    }

    public static long b(long j11, long j12) {
        e44.a("a", j11);
        e44.a(QueryKeys.PAGE_LOAD_TIME, j12);
        if (j11 == 0) {
            return j12;
        }
        if (j12 == 0) {
            return j11;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
        long jNumberOfTrailingZeros = j11 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j12);
        long j13 = j12 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j13) {
            long j14 = jNumberOfTrailingZeros - j13;
            long j15 = (j14 >> 63) & j14;
            long j16 = (j14 - j15) - j15;
            jNumberOfTrailingZeros = j16 >> Long.numberOfTrailingZeros(j16);
            j13 += j15;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long c(long j11, long j12) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j12) + Long.numberOfLeadingZeros(~j12);
        if (iNumberOfLeadingZeros > 65) {
            return j11 * j12;
        }
        long j13 = j11 ^ j12;
        boolean z11 = (iNumberOfLeadingZeros < 64) | ((j12 == Long.MIN_VALUE) & (j11 < 0));
        long j14 = (j13 >>> 63) + LongCompanionObject.MAX_VALUE;
        if (!z11) {
            long j15 = j11 * j12;
            if (j11 == 0 || j15 / j11 == j12) {
                return j15;
            }
        }
        return j14;
    }
}
