package v1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final int a(long[] jArr, long j11) {
        int length = jArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            long j12 = jArr[i12];
            if (j11 > j12) {
                i11 = i12 + 1;
            } else {
                if (j11 >= j12) {
                    return i12;
                }
                length = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final long[] b(int i11) {
        return new long[i11];
    }

    public static final long c(int i11) {
        return i11;
    }

    public static final long[] d(long[] jArr, int i11, long j11) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        kotlin.collections.n.m(jArr, jArr2, 0, 0, i11);
        kotlin.collections.n.m(jArr, jArr2, i11 + 1, i11, length);
        jArr2[i11] = j11;
        return jArr2;
    }

    public static final long[] e(long[] jArr, int i11) {
        int length = jArr.length;
        int i12 = length - 1;
        if (i12 == 0) {
            return null;
        }
        long[] jArr2 = new long[i12];
        if (i11 > 0) {
            kotlin.collections.n.m(jArr, jArr2, 0, 0, i11);
        }
        if (i11 < i12) {
            kotlin.collections.n.m(jArr, jArr2, i11, i11 + 1, length);
        }
        return jArr2;
    }
}
