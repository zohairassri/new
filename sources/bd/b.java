package bd;

import io.agora.rtc2.internal.Marshallable;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f14284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f14285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f14286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14288e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends ByteArrayOutputStream {
        a(int i11) {
            super(i11);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i11 = ((ByteArrayOutputStream) this).count;
            if (i11 > 0 && ((ByteArrayOutputStream) this).buf[i11 - 1] == 13) {
                i11--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i11, b.this.f14285b.name());
            } catch (UnsupportedEncodingException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, Marshallable.PROTO_PACKET_SIZE, charset);
    }

    private void c() throws IOException {
        InputStream inputStream = this.f14284a;
        byte[] bArr = this.f14286c;
        int i11 = inputStream.read(bArr, 0, bArr.length);
        if (i11 == -1) {
            throw new EOFException();
        }
        this.f14287d = 0;
        this.f14288e = i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f14284a) {
            try {
                if (this.f14286c != null) {
                    this.f14286c = null;
                    this.f14284a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e() {
        return this.f14288e == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String f() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f14284a
            monitor-enter(r0)
            byte[] r1 = r7.f14286c     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.f14287d     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f14288e     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.c()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r7 = move-exception
            goto L8b
        L14:
            int r1 = r7.f14287d     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.f14288e     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.f14286c     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.f14287d     // Catch: java.lang.Throwable -> L11
            if (r1 == r3) goto L2f
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L11
            r6 = 13
            if (r5 != r6) goto L2f
            goto L30
        L2f:
            r4 = r1
        L30:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.f14285b     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.f14287d = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            bd.b$a r1 = new bd.b$a     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f14288e     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f14287d     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.f14286c     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f14287d     // Catch: java.lang.Throwable -> L11
            int r5 = r7.f14288e     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.f14288e = r2     // Catch: java.lang.Throwable -> L11
            r7.c()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f14287d     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.f14288e     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.f14286c     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.f14287d     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.f14287d = r2     // Catch: java.lang.Throwable -> L11
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r7
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "LineReader is closed"
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L11
            throw r7     // Catch: java.lang.Throwable -> L11
        L8b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.b.f():java.lang.String");
    }

    public b(InputStream inputStream, int i11, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(c.f14290a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f14284a = inputStream;
        this.f14285b = charset;
        this.f14286c = new byte[i11];
    }
}
