package u;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f130789a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f130790b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f130791c = new Object[0];

    public static final int a(int[] array, int i11, int i12) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i13 = i11 - 1;
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) >>> 1;
            int i16 = array[i15];
            if (i16 < i12) {
                i14 = i15 + 1;
            } else {
                if (i16 <= i12) {
                    return i15;
                }
                i13 = i15 - 1;
            }
        }
        return ~i14;
    }

    public static final int b(long[] array, int i11, long j11) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i12 = i11 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            long j12 = array[i14];
            if (j12 < j11) {
                i13 = i14 + 1;
            } else {
                if (j12 <= j11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public static final int d(int i11) {
        for (int i12 = 4; i12 < 32; i12++) {
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                return i13;
            }
        }
        return i11;
    }

    public static final int e(int i11) {
        return d(i11 * 4) / 4;
    }

    public static final int f(int i11) {
        return d(i11 * 8) / 8;
    }
}
