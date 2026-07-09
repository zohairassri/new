package x2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(float f11, boolean z11, boolean z12) {
        return r.b((((z11 ? 1L : 0L) | (z12 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f11)) << 32));
    }

    static /* synthetic */ long b(float f11, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return a(f11, z11, z12);
    }
}
