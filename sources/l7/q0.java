package l7;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f113591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f113592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f113593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f113594d;

    public q0(byte[] bArr) {
        this.f113591a = bArr;
        this.f113592b = bArr.length;
    }

    private void a() {
        int i11;
        int i12 = this.f113593c;
        k6.a.g(i12 >= 0 && (i12 < (i11 = this.f113592b) || (i12 == i11 && this.f113594d == 0)));
    }

    public int b() {
        return (this.f113593c * 8) + this.f113594d;
    }

    public boolean c() {
        boolean z11 = (((this.f113591a[this.f113593c] & 255) >> this.f113594d) & 1) == 1;
        e(1);
        return z11;
    }

    public int d(int i11) {
        int i12 = this.f113593c;
        int iMin = Math.min(i11, 8 - this.f113594d);
        int i13 = i12 + 1;
        int i14 = ((this.f113591a[i12] & 255) >> this.f113594d) & (255 >> (8 - iMin));
        while (iMin < i11) {
            i14 |= (this.f113591a[i13] & 255) << iMin;
            iMin += 8;
            i13++;
        }
        int i15 = i14 & ((-1) >>> (32 - i11));
        e(i11);
        return i15;
    }

    public void e(int i11) {
        int i12 = i11 / 8;
        int i13 = this.f113593c + i12;
        this.f113593c = i13;
        int i14 = this.f113594d + (i11 - (i12 * 8));
        this.f113594d = i14;
        if (i14 > 7) {
            this.f113593c = i13 + 1;
            this.f113594d = i14 - 8;
        }
        a();
    }
}
