package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface c2 extends s1, d2 {
    @Override // androidx.compose.runtime.s1
    long b();

    default void j(long j11) {
        z(j11);
    }

    @Override // androidx.compose.runtime.d2
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        j(((Number) obj).longValue());
    }

    void z(long j11);

    @Override // androidx.compose.runtime.i5
    default Long getValue() {
        return Long.valueOf(b());
    }
}
