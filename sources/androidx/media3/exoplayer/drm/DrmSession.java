package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.h;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface DrmSession {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class DrmSessionException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9594a;

        public DrmSessionException(Throwable th2, int i11) {
            super(th2);
            this.f9594a = i11;
        }
    }

    static void f(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.g(null);
        }
        if (drmSession != null) {
            drmSession.h(null);
        }
    }

    UUID a();

    boolean b();

    p6.b c();

    Map d();

    boolean e(String str);

    void g(h.a aVar);

    DrmSessionException getError();

    int getState();

    void h(h.a aVar);
}
