package ib0;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class i extends HttpsURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f103565a;

    public i(HttpsURLConnection httpsURLConnection, boolean z11) {
        this(httpsURLConnection, new s(httpsURLConnection, z11));
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f103565a.r(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f103565a.a();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f103565a.disconnect();
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f103565a.l();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f103565a.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f103565a.i();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f103565a.getContent();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f103565a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f103565a.getContentLength();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f103565a.t();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f103565a.getContentType();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f103565a.f();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f103565a.M();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f103565a.u();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f103565a.A();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f103565a.h();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i11) {
        return this.f103565a.O(i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j11) {
        return this.f103565a.V(str, j11);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i11) {
        return this.f103565a.G(str, i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i11) {
        return this.f103565a.C(i11);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j11) {
        return this.f103565a.y(str, j11);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f103565a.c();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f103565a.J();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f103565a.k();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f103565a.getInputStream();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f103565a.z();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f103565a.F();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f103565a.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f103565a.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f103565a.d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() {
        return this.f103565a.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f103565a.T();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f103565a.w();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f103565a.p();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f103565a.P();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f103565a.N(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f103565a.g();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f103565a.U();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f103565a.W();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() {
        return this.f103565a.L();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f103565a.getUrl();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f103565a.j();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z11) {
        this.f103565a.s(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i11) {
        this.f103565a.Q(i11);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i11) {
        this.f103565a.o(i11);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z11) {
        this.f103565a.E(z11);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z11) {
        this.f103565a.x(z11);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z11) {
        this.f103565a.q(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i11) {
        this.f103565a.H(i11);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f103565a.K(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j11) {
        this.f103565a.n(j11);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z11) {
        this.f103565a.D(z11);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i11) {
        this.f103565a.S(i11);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f103565a.e(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f103565a.b(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f103565a.R(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z11) {
        this.f103565a.B(z11);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f103565a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f103565a.v();
    }

    i(HttpsURLConnection httpsURLConnection, s sVar) {
        super(httpsURLConnection.getURL());
        this.f103565a = sVar;
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f103565a.m(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f103565a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j11) {
        this.f103565a.I(j11);
    }
}
