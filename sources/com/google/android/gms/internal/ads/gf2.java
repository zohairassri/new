package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class gf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f26976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26979d;

    public gf2(byte[] bArr, int i11) {
        this.f26976a = bArr;
        this.f26979d = i11;
    }

    private final void q() {
        int i11;
        int i12 = this.f26977b;
        boolean z11 = false;
        if (i12 >= 0 && (i12 < (i11 = this.f26979d) || (i12 == i11 && this.f26978c == 0))) {
            z11 = true;
        }
        jx3.i(z11);
    }

    public final void a(hg2 hg2Var) {
        b(hg2Var.H(), hg2Var.D());
        f(hg2Var.F() * 8);
    }

    public final void b(byte[] bArr, int i11) {
        this.f26976a = bArr;
        this.f26977b = 0;
        this.f26978c = 0;
        this.f26979d = i11;
    }

    public final int c() {
        return ((this.f26979d - this.f26977b) * 8) - this.f26978c;
    }

    public final int d() {
        return (this.f26977b * 8) + this.f26978c;
    }

    public final int e() {
        jx3.i(this.f26978c == 0);
        return this.f26977b;
    }

    public final void f(int i11) {
        int i12 = i11 / 8;
        this.f26977b = i12;
        this.f26978c = i11 - (i12 * 8);
        q();
    }

    public final void g() {
        int i11 = this.f26978c + 1;
        this.f26978c = i11;
        if (i11 == 8) {
            this.f26978c = 0;
            this.f26977b++;
        }
        q();
    }

    public final void h(int i11) {
        int i12 = i11 / 8;
        int i13 = this.f26977b + i12;
        this.f26977b = i13;
        int i14 = this.f26978c + (i11 - (i12 * 8));
        this.f26978c = i14;
        if (i14 > 7) {
            this.f26977b = i13 + 1;
            this.f26978c = i14 - 8;
        }
        q();
    }

    public final boolean i() {
        int i11 = this.f26976a[this.f26977b] & (128 >> this.f26978c);
        g();
        return i11 != 0;
    }

    public final int j(int i11) {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        this.f26978c += i11;
        int i13 = 0;
        while (true) {
            i12 = this.f26978c;
            if (i12 <= 8) {
                break;
            }
            int i14 = i12 - 8;
            this.f26978c = i14;
            byte[] bArr = this.f26976a;
            int i15 = this.f26977b;
            this.f26977b = i15 + 1;
            i13 |= (bArr[i15] & 255) << i14;
        }
        byte[] bArr2 = this.f26976a;
        int i16 = this.f26977b;
        int i17 = i13 | ((bArr2[i16] & 255) >> (8 - i12));
        int i18 = 32 - i11;
        if (i12 == 8) {
            this.f26978c = 0;
            this.f26977b = i16 + 1;
        }
        int i19 = ((-1) >>> i18) & i17;
        q();
        return i19;
    }

    public final long k(int i11) {
        if (i11 <= 32) {
            int iJ = j(i11);
            String str = yy2.f38899a;
            return ((long) iJ) & 4294967295L;
        }
        int iJ2 = j(i11 - 32);
        int iJ3 = j(32);
        String str2 = yy2.f38899a;
        return ((((long) iJ2) & 4294967295L) << 32) | (4294967295L & ((long) iJ3));
    }

    public final void l(byte[] bArr, int i11, int i12) {
        int i13;
        int i14 = 0;
        while (true) {
            i13 = i12 >> 3;
            if (i14 >= i13) {
                break;
            }
            byte[] bArr2 = this.f26976a;
            int i15 = this.f26977b;
            int i16 = i15 + 1;
            this.f26977b = i16;
            byte b11 = bArr2[i15];
            int i17 = this.f26978c;
            byte b12 = (byte) (b11 << i17);
            bArr[i14] = b12;
            bArr[i14] = (byte) (((bArr2[i16] & 255) >> (8 - i17)) | b12);
            i14++;
        }
        int i18 = i12 & 7;
        if (i18 == 0) {
            return;
        }
        byte b13 = (byte) (bArr[i13] & (255 >> i18));
        bArr[i13] = b13;
        int i19 = this.f26978c;
        if (i19 + i18 > 8) {
            byte[] bArr3 = this.f26976a;
            int i21 = this.f26977b;
            this.f26977b = i21 + 1;
            b13 = (byte) (b13 | ((bArr3[i21] & 255) << i19));
            bArr[i13] = b13;
            i19 -= 8;
        }
        int i22 = i19 + i18;
        this.f26978c = i22;
        byte[] bArr4 = this.f26976a;
        int i23 = this.f26977b;
        bArr[i13] = (byte) (((byte) (((255 & bArr4[i23]) >> (8 - i22)) << (8 - i18))) | b13);
        if (i22 == 8) {
            this.f26978c = 0;
            this.f26977b = i23 + 1;
        }
        q();
    }

    public final void m() {
        if (this.f26978c == 0) {
            return;
        }
        this.f26978c = 0;
        this.f26977b++;
        q();
    }

    public final void n(byte[] bArr, int i11, int i12) {
        jx3.i(this.f26978c == 0);
        System.arraycopy(this.f26976a, this.f26977b, bArr, 0, i12);
        this.f26977b += i12;
        q();
    }

    public final void o(int i11) {
        jx3.i(this.f26978c == 0);
        this.f26977b += i11;
        q();
    }

    public final void p(int i11, int i12) {
        int iMin = Math.min(8 - this.f26978c, 14);
        int i13 = this.f26978c;
        int i14 = (8 - i13) - iMin;
        byte[] bArr = this.f26976a;
        int i15 = this.f26977b;
        byte b11 = (byte) (((65280 >> i13) | ((1 << i14) - 1)) & bArr[i15]);
        bArr[i15] = b11;
        int i16 = 14 - iMin;
        int i17 = i11 & 16383;
        bArr[i15] = (byte) (b11 | ((i17 >>> i16) << i14));
        int i18 = i15 + 1;
        while (i16 > 8) {
            i16 -= 8;
            this.f26976a[i18] = (byte) (i17 >>> i16);
            i18++;
        }
        byte[] bArr2 = this.f26976a;
        byte b12 = (byte) (bArr2[i18] & ((1 << r0) - 1));
        bArr2[i18] = b12;
        bArr2[i18] = (byte) (((i17 & ((1 << i16) - 1)) << (8 - i16)) | b12);
        h(14);
        q();
    }

    public gf2() {
        this.f26976a = yy2.f38900b;
    }
}
