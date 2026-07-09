package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class uf4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final uf4 f36074d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final BigInteger f36075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final BigInteger f36076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final BigInteger f36077c;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        f36074d = new uf4(bigInteger, bigInteger, BigInteger.ZERO);
    }

    uf4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f36075a = bigInteger;
        this.f36076b = bigInteger2;
        this.f36077c = bigInteger3;
    }

    final boolean a() {
        return this.f36077c.equals(BigInteger.ZERO);
    }
}
