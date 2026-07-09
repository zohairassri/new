package w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface i0 extends k {
    default float b(float f11, float f12, float f13) {
        return d(e(f11, f12, f13), f11, f12, f13);
    }

    float c(long j11, float f11, float f12, float f13);

    float d(long j11, float f11, float f12, float f13);

    long e(float f11, float f12, float f13);

    @Override // w.k
    default w3 a(w2 w2Var) {
        return new w3(this);
    }
}
