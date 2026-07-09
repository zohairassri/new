package com.google.android.gms.internal.ads;

import com.comscore.android.ConnectivityType;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f35890a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f35891b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f35892c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f35893d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f35894e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f35895f = {32000, ConnectivityType.UNKNOWN, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f35896g = {8000, 16000, 24000, 32000, ConnectivityType.UNKNOWN, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int a(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (!l(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = i14 - 1;
        int i17 = f35891b[i15];
        if (i12 == 2) {
            i17 /= 2;
        } else if (i12 == 0) {
            i17 /= 4;
        }
        int i18 = (i11 >>> 9) & 1;
        if (i13 == 3) {
            return ((((i12 == 3 ? f35892c[i16] : f35893d[i16]) * 12) / i17) + i18) * 4;
        }
        int i19 = i12 == 3 ? i13 == 2 ? f35894e[i16] : f35895f[i16] : f35896g[i16];
        if (i12 == 3) {
            return ((i19 * 144) / i17) + i18;
        }
        return (((i13 == 1 ? 72 : 144) * i19) / i17) + i18;
    }

    public static int b(int i11) {
        int i12;
        int i13;
        if (!l(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0) {
            return -1;
        }
        int i14 = i11 >>> 12;
        int i15 = (i11 >>> 10) & 3;
        int i16 = i14 & 15;
        if (i16 == 0 || i16 == 15 || i15 == 3) {
            return -1;
        }
        return m(i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i11) {
        return (i11 & (-2097152)) == -2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(int i11, int i12) {
        return i12 != 1 ? i12 != 2 ? 384 : 1152 : i11 == 3 ? 1152 : 576;
    }
}
