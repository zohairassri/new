package ib0;

import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class a extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f103542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f103543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f103544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicLong f103545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f103546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ByteArrayOutputStream f103547f;

    a(InputStream inputStream, boolean z11, Function1 function1) {
        super(inputStream);
        this.f103542a = -1L;
        this.f103545d = new AtomicLong(0L);
        this.f103547f = new ByteArrayOutputStream();
        this.f103543b = function1;
        this.f103546e = z11;
    }

    private void a(byte[] bArr, int i11, int i12) {
        if (this.f103546e && bArr != null) {
            this.f103547f.write(bArr, i11, i12);
        }
    }

    private void c() {
        this.f103544c = true;
        this.f103543b.invoke(this.f103547f.toByteArray());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        ((FilterInputStream) this).in.mark(i11);
        this.f103542a = this.f103545d.longValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i11 = ((FilterInputStream) this).in.read();
        if (i11 != -1) {
            this.f103545d.incrementAndGet();
            a(new byte[]{Integer.valueOf(i11).byteValue()}, 0, 1);
            return i11;
        }
        if (!this.f103544c) {
            c();
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f103542a == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f103545d.set(this.f103542a);
        this.f103544c = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j11);
        this.f103545d.addAndGet(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = ((FilterInputStream) this).in.read(bArr, i11, i12);
        if (i13 != -1) {
            this.f103545d.addAndGet(i13);
            a(bArr, i11, i13);
            return i13;
        }
        if (!this.f103544c) {
            c();
        }
        return i13;
    }
}
