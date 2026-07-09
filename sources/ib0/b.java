package ib0;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class b extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ByteArrayOutputStream f103555b;

    public b(OutputStream outputStream) {
        super(outputStream);
        this.f103555b = new ByteArrayOutputStream();
    }

    public long a() {
        return this.f103554a;
    }

    byte[] c() {
        return this.f103555b.toByteArray();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i11, i12);
        this.f103554a += (long) i12;
        if (bArr != null) {
            this.f103555b.write(bArr, i11, i12);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) throws IOException {
        ((FilterOutputStream) this).out.write(i11);
        this.f103554a++;
        this.f103555b.write(i11);
    }
}
