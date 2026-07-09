package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class kg implements jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f29612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f29614c;

    public kg(FileChannel fileChannel, long j11, long j12) {
        this.f29612a = fileChannel;
        this.f29613b = j11;
        this.f29614c = j12;
    }

    @Override // com.google.android.gms.internal.ads.jg
    public final long zza() {
        return this.f29614c;
    }

    @Override // com.google.android.gms.internal.ads.jg
    public final void zzb(MessageDigest[] messageDigestArr, long j11, int i11) throws IOException {
        MappedByteBuffer map = this.f29612a.map(FileChannel.MapMode.READ_ONLY, this.f29613b + j11, i11);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
