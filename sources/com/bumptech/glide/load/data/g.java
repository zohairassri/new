package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class g extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f18932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f18933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f18934e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f18935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18936b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f18932c = bArr;
        int length = bArr.length;
        f18933d = length;
        f18934e = length + 2;
    }

    public g(InputStream inputStream, int i11) {
        super(inputStream);
        if (i11 >= -1 && i11 <= 8) {
            this.f18935a = (byte) i11;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i11;
        int i12 = this.f18936b;
        int i13 = (i12 < 2 || i12 > (i11 = f18934e)) ? super.read() : i12 == i11 ? this.f18935a : f18932c[i12 - 2] & 255;
        if (i13 != -1) {
            this.f18936b++;
        }
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        long jSkip = super.skip(j11);
        if (jSkip > 0) {
            this.f18936b = (int) (((long) this.f18936b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        int i14 = this.f18936b;
        int i15 = f18934e;
        if (i14 > i15) {
            i13 = super.read(bArr, i11, i12);
        } else if (i14 == i15) {
            bArr[i11] = this.f18935a;
            i13 = 1;
        } else if (i14 < 2) {
            i13 = super.read(bArr, i11, 2 - i14);
        } else {
            int iMin = Math.min(i15 - i14, i12);
            System.arraycopy(f18932c, this.f18936b - 2, bArr, i11, iMin);
            i13 = iMin;
        }
        if (i13 > 0) {
            this.f18936b += i13;
        }
        return i13;
    }
}
