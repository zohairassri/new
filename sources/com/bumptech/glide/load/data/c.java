package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f18925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f18926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hd.b f18927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18928d;

    public c(OutputStream outputStream, hd.b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void a() throws IOException {
        int i11 = this.f18928d;
        if (i11 > 0) {
            this.f18925a.write(this.f18926b, 0, i11);
            this.f18928d = 0;
        }
    }

    private void c() throws IOException {
        if (this.f18928d == this.f18926b.length) {
            a();
        }
    }

    private void e() {
        byte[] bArr = this.f18926b;
        if (bArr != null) {
            this.f18927c.put(bArr);
            this.f18926b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f18925a.close();
            e();
        } catch (Throwable th2) {
            this.f18925a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f18925a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        byte[] bArr = this.f18926b;
        int i12 = this.f18928d;
        this.f18928d = i12 + 1;
        bArr[i12] = (byte) i11;
        c();
    }

    c(OutputStream outputStream, hd.b bVar, int i11) {
        this.f18925a = outputStream;
        this.f18927c = bVar;
        this.f18926b = (byte[]) bVar.c(i11, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        do {
            int i14 = i12 - i13;
            int i15 = i11 + i13;
            int i16 = this.f18928d;
            if (i16 == 0 && i14 >= this.f18926b.length) {
                this.f18925a.write(bArr, i15, i14);
                return;
            }
            int iMin = Math.min(i14, this.f18926b.length - i16);
            System.arraycopy(bArr, i15, this.f18926b, this.f18928d, iMin);
            this.f18928d += iMin;
            i13 += iMin;
            c();
        } while (i13 < i12);
    }
}
