package te;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f129881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f129882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f129883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f129884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f129885e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void b();

        void c();

        void d();

        void onStarted();
    }

    public b(a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f129881a = callback;
        this.f129882b = new AtomicInteger(0);
        this.f129883c = new AtomicInteger(0);
        this.f129884d = new AtomicBoolean(true);
        this.f129885e = new AtomicBoolean(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f129882b.decrementAndGet() != 0 || this.f129884d.getAndSet(true)) {
            return;
        }
        this.f129881a.d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f129882b.incrementAndGet() == 1 && this.f129884d.getAndSet(false)) {
            this.f129881a.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f129883c.incrementAndGet() == 1 && this.f129885e.getAndSet(false)) {
            this.f129881a.onStarted();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f129883c.decrementAndGet() == 0 && this.f129884d.get()) {
            this.f129881a.b();
            this.f129885e.set(true);
        }
    }
}
