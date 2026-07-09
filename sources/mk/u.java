package mk;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f116713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f116714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f116715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f116716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f116717e;

    public u(int i11, int i12) {
        this.f116713a = i11;
        byte[] bArr = new byte[i12 + 3];
        this.f116716d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i11, int i12) {
        if (this.f116714b) {
            int i13 = i12 - i11;
            byte[] bArr2 = this.f116716d;
            int length = bArr2.length;
            int i14 = this.f116717e;
            if (length < i14 + i13) {
                this.f116716d = Arrays.copyOf(bArr2, (i14 + i13) * 2);
            }
            System.arraycopy(bArr, i11, this.f116716d, this.f116717e, i13);
            this.f116717e += i13;
        }
    }

    public boolean b(int i11) {
        if (!this.f116714b) {
            return false;
        }
        this.f116717e -= i11;
        this.f116714b = false;
        this.f116715c = true;
        return true;
    }

    public boolean c() {
        return this.f116715c;
    }

    public void d() {
        this.f116714b = false;
        this.f116715c = false;
    }

    public void e(int i11) {
        ml.a.f(!this.f116714b);
        boolean z11 = i11 == this.f116713a;
        this.f116714b = z11;
        if (z11) {
            this.f116717e = 3;
            this.f116715c = false;
        }
    }
}
