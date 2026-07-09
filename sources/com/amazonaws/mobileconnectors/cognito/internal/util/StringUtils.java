package com.amazonaws.mobileconnectors.cognito.internal.util;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class StringUtils {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static boolean equals(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static long utf8ByteLength(String str) {
        if (str == null) {
            return 0L;
        }
        return str.getBytes(UTF_8).length;
    }
}
