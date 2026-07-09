package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class r implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f10036a;

    public r(MediaCodec mediaCodec) {
        this.f10036a = mediaCodec;
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void e(int i11, int i12, p6.c cVar, long j11, int i13) {
        this.f10036a.queueSecureInputBuffer(i11, i12, cVar.a(), j11, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void queueInputBuffer(int i11, int i12, int i13, long j11, int i14) {
        this.f10036a.queueInputBuffer(i11, i12, i13, j11, i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void setParameters(Bundle bundle) {
        this.f10036a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void a() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void flush() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void shutdown() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void start() {
    }
}
