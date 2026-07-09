package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class au4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f23501a = Charset.forName("UTF-8");

    public static byte[] a(String str, int i11) {
        byte[] bytes = str.getBytes(f23501a);
        int length = bytes.length;
        zt4 zt4Var = new zt4(2, new byte[(length * 3) / 4]);
        if (!zt4Var.a(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i12 = zt4Var.f38719b;
        byte[] bArr = zt4Var.f38718a;
        if (i12 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, 0, bArr2, 0, i12);
        return bArr2;
    }
}
