package ad;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    private static final long a(String str, int i11, int i12) {
        long j11;
        long j12 = 0;
        do {
            if (str.charAt(i11) != '-') {
                j12 *= (long) 16;
                char cCharAt = str.charAt(i11);
                if (cCharAt != '0') {
                    if (cCharAt == '1') {
                        j11 = 1;
                    } else if (cCharAt == '2') {
                        j11 = 2;
                    } else if (cCharAt == '3') {
                        j11 = 3;
                    } else if (cCharAt == '4') {
                        j11 = 4;
                    } else if (cCharAt == '5') {
                        j11 = 5;
                    } else if (cCharAt == '6') {
                        j11 = 6;
                    } else if (cCharAt == '7') {
                        j11 = 7;
                    } else if (cCharAt == '8') {
                        j11 = 8;
                    } else if (cCharAt == '9') {
                        j11 = 9;
                    } else if (cCharAt == 'a' || cCharAt == 'A') {
                        j11 = 10;
                    } else if (cCharAt == 'b' || cCharAt == 'B') {
                        j11 = 11;
                    } else if (cCharAt == 'c' || cCharAt == 'C') {
                        j11 = 12;
                    } else if (cCharAt == 'd' || cCharAt == 'D') {
                        j11 = 13;
                    } else if (cCharAt == 'e' || cCharAt == 'E') {
                        j11 = 14;
                    } else {
                        if (cCharAt != 'f' && cCharAt != 'F') {
                            throw new IllegalArgumentException("Invalid UUID string, encountered non-hexadecimal digit `" + str.charAt(i11) + "` at index " + i11 + " in: " + str);
                        }
                        j11 = 15;
                    }
                    j12 += j11;
                }
            } else if (i11 != 8 && i11 != 13 && i11 != 18 && i11 != 23) {
                throw new IllegalArgumentException(("Invalid UUID string, encountered dash at index " + i11 + " but it can occur only at 8, 13, 18, or 23: " + str).toString());
            }
            i11++;
        } while (i11 < i12);
        return j12;
    }

    public static final UUID b(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (string.length() == 36) {
            return new UUID(a(string, 0, 19), a(string, 19, 36));
        }
        throw new IllegalArgumentException("Invalid UUID string, expected exactly 36 characters but got " + string.length() + ": " + string);
    }
}
