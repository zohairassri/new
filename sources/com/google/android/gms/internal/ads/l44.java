package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class l44 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f30007a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i11 = 0; i11 < 10; i11++) {
            bArr[i11 + 48] = (byte) i11;
        }
        for (int i12 = 0; i12 < 26; i12++) {
            byte b11 = (byte) (i12 + 10);
            bArr[i12 + 65] = b11;
            bArr[i12 + 97] = b11;
        }
        f30007a = bArr;
    }

    static int a(char c11) {
        if (c11 < 128) {
            return f30007a[c11];
        }
        return -1;
    }
}
