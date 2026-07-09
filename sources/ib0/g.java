package ib0;

import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class g extends t {
    public g(URLStreamHandler uRLStreamHandler) {
        super(uRLStreamHandler);
    }

    @Override // ib0.t
    protected Method a(Class cls) throws NoSuchMethodException {
        Method declaredMethod = this.f103601b.getClass().getDeclaredMethod("openConnection", cls);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // ib0.t
    protected Method b(Class cls, Class cls2) throws NoSuchMethodException {
        Method declaredMethod = this.f103601b.getClass().getDeclaredMethod("openConnection", cls, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // ib0.t
    protected URLConnection f(URLConnection uRLConnection) {
        if (!(uRLConnection instanceof HttpURLConnection)) {
            return uRLConnection;
        }
        c(uRLConnection);
        if (!t.f103599e.booleanValue() || uRLConnection.getRequestProperties().containsKey("Accept-Encoding")) {
            return new e((HttpURLConnection) uRLConnection, false);
        }
        uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
        return new e((HttpURLConnection) uRLConnection, true);
    }

    @Override // java.net.URLStreamHandler
    public int getDefaultPort() {
        return 80;
    }
}
