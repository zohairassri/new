package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class q4 {
    public static long a(long j11, int i11) {
        long j12 = i11;
        long j13 = j11 * j12;
        if (j13 / j12 == j11) {
            return j13;
        }
        StringBuilder sb2 = new StringBuilder(67);
        sb2.append("Multiplication overflows a long: ");
        sb2.append(j11);
        sb2.append(" * ");
        sb2.append(i11);
        throw new ArithmeticException(sb2.toString());
    }
}
