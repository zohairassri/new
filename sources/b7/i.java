package b7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f13850h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n6.g f13852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f13853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f13854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13857g;

    public i(long j11, n6.g gVar, long j12) {
        this(j11, gVar, gVar.f117400a, Collections.EMPTY_MAP, j12, 0L, 0L);
    }

    public static long a() {
        return f13850h.getAndIncrement();
    }

    public i(long j11, n6.g gVar, Uri uri, Map map, long j12, long j13, long j14) {
        this.f13851a = j11;
        this.f13852b = gVar;
        this.f13853c = uri;
        this.f13854d = map;
        this.f13855e = j12;
        this.f13856f = j13;
        this.f13857g = j14;
    }
}
