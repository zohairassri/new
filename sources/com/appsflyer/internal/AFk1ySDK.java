package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFk1ySDK {
    private static void AFAdRevenueData(int[] iArr) {
        for (int i11 = 0; i11 < iArr.length / 2; i11++) {
            int i12 = iArr[i11];
            iArr[i11] = iArr[(iArr.length - i11) - 1];
            iArr[(iArr.length - i11) - 1] = i12;
        }
    }

    public static void getRevenue(int i11, int i12, boolean z11, int i13, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z11) {
            AFAdRevenueData(iArr);
        }
        int i14 = 0;
        while (i14 < i13) {
            int i15 = i11 ^ iArr[i14];
            int iAFAdRevenueData = i12 ^ AFAdRevenueData(i15, iArr2);
            i14++;
            i12 = i15;
            i11 = iAFAdRevenueData;
        }
        int i16 = i11 ^ iArr[iArr.length - 2];
        int i17 = i12 ^ iArr[iArr.length - 1];
        if (!z11) {
            AFAdRevenueData(iArr);
        }
        iArr3[0] = i17;
        iArr3[1] = i16;
    }

    private static int AFAdRevenueData(int i11, int[][] iArr) {
        return ((iArr[0][i11 >>> 24] + iArr[1][(i11 >>> 16) & 255]) ^ iArr[2][(i11 >>> 8) & 255]) + iArr[3][i11 & 255];
    }
}
