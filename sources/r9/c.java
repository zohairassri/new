package r9;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface c extends Closeable {
    Cursor E1(String str);

    void F();

    List I();

    void L(String str);

    boolean S1();

    String b();

    g e1(String str);

    boolean g2();

    boolean isOpen();

    default void j1() {
        F();
    }

    void l0();

    void m0(String str, Object[] objArr);

    void n0();

    Cursor r1(f fVar, CancellationSignal cancellationSignal);

    Cursor s1(f fVar);

    int u1(String str, int i11, ContentValues contentValues, String str2, Object[] objArr);

    void w0();
}
