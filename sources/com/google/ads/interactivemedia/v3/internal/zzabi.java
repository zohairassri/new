package com.google.ads.interactivemedia.v3.internal;

import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzabi {
    private static final TimeZone zza = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:19:0x0059, B:21:0x0069, B:22:0x006b, B:24:0x0077, B:25:0x007a, B:27:0x0080, B:31:0x008a, B:36:0x009a, B:38:0x00a2, B:39:0x00a6, B:41:0x00ac, B:46:0x00b9, B:49:0x00c4, B:60:0x00ef, B:62:0x00f5, B:64:0x00fb, B:88:0x01aa, B:69:0x0107, B:70:0x0122, B:71:0x0123, B:73:0x012e, B:74:0x013f, B:76:0x014c, B:79:0x0155, B:81:0x0174, B:84:0x0183, B:85:0x01a5, B:87:0x01a8, B:90:0x01dc, B:91:0x01e3, B:53:0x00d4, B:54:0x00d7, B:48:0x00c0), top: B:102:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dc A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:19:0x0059, B:21:0x0069, B:22:0x006b, B:24:0x0077, B:25:0x007a, B:27:0x0080, B:31:0x008a, B:36:0x009a, B:38:0x00a2, B:39:0x00a6, B:41:0x00ac, B:46:0x00b9, B:49:0x00c4, B:60:0x00ef, B:62:0x00f5, B:64:0x00fb, B:88:0x01aa, B:69:0x0107, B:70:0x0122, B:71:0x0123, B:73:0x012e, B:74:0x013f, B:76:0x014c, B:79:0x0155, B:81:0x0174, B:84:0x0183, B:85:0x01a5, B:87:0x01a8, B:90:0x01dc, B:91:0x01e3, B:53:0x00d4, B:54:0x00d7, B:48:0x00c0), top: B:102:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date zza(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzabi.zza(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int zzb(String str, int i11, int i12) throws NumberFormatException {
        int i13;
        int i14;
        if (i11 < 0 || i12 > str.length() || i11 > i12) {
            throw new NumberFormatException(str);
        }
        if (i11 < i12) {
            i14 = i11 + 1;
            int iDigit = Character.digit(str.charAt(i11), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i11, i12))));
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
                throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i11, i12))));
            }
            i13 = (i13 * 10) - iDigit2;
            i14 = i15;
        }
        return -i13;
    }

    private static boolean zzc(String str, int i11, char c11) {
        return i11 < str.length() && str.charAt(i11) == c11;
    }
}
