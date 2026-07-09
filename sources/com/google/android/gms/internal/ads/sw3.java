package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class sw3 {
    public static String a(String str) {
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            if (d(str.charAt(i11))) {
                char[] charArray = str.toCharArray();
                while (i11 < length) {
                    char c11 = charArray[i11];
                    if (d(c11)) {
                        charArray[i11] = (char) (c11 ^ ' ');
                    }
                    i11++;
                }
                return String.valueOf(charArray);
            }
            i11++;
        }
        return str;
    }

    public static String b(String str) {
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            if (c(str.charAt(i11))) {
                char[] charArray = str.toCharArray();
                while (i11 < length) {
                    char c11 = charArray[i11];
                    if (c(c11)) {
                        charArray[i11] = (char) (c11 ^ ' ');
                    }
                    i11++;
                }
                return String.valueOf(charArray);
            }
            i11++;
        }
        return str;
    }

    public static boolean c(char c11) {
        return c11 >= 'a' && c11 <= 'z';
    }

    public static boolean d(char c11) {
        return c11 >= 'A' && c11 <= 'Z';
    }

    public static boolean e(CharSequence charSequence, CharSequence charSequence2) {
        int iF;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = charSequence.charAt(i11);
            char cCharAt2 = charSequence2.charAt(i11);
            if (cCharAt != cCharAt2 && ((iF = f(cCharAt)) >= 26 || iF != f(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int f(char c11) {
        return (char) ((c11 | ' ') - 97);
    }
}
