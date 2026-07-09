package we0;

import com.amazonaws.event.ProgressEvent;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class j0 {
    public static final long a(double d11) {
        if (Double.isNaN(d11) || d11 <= e(0L)) {
            return 0L;
        }
        if (d11 >= e(-1L)) {
            return -1L;
        }
        return d11 < 9.223372036854776E18d ? d0.b((long) d11) : d0.b(d0.b((long) (d11 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    public static final int b(int i11, int i12) {
        return Intrinsics.compare(i11 ^ IntCompanionObject.MIN_VALUE, i12 ^ IntCompanionObject.MIN_VALUE);
    }

    public static final int c(long j11, long j12) {
        return Intrinsics.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
    }

    public static final long d(long j11, long j12) {
        if (j12 < 0) {
            return Long.compareUnsigned(j11, j12) < 0 ? j11 : d0.b(j11 - j12);
        }
        if (j11 >= 0) {
            return d0.b(j11 % j12);
        }
        long j13 = j11 - ((((j11 >>> 1) / j12) << 1) * j12);
        if (Long.compareUnsigned(d0.b(j13), d0.b(j12)) < 0) {
            j12 = 0;
        }
        return d0.b(j13 - j12);
    }

    public static final double e(long j11) {
        return ((j11 >>> 11) * ((double) ProgressEvent.PART_COMPLETED_EVENT_CODE)) + (j11 & 2047);
    }

    public static final String f(long j11, int i11) {
        if (j11 >= 0) {
            String string = Long.toString(j11, CharsKt.checkRadix(i11));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j12 = i11;
        long j13 = ((j11 >>> 1) / j12) << 1;
        long j14 = j11 - (j13 * j12);
        if (j14 >= j12) {
            j14 -= j12;
            j13++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j13, CharsKt.checkRadix(i11));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j14, CharsKt.checkRadix(i11));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
