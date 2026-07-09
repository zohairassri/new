package k6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f107578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f107579b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileOutputStream f107580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f107581b = false;

        public a(File file) {
            this.f107580a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f107581b) {
                return;
            }
            this.f107581b = true;
            flush();
            try {
                this.f107580a.getFD().sync();
            } catch (IOException e11) {
                s.j("AtomicFile", "Failed to sync file descriptor:", e11);
            }
            this.f107580a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f107580a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i11) throws IOException {
            this.f107580a.write(i11);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f107580a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) throws IOException {
            this.f107580a.write(bArr, i11, i12);
        }
    }

    public b(File file) {
        this.f107578a = file;
        this.f107579b = new File(file.getPath() + ".bak");
    }

    private void e() {
        if (this.f107579b.exists()) {
            this.f107578a.delete();
            this.f107579b.renameTo(this.f107578a);
        }
    }

    public void a() {
        this.f107578a.delete();
        this.f107579b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f107579b.delete();
    }

    public boolean c() {
        return this.f107578a.exists() || this.f107579b.exists();
    }

    public InputStream d() {
        e();
        return new FileInputStream(this.f107578a);
    }

    public OutputStream f() throws IOException {
        if (this.f107578a.exists()) {
            if (this.f107579b.exists()) {
                this.f107578a.delete();
            } else if (!this.f107578a.renameTo(this.f107579b)) {
                s.i("AtomicFile", "Couldn't rename file " + this.f107578a + " to backup file " + this.f107579b);
            }
        }
        try {
            return new a(this.f107578a);
        } catch (FileNotFoundException e11) {
            File parentFile = this.f107578a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f107578a, e11);
            }
            try {
                return new a(this.f107578a);
            } catch (FileNotFoundException e12) {
                throw new IOException("Couldn't create " + this.f107578a, e12);
            }
        }
    }
}
