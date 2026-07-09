package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class lj implements cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eu f41540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eu f41541b;

    private lj(byte[] bArr, byte[] bArr2) {
        this.f41540a = eu.b(bArr);
        this.f41541b = eu.b(bArr2);
    }

    static lj a(byte[] bArr, byte[] bArr2, int i11) throws GeneralSecurityException {
        et.e(et.j(et.k(i11), 1, bArr2), et.h(i11, bArr));
        return new lj(bArr, bArr2);
    }
}
