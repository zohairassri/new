package ib0;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class e extends HttpURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f103563a;

    public e(HttpURLConnection httpURLConnection, boolean z11) {
        this(httpURLConnection, new s(httpURLConnection, z11));
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f103563a.r(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f103563a.a();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f103563a.disconnect();
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f103563a.l();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f103563a.i();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f103563a.getContent();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f103563a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f103563a.getContentLength();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f103563a.t();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f103563a.getContentType();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f103563a.f();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f103563a.M();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f103563a.u();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f103563a.A();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f103563a.h();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i11) {
        return this.f103563a.O(i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j11) {
        return this.f103563a.V(str, j11);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i11) {
        return this.f103563a.G(str, i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i11) {
        return this.f103563a.C(i11);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j11) {
        return this.f103563a.y(str, j11);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f103563a.c();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f103563a.k();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f103563a.getInputStream();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f103563a.z();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f103563a.F();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f103563a.d();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f103563a.T();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f103563a.w();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f103563a.p();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f103563a.P();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f103563a.N(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f103563a.g();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f103563a.U();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f103563a.getUrl();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f103563a.j();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z11) {
        this.f103563a.s(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i11) {
        this.f103563a.Q(i11);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i11) {
        this.f103563a.o(i11);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z11) {
        this.f103563a.E(z11);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z11) {
        this.f103563a.x(z11);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z11) {
        this.f103563a.q(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i11) {
        this.f103563a.H(i11);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j11) {
        this.f103563a.n(j11);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z11) {
        this.f103563a.D(z11);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i11) {
        this.f103563a.S(i11);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f103563a.e(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f103563a.b(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z11) {
        this.f103563a.B(z11);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f103563a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f103563a.v();
    }

    e(HttpURLConnection httpURLConnection, s sVar) {
        super(httpURLConnection.getURL());
        this.f103563a = sVar;
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f103563a.m(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f103563a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j11) {
        this.f103563a.I(j11);
    }
}
