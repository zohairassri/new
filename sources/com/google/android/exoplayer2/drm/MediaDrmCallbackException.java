package com.google.android.exoplayer2.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll.k f20452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f20453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f20454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20455d;

    public MediaDrmCallbackException(ll.k kVar, Uri uri, Map map, long j11, Throwable th2) {
        super(th2);
        this.f20452a = kVar;
        this.f20453b = uri;
        this.f20454c = map;
        this.f20455d = j11;
    }
}
