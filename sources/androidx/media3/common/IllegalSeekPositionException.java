package androidx.media3.common;

import h6.z;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class IllegalSeekPositionException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f8746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8748c;

    public IllegalSeekPositionException(z zVar, int i11, long j11) {
        this.f8746a = zVar;
        this.f8747b = i11;
        this.f8748c = j11;
    }
}
