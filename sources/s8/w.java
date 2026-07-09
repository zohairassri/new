package s8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f126062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f126063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f126064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f126065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f126066e;

    public w(int i11, int i12) {
        this.f126062a = i11;
        byte[] bArr = new byte[i12 + 3];
        this.f126065d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i11, int i12) {
        if (this.f126063b) {
            int i13 = i12 - i11;
            byte[] bArr2 = this.f126065d;
            int length = bArr2.length;
            int i14 = this.f126066e;
            if (length < i14 + i13) {
                this.f126065d = Arrays.copyOf(bArr2, (i14 + i13) * 2);
            }
            System.arraycopy(bArr, i11, this.f126065d, this.f126066e, i13);
            this.f126066e += i13;
        }
    }

    public boolean b(int i11) {
        if (!this.f126063b) {
            return false;
        }
        this.f126066e -= i11;
        this.f126063b = false;
        this.f126064c = true;
        return true;
    }

    public boolean c() {
        return this.f126064c;
    }

    public void d() {
        this.f126063b = false;
        this.f126064c = false;
    }

    public void e(int i11) {
        k6.a.g(!this.f126063b);
        boolean z11 = i11 == this.f126062a;
        this.f126063b = z11;
        if (z11) {
            this.f126066e = 3;
            this.f126064c = false;
        }
    }
}
