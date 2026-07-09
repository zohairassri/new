package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class lf4 {
    static void a(long[] jArr, long[] jArr2, int i11) {
        for (int i12 = 0; i12 < 10; i12++) {
            int i13 = (int) jArr[i12];
            jArr[i12] = ((-i11) & (((int) jArr2[i12]) ^ i13)) ^ i13;
        }
    }
}
