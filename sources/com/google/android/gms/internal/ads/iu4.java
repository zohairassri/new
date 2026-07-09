package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class iu4 {
    public static byte[] a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        int i11;
        int length = bArr.length;
        if ((length & 1) != 0 || length == 0 || length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        int i12 = length >> 1;
        byte[] bArrC = c(Arrays.copyOf(bArr, i12));
        byte[] bArrC2 = c(Arrays.copyOfRange(bArr, i12, length));
        int length2 = bArrC.length;
        int length3 = bArrC2.length;
        int i13 = length2 + 4 + length3;
        if (i13 >= 128) {
            bArr2 = new byte[i13 + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) i13;
            i11 = 3;
        } else {
            bArr2 = new byte[i13 + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) i13;
            i11 = 2;
        }
        int i14 = i11 + 1;
        bArr2[i11] = 2;
        int i15 = i11 + 2;
        bArr2[i14] = (byte) length2;
        System.arraycopy(bArrC, 0, bArr2, i15, length2);
        int i16 = i15 + length2;
        bArr2[i16] = 2;
        bArr2[i16 + 1] = (byte) length3;
        System.arraycopy(bArrC2, 0, bArr2, i16 + 2, length3);
        return bArr2;
    }

    public static ECParameterSpec b(gu4 gu4Var) throws NoSuchAlgorithmException {
        int iOrdinal = gu4Var.ordinal();
        if (iOrdinal == 0) {
            return vf4.f36783a;
        }
        if (iOrdinal == 1) {
            return vf4.f36784b;
        }
        if (iOrdinal == 2) {
            return vf4.f36785c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(gu4Var.toString()));
    }

    private static byte[] c(byte[] bArr) {
        int length;
        int i11 = 0;
        while (true) {
            length = bArr.length;
            if (i11 >= length || bArr[i11] != 0) {
                break;
            }
            i11++;
        }
        if (i11 == length) {
            i11 = length - 1;
        }
        int i12 = (bArr[i11] & ByteCompanionObject.MIN_VALUE) == 128 ? 1 : 0;
        int i13 = length - i11;
        byte[] bArr2 = new byte[i13 + i12];
        System.arraycopy(bArr, i11, bArr2, i12, i13);
        return bArr2;
    }
}
