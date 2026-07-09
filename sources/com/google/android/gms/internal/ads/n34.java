package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class n34 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f31203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f31204b;

    n34(InputStream inputStream, long j11) {
        super(inputStream);
        this.f31204b = -1L;
        inputStream.getClass();
        jx3.b(j11 >= 0, "limit must be non-negative");
        this.f31203a = j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f31203a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i11) {
        ((FilterInputStream) this).in.mark(i11);
        this.f31204b = this.f31203a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f31203a == 0) {
            return -1;
        }
        int i11 = ((FilterInputStream) this).in.read();
        if (i11 != -1) {
            this.f31203a--;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f31204b == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f31203a = this.f31204b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j11) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j11, this.f31203a));
        this.f31203a -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        long j11 = this.f31203a;
        if (j11 == 0) {
            return -1;
        }
        int i13 = ((FilterInputStream) this).in.read(bArr, i11, (int) Math.min(i12, j11));
        if (i13 != -1) {
            this.f31203a -= (long) i13;
        }
        return i13;
    }
}
