package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class m8 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Handler f41553r = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f41554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f41555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PowerManager f41556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final KeyguardManager f41557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f41558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zzdo f41559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference f41560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference f41561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private x7 f41562i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f41563l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f41564m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f41565n = -3;

    public m8(Context context, zzdo zzdoVar) {
        Context applicationContext = context.getApplicationContext();
        this.f41554a = applicationContext;
        this.f41559f = zzdoVar;
        this.f41556c = (PowerManager) applicationContext.getSystemService("power");
        this.f41557d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f41555b = application;
            this.f41562i = new x7(application, this);
        }
        d(null);
    }

    private final void e(Activity activity, int i11) {
        Window window;
        if (this.f41561h == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewB = b();
        if (viewB == null || viewPeekDecorView == null || viewB.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f41564m = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.f41561h
            if (r0 != 0) goto L6
            goto L9b
        L6:
            android.view.View r0 = r7.b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L14
            r7.f41565n = r2
            r7.f41563l = r1
            return
        L14:
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            boolean r5 = r0.isShown()
            if (r5 != 0) goto L25
            r4 = r4 | 2
        L25:
            android.os.PowerManager r5 = r7.f41556c
            if (r5 == 0) goto L31
            boolean r5 = r5.isScreenOn()
            if (r5 != 0) goto L31
            r4 = r4 | 4
        L31:
            com.google.android.gms.internal.pal.zzdo r5 = r7.f41559f
            boolean r5 = r5.a()
            if (r5 != 0) goto L61
            android.app.KeyguardManager r5 = r7.f41557d
            if (r5 == 0) goto L5f
            boolean r5 = r5.inKeyguardRestrictedInputMode()
            if (r5 == 0) goto L5f
            android.app.Activity r5 = com.google.android.gms.internal.pal.h8.b(r0)
            if (r5 != 0) goto L4a
            goto L5f
        L4a:
            android.view.Window r5 = r5.getWindow()
            if (r5 != 0) goto L52
            r5 = 0
            goto L56
        L52:
            android.view.WindowManager$LayoutParams r5 = r5.getAttributes()
        L56:
            if (r5 == 0) goto L5f
            int r5 = r5.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L61
        L5f:
            r4 = r4 | 8
        L61:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L6e
            r4 = r4 | 16
        L6e:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L7b
            r4 = r4 | 32
        L7b:
            int r0 = r0.getWindowVisibility()
            int r5 = r7.f41564m
            if (r5 == r1) goto L84
            r0 = r5
        L84:
            if (r0 == 0) goto L88
            r4 = r4 | 64
        L88:
            byte r0 = r7.f41563l
            if (r0 == r4) goto L9b
            byte r0 = (byte) r4
            r7.f41563l = r0
            if (r4 != 0) goto L96
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L99
        L96:
            long r0 = (long) r4
            long r0 = r2 - r0
        L99:
            r7.f41565n = r0
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.m8.f():void");
    }

    private final void g() {
        f41553r.post(new j8(this));
    }

    private final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f41560g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f41558e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            l8 l8Var = new l8(this);
            this.f41558e = l8Var;
            this.f41554a.registerReceiver(l8Var, intentFilter);
        }
        Application application = this.f41555b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f41562i);
            } catch (Exception unused) {
            }
        }
    }

    private final void i(View view) {
        try {
            WeakReference weakReference = this.f41560g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f41560g = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f41558e;
        if (broadcastReceiver != null) {
            try {
                this.f41554a.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f41558e = null;
        }
        Application application = this.f41555b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f41562i);
            } catch (Exception unused4) {
            }
        }
    }

    public final long a() {
        if (this.f41565n <= -2 && b() == null) {
            this.f41565n = -3L;
        }
        return this.f41565n;
    }

    final View b() {
        WeakReference weakReference = this.f41561h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    final void d(View view) {
        long j11;
        View viewB = b();
        if (viewB != null) {
            viewB.removeOnAttachStateChangeListener(this);
            i(viewB);
        }
        this.f41561h = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j11 = -2;
        } else {
            j11 = -3;
        }
        this.f41565n = j11;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        e(activity, 4);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e(activity, 0);
        f();
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f41564m = -1;
        h(view);
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f41564m = -1;
        f();
        g();
        i(view);
    }
}
