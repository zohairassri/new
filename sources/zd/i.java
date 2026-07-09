package zd;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class i extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f142264a;

    public i(InputStream inputStream) {
        super(inputStream);
        this.f142264a = IntCompanionObject.MIN_VALUE;
    }

    private long a(long j11) {
        int i11 = this.f142264a;
        if (i11 == 0) {
            return -1L;
        }
        return (i11 == Integer.MIN_VALUE || j11 <= ((long) i11)) ? j11 : i11;
    }

    private void c(long j11) {
        int i11 = this.f142264a;
        if (i11 == Integer.MIN_VALUE || j11 == -1) {
            return;
        }
        this.f142264a = (int) (((long) i11) - j11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i11 = this.f142264a;
        return i11 == Integer.MIN_VALUE ? super.available() : Math.min(i11, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        super.mark(i11);
        this.f142264a = i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i11 = super.read();
        c(1L);
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f142264a = IntCompanionObject.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        long jA = a(j11);
        if (jA == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA);
        c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int iA = (int) a(i12);
        if (iA == -1) {
            return -1;
        }
        int i13 = super.read(bArr, i11, iA);
        c(i13);
        return i13;
    }
}
