package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ig implements jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f28383a;

    public ig(ByteBuffer byteBuffer) {
        this.f28383a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.jg
    public final long zza() {
        return this.f28383a.capacity();
    }

    @Override // com.google.android.gms.internal.ads.jg
    public final void zzb(MessageDigest[] messageDigestArr, long j11, int i11) {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer = this.f28383a;
        synchronized (byteBuffer) {
            int i12 = (int) j11;
            byteBuffer.position(i12);
            byteBuffer.limit(i12 + i11);
            byteBufferSlice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
