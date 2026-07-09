package zr;

import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f142512a = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i11, char c11) {
        return i11 < str.length() && str.charAt(i11) == c11;
    }

    private static int b(String str, int i11) {
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < '0' || cCharAt > '9') {
                return i11;
            }
            i11++;
        }
        return str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:49:0x00d6, B:51:0x00dc, B:53:0x00e2, B:77:0x018f, B:57:0x00ec, B:58:0x0107, B:59:0x0108, B:63:0x0124, B:65:0x0131, B:68:0x013a, B:70:0x0159, B:73:0x0168, B:74:0x018a, B:76:0x018d, B:62:0x0113, B:79:0x01c0, B:80:0x01c7, B:42:0x00b9, B:43:0x00bc), top: B:91:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c0 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:49:0x00d6, B:51:0x00dc, B:53:0x00e2, B:77:0x018f, B:57:0x00ec, B:58:0x0107, B:59:0x0108, B:63:0x0124, B:65:0x0131, B:68:0x013a, B:70:0x0159, B:73:0x0168, B:74:0x018a, B:76:0x018d, B:62:0x0113, B:79:0x01c0, B:80:0x01c7, B:42:0x00b9, B:43:0x00bc), top: B:91:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date c(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zr.a.c(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int d(String str, int i11, int i12) {
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
