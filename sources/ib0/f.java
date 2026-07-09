package ib0;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class f implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f103564a;

    f(HttpURLConnection httpURLConnection) {
        this.f103564a = httpURLConnection;
    }

    @Override // ib0.v
    public String a(String str) {
        try {
            return new URL(this.f103564a.getURL().getProtocol(), this.f103564a.getURL().getHost(), this.f103564a.getURL().getPort(), str + "?" + this.f103564a.getURL().getQuery()).toString();
        } catch (MalformedURLException unused) {
            return this.f103564a.getURL().toString();
        }
    }

    @Override // ib0.v
    public String b() {
        return this.f103564a.getURL().toString();
    }

    @Override // ib0.v
    public String c(String str) {
        return this.f103564a.getRequestProperty(str);
    }
}
