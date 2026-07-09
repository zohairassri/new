package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class w extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile byte[] f19255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final hd.b f19260f;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public w(InputStream inputStream, hd.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i11 = this.f19258d;
        if (i11 != -1) {
            int i12 = this.f19259e - i11;
            int i13 = this.f19257c;
            if (i12 < i13) {
                if (i11 == 0 && i13 > bArr.length && this.f19256b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i13) {
                        i13 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f19260f.c(i13, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f19255a = bArr2;
                    this.f19260f.put(bArr);
                    bArr = bArr2;
                } else if (i11 > 0) {
                    System.arraycopy(bArr, i11, bArr, 0, bArr.length - i11);
                }
                int i14 = this.f19259e - this.f19258d;
                this.f19259e = i14;
                this.f19258d = 0;
                this.f19256b = 0;
                int i15 = inputStream.read(bArr, i14, bArr.length - i14);
                int i16 = this.f19259e;
                if (i15 > 0) {
                    i16 += i15;
                }
                this.f19256b = i16;
                return i15;
            }
        }
        int i17 = inputStream.read(bArr);
        if (i17 > 0) {
            this.f19258d = -1;
            this.f19259e = 0;
            this.f19256b = i17;
        }
        return i17;
    }

    private static IOException f() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f19255a == null || inputStream == null) {
            throw f();
        }
        return (this.f19256b - this.f19259e) + inputStream.available();
    }

    public synchronized void c() {
        this.f19257c = this.f19255a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f19255a != null) {
            this.f19260f.put(this.f19255a);
            this.f19255a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void e() {
        if (this.f19255a != null) {
            this.f19260f.put(this.f19255a);
            this.f19255a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        this.f19257c = Math.max(this.f19257c, i11);
        this.f19258d = this.f19259e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f19255a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw f();
        }
        if (this.f19259e >= this.f19256b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f19255a && (bArr = this.f19255a) == null) {
            throw f();
        }
        int i11 = this.f19256b;
        int i12 = this.f19259e;
        if (i11 - i12 <= 0) {
            return -1;
        }
        this.f19259e = i12 + 1;
        return bArr[i12] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f19255a == null) {
            throw new IOException("Stream is closed");
        }
        int i11 = this.f19258d;
        if (-1 == i11) {
            throw new a("Mark has been invalidated, pos: " + this.f19259e + " markLimit: " + this.f19257c);
        }
        this.f19259e = i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j11) {
        if (j11 < 1) {
            return 0L;
        }
        byte[] bArr = this.f19255a;
        if (bArr == null) {
            throw f();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw f();
        }
        int i11 = this.f19256b;
        int i12 = this.f19259e;
        if (i11 - i12 >= j11) {
            this.f19259e = (int) (((long) i12) + j11);
            return j11;
        }
        long j12 = ((long) i11) - ((long) i12);
        this.f19259e = i11;
        if (this.f19258d == -1 || j11 > this.f19257c) {
            long jSkip = inputStream.skip(j11 - j12);
            if (jSkip > 0) {
                this.f19258d = -1;
            }
            return j12 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j12;
        }
        int i13 = this.f19256b;
        int i14 = this.f19259e;
        if (i13 - i14 >= j11 - j12) {
            this.f19259e = (int) ((((long) i14) + j11) - j12);
            return j11;
        }
        long j13 = (j12 + ((long) i13)) - ((long) i14);
        this.f19259e = i13;
        return j13;
    }

    w(InputStream inputStream, hd.b bVar, int i11) {
        super(inputStream);
        this.f19258d = -1;
        this.f19260f = bVar;
        this.f19255a = (byte[]) bVar.c(i11, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        byte[] bArr2 = this.f19255a;
        if (bArr2 == null) {
            throw f();
        }
        if (i12 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i15 = this.f19259e;
            int i16 = this.f19256b;
            if (i15 < i16) {
                int i17 = i16 - i15 >= i12 ? i12 : i16 - i15;
                System.arraycopy(bArr2, i15, bArr, i11, i17);
                this.f19259e += i17;
                if (i17 == i12 || inputStream.available() == 0) {
                    return i17;
                }
                i11 += i17;
                i13 = i12 - i17;
            } else {
                i13 = i12;
            }
            while (true) {
                if (this.f19258d == -1 && i13 >= bArr2.length) {
                    i14 = inputStream.read(bArr, i11, i13);
                    if (i14 == -1) {
                        return i13 != i12 ? i12 - i13 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i13 != i12 ? i12 - i13 : -1;
                    }
                    if (bArr2 != this.f19255a && (bArr2 = this.f19255a) == null) {
                        throw f();
                    }
                    int i18 = this.f19256b;
                    int i19 = this.f19259e;
                    i14 = i18 - i19 >= i13 ? i13 : i18 - i19;
                    System.arraycopy(bArr2, i19, bArr, i11, i14);
                    this.f19259e += i14;
                }
                i13 -= i14;
                if (i13 == 0) {
                    return i12;
                }
                if (inputStream.available() == 0) {
                    return i12 - i13;
                }
                i11 += i14;
            }
        } else {
            throw f();
        }
    }
}
