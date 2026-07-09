package ib0;

import java.security.cert.Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
interface h extends d {
    HostnameVerifier J();

    void K(HostnameVerifier hostnameVerifier);

    Certificate[] L();

    void R(SSLSocketFactory sSLSocketFactory);

    SSLSocketFactory W();

    String getCipherSuite();

    Certificate[] getLocalCertificates();
}
