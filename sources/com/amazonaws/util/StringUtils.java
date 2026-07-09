package com.amazonaws.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class StringUtils {
    private static final String DEFAULT_ENCODING = "UTF-8";
    public static final Charset UTF8 = Charset.forName("UTF-8");

    public static String fromBigDecimal(BigDecimal bigDecimal) {
        return bigDecimal.toString();
    }

    public static String fromBigInteger(BigInteger bigInteger) {
        return bigInteger.toString();
    }

    public static String fromBoolean(Boolean bool) {
        return Boolean.toString(bool.booleanValue());
    }

    public static String fromByte(Byte b11) {
        return Byte.toString(b11.byteValue());
    }

    public static String fromByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return Base64.encodeAsString(byteBuffer.array());
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return Base64.encodeAsString(bArr);
    }

    public static String fromDate(Date date) {
        return DateUtils.formatISO8601Date(date);
    }

    public static String fromDouble(Double d11) {
        return Double.toString(d11.doubleValue());
    }

    public static String fromFloat(Float f11) {
        return Float.toString(f11.floatValue());
    }

    public static String fromInteger(Integer num) {
        return Integer.toString(num.intValue());
    }

    public static String fromLong(Long l11) {
        return Long.toString(l11.longValue());
    }

    public static boolean isBlank(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i11 = 0; i11 < length; i11++) {
                if (!Character.isWhitespace(charSequence.charAt(i11))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String join(String str, String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            sb2.append(strArr[i11]);
            if (i11 < strArr.length - 1) {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static String lowerCase(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? "" : str.toLowerCase(Locale.ENGLISH);
    }

    public static String replace(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer(str.length());
        stringBuffer.append(str);
        int iIndexOf = stringBuffer.indexOf(str2);
        while (iIndexOf != -1) {
            stringBuffer = stringBuffer.replace(iIndexOf, str2.length() + iIndexOf, str3);
            iIndexOf = stringBuffer.indexOf(str2);
        }
        return stringBuffer.toString();
    }

    public static BigDecimal toBigDecimal(String str) {
        return new BigDecimal(str);
    }

    public static BigInteger toBigInteger(String str) {
        return new BigInteger(str);
    }

    public static Boolean toBoolean(StringBuilder sb2) {
        return Boolean.valueOf(Boolean.getBoolean(sb2.toString()));
    }

    public static Integer toInteger(StringBuilder sb2) {
        return Integer.valueOf(Integer.parseInt(sb2.toString()));
    }

    public static String toString(StringBuilder sb2) {
        return sb2.toString();
    }

    public static String upperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? "" : str.toUpperCase(Locale.ENGLISH);
    }

    public static String fromString(String str) {
        return str;
    }
}
