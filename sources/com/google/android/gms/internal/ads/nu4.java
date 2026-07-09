package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class nu4 implements ou4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xu4 f31600a;

    @Override // com.google.android.gms.internal.ads.ou4
    public final Object b(String str) throws GeneralSecurityException {
        Iterator it = pu4.a("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f31600a.a(str, (Provider) it.next());
            } catch (Exception e11) {
                if (exc == null) {
                    exc = e11;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
