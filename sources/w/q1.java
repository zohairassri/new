package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {
    public static long a(int i11, int i12) {
        return b(i11 * i12);
    }

    public static /* synthetic */ long c(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            i12 = r1.f133806a.a();
        }
        return a(i11, i12);
    }

    public static final boolean d(long j11, long j12) {
        return j11 == j12;
    }

    public static int e(long j11) {
        return Long.hashCode(j11);
    }

    private static long b(long j11) {
        return j11;
    }
}
