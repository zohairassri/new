package okio;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import okio.h;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f120493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f120494b;

    static {
        h.a aVar = h.f120526d;
        f120493a = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").j();
        f120494b = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").j();
    }

    public static final byte[] a(String str) {
        int i11;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i12 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i12];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            char cCharAt2 = str.charAt(i16);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i11 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i11 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i11 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i11 = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i11 = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i14 = (i14 << 6) | i11;
            i13++;
            if (i13 % 4 == 0) {
                bArr[i15] = (byte) (i14 >> 16);
                int i17 = i15 + 2;
                bArr[i15 + 1] = (byte) (i14 >> 8);
                i15 += 3;
                bArr[i17] = (byte) i14;
            }
        }
        int i18 = i13 % 4;
        if (i18 == 1) {
            return null;
        }
        if (i18 == 2) {
            bArr[i15] = (byte) ((i14 << 12) >> 16);
            i15++;
        } else if (i18 == 3) {
            int i19 = i14 << 6;
            int i21 = i15 + 1;
            bArr[i15] = (byte) (i19 >> 16);
            i15 += 2;
            bArr[i21] = (byte) (i19 >> 8);
        }
        if (i15 == i12) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i15);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final String b(byte[] bArr, byte[] map) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            byte b11 = bArr[i11];
            int i13 = i11 + 2;
            byte b12 = bArr[i11 + 1];
            i11 += 3;
            byte b13 = bArr[i13];
            bArr2[i12] = map[(b11 & 255) >> 2];
            bArr2[i12 + 1] = map[((b11 & 3) << 4) | ((b12 & 255) >> 4)];
            int i14 = i12 + 3;
            bArr2[i12 + 2] = map[((b12 & 15) << 2) | ((b13 & 255) >> 6)];
            i12 += 4;
            bArr2[i14] = map[b13 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b14 = bArr[i11];
            bArr2[i12] = map[(b14 & 255) >> 2];
            bArr2[i12 + 1] = map[(b14 & 3) << 4];
            bArr2[i12 + 2] = 61;
            bArr2[i12 + 3] = 61;
        } else if (length2 == 2) {
            int i15 = i11 + 1;
            byte b15 = bArr[i11];
            byte b16 = bArr[i15];
            bArr2[i12] = map[(b15 & 255) >> 2];
            bArr2[i12 + 1] = map[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr2[i12 + 2] = map[(b16 & 15) << 2];
            bArr2[i12 + 3] = 61;
        }
        return r0.c(bArr2);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bArr2 = f120493a;
        }
        return b(bArr, bArr2);
    }
}
