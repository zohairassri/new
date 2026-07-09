package com.amazonaws.util;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ValidationUtils {
    public static void assertAllAreNull(String str, Object... objArr) {
        for (Object obj : objArr) {
            if (obj != null) {
                throw new IllegalArgumentException(str);
            }
        }
    }

    public static int assertIsPositive(int i11, String str) {
        if (i11 > 0) {
            return i11;
        }
        throw new IllegalArgumentException(String.format("%s must be positive", str));
    }

    public static <T extends Collection<?>> T assertNotEmpty(T t11, String str) {
        assertNotNull(t11, str);
        if (t11.isEmpty()) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", str));
        }
        return t11;
    }

    public static <T> T assertNotNull(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalArgumentException(String.format("%s cannot be null", str));
    }

    public static void assertParameterNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String assertStringNotEmpty(String str, String str2) {
        assertNotNull(str, str2);
        if (str.isEmpty()) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", str2));
        }
        return str;
    }

    public static <T> T[] assertNotEmpty(T[] tArr, String str) {
        assertNotNull(tArr, str);
        if (tArr.length != 0) {
            return tArr;
        }
        throw new IllegalArgumentException(String.format("%s cannot be empty", str));
    }
}
