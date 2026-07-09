package zy;

import com.squareup.moshi.JsonDataException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final TimeZone f142725a = TimeZone.getTimeZone("GMT");

    private static boolean a(String str, int i11, char c11) {
        return i11 < str.length() && str.charAt(i11) == c11;
    }

    public static String b(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f142725a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(24);
        d(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        d(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        d(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        d(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        d(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        d(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        d(sb2, gregorianCalendar.get(14), 3);
        sb2.append('Z');
        return sb2.toString();
    }

    private static int c(String str, int i11) {
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < '0' || cCharAt > '9') {
                return i11;
            }
            i11++;
        }
        return str.length();
    }

    private static void d(StringBuilder sb2, int i11, int i12) {
        String string = Integer.toString(i11);
        for (int length = i12 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }

    public static Date e(String str) {
        int i11;
        int i12;
        int iPow;
        int iF;
        int iF2;
        TimeZone timeZone;
        char cCharAt;
        try {
            int iF3 = f(str, 0, 4);
            int i13 = a(str, 4, '-') ? 5 : 4;
            int i14 = i13 + 2;
            int iF4 = f(str, i13, i14);
            if (a(str, i14, '-')) {
                i14 = i13 + 3;
            }
            int i15 = i14 + 2;
            int iF5 = f(str, i14, i15);
            boolean zA = a(str, i15, 'T');
            if (!zA && str.length() <= i15) {
                return new GregorianCalendar(iF3, iF4 - 1, iF5).getTime();
            }
            if (zA) {
                int i16 = i14 + 5;
                int iF6 = f(str, i14 + 3, i16);
                if (a(str, i16, ':')) {
                    i16 = i14 + 6;
                }
                int i17 = i16 + 2;
                iF2 = f(str, i16, i17);
                if (a(str, i17, ':')) {
                    i17 = i16 + 3;
                }
                if (str.length() <= i17 || (cCharAt = str.charAt(i17)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i11 = iF3;
                    i12 = iF6;
                    i15 = i17;
                    iPow = 0;
                    iF = 0;
                } else {
                    int i18 = i17 + 2;
                    iF = f(str, i17, i18);
                    if (iF > 59 && iF < 63) {
                        iF = 59;
                    }
                    if (a(str, i18, '.')) {
                        int iC = c(str, i17 + 4);
                        i11 = iF3;
                        iPow = (int) (Math.pow(10.0d, 3 - (r5 - r9)) * ((double) f(str, i17 + 3, Math.min(iC, i17 + 6))));
                        i12 = iF6;
                        i15 = iC;
                    } else {
                        i11 = iF3;
                        i12 = iF6;
                        i15 = i18;
                        iPow = 0;
                    }
                }
            } else {
                i11 = iF3;
                i12 = 0;
                iPow = 0;
                iF = 0;
                iF2 = 0;
            }
            if (str.length() <= i15) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 == 'Z') {
                timeZone = f142725a;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                }
                String strSubstring = str.substring(i15);
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = f142725a;
                } else {
                    String str2 = "GMT" + strSubstring;
                    TimeZone timeZone2 = TimeZone.getTimeZone(str2);
                    String id2 = timeZone2.getID();
                    if (!id2.equals(str2) && !id2.replace(":", "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i11);
            gregorianCalendar.set(2, iF4 - 1);
            gregorianCalendar.set(5, iF5);
            gregorianCalendar.set(11, i12);
            gregorianCalendar.set(12, iF2);
            gregorianCalendar.set(13, iF);
            gregorianCalendar.set(14, iPow);
            return gregorianCalendar.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException e11) {
            throw new JsonDataException("Not an RFC 3339 date: " + str, e11);
        }
    }

    private static int f(String str, int i11, int i12) {
        int i13;
        int i14;
        if (i11 < 0 || i12 > str.length() || i11 > i12) {
            throw new NumberFormatException(str);
        }
        if (i11 < i12) {
            i14 = i11 + 1;
            int iDigit = Character.digit(str.charAt(i11), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
            }
            i13 = -iDigit;
        } else {
            i13 = 0;
            i14 = i11;
        }
        while (i14 < i12) {
            int i15 = i14 + 1;
            int iDigit2 = Character.digit(str.charAt(i14), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
            }
            i13 = (i13 * 10) - iDigit2;
            i14 = i15;
        }
        return -i13;
    }
}
