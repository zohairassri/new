package l6;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f113385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f113386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f113387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f113388d;

    public i(byte[] bArr, int i11, int i12) {
        j(bArr, i11, i12);
    }

    private void a() {
        int i11;
        int i12 = this.f113387c;
        k6.a.g(i12 >= 0 && (i12 < (i11 = this.f113386b) || (i12 == i11 && this.f113388d == 0)));
    }

    private int g() {
        int i11 = 0;
        while (!e()) {
            i11++;
        }
        return ((1 << i11) - 1) + (i11 > 0 ? f(i11) : 0);
    }

    private boolean k(int i11) {
        if (2 > i11 || i11 >= this.f113386b) {
            return false;
        }
        byte[] bArr = this.f113385a;
        return bArr[i11] == 3 && bArr[i11 + (-2)] == 0 && bArr[i11 - 1] == 0;
    }

    public void b() {
        int i11 = this.f113388d;
        if (i11 > 0) {
            m(8 - i11);
        }
    }

    public boolean c(int i11) {
        int i12 = this.f113387c;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        int i15 = (this.f113388d + i11) - (i13 * 8);
        if (i15 > 7) {
            i14++;
            i15 -= 8;
        }
        while (true) {
            i12++;
            if (i12 > i14 || i14 >= this.f113386b) {
                break;
            }
            if (k(i12)) {
                i14++;
                i12 += 2;
            }
        }
        int i16 = this.f113386b;
        return i14 < i16 || (i14 == i16 && i15 == 0);
    }

    public boolean d() {
        int i11 = this.f113387c;
        int i12 = this.f113388d;
        int i13 = 0;
        while (this.f113387c < this.f113386b && !e()) {
            i13++;
        }
        boolean z11 = this.f113387c == this.f113386b;
        this.f113387c = i11;
        this.f113388d = i12;
        return !z11 && c((i13 * 2) + 1);
    }

    public boolean e() {
        boolean z11 = (this.f113385a[this.f113387c] & (128 >> this.f113388d)) != 0;
        l();
        return z11;
    }

    public int f(int i11) {
        int i12;
        this.f113388d += i11;
        int i13 = 0;
        while (true) {
            i12 = this.f113388d;
            if (i12 <= 8) {
                break;
            }
            int i14 = i12 - 8;
            this.f113388d = i14;
            byte[] bArr = this.f113385a;
            int i15 = this.f113387c;
            i13 |= (bArr[i15] & 255) << i14;
            if (!k(i15 + 1)) {
                i = 1;
            }
            this.f113387c = i15 + i;
        }
        byte[] bArr2 = this.f113385a;
        int i16 = this.f113387c;
        int i17 = ((-1) >>> (32 - i11)) & (i13 | ((bArr2[i16] & 255) >> (8 - i12)));
        if (i12 == 8) {
            this.f113388d = 0;
            this.f113387c = i16 + (k(i16 + 1) ? 2 : 1);
        }
        a();
        return i17;
    }

    public int h() {
        int iG = g();
        return (iG % 2 == 0 ? -1 : 1) * ((iG + 1) / 2);
    }

    public int i() {
        return g();
    }

    public void j(byte[] bArr, int i11, int i12) {
        this.f113385a = bArr;
        this.f113387c = i11;
        this.f113386b = i12;
        this.f113388d = 0;
        a();
    }

    public void l() {
        int i11 = this.f113388d + 1;
        this.f113388d = i11;
        if (i11 == 8) {
            this.f113388d = 0;
            int i12 = this.f113387c;
            this.f113387c = i12 + (k(i12 + 1) ? 2 : 1);
        }
        a();
    }

    public void m(int i11) {
        int i12 = this.f113387c;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        this.f113387c = i14;
        int i15 = this.f113388d + (i11 - (i13 * 8));
        this.f113388d = i15;
        if (i15 > 7) {
            this.f113387c = i14 + 1;
            this.f113388d = i15 - 8;
        }
        while (true) {
            i12++;
            if (i12 > this.f113387c) {
                a();
                return;
            } else if (k(i12)) {
                this.f113387c++;
                i12 += 2;
            }
        }
    }
}
