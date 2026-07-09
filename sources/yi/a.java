package yi;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f140520a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    private static byte[] a(int i11) {
        if (i11 > 16) {
            i11 = 32;
        } else if (i11 < 16) {
            i11 = 16;
        }
        return new byte[i11];
    }

    private static void b(long j11, int i11, int i12, byte[] bArr) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j11) >>> 2;
        Arrays.fill(bArr, i11, (i12 - 16) + i11 + iNumberOfLeadingZeros, (byte) 48);
        for (int i13 = 0; i13 < 16 - iNumberOfLeadingZeros; i13++) {
            bArr[((i11 + i12) - 1) - i13] = f140520a[(int) (15 & j11)];
            j11 >>>= 4;
        }
    }

    public static NumberFormatException c(CharSequence charSequence) {
        return new NumberFormatException(String.format("String value %s exceeds range of unsigned long.", charSequence));
    }

    public static long d(String str) {
        int i11;
        if (str == null) {
            throw new NumberFormatException("s can't be null");
        }
        int length = str.length();
        if (length <= 0) {
            throw new NumberFormatException("Empty input string");
        }
        int i12 = 0;
        if (str.charAt(0) == '-') {
            throw new NumberFormatException(String.format("Illegal leading minus sign on unsigned string %s.", str));
        }
        if (length <= 18) {
            return Long.parseLong(str);
        }
        if (length > 20) {
            throw c(str);
        }
        int i13 = 0;
        long j11 = 0;
        while (true) {
            i11 = length - 1;
            if (i12 >= i11) {
                break;
            }
            int iDigit = Character.digit(str.charAt(i12), 10);
            i13 |= iDigit;
            j11 = (j11 * 10) + ((long) iDigit);
            i12++;
        }
        int iDigit2 = Character.digit(str.charAt(i11), 10);
        if ((i13 | iDigit2) < 0) {
            throw new NumberFormatException("Illegal character in " + str);
        }
        if (j11 > 1844674407370955161L) {
            throw c(str);
        }
        long j12 = j11 * 10;
        long j13 = ((long) iDigit2) + j12;
        if (j12 >= 0 || j13 < 0) {
            return j13;
        }
        throw c(str);
    }

    public static String e(long j11, int i11) {
        byte[] bArrA = a(i11);
        b(j11, 0, bArrA.length, bArrA);
        return new String(bArrA, StandardCharsets.US_ASCII);
    }

    public static String f(long j11, long j12, int i11) {
        if (i11 <= 16) {
            return e(j12, i11);
        }
        byte[] bArrA = a(i11);
        b(j11, 0, 16, bArrA);
        b(j12, 16, 16, bArrA);
        return new String(bArrA, StandardCharsets.US_ASCII);
    }
}
