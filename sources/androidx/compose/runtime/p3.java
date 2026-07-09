package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class p3 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3 f4701a = new p3();

    private p3() {
    }

    @Override // androidx.compose.runtime.s4
    public boolean b(Object obj, Object obj2) {
        return obj == obj2;
    }

    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}
