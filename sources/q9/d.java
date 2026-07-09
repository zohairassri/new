package q9;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface d extends AutoCloseable {
    void D(int i11);

    String J1(int i11);

    @Override // java.lang.AutoCloseable
    void close();

    int getColumnCount();

    String getColumnName(int i11);

    double getDouble(int i11);

    long getLong(int i11);

    void i0(int i11, String str);

    boolean isNull(int i11);

    default boolean n1(int i11) {
        return getLong(i11) != 0;
    }

    boolean r2();

    void reset();

    void u(int i11, double d11);

    void z(int i11, long j11);
}
