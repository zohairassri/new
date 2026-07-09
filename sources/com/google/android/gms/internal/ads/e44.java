package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class e44 {
    static long a(String str, long j11) {
        if (j11 >= 0) {
            return j11;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 17);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j11);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    static void b(boolean z11) {
        if (!z11) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
