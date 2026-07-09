package androidx.fragment.app;

import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class p0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f8349b = new StringBuilder(128);

    p0(String str) {
        this.f8348a = str;
    }

    private void a() {
        if (this.f8349b.length() > 0) {
            this.f8349b.toString();
            StringBuilder sb2 = this.f8349b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            char c11 = cArr[i11 + i13];
            if (c11 == '\n') {
                a();
            } else {
                this.f8349b.append(c11);
            }
        }
    }
}
