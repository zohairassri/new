package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ho0 implements t65 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f27850a;

    ho0(ByteBuffer byteBuffer) {
        this.f27850a = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.t65
    public final ByteBuffer i(long j11, long j12) {
        ByteBuffer byteBuffer = this.f27850a;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j11);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit((int) j12);
        byteBuffer.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.t65
    public final int p2(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f27850a;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.t65
    public final void r(long j11) {
        this.f27850a.position((int) j11);
    }

    @Override // com.google.android.gms.internal.ads.t65
    public final long zzb() {
        return this.f27850a.limit();
    }

    @Override // com.google.android.gms.internal.ads.t65
    public final long zzc() {
        return this.f27850a.position();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
