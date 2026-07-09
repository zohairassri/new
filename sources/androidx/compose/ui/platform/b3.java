package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface b3 {
    long a();

    long b();

    long c();

    default float d() {
        return 2.0f;
    }

    default long e() {
        float f11 = 48;
        return z3.i.b(z3.h.h(f11), z3.h.h(f11));
    }

    default float f() {
        return Float.MAX_VALUE;
    }

    float g();

    default float h() {
        return 16.0f;
    }
}
