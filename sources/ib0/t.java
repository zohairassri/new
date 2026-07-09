package ib0;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class t extends URLStreamHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static Boolean f103599e = Boolean.FALSE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final x f103600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final URLStreamHandler f103601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f103602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f103603d;

    public t(URLStreamHandler uRLStreamHandler) {
        this(uRLStreamHandler, z.a());
    }

    private URLConnection d(URLConnection uRLConnection) {
        return this.f103600a.d() ? f(uRLConnection) : uRLConnection;
    }

    public static void e(Boolean bool) {
        f103599e = bool;
    }

    protected abstract Method a(Class cls);

    protected abstract Method b(Class cls, Class cls2);

    protected void c(URLConnection uRLConnection) {
        if (!this.f103600a.isNetworkSpanForwardingEnabled() || uRLConnection.getRequestProperties().containsKey("traceparent")) {
            return;
        }
        uRLConnection.addRequestProperty("traceparent", this.f103600a.e());
    }

    protected abstract URLConnection f(URLConnection uRLConnection);

    @Override // java.net.URLStreamHandler
    protected URLConnection openConnection(URL url) throws IOException {
        try {
            return d((URLConnection) this.f103602c.invoke(this.f103601b, url));
        } catch (Exception e11) {
            throw new IOException("An exception was thrown while attempting to open a connection", e11);
        }
    }

    t(URLStreamHandler uRLStreamHandler, x xVar) {
        this.f103601b = uRLStreamHandler;
        this.f103600a = xVar;
        try {
            this.f103602c = a(URL.class);
            this.f103603d = b(URL.class, Proxy.class);
        } catch (NoSuchMethodException e11) {
            throw new IllegalStateException("Failed to initialize EmbraceUrlStreamHandler instance.", e11);
        }
    }

    @Override // java.net.URLStreamHandler
    protected URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        try {
            return d((URLConnection) this.f103603d.invoke(this.f103601b, url, proxy));
        } catch (Exception e11) {
            throw new IOException("An exception was thrown while attempting to open a connection", e11);
        }
    }
}
