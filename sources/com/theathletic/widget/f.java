package com.theathletic.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import io.agora.base.internal.video.FactorBitrateAdjuster;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class f implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f87031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f87032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f87033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f87034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f87035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f87036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f87037g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f87038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f87039i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f87040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f87041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f87042n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private VelocityTracker f87043r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f87044s;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f87046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f87047b;

        b(ViewGroup.LayoutParams layoutParams, int i11) {
            this.f87046a = layoutParams;
            this.f87047b = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f87036f.a(f.this.f87035e, f.this.f87042n);
            f.this.f87035e.setAlpha(1.0f);
            f.this.f87035e.setTranslationX(0.0f);
            this.f87046a.height = this.f87047b;
            f.this.f87035e.setLayoutParams(this.f87046a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface c {
        void a(View view, Object obj);

        boolean b(Object obj);

        void c(View view, Object obj);
    }

    public f(View view, Object obj, c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f87031a = viewConfiguration.getScaledTouchSlop();
        this.f87032b = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f87033c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f87034d = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.f87035e = view;
        this.f87042n = obj;
        this.f87036f = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(ViewGroup.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f87035e.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        final ViewGroup.LayoutParams layoutParams = this.f87035e.getLayoutParams();
        int height = this.f87035e.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.f87034d);
        duration.addListener(new b(layoutParams, height));
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.theathletic.widget.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f87029a.f(layoutParams, valueAnimator);
            }
        });
        duration.start();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        motionEvent.offsetLocation(this.f87044s, 0.0f);
        if (this.f87037g < 2) {
            this.f87037g = this.f87035e.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f87038h = motionEvent.getRawX();
            this.f87039i = motionEvent.getRawY();
            if (this.f87036f.b(this.f87042n)) {
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.f87043r = velocityTrackerObtain;
                velocityTrackerObtain.addMovement(motionEvent);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker = this.f87043r;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.f87038h;
                    float rawY = motionEvent.getRawY() - this.f87039i;
                    if (Math.abs(rawX) > this.f87031a && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                        this.f87040l = true;
                        this.f87041m = rawX > 0.0f ? this.f87031a : -this.f87031a;
                        this.f87035e.getParent().requestDisallowInterceptTouchEvent(true);
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3 | (motionEvent.getActionIndex() << 8));
                        this.f87035e.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (this.f87040l) {
                        this.f87044s = rawX;
                        this.f87035e.setTranslationX(rawX - this.f87041m);
                        this.f87035e.setAlpha(Math.max(0.0f, Math.min(1.0f, 1.0f - ((Math.abs(rawX) * 2.0f) / this.f87037g))));
                        return true;
                    }
                }
            } else if (actionMasked == 3 && this.f87043r != null) {
                this.f87035e.animate().translationX(0.0f).alpha(1.0f).setDuration(this.f87034d).setListener(null);
                VelocityTracker velocityTracker2 = this.f87043r;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                }
                this.f87043r = null;
                this.f87044s = 0.0f;
                this.f87038h = 0.0f;
                this.f87039i = 0.0f;
                this.f87040l = false;
            }
        } else if (this.f87043r == null) {
            view.performClick();
        } else {
            float rawX2 = motionEvent.getRawX() - this.f87038h;
            this.f87043r.addMovement(motionEvent);
            this.f87043r.computeCurrentVelocity(FactorBitrateAdjuster.FACTOR_BASE);
            float xVelocity = this.f87043r.getXVelocity();
            float fAbs = Math.abs(xVelocity);
            float fAbs2 = Math.abs(this.f87043r.getYVelocity());
            if (Math.abs(rawX2) > this.f87037g / 2 && this.f87040l) {
                z11 = rawX2 > 0.0f;
            } else if (this.f87032b > fAbs || fAbs > this.f87033c || fAbs2 >= fAbs || fAbs2 >= fAbs || !this.f87040l) {
                z11 = false;
                z = false;
            } else {
                z = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1)) < 0);
                z11 = this.f87043r.getXVelocity() > 0.0f;
            }
            if (z) {
                this.f87036f.c(this.f87035e, this.f87042n);
                this.f87035e.animate().translationX(z11 ? this.f87037g : -this.f87037g).alpha(0.0f).setDuration(this.f87034d).setListener(new a());
            } else if (this.f87040l) {
                this.f87035e.animate().translationX(0.0f).alpha(1.0f).setDuration(this.f87034d).setListener(null);
            } else {
                view.performClick();
            }
            VelocityTracker velocityTracker3 = this.f87043r;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
            }
            this.f87043r = null;
            this.f87044s = 0.0f;
            this.f87038h = 0.0f;
            this.f87039i = 0.0f;
            this.f87040l = false;
        }
        return false;
    }
}
