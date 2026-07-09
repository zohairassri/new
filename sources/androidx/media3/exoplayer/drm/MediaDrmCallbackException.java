package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n6.g f9595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f9596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f9597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9598d;

    public MediaDrmCallbackException(n6.g gVar, Uri uri, Map map, long j11, Throwable th2) {
        super(th2);
        this.f9595a = gVar;
        this.f9596b = uri;
        this.f9597c = map;
        this.f9598d = j11;
    }
}
