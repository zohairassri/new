package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f30598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30601d;

    public m5(byte[] bArr) {
        this.f30598a = bArr;
        this.f30599b = bArr.length;
    }

    public final boolean a() {
        int i11 = (this.f30598a[this.f30600c] & 255) >> this.f30601d;
        c(1);
        return 1 == (i11 & 1);
    }

    public final int b(int i11) {
        int i12 = this.f30600c;
        int i13 = 8 - this.f30601d;
        int i14 = i12 + 1;
        byte[] bArr = this.f30598a;
        int iMin = Math.min(i11, i13);
        int i15 = ((bArr[i12] & 255) >> this.f30601d) & (255 >> (8 - iMin));
        while (iMin < i11) {
            i15 |= (bArr[i14] & 255) << iMin;
            iMin += 8;
            i14++;
        }
        int i16 = i15 & ((-1) >>> (32 - i11));
        c(i11);
        return i16;
    }

    public final void c(int i11) {
        int i12;
        int i13 = i11 / 8;
        int i14 = this.f30600c + i13;
        this.f30600c = i14;
        int i15 = this.f30601d + (i11 - (i13 * 8));
        this.f30601d = i15;
        if (i15 > 7) {
            i14++;
            this.f30600c = i14;
            i15 -= 8;
            this.f30601d = i15;
        }
        boolean z11 = false;
        if (i14 >= 0 && (i14 < (i12 = this.f30599b) || (i14 == i12 && i15 == 0))) {
            z11 = true;
        }
        jx3.i(z11);
    }

    public final int d() {
        return (this.f30600c * 8) + this.f30601d;
    }
}
