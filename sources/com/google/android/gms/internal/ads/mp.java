package com.google.android.gms.internal.ads;

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
public final class mp implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Handler f30928r = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f30930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PowerManager f30931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final KeyguardManager f30932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f30933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zzbad f30934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference f30935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference f30936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private uo f30937i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f30938l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f30939m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f30940n = -3;

    public mp(Context context, zzbad zzbadVar) {
        Context applicationContext = context.getApplicationContext();
        this.f30929a = applicationContext;
        this.f30934f = zzbadVar;
        this.f30931c = (PowerManager) applicationContext.getSystemService("power");
        this.f30932d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.f30930b = (Application) applicationContext;
            this.f30937i = new uo((Application) applicationContext, this);
        }
        a(null);
    }

    private final void e() {
        f30928r.post(new kp(this));
    }

    private final void f(Activity activity, int i11) {
        Window window;
        if (this.f30936h == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewB = b();
        if (viewB == null || viewPeekDecorView == null || viewB.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f30939m = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r9 = this;
            java.lang.ref.WeakReference r0 = r9.f30936h
            if (r0 != 0) goto L6
            goto Lbe
        L6:
            android.view.View r0 = r9.b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L14
            r9.f30940n = r2
            r9.f30938l = r1
            return
        L14:
            int r4 = r0.getVisibility()
            r5 = 0
            if (r4 == 0) goto L1d
            r4 = 1
            goto L1e
        L1d:
            r4 = r5
        L1e:
            boolean r6 = r0.isShown()
            if (r6 != 0) goto L26
            r4 = r4 | 2
        L26:
            android.os.PowerManager r6 = r9.f30931c
            if (r6 == 0) goto L32
            boolean r6 = r6.isScreenOn()
            if (r6 != 0) goto L32
            r4 = r4 | 4
        L32:
            com.google.android.gms.internal.ads.zzbad r6 = r9.f30934f
            boolean r6 = r6.a()
            if (r6 != 0) goto L84
            android.app.KeyguardManager r6 = r9.f30932d
            if (r6 == 0) goto L82
            boolean r6 = r6.inKeyguardRestrictedInputMode()
            if (r6 == 0) goto L82
            int r6 = com.google.android.gms.internal.ads.ip.f28509b
            android.view.View r6 = r0.getRootView()
            if (r6 != 0) goto L4d
            r6 = r0
        L4d:
            android.content.Context r6 = r6.getContext()
        L51:
            boolean r7 = r6 instanceof android.content.ContextWrapper
            r8 = 0
            if (r7 == 0) goto L6a
            r7 = 10
            if (r5 >= r7) goto L6a
            boolean r7 = r6 instanceof android.app.Activity
            if (r7 == 0) goto L61
            android.app.Activity r6 = (android.app.Activity) r6
            goto L6b
        L61:
            android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
            android.content.Context r6 = r6.getBaseContext()
            int r5 = r5 + 1
            goto L51
        L6a:
            r6 = r8
        L6b:
            if (r6 != 0) goto L6e
            goto L82
        L6e:
            android.view.Window r5 = r6.getWindow()
            if (r5 != 0) goto L75
            goto L79
        L75:
            android.view.WindowManager$LayoutParams r8 = r5.getAttributes()
        L79:
            if (r8 == 0) goto L82
            int r5 = r8.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L84
        L82:
            r4 = r4 | 8
        L84:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L91
            r4 = r4 | 16
        L91:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L9e
            r4 = r4 | 32
        L9e:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.f30939m
            if (r5 == r1) goto La7
            r0 = r5
        La7:
            if (r0 == 0) goto Lab
            r4 = r4 | 64
        Lab:
            byte r0 = r9.f30938l
            if (r0 == r4) goto Lbe
            byte r0 = (byte) r4
            r9.f30938l = r0
            if (r4 != 0) goto Lb9
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lbc
        Lb9:
            long r0 = (long) r4
            long r0 = r2 - r0
        Lbc:
            r9.f30940n = r0
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mp.d():void");
    }

    private final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f30935g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f30933e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            lp lpVar = new lp(this);
            this.f30933e = lpVar;
            this.f30929a.registerReceiver(lpVar, intentFilter);
        }
        Application application = this.f30930b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f30937i);
            } catch (Exception unused) {
            }
        }
    }

    private final void i(View view) {
        try {
            WeakReference weakReference = this.f30935g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f30935g = null;
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
        BroadcastReceiver broadcastReceiver = this.f30933e;
        if (broadcastReceiver != null) {
            try {
                this.f30929a.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f30933e = null;
        }
        Application application = this.f30930b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f30937i);
            } catch (Exception unused4) {
            }
        }
    }

    final void a(View view) {
        long j11;
        View viewB = b();
        if (viewB != null) {
            viewB.removeOnAttachStateChangeListener(this);
            i(viewB);
        }
        this.f30936h = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j11 = -2;
        } else {
            j11 = -3;
        }
        this.f30940n = j11;
    }

    final View b() {
        WeakReference weakReference = this.f30936h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final long c() {
        if (this.f30940n <= -2 && b() == null) {
            this.f30940n = -3L;
        }
        return this.f30940n;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f(activity, 0);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        f(activity, 4);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        f(activity, 0);
        d();
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        f(activity, 0);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f30939m = -1;
        h(view);
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f30939m = -1;
        d();
        e();
        i(view);
    }
}
