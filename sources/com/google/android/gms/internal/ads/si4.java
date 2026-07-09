package com.google.android.gms.internal.ads;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class si4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34881a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final qv4 a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb2.append("Not a printable ASCII character: ");
                sb2.append(cCharAt);
                throw new zzhlm(sb2.toString());
            }
            bArr[i11] = (byte) cCharAt;
        }
        return qv4.a(bArr);
    }

    public static final qv4 b(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb2.append("Not a printable ASCII character: ");
                sb2.append(cCharAt);
                throw new GeneralSecurityException(sb2.toString());
            }
            bArr[i11] = (byte) cCharAt;
        }
        return qv4.a(bArr);
    }

    public static boolean c() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static Integer d() {
        if (c()) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean e(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (bArr2[i11] != bArr[i11]) {
                return false;
            }
        }
        return true;
    }
}
