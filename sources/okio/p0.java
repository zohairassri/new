package okio;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class p0 {
    public static final long a(String str, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i11).toString());
        }
        if (i12 < i11) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i12 + " < " + i11).toString());
        }
        if (i12 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i12 + " > " + str.length()).toString());
        }
        long j11 = 0;
        while (i11 < i12) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                j11++;
            } else {
                if (cCharAt < 2048) {
                    i13 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i13 = 3;
                } else {
                    int i14 = i11 + 1;
                    char cCharAt2 = i14 < i12 ? str.charAt(i14) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j11++;
                        i11 = i14;
                    } else {
                        j11 += (long) 4;
                        i11 += 2;
                    }
                }
                j11 += (long) i13;
            }
            i11++;
        }
        return j11;
    }

    public static /* synthetic */ long b(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return a(str, i11, i12);
    }
}
