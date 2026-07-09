package com.google.android.gms.internal.ads;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class pw4 {
    public static BigDecimal a(String str) {
        c(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(String.valueOf(str)));
    }

    public static BigInteger b(String str) {
        c(str);
        return new BigInteger(str);
    }

    private static void c(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + 28);
        sb2.append("Number string too large: ");
        sb2.append(strSubstring);
        sb2.append("...");
        throw new NumberFormatException(sb2.toString());
    }
}
