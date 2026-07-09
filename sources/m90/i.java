package m90;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ja0.a f115982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f115983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f115984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile long f115985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f115986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f115987f;

    public i(ja0.a clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f115982a = clock;
        this.f115983b = new AtomicBoolean(false);
        this.f115984c = clock.a();
        this.f115985d = clock.a();
    }

    public final boolean a() {
        return this.f115987f;
    }

    public final long b() {
        return this.f115985d;
    }

    public final long c() {
        return this.f115984c;
    }

    public final void d() {
        this.f115987f = false;
        this.f115984c = this.f115982a.a();
        this.f115985d = this.f115982a.a();
        this.f115986e = 0L;
    }

    public final void e(boolean z11) {
        this.f115987f = z11;
    }

    public final void f(long j11) {
        this.f115985d = j11;
    }

    public final void g(long j11) {
        this.f115986e = j11;
    }

    public final void h(long j11) {
        this.f115984c = j11;
    }
}
