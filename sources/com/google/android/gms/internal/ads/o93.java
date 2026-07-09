package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class o93 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f31829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f31830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n93 f31831c;

    private final boolean a() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || b();
    }

    private final void h(boolean z11) {
        if (this.f31830b != z11) {
            this.f31830b = z11;
            if (this.f31829a) {
                c(z11);
                n93 n93Var = this.f31831c;
                if (n93Var != null) {
                    n93Var.E(z11);
                }
            }
        }
    }

    protected boolean b() {
        return false;
    }

    public final void d(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void e() {
        this.f31829a = true;
        boolean zA = a();
        this.f31830b = zA;
        c(zA);
    }

    public final void f() {
        this.f31829a = false;
        this.f31831c = null;
    }

    public final void g(n93 n93Var) {
        this.f31831c = n93Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        h(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        h(a());
    }

    protected void c(boolean z11) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
