package wk;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f135745h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f135746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ll.k f135747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f135748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f135749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f135750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f135751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f135752g;

    public l(long j11, ll.k kVar, long j12) {
        this(j11, kVar, kVar.f114572a, Collections.EMPTY_MAP, j12, 0L, 0L);
    }

    public static long a() {
        return f135745h.getAndIncrement();
    }

    public l(long j11, ll.k kVar, Uri uri, Map map, long j12, long j13, long j14) {
        this.f135746a = j11;
        this.f135747b = kVar;
        this.f135748c = uri;
        this.f135749d = map;
        this.f135750e = j12;
        this.f135751f = j13;
        this.f135752g = j14;
    }
}
