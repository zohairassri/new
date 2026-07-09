package androidx.media3.common;

import android.os.Bundle;
import k6.n0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f8751d = n0.B0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f8752e = n0.B0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f8753f = n0.B0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f8754g = n0.B0(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f8755h = n0.B0(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f8756i = n0.B0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f8759c;

    protected PlaybackException(String str, Throwable th2, int i11, Bundle bundle, long j11) {
        super(str, th2);
        this.f8757a = i11;
        this.f8759c = bundle;
        this.f8758b = j11;
    }
}
