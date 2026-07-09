package ib0;

import java.lang.reflect.Method;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class j extends t {
    public j(URLStreamHandler uRLStreamHandler) {
        super(uRLStreamHandler);
    }

    @Override // ib0.t
    protected Method a(Class cls) throws NoSuchMethodException {
        Method declaredMethod = this.f103601b.getClass().getSuperclass().getDeclaredMethod("openConnection", cls);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // ib0.t
    protected Method b(Class cls, Class cls2) throws NoSuchMethodException {
        Method declaredMethod = this.f103601b.getClass().getSuperclass().getDeclaredMethod("openConnection", cls, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // ib0.t
    protected URLConnection f(URLConnection uRLConnection) {
        if (!(uRLConnection instanceof HttpsURLConnection)) {
            return uRLConnection;
        }
        c(uRLConnection);
        if (!t.f103599e.booleanValue() || uRLConnection.getRequestProperties().containsKey("Accept-Encoding")) {
            return new i((HttpsURLConnection) uRLConnection, false);
        }
        uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
        return new i((HttpsURLConnection) uRLConnection, true);
    }

    @Override // java.net.URLStreamHandler
    public int getDefaultPort() {
        return 443;
    }
}
