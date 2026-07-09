package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class i94 implements p74 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wh4 f28259a;

    @Override // com.google.android.gms.internal.ads.p74
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f28259a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                byte[] bArrZza = ((g94) it.next()).f26873a.zza(bArr, bArr2);
                int length = bArr.length;
                return bArrZza;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
