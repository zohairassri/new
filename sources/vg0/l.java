package vg0;

import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final l[] f133147d = {new l("", 0, ""), new l("", 0, " "), new l(" ", 0, " "), new l("", 12, ""), new l("", 10, " "), new l("", 0, " the "), new l(" ", 0, ""), new l("s ", 0, " "), new l("", 0, " of "), new l("", 10, ""), new l("", 0, " and "), new l("", 13, ""), new l("", 1, ""), new l(", ", 0, " "), new l("", 0, ", "), new l(" ", 10, " "), new l("", 0, " in "), new l("", 0, " to "), new l("e ", 0, " "), new l("", 0, "\""), new l("", 0, InstructionFileId.DOT), new l("", 0, "\">"), new l("", 0, "\n"), new l("", 3, ""), new l("", 0, "]"), new l("", 0, " for "), new l("", 14, ""), new l("", 2, ""), new l("", 0, " a "), new l("", 0, " that "), new l(" ", 10, ""), new l("", 0, ". "), new l(InstructionFileId.DOT, 0, ""), new l(" ", 0, ", "), new l("", 15, ""), new l("", 0, " with "), new l("", 0, "'"), new l("", 0, " from "), new l("", 0, " by "), new l("", 16, ""), new l("", 17, ""), new l(" the ", 0, ""), new l("", 4, ""), new l("", 0, ". The "), new l("", 11, ""), new l("", 0, " on "), new l("", 0, " as "), new l("", 0, " is "), new l("", 7, ""), new l("", 1, "ing "), new l("", 0, "\n\t"), new l("", 0, ":"), new l(" ", 0, ". "), new l("", 0, "ed "), new l("", 20, ""), new l("", 18, ""), new l("", 6, ""), new l("", 0, "("), new l("", 10, ", "), new l("", 8, ""), new l("", 0, " at "), new l("", 0, "ly "), new l(" the ", 0, " of "), new l("", 5, ""), new l("", 9, ""), new l(" ", 10, ", "), new l("", 10, "\""), new l(InstructionFileId.DOT, 0, "("), new l("", 11, " "), new l("", 10, "\">"), new l("", 0, "=\""), new l(" ", 0, InstructionFileId.DOT), new l(".com/", 0, ""), new l(" the ", 0, " of the "), new l("", 10, "'"), new l("", 0, ". This "), new l("", 0, ","), new l(InstructionFileId.DOT, 0, " "), new l("", 10, "("), new l("", 10, InstructionFileId.DOT), new l("", 0, " not "), new l(" ", 0, "=\""), new l("", 0, "er "), new l(" ", 11, " "), new l("", 0, "al "), new l(" ", 11, ""), new l("", 0, "='"), new l("", 11, "\""), new l("", 10, ". "), new l(" ", 0, "("), new l("", 0, "ful "), new l(" ", 10, ". "), new l("", 0, "ive "), new l("", 0, "less "), new l("", 11, "'"), new l("", 0, "est "), new l(" ", 10, InstructionFileId.DOT), new l("", 11, "\">"), new l(" ", 0, "='"), new l("", 10, ","), new l("", 0, "ize "), new l("", 11, InstructionFileId.DOT), new l("Â ", 0, ""), new l(" ", 0, ","), new l("", 10, "=\""), new l("", 11, "=\""), new l("", 0, "ous "), new l("", 11, ", "), new l("", 10, "='"), new l(" ", 10, ","), new l(" ", 11, "=\""), new l(" ", 11, ", "), new l("", 11, ","), new l("", 11, "("), new l("", 11, ". "), new l(" ", 11, InstructionFileId.DOT), new l("", 11, "='"), new l(" ", 11, ". "), new l(" ", 10, "=\""), new l(" ", 11, "='"), new l(" ", 10, "='")};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f133148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f133149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f133150c;

    l(String str, int i11, String str2) {
        this.f133148a = a(str);
        this.f133149b = i11;
        this.f133150c = a(str2);
    }

    static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = (byte) str.charAt(i11);
        }
        return bArr;
    }

    static int b(byte[] bArr, int i11, byte[] bArr2, int i12, int i13, l lVar) {
        int i14 = i11;
        for (byte b11 : lVar.f133148a) {
            bArr[i14] = b11;
            i14++;
        }
        int i15 = lVar.f133149b;
        int iA = n.a(i15);
        if (iA > i13) {
            iA = i13;
        }
        int i16 = i12 + iA;
        int iB = (i13 - iA) - n.b(i15);
        int i17 = iB;
        while (i17 > 0) {
            bArr[i14] = bArr2[i16];
            i17--;
            i14++;
            i16++;
        }
        if (i15 == 11 || i15 == 10) {
            int i18 = i14 - iB;
            if (i15 == 10) {
                iB = 1;
            }
            while (iB > 0) {
                byte b12 = bArr[i18];
                int i19 = b12 & 255;
                if (i19 < 192) {
                    if (i19 >= 97 && i19 <= 122) {
                        bArr[i18] = (byte) (b12 ^ 32);
                    }
                    i18++;
                    iB--;
                } else if (i19 < 224) {
                    int i21 = i18 + 1;
                    bArr[i21] = (byte) (bArr[i21] ^ 32);
                    i18 += 2;
                    iB -= 2;
                } else {
                    int i22 = i18 + 2;
                    bArr[i22] = (byte) (bArr[i22] ^ 5);
                    i18 += 3;
                    iB -= 3;
                }
            }
        }
        for (byte b13 : lVar.f133150c) {
            bArr[i14] = b13;
            i14++;
        }
        return i14 - i11;
    }
}
