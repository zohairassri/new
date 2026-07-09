package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class lj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lj f30253b = new lj(new byte[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator f30254c = new kj();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f30255a;

    public lj(byte[] bArr) {
        this.f30255a = bArr;
    }

    public static lj e(byte[] bArr) {
        return new lj(h(bArr, 0, bArr.length));
    }

    public static lj f(String str) {
        return e(str.getBytes(Charset.forName(jj.a("Hn2H4l0="))));
    }

    public static int g(byte b11) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        return b11 & ((iArr[7] % 837626799) ^ (i17 + ((((i12 & (~i11)) | i13) + ((i11 & i14) | i15)) - i16)));
    }

    public static byte[] h(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return bArr2;
    }

    public final byte[] a() {
        byte[] bArr = this.f30255a;
        int length = bArr.length;
        return length == 0 ? new byte[0] : h(bArr, 0, length);
    }

    public final byte b(int i11) {
        int i12 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i13 = 2013725218 % 1633938701;
        int i14 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i15 = 1442767057 % 63299708;
        byte[] bArr = this.f30255a;
        int length = bArr.length;
        if (((length - (i11 + 1)) | i11) >= 0) {
            return bArr[i11];
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + (i12 ^ i13));
            sb2.append(jj.a("Akelqh1fajntGgo="));
            sb2.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + (i14 ^ i15) + String.valueOf(length).length());
        sb3.append(jj.a("Akelqh1faDmxRUSK1T9GeQ=="));
        sb3.append(i11);
        sb3.append(jj.a("Zwk="));
        sb3.append(length);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    public final String c() {
        Charset charsetForName = Charset.forName(jj.a("Hn2H4l0="));
        byte[] bArr = this.f30255a;
        return new String(bArr, 0, bArr.length, charsetForName);
    }

    public final lj d(lj ljVar) {
        byte[] bArr = ljVar.f30255a;
        int length = bArr.length;
        byte[] bArr2 = this.f30255a;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return e(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lj) {
            return Arrays.equals(this.f30255a, ((lj) obj).f30255a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.f30255a));
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = i17 + ((((i12 & (~i11)) | i13) + ((i11 & i14) | i15)) - i16);
        String string = Arrays.toString(this.f30255a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + ((i18 % 981766422) ^ i19));
        sb2.append(jj.a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb2.append(string);
        sb2.append(jj.a("Ng=="));
        return sb2.toString();
    }
}
