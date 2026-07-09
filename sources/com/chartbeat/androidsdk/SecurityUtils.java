package com.chartbeat.androidsdk;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class SecurityUtils {
    private static SecureRandom random = new SecureRandom();

    private SecurityUtils() {
    }

    static synchronized String randomChars(int i11) {
        String strEncodeToString;
        try {
            if (i11 <= 0) {
                throw new RuntimeException("need at least one character");
            }
            byte[] bArr = new byte[((i11 % 3 != 0 ? (i11 - (i11 % 3)) + 3 : i11) * 4) / 3];
            random.nextBytes(bArr);
            strEncodeToString = Base64.encodeToString(bArr, 3);
            if (strEncodeToString.length() < i11) {
                throw new RuntimeException();
            }
            if (strEncodeToString.contains("=")) {
                throw new RuntimeException();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return strEncodeToString.replaceAll("\\/", "-").replaceAll("\\+", QueryKeys.END_MARKER).substring(0, i11);
    }
}
