package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface a2 extends c1, d2 {
    @Override // androidx.compose.runtime.c1
    float a();

    default void l(float f11) {
        t(f11);
    }

    @Override // androidx.compose.runtime.d2
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        l(((Number) obj).floatValue());
    }

    void t(float f11);

    @Override // androidx.compose.runtime.i5
    default Float getValue() {
        return Float.valueOf(a());
    }
}
