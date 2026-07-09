package w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface r3 {
    boolean a();

    long b(s sVar, s sVar2, s sVar3);

    s d(long j11, s sVar, s sVar2, s sVar3);

    s e(long j11, s sVar, s sVar2, s sVar3);

    default s g(s sVar, s sVar2, s sVar3) {
        return e(b(sVar, sVar2, sVar3), sVar, sVar2, sVar3);
    }
}
