package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class lu4 implements ou4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xu4 f30451a;

    @Override // com.google.android.gms.internal.ads.ou4
    public final Object b(String str) {
        Iterator it = pu4.a("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.f30451a.a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.f30451a.a(str, null);
    }
}
