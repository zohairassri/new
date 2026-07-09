package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f2507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f2508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f2509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f2512i = new int[2];

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = w.this.f2507d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.e();
        }
    }

    public w(View view) {
        this.f2507d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2504a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2505b = tapTimeout;
        this.f2506c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f2509f;
        if (runnable != null) {
            this.f2507d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2508e;
        if (runnable2 != null) {
            this.f2507d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        u uVar;
        View view = this.f2507d;
        m.e eVarB = b();
        if (eVarB != null && eVarB.b() && (uVar = (u) eVarB.p()) != null && uVar.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(uVar, motionEventObtainNoHistory);
            boolean zE = uVar.e(motionEventObtainNoHistory, this.f2511h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z11 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f2507d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f2511h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f2504a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r5 = r0.getParent()
            r5.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f2511h = r6
            java.lang.Runnable r6 = r5.f2508e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.w$a r6 = new androidx.appcompat.widget.w$a
            r6.<init>()
            r5.f2508e = r6
        L52:
            java.lang.Runnable r6 = r5.f2508e
            int r1 = r5.f2505b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f2509f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.w$b r6 = new androidx.appcompat.widget.w$b
            r6.<init>()
            r5.f2509f = r6
        L65:
            java.lang.Runnable r6 = r5.f2509f
            int r5 = r5.f2506c
            long r3 = (long) r5
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f11, float f12, float f13) {
        float f14 = -f13;
        return f11 >= f14 && f12 >= f14 && f11 < ((float) (view.getRight() - view.getLeft())) + f13 && f12 < ((float) (view.getBottom() - view.getTop())) + f13;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f2512i);
        motionEvent.offsetLocation(r1[0], r1[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f2512i);
        motionEvent.offsetLocation(-r1[0], -r1[1]);
        return true;
    }

    public abstract m.e b();

    protected abstract boolean c();

    protected boolean d() {
        m.e eVarB = b();
        if (eVarB == null || !eVarB.b()) {
            return true;
        }
        eVarB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f2507d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f2510g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean z12 = this.f2510g;
        if (z12) {
            z11 = f(motionEvent) || !d();
        } else {
            z11 = g(motionEvent) && c();
            if (z11) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f2507d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f2510g = z11;
        return z11 || z12;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f2510g = false;
        this.f2511h = -1;
        Runnable runnable = this.f2508e;
        if (runnable != null) {
            this.f2507d.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
