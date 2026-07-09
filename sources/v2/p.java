package v2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface p {
    static /* synthetic */ e2.h X(p pVar, p pVar2, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return pVar.D(pVar2, z11);
    }

    e2.h D(p pVar, boolean z11);

    p J();

    long N(long j11);

    long U(long j11);

    long b();

    boolean e();

    void e0(float[] fArr);

    void f0(p pVar, float[] fArr);

    long l(long j11);

    long o0(p pVar, long j11, boolean z11);

    p s0();

    long t0(p pVar, long j11);

    long v0(long j11);

    long z(long j11);
}
