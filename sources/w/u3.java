package w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface u3 extends v3 {
    @Override // w.r3
    default long b(s sVar, s sVar2, s sVar3) {
        return ((long) (f() + c())) * 1000000;
    }

    int c();

    int f();
}
