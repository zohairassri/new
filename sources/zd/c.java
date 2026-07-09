package zd;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f142248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f142249b;

    private c(InputStream inputStream, long j11) {
        super(inputStream);
        this.f142248a = j11;
    }

    private int a(int i11) throws IOException {
        if (i11 >= 0) {
            this.f142249b += i11;
            return i11;
        }
        if (this.f142248a - ((long) this.f142249b) <= 0) {
            return i11;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f142248a + ", but read: " + this.f142249b);
    }

    public static InputStream c(InputStream inputStream, long j11) {
        return new c(inputStream, j11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f142248a - ((long) this.f142249b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i11;
        i11 = super.read();
        a(i11 >= 0 ? 1 : -1);
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i11, int i12) {
        return a(super.read(bArr, i11, i12));
    }
}
