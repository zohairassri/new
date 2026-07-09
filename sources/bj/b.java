package bj;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import io.agora.base.internal.video.FactorBitrateAdjuster;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14608a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14609b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScaleGestureDetector f14610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VelocityTracker f14611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f14613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f14614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f14615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f14616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f14617j;

    b(Context context, c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f14616i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f14615h = viewConfiguration.getScaledTouchSlop();
        this.f14617j = cVar;
        this.f14610c = new ScaleGestureDetector(context, new a());
    }

    private float b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f14609b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    private float c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f14609b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    private boolean g(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f14608a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f14611d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f14613f = b(motionEvent);
            this.f14614g = c(motionEvent);
            this.f14612e = false;
        } else if (action == 1) {
            this.f14608a = -1;
            if (this.f14612e && this.f14611d != null) {
                this.f14613f = b(motionEvent);
                this.f14614g = c(motionEvent);
                this.f14611d.addMovement(motionEvent);
                this.f14611d.computeCurrentVelocity(FactorBitrateAdjuster.FACTOR_BASE);
                float xVelocity = this.f14611d.getXVelocity();
                float yVelocity = this.f14611d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f14616i) {
                    this.f14617j.c(this.f14613f, this.f14614g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f14611d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f14611d = null;
            }
        } else if (action == 2) {
            float fB = b(motionEvent);
            float fC = c(motionEvent);
            float f11 = fB - this.f14613f;
            float f12 = fC - this.f14614g;
            if (!this.f14612e) {
                this.f14612e = Math.sqrt((double) ((f11 * f11) + (f12 * f12))) >= ((double) this.f14615h);
            }
            if (this.f14612e) {
                this.f14617j.a(f11, f12);
                this.f14613f = fB;
                this.f14614g = fC;
                VelocityTracker velocityTracker2 = this.f14611d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f14608a = -1;
            VelocityTracker velocityTracker3 = this.f14611d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f14611d = null;
            }
        } else if (action == 6) {
            int iB = l.b(motionEvent.getAction());
            if (motionEvent.getPointerId(iB) == this.f14608a) {
                int i11 = iB == 0 ? 1 : 0;
                this.f14608a = motionEvent.getPointerId(i11);
                this.f14613f = motionEvent.getX(i11);
                this.f14614g = motionEvent.getY(i11);
            }
        }
        int i12 = this.f14608a;
        this.f14609b = motionEvent.findPointerIndex(i12 != -1 ? i12 : 0);
        return true;
    }

    public boolean d() {
        return this.f14612e;
    }

    public boolean e() {
        return this.f14610c.isInProgress();
    }

    public boolean f(MotionEvent motionEvent) {
        try {
            this.f14610c.onTouchEvent(motionEvent);
            return g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements ScaleGestureDetector.OnScaleGestureListener {
        a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            b.this.f14617j.b(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }
}
