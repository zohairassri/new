package eq;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class g implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f92827g = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f92828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f92829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f92830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f92831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f92832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f92833f = new byte[16];

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f92834a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f92835b;

        a(StringBuilder sb2) {
            this.f92835b = sb2;
        }

        @Override // eq.g.d
        public void a(InputStream inputStream, int i11) {
            if (this.f92834a) {
                this.f92834a = false;
            } else {
                this.f92835b.append(", ");
            }
            this.f92835b.append(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f92837c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f92838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f92839b;

        b(int i11, int i12) {
            this.f92838a = i11;
            this.f92839b = i12;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f92838a + ", length = " + this.f92839b + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private final class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f92840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f92841b;

        /* synthetic */ c(g gVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) throws IOException {
            g.q(bArr, "buffer");
            if ((i11 | i12) < 0 || i12 > bArr.length - i11) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i13 = this.f92841b;
            if (i13 <= 0) {
                return -1;
            }
            if (i12 > i13) {
                i12 = i13;
            }
            g.this.V(this.f92840a, bArr, i11, i12);
            this.f92840a = g.this.j0(this.f92840a + i12);
            this.f92841b -= i12;
            return i12;
        }

        private c(b bVar) {
            this.f92840a = g.this.j0(bVar.f92838a + 4);
            this.f92841b = bVar.f92839b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f92841b == 0) {
                return -1;
            }
            g.this.f92828a.seek(this.f92840a);
            int i11 = g.this.f92828a.read();
            this.f92840a = g.this.j0(this.f92840a + 1);
            this.f92841b--;
            return i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface d {
        void a(InputStream inputStream, int i11);
    }

    public g(File file) throws IOException {
        if (!file.exists()) {
            n(file);
        }
        this.f92828a = t(file);
        E();
    }

    private b C(int i11) throws IOException {
        if (i11 == 0) {
            return b.f92837c;
        }
        this.f92828a.seek(i11);
        return new b(i11, this.f92828a.readInt());
    }

    private void E() throws IOException {
        this.f92828a.seek(0L);
        this.f92828a.readFully(this.f92833f);
        int iJ = J(this.f92833f, 0);
        this.f92829b = iJ;
        if (iJ <= this.f92828a.length()) {
            this.f92830c = J(this.f92833f, 4);
            int iJ2 = J(this.f92833f, 8);
            int iJ3 = J(this.f92833f, 12);
            this.f92831d = C(iJ2);
            this.f92832e = C(iJ3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f92829b + ", Actual length: " + this.f92828a.length());
    }

    private static int J(byte[] bArr, int i11) {
        return ((bArr[i11] & 255) << 24) + ((bArr[i11 + 1] & 255) << 16) + ((bArr[i11 + 2] & 255) << 8) + (bArr[i11 + 3] & 255);
    }

    private int M() {
        return this.f92829b - e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i11, byte[] bArr, int i12, int i13) throws IOException {
        int iJ0 = j0(i11);
        int i14 = iJ0 + i13;
        int i15 = this.f92829b;
        if (i14 <= i15) {
            this.f92828a.seek(iJ0);
            this.f92828a.readFully(bArr, i12, i13);
            return;
        }
        int i16 = i15 - iJ0;
        this.f92828a.seek(iJ0);
        this.f92828a.readFully(bArr, i12, i16);
        this.f92828a.seek(16L);
        this.f92828a.readFully(bArr, i12 + i16, i13 - i16);
    }

    private void Y(int i11, byte[] bArr, int i12, int i13) throws IOException {
        int iJ0 = j0(i11);
        int i14 = iJ0 + i13;
        int i15 = this.f92829b;
        if (i14 <= i15) {
            this.f92828a.seek(iJ0);
            this.f92828a.write(bArr, i12, i13);
            return;
        }
        int i16 = i15 - iJ0;
        this.f92828a.seek(iJ0);
        this.f92828a.write(bArr, i12, i16);
        this.f92828a.seek(16L);
        this.f92828a.write(bArr, i12 + i16, i13 - i16);
    }

    private void a0(int i11) throws IOException {
        this.f92828a.setLength(i11);
        this.f92828a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int j0(int i11) {
        int i12 = this.f92829b;
        return i11 < i12 ? i11 : (i11 + 16) - i12;
    }

    private void k(int i11) throws IOException {
        int i12 = i11 + 4;
        int iM = M();
        if (iM >= i12) {
            return;
        }
        int i13 = this.f92829b;
        do {
            iM += i13;
            i13 <<= 1;
        } while (iM < i12);
        a0(i13);
        b bVar = this.f92832e;
        int iJ0 = j0(bVar.f92838a + 4 + bVar.f92839b);
        if (iJ0 < this.f92831d.f92838a) {
            FileChannel channel = this.f92828a.getChannel();
            channel.position(this.f92829b);
            long j11 = iJ0 - 4;
            if (channel.transferTo(16L, j11, channel) != j11) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i14 = this.f92832e.f92838a;
        int i15 = this.f92831d.f92838a;
        if (i14 < i15) {
            int i16 = (this.f92829b + i14) - 16;
            p0(i13, this.f92830c, i15, i16);
            this.f92832e = new b(i16, this.f92832e.f92839b);
        } else {
            p0(i13, this.f92830c, i15, i14);
        }
        this.f92829b = i13;
    }

    private static void n(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileT = t(file2);
        try {
            randomAccessFileT.setLength(4096L);
            randomAccessFileT.seek(0L);
            byte[] bArr = new byte[16];
            x0(bArr, 4096, 0, 0, 0);
            randomAccessFileT.write(bArr);
            randomAccessFileT.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            randomAccessFileT.close();
            throw th2;
        }
    }

    private void p0(int i11, int i12, int i13, int i14) throws IOException {
        x0(this.f92833f, i11, i12, i13, i14);
        this.f92828a.seek(0L);
        this.f92828a.write(this.f92833f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object q(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile t(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private static void v0(byte[] bArr, int i11, int i12) {
        bArr[i11] = (byte) (i12 >> 24);
        bArr[i11 + 1] = (byte) (i12 >> 16);
        bArr[i11 + 2] = (byte) (i12 >> 8);
        bArr[i11 + 3] = (byte) i12;
    }

    private static void x0(byte[] bArr, int... iArr) {
        int i11 = 0;
        for (int i12 : iArr) {
            v0(bArr, i11, i12);
            i11 += 4;
        }
    }

    public synchronized void U() {
        try {
            if (o()) {
                throw new NoSuchElementException();
            }
            if (this.f92830c == 1) {
                j();
            } else {
                b bVar = this.f92831d;
                int iJ0 = j0(bVar.f92838a + 4 + bVar.f92839b);
                V(iJ0, this.f92833f, 0, 4);
                int iJ = J(this.f92833f, 0);
                p0(this.f92829b, this.f92830c - 1, iJ0, this.f92832e.f92838a);
                this.f92830c--;
                this.f92831d = new b(iJ0, iJ);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f92828a.close();
    }

    public int e0() {
        if (this.f92830c == 0) {
            return 16;
        }
        b bVar = this.f92832e;
        int i11 = bVar.f92838a;
        int i12 = this.f92831d.f92838a;
        return i11 >= i12 ? (i11 - i12) + 4 + bVar.f92839b + 16 : (((i11 + 4) + bVar.f92839b) + this.f92829b) - i12;
    }

    public void g(byte[] bArr) {
        h(bArr, 0, bArr.length);
    }

    public synchronized void h(byte[] bArr, int i11, int i12) {
        int iJ0;
        try {
            q(bArr, "buffer");
            if ((i11 | i12) < 0 || i12 > bArr.length - i11) {
                throw new IndexOutOfBoundsException();
            }
            k(i12);
            boolean zO = o();
            if (zO) {
                iJ0 = 16;
            } else {
                b bVar = this.f92832e;
                iJ0 = j0(bVar.f92838a + 4 + bVar.f92839b);
            }
            b bVar2 = new b(iJ0, i12);
            v0(this.f92833f, 0, i12);
            Y(bVar2.f92838a, this.f92833f, 0, 4);
            Y(bVar2.f92838a + 4, bArr, i11, i12);
            p0(this.f92829b, this.f92830c + 1, zO ? bVar2.f92838a : this.f92831d.f92838a, bVar2.f92838a);
            this.f92832e = bVar2;
            this.f92830c++;
            if (zO) {
                this.f92831d = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void j() {
        try {
            p0(4096, 0, 0, 0);
            this.f92830c = 0;
            b bVar = b.f92837c;
            this.f92831d = bVar;
            this.f92832e = bVar;
            if (this.f92829b > 4096) {
                a0(4096);
            }
            this.f92829b = 4096;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void l(d dVar) {
        int iJ0 = this.f92831d.f92838a;
        for (int i11 = 0; i11 < this.f92830c; i11++) {
            b bVarC = C(iJ0);
            dVar.a(new c(this, bVarC, null), bVarC.f92839b);
            iJ0 = j0(bVarC.f92838a + 4 + bVarC.f92839b);
        }
    }

    public synchronized boolean o() {
        return this.f92830c == 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f92829b);
        sb2.append(", size=");
        sb2.append(this.f92830c);
        sb2.append(", first=");
        sb2.append(this.f92831d);
        sb2.append(", last=");
        sb2.append(this.f92832e);
        sb2.append(", element lengths=[");
        try {
            l(new a(sb2));
        } catch (IOException e11) {
            f92827g.log(Level.WARNING, "read error", (Throwable) e11);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
