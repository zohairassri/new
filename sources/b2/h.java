package b2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final long a(b bVar) {
        float x11 = bVar.a().getX();
        float y11 = bVar.a().getY();
        return e2.f.e((((long) Float.floatToRawIntBits(x11)) << 32) | (((long) Float.floatToRawIntBits(y11)) & 4294967295L));
    }
}
