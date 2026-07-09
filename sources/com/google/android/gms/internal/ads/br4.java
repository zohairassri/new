package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class br4 implements q84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wh4 f24102a;

    public br4(wh4 wh4Var, wg4 wg4Var) {
        this.f24102a = wh4Var;
    }

    @Override // com.google.android.gms.internal.ads.q84
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f24102a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((ar4) it.next()).f23446a.zza(bArr, bArr2);
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
