package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class cl {
    public static final eu a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new zzqc("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i11] = (byte) cCharAt;
        }
        return eu.b(bArr);
    }
}
