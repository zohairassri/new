package k6;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f107582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f107585d;

    public b0() {
        this.f107582a = n0.f107642f;
    }

    private void a() {
        int i11;
        int i12 = this.f107583b;
        a.g(i12 >= 0 && (i12 < (i11 = this.f107585d) || (i12 == i11 && this.f107584c == 0)));
    }

    public int b() {
        return ((this.f107585d - this.f107583b) * 8) - this.f107584c;
    }

    public void c() {
        if (this.f107584c == 0) {
            return;
        }
        this.f107584c = 0;
        this.f107583b++;
        a();
    }

    public int d() {
        a.g(this.f107584c == 0);
        return this.f107583b;
    }

    public int e() {
        return (this.f107583b * 8) + this.f107584c;
    }

    public void f(int i11, int i12) {
        if (i12 < 32) {
            i11 &= (1 << i12) - 1;
        }
        int iMin = Math.min(8 - this.f107584c, i12);
        int i13 = this.f107584c;
        int i14 = (8 - i13) - iMin;
        byte[] bArr = this.f107582a;
        int i15 = this.f107583b;
        byte b11 = (byte) (((65280 >> i13) | ((1 << i14) - 1)) & bArr[i15]);
        bArr[i15] = b11;
        int i16 = i12 - iMin;
        bArr[i15] = (byte) (b11 | ((i11 >>> i16) << i14));
        int i17 = i15 + 1;
        while (i16 > 8) {
            this.f107582a[i17] = (byte) (i11 >>> (i16 - 8));
            i16 -= 8;
            i17++;
        }
        int i18 = 8 - i16;
        byte[] bArr2 = this.f107582a;
        byte b12 = (byte) (bArr2[i17] & ((1 << i18) - 1));
        bArr2[i17] = b12;
        bArr2[i17] = (byte) (((i11 & ((1 << i16) - 1)) << i18) | b12);
        r(i12);
        a();
    }

    public boolean g() {
        boolean z11 = (this.f107582a[this.f107583b] & (128 >> this.f107584c)) != 0;
        q();
        return z11;
    }

    public int h(int i11) {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        this.f107584c += i11;
        int i13 = 0;
        while (true) {
            i12 = this.f107584c;
            if (i12 <= 8) {
                break;
            }
            int i14 = i12 - 8;
            this.f107584c = i14;
            byte[] bArr = this.f107582a;
            int i15 = this.f107583b;
            this.f107583b = i15 + 1;
            i13 |= (bArr[i15] & 255) << i14;
        }
        byte[] bArr2 = this.f107582a;
        int i16 = this.f107583b;
        int i17 = ((-1) >>> (32 - i11)) & (i13 | ((bArr2[i16] & 255) >> (8 - i12)));
        if (i12 == 8) {
            this.f107584c = 0;
            this.f107583b = i16 + 1;
        }
        a();
        return i17;
    }

    public void i(byte[] bArr, int i11, int i12) {
        int i13 = (i12 >> 3) + i11;
        while (i11 < i13) {
            byte[] bArr2 = this.f107582a;
            int i14 = this.f107583b;
            int i15 = i14 + 1;
            this.f107583b = i15;
            byte b11 = bArr2[i14];
            int i16 = this.f107584c;
            byte b12 = (byte) (b11 << i16);
            bArr[i11] = b12;
            bArr[i11] = (byte) (((255 & bArr2[i15]) >> (8 - i16)) | b12);
            i11++;
        }
        int i17 = i12 & 7;
        if (i17 == 0) {
            return;
        }
        byte b13 = (byte) (bArr[i13] & (255 >> i17));
        bArr[i13] = b13;
        int i18 = this.f107584c;
        if (i18 + i17 > 8) {
            byte[] bArr3 = this.f107582a;
            int i19 = this.f107583b;
            this.f107583b = i19 + 1;
            bArr[i13] = (byte) (b13 | ((bArr3[i19] & 255) << i18));
            this.f107584c = i18 - 8;
        }
        int i21 = this.f107584c + i17;
        this.f107584c = i21;
        byte[] bArr4 = this.f107582a;
        int i22 = this.f107583b;
        bArr[i13] = (byte) (((byte) (((255 & bArr4[i22]) >> (8 - i21)) << (8 - i17))) | bArr[i13]);
        if (i21 == 8) {
            this.f107584c = 0;
            this.f107583b = i22 + 1;
        }
        a();
    }

    public long j(int i11) {
        return i11 <= 32 ? n0.s1(h(i11)) : n0.r1(h(i11 - 32), h(32));
    }

    public void k(byte[] bArr, int i11, int i12) {
        a.g(this.f107584c == 0);
        System.arraycopy(this.f107582a, this.f107583b, bArr, i11, i12);
        this.f107583b += i12;
        a();
    }

    public String l(int i11, Charset charset) {
        byte[] bArr = new byte[i11];
        k(bArr, 0, i11);
        return new String(bArr, charset);
    }

    public void m(c0 c0Var) {
        o(c0Var.f(), c0Var.j());
        p(c0Var.g() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i11) {
        this.f107582a = bArr;
        this.f107583b = 0;
        this.f107584c = 0;
        this.f107585d = i11;
    }

    public void p(int i11) {
        int i12 = i11 / 8;
        this.f107583b = i12;
        this.f107584c = i11 - (i12 * 8);
        a();
    }

    public void q() {
        int i11 = this.f107584c + 1;
        this.f107584c = i11;
        if (i11 == 8) {
            this.f107584c = 0;
            this.f107583b++;
        }
        a();
    }

    public void r(int i11) {
        int i12 = i11 / 8;
        int i13 = this.f107583b + i12;
        this.f107583b = i13;
        int i14 = this.f107584c + (i11 - (i12 * 8));
        this.f107584c = i14;
        if (i14 > 7) {
            this.f107583b = i13 + 1;
            this.f107584c = i14 - 8;
        }
        a();
    }

    public void s(int i11) {
        a.g(this.f107584c == 0);
        this.f107583b += i11;
        a();
    }

    public b0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public b0(byte[] bArr, int i11) {
        this.f107582a = bArr;
        this.f107585d = i11;
    }
}
