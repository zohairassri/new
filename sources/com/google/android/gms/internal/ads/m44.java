package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class m44 {
    public static long[] a(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i11 = (int) length;
        jx3.e(length == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i11];
        int i12 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i12, length2);
            i12 += length2;
        }
        return jArr3;
    }
}
