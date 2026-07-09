package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ft implements ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tt f41334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lf f41335b;

    public ft(tt ttVar, lf lfVar, int i11) {
        this.f41334a = ttVar;
        this.f41335b = lfVar;
    }

    @Override // com.google.android.gms.internal.pal.ne
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = this.f41334a.a(bArr);
        return vs.c(bArrA, this.f41335b.a(vs.c(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
