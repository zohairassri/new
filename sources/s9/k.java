package s9;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class k implements r9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteProgram f126124a;

    public k(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f126124a = delegate;
    }

    @Override // r9.e
    public void D(int i11) {
        this.f126124a.bindNull(i11);
    }

    @Override // r9.e
    public void Z0(int i11, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f126124a.bindString(i11, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f126124a.close();
    }

    @Override // r9.e
    public void u(int i11, double d11) {
        this.f126124a.bindDouble(i11, d11);
    }

    @Override // r9.e
    public void y1(int i11, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f126124a.bindBlob(i11, value);
    }

    @Override // r9.e
    public void z(int i11, long j11) {
        this.f126124a.bindLong(i11, j11);
    }
}
