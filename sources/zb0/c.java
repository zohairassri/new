package zb0;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public static final String a(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArr2 = new byte[bArr.length * 2];
        int i11 = 0;
        for (byte b11 : bArr) {
            int i12 = b11 & 255;
            if (i12 < 128) {
                bArr2[i11] = (byte) i12;
                i11++;
            } else {
                int i13 = i11 + 1;
                bArr2[i11] = (byte) ((i12 >> 6) | 192);
                i11 += 2;
                bArr2[i13] = (byte) ((b11 & 63) | 128);
            }
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, i11);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
        return new String(bArrCopyOf, Charsets.UTF_8);
    }
}
