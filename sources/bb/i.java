package bb;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class i extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f14167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14168b = 1073741824;

    public i(InputStream inputStream) {
        this.f14167a = inputStream;
    }

    private final int a(int i11) {
        if (i11 == -1) {
            this.f14168b = 0;
        }
        return i11;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f14168b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14167a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return a(this.f14167a.read());
    }

    @Override // java.io.InputStream
    public long skip(long j11) {
        return this.f14167a.skip(j11);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return a(this.f14167a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        return a(this.f14167a.read(bArr, i11, i12));
    }
}
