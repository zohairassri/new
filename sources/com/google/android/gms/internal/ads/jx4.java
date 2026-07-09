package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class jx4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final jx4 f29268h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f29272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29275g;

    static {
        w64 w64Var = new w64();
        w64Var.a(1);
        w64Var.b(2);
        w64Var.c(3);
        f29268h = w64Var.g();
        w64 w64Var2 = new w64();
        w64Var2.a(1);
        w64Var2.b(1);
        w64Var2.c(2);
        w64Var2.g();
        String str = yy2.f38899a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ jx4(int i11, int i12, int i13, byte[] bArr, int i14, int i15, byte[] bArr2) {
        this.f29269a = i11;
        this.f29270b = i12;
        this.f29271c = i13;
        this.f29272d = bArr;
        this.f29273e = i14;
        this.f29274f = i15;
    }

    public static boolean a(jx4 jx4Var) {
        if (jx4Var == null) {
            return true;
        }
        int i11 = jx4Var.f29269a;
        if (i11 != -1 && i11 != 1 && i11 != 2) {
            return false;
        }
        int i12 = jx4Var.f29270b;
        if (i12 != -1 && i12 != 2) {
            return false;
        }
        int i13 = jx4Var.f29271c;
        if ((i13 != -1 && i13 != 3) || jx4Var.f29272d != null) {
            return false;
        }
        int i14 = jx4Var.f29274f;
        if (i14 != -1 && i14 != 8) {
            return false;
        }
        int i15 = jx4Var.f29273e;
        return i15 == -1 || i15 == 8;
    }

    public static int b(int i11) {
        if (i11 == 1) {
            return 1;
        }
        if (i11 != 9) {
            return (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i11) {
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 4) {
            return 10;
        }
        if (i11 == 13) {
            return 2;
        }
        if (i11 == 16) {
            return 6;
        }
        if (i11 != 18) {
            return (i11 == 6 || i11 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String h(int i11) {
        if (i11 == -1) {
            return "Unset color space";
        }
        if (i11 == 6) {
            return "BT2020";
        }
        if (i11 == 1) {
            return "BT709";
        }
        if (i11 == 2) {
            return "BT601";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 22);
        sb2.append("Undefined color space ");
        sb2.append(i11);
        return sb2.toString();
    }

    private static String i(int i11) {
        if (i11 == -1) {
            return "Unset color transfer";
        }
        if (i11 == 10) {
            return "Gamma 2.2";
        }
        if (i11 == 1) {
            return "Linear";
        }
        if (i11 == 2) {
            return "sRGB";
        }
        if (i11 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i11 == 6) {
            return "ST2084 PQ";
        }
        if (i11 == 7) {
            return "HLG";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 25);
        sb2.append("Undefined color transfer ");
        sb2.append(i11);
        return sb2.toString();
    }

    private static String j(int i11) {
        if (i11 == -1) {
            return "Unset color range";
        }
        if (i11 == 1) {
            return "Full range";
        }
        if (i11 == 2) {
            return "Limited range";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 22);
        sb2.append("Undefined color range ");
        sb2.append(i11);
        return sb2.toString();
    }

    public final w64 d() {
        return new w64(this, null);
    }

    public final boolean e() {
        return (this.f29273e == -1 || this.f29274f == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jx4.class == obj.getClass()) {
            jx4 jx4Var = (jx4) obj;
            if (this.f29269a == jx4Var.f29269a && this.f29270b == jx4Var.f29270b && this.f29271c == jx4Var.f29271c && Arrays.equals(this.f29272d, jx4Var.f29272d) && this.f29273e == jx4Var.f29273e && this.f29274f == jx4Var.f29274f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.f29269a == -1 || this.f29270b == -1 || this.f29271c == -1) ? false : true;
    }

    public final String g() {
        String str;
        String string;
        if (f()) {
            Object[] objArr = {h(this.f29269a), j(this.f29270b), i(this.f29271c)};
            String str2 = yy2.f38899a;
            str = String.format(Locale.US, "%s/%s/%s", objArr);
        } else {
            str = "NA/NA/NA";
        }
        if (e()) {
            int i11 = this.f29273e;
            int i12 = this.f29274f;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 1 + String.valueOf(i12).length());
            sb2.append(i11);
            sb2.append("/");
            sb2.append(i12);
            string = sb2.toString();
        } else {
            string = "NA/NA";
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 1 + string.length());
        sb3.append(str);
        sb3.append("/");
        sb3.append(string);
        return sb3.toString();
    }

    public final int hashCode() {
        int i11 = this.f29275g;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((this.f29269a + 527) * 31) + this.f29270b) * 31) + this.f29271c) * 31) + Arrays.hashCode(this.f29272d)) * 31) + this.f29273e) * 31) + this.f29274f;
        this.f29275g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string;
        int i11 = this.f29273e;
        int i12 = this.f29271c;
        int i13 = this.f29270b;
        String strH = h(this.f29269a);
        String strJ = j(i13);
        String strI = i(i12);
        String string2 = "NA";
        if (i11 != -1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 8);
            sb2.append(i11);
            sb2.append("bit Luma");
            string = sb2.toString();
        } else {
            string = "NA";
        }
        int i14 = this.f29274f;
        if (i14 != -1) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 10);
            sb3.append(i14);
            sb3.append("bit Chroma");
            string2 = sb3.toString();
        }
        boolean z11 = this.f29272d != null;
        StringBuilder sb4 = new StringBuilder(strH.length() + 12 + strJ.length() + 2 + strI.length() + 2 + String.valueOf(z11).length() + 2 + string.length() + 2 + string2.length() + 1);
        sb4.append("ColorInfo(");
        sb4.append(strH);
        sb4.append(", ");
        sb4.append(strJ);
        sb4.append(", ");
        sb4.append(strI);
        sb4.append(", ");
        sb4.append(z11);
        sb4.append(", ");
        sb4.append(string);
        sb4.append(", ");
        sb4.append(string2);
        sb4.append(")");
        return sb4.toString();
    }
}
