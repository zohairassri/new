package com.google.android.gms.internal.pal;

import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class xt implements lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jm f42216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42217b;

    public xt(jm jmVar, int i11) throws InvalidAlgorithmParameterException {
        this.f42216a = jmVar;
        this.f42217b = i11;
        if (i11 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        jmVar.a(new byte[0], i11);
    }

    @Override // com.google.android.gms.internal.pal.lf
    public final byte[] a(byte[] bArr) {
        return this.f42216a.a(bArr, this.f42217b);
    }
}
