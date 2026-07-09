package com.iterable.iterableapi;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f47646h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static f f47647i = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f47649b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f47648a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47650c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f47651d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f47652e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f47653f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Application.ActivityLifecycleCallbacks f47654g = new b();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f47651d = false;
            for (WeakReference weakReference : f.this.f47652e) {
                if (weakReference.get() != null) {
                    ((c) weakReference.get()).a();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface c {
        void a();

        void d();
    }

    static /* synthetic */ int g(f fVar) {
        int i11 = fVar.f47650c;
        fVar.f47650c = i11 + 1;
        return i11;
    }

    static /* synthetic */ int h(f fVar) {
        int i11 = fVar.f47650c;
        fVar.f47650c = i11 - 1;
        return i11;
    }

    public static f l() {
        return f47647i;
    }

    public void j(c cVar) {
        Iterator it = this.f47652e.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == cVar) {
                return;
            }
        }
        this.f47652e.add(new WeakReference(cVar));
    }

    public Activity k() {
        WeakReference weakReference = this.f47649b;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public boolean m() {
        return k() != null;
    }

    public void n(Context context) {
        if (f47646h) {
            return;
        }
        f47646h = true;
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.f47654g);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (f.this.k() == activity) {
                f.this.f47649b = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            f.this.f47649b = new WeakReference(activity);
            if (!f.this.f47651d || es.a.a(activity.getPackageManager())) {
                f.this.f47651d = true;
                for (WeakReference weakReference : f.this.f47652e) {
                    if (weakReference.get() != null) {
                        ((c) weakReference.get()).d();
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            f.this.f47648a.removeCallbacks(f.this.f47653f);
            f.g(f.this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (f.this.f47650c > 0) {
                f.h(f.this);
            }
            if (f.this.f47650c == 0 && f.this.f47651d) {
                f.this.f47648a.postDelayed(f.this.f47653f, 1000L);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
