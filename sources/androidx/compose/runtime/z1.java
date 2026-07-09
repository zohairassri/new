package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface z1 extends i5, d2 {
    default void m(double d11) {
        n(d11);
    }

    void n(double d11);

    @Override // androidx.compose.runtime.d2
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        m(((Number) obj).doubleValue());
    }

    double u();

    @Override // androidx.compose.runtime.i5
    default Double getValue() {
        return Double.valueOf(u());
    }
}
