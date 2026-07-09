package h3;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d3 {
    public static final long a(int i11) {
        return b(i11, i11);
    }

    public static final long b(int i11, int i12) {
        return c3.c(d(i11, i12));
    }

    public static final long c(long j11, int i11, int i12) {
        int iN = c3.n(j11);
        if (iN < i11) {
            iN = i11;
        }
        if (iN > i12) {
            iN = i12;
        }
        int i13 = c3.i(j11);
        if (i13 >= i11) {
            i11 = i13;
        }
        if (i11 <= i12) {
            i12 = i11;
        }
        return (iN == c3.n(j11) && i12 == c3.i(j11)) ? j11 : b(iN, i12);
    }

    private static final long d(int i11, int i12) {
        if (!(i11 >= 0 && i12 >= 0)) {
            n3.a.a("start and end cannot be negative. [start: " + i11 + ", end: " + i12 + ']');
        }
        return (((long) i12) & 4294967295L) | (((long) i11) << 32);
    }

    public static final String e(CharSequence charSequence, long j11) {
        return charSequence.subSequence(c3.l(j11), c3.k(j11)).toString();
    }
}
