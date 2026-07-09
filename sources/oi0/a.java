package oi0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public final String b(Object obj) {
        try {
            return c(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName() + ".errorRendering";
        } catch (Throwable th2) {
            hi0.a.d(th2);
            return obj.getClass().getName() + ".errorRendering";
        }
    }

    protected String c(Object obj) {
        return null;
    }

    public void a(Throwable th2) {
    }
}
