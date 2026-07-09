package zd;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Queue f142250c = l.g(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f142251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f142252b;

    d() {
    }

    public static d c(InputStream inputStream) {
        d dVar;
        Queue queue = f142250c;
        synchronized (queue) {
            dVar = (d) queue.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.f(inputStream);
        return dVar;
    }

    public IOException a() {
        return this.f142252b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f142251a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f142251a.close();
    }

    public void e() {
        this.f142252b = null;
        this.f142251a = null;
        Queue queue = f142250c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    void f(InputStream inputStream) {
        this.f142251a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f142251a.mark(i11);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f142251a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f142251a.read();
        } catch (IOException e11) {
            this.f142252b = e11;
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f142251a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        try {
            return this.f142251a.skip(j11);
        } catch (IOException e11) {
            this.f142252b = e11;
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f142251a.read(bArr);
        } catch (IOException e11) {
            this.f142252b = e11;
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        try {
            return this.f142251a.read(bArr, i11, i12);
        } catch (IOException e11) {
            this.f142252b = e11;
            throw e11;
        }
    }
}
