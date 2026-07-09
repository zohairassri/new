package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ng extends og {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f31371b;

    public ng(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f31371b = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f31371b;
    }
}
