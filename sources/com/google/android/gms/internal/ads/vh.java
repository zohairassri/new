package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class vh extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f36803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36804b;

    vh(InputStream inputStream, long j11) {
        super(inputStream);
        this.f36803a = j11;
    }

    final long a() {
        return this.f36803a - this.f36804b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i11 = super.read();
        if (i11 != -1) {
            this.f36804b++;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = super.read(bArr, i11, i12);
        if (i13 != -1) {
            this.f36804b += (long) i13;
        }
        return i13;
    }
}
