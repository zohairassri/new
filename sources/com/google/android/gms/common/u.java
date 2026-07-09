package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class u extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f22902b;

    u(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f22902b = bArr;
    }

    @Override // com.google.android.gms.common.t
    final byte[] I0() {
        return this.f22902b;
    }
}
