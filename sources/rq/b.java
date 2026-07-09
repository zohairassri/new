package rq;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f125073a = 0;

    b() {
    }

    long a() {
        return this.f125073a;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.f125073a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f125073a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        int i13;
        if (i11 >= 0 && i11 <= bArr.length && i12 >= 0 && (i13 = i11 + i12) <= bArr.length && i13 >= 0) {
            this.f125073a += (long) i12;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
