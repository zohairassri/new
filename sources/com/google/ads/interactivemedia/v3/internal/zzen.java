package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzen implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final List zzb = new ArrayList();

    public zzen(Application application) {
        this.zza = application;
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity.isFinishing() && activity.getClass().getSimpleName().equals("FallbackImageActivity")) {
            Iterator it = this.zzb.iterator();
            while (it.hasNext()) {
                ((zzem) it.next()).zzm();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzem) it.next()).zzk();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzem) it.next()).zzl();
        }
    }

    public final void zza(zzem zzemVar) {
        this.zzb.add(zzemVar);
    }

    public final void zzb() {
        this.zza.unregisterActivityLifecycleCallbacks(this);
        this.zzb.clear();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
