package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class et3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f25927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25930d = 0;

    public et3(byte[] bArr, int i11, int i12) {
        this.f25927a = bArr;
        this.f25929c = i11;
        this.f25928b = i12;
        k();
    }

    private final int i() {
        int i11 = 0;
        while (!e()) {
            i11++;
        }
        return ((1 << i11) - 1) + (i11 > 0 ? f(i11) : 0);
    }

    private final boolean j(int i11) {
        if (i11 < 2 || i11 >= this.f25928b) {
            return false;
        }
        byte[] bArr = this.f25927a;
        return bArr[i11] == 3 && bArr[i11 + (-2)] == 0 && bArr[i11 + (-1)] == 0;
    }

    private final void k() {
        int i11;
        int i12 = this.f25929c;
        boolean z11 = false;
        if (i12 >= 0 && (i12 < (i11 = this.f25928b) || (i12 == i11 && this.f25930d == 0))) {
            z11 = true;
        }
        jx3.i(z11);
    }

    public final void a() {
        int i11 = this.f25930d + 1;
        this.f25930d = i11;
        if (i11 == 8) {
            this.f25930d = 0;
            int i12 = this.f25929c;
            this.f25929c = i12 + (true == j(i12 + 1) ? 2 : 1);
        }
        k();
    }

    public final void b(int i11) {
        int i12 = this.f25929c;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        this.f25929c = i14;
        int i15 = this.f25930d + (i11 - (i13 * 8));
        this.f25930d = i15;
        if (i15 > 7) {
            this.f25929c = i14 + 1;
            this.f25930d = i15 - 8;
        }
        while (true) {
            i12++;
            if (i12 > this.f25929c) {
                k();
                return;
            } else if (j(i12)) {
                this.f25929c++;
                i12 += 2;
            }
        }
    }

    public final void c() {
        int i11 = this.f25930d;
        if (i11 > 0) {
            b(8 - i11);
        }
    }

    public final boolean d(int i11) {
        int i12 = this.f25929c;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        int i15 = (this.f25930d + i11) - (i13 * 8);
        if (i15 > 7) {
            i14++;
            i15 -= 8;
        }
        while (true) {
            i12++;
            if (i12 > i14 || i14 >= this.f25928b) {
                break;
            }
            if (j(i12)) {
                i14++;
                i12 += 2;
            }
        }
        int i16 = this.f25928b;
        if (i14 >= i16) {
            return i14 == i16 && i15 == 0;
        }
        return true;
    }

    public final boolean e() {
        int i11 = this.f25927a[this.f25929c] & (128 >> this.f25930d);
        a();
        return i11 != 0;
    }

    public final int f(int i11) {
        int i12;
        this.f25930d += i11;
        int i13 = 0;
        while (true) {
            i12 = this.f25930d;
            if (i12 <= 8) {
                break;
            }
            int i14 = i12 - 8;
            this.f25930d = i14;
            byte[] bArr = this.f25927a;
            int i15 = this.f25929c;
            i13 |= (bArr[i15] & 255) << i14;
            if (true != j(i15 + 1)) {
                i = 1;
            }
            this.f25929c = i15 + i;
        }
        byte[] bArr2 = this.f25927a;
        int i16 = this.f25929c;
        int i17 = i13 | ((bArr2[i16] & 255) >> (8 - i12));
        int i18 = 32 - i11;
        if (i12 == 8) {
            this.f25930d = 0;
            this.f25929c = i16 + (true != j(i16 + 1) ? 1 : 2);
        }
        int i19 = ((-1) >>> i18) & i17;
        k();
        return i19;
    }

    public final int g() {
        return i();
    }

    public final int h() {
        int i11 = i();
        return (i11 % 2 == 0 ? -1 : 1) * ((i11 + 1) / 2);
    }
}
