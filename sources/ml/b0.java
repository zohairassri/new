package ml;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f116750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f116751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f116752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f116753d;

    public b0(byte[] bArr, int i11, int i12) {
        i(bArr, i11, i12);
    }

    private void a() {
        int i11;
        int i12 = this.f116752c;
        a.f(i12 >= 0 && (i12 < (i11 = this.f116751b) || (i12 == i11 && this.f116753d == 0)));
    }

    private int f() {
        int i11 = 0;
        while (!d()) {
            i11++;
        }
        return ((1 << i11) - 1) + (i11 > 0 ? e(i11) : 0);
    }

    private boolean j(int i11) {
        if (2 > i11 || i11 >= this.f116751b) {
            return false;
        }
        byte[] bArr = this.f116750a;
        return bArr[i11] == 3 && bArr[i11 + (-2)] == 0 && bArr[i11 - 1] == 0;
    }

    public boolean b(int i11) {
        int i12 = this.f116752c;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        int i15 = (this.f116753d + i11) - (i13 * 8);
        if (i15 > 7) {
            i14++;
            i15 -= 8;
        }
        while (true) {
            i12++;
            if (i12 > i14 || i14 >= this.f116751b) {
                break;
            }
            if (j(i12)) {
                i14++;
                i12 += 2;
            }
        }
        int i16 = this.f116751b;
        return i14 < i16 || (i14 == i16 && i15 == 0);
    }

    public boolean c() {
        int i11 = this.f116752c;
        int i12 = this.f116753d;
        int i13 = 0;
        while (this.f116752c < this.f116751b && !d()) {
            i13++;
        }
        boolean z11 = this.f116752c == this.f116751b;
        this.f116752c = i11;
        this.f116753d = i12;
        return !z11 && b((i13 * 2) + 1);
    }

    public boolean d() {
        boolean z11 = (this.f116750a[this.f116752c] & (128 >> this.f116753d)) != 0;
        k();
        return z11;
    }

    public int e(int i11) {
        int i12;
        this.f116753d += i11;
        int i13 = 0;
        while (true) {
            i12 = this.f116753d;
            if (i12 <= 8) {
                break;
            }
            int i14 = i12 - 8;
            this.f116753d = i14;
            byte[] bArr = this.f116750a;
            int i15 = this.f116752c;
            i13 |= (bArr[i15] & 255) << i14;
            if (!j(i15 + 1)) {
                i = 1;
            }
            this.f116752c = i15 + i;
        }
        byte[] bArr2 = this.f116750a;
        int i16 = this.f116752c;
        int i17 = ((-1) >>> (32 - i11)) & (i13 | ((bArr2[i16] & 255) >> (8 - i12)));
        if (i12 == 8) {
            this.f116753d = 0;
            this.f116752c = i16 + (j(i16 + 1) ? 2 : 1);
        }
        a();
        return i17;
    }

    public int g() {
        int iF = f();
        return (iF % 2 == 0 ? -1 : 1) * ((iF + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i11, int i12) {
        this.f116750a = bArr;
        this.f116752c = i11;
        this.f116751b = i12;
        this.f116753d = 0;
        a();
    }

    public void k() {
        int i11 = this.f116753d + 1;
        this.f116753d = i11;
        if (i11 == 8) {
            this.f116753d = 0;
            int i12 = this.f116752c;
            this.f116752c = i12 + (j(i12 + 1) ? 2 : 1);
        }
        a();
    }

    public void l(int i11) {
        int i12 = this.f116752c;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        this.f116752c = i14;
        int i15 = this.f116753d + (i11 - (i13 * 8));
        this.f116753d = i15;
        if (i15 > 7) {
            this.f116752c = i14 + 1;
            this.f116753d = i15 - 8;
        }
        while (true) {
            i12++;
            if (i12 > this.f116752c) {
                a();
                return;
            } else if (j(i12)) {
                this.f116752c++;
                i12 += 2;
            }
        }
    }
}
