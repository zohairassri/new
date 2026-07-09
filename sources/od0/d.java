package od0;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface d extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        a a(c cVar);

        b start();
    }

    c Q(qd0.a aVar, Object obj);

    void W(c cVar, qd0.a aVar, Object obj);

    a X(String str);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
