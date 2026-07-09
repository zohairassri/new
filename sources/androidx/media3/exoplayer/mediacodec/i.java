package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
interface i {
    void a();

    void e(int i11, int i12, p6.c cVar, long j11, int i13);

    void flush();

    void queueInputBuffer(int i11, int i12, int i13, long j11, int i14);

    void setParameters(Bundle bundle);

    void shutdown();

    void start();
}
