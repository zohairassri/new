package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import x4.r0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f7422y = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f7425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f7426d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7430h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f7434n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f7435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f7436s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f7437v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f7438w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f7439x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0127a f7423a = new C0127a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Interpolator f7424b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f7427e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f7428f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f7431i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f7432l = {0.0f, 0.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float[] f7433m = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class C0127a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f7442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f7443d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f7449j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f7450k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f7444e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f7448i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f7445f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f7446g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f7447h = 0;

        C0127a() {
        }

        private float e(long j11) {
            if (j11 < this.f7444e) {
                return 0.0f;
            }
            long j12 = this.f7448i;
            if (j12 < 0 || j11 < j12) {
                return a.e((j11 - r0) / this.f7440a, 0.0f, 1.0f) * 0.5f;
            }
            float f11 = this.f7449j;
            return (1.0f - f11) + (f11 * a.e((j11 - j12) / this.f7450k, 0.0f, 1.0f));
        }

        private float g(float f11) {
            return ((-4.0f) * f11 * f11) + (f11 * 4.0f);
        }

        public void a() {
            if (this.f7445f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j11 = jCurrentAnimationTimeMillis - this.f7445f;
            this.f7445f = jCurrentAnimationTimeMillis;
            float f11 = j11 * fG;
            this.f7446g = (int) (this.f7442c * f11);
            this.f7447h = (int) (f11 * this.f7443d);
        }

        public int b() {
            return this.f7446g;
        }

        public int c() {
            return this.f7447h;
        }

        public int d() {
            float f11 = this.f7442c;
            return (int) (f11 / Math.abs(f11));
        }

        public int f() {
            float f11 = this.f7443d;
            return (int) (f11 / Math.abs(f11));
        }

        public boolean h() {
            return this.f7448i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f7448i + ((long) this.f7450k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f7450k = a.f((int) (jCurrentAnimationTimeMillis - this.f7444e), 0, this.f7441b);
            this.f7449j = e(jCurrentAnimationTimeMillis);
            this.f7448i = jCurrentAnimationTimeMillis;
        }

        public void j(int i11) {
            this.f7441b = i11;
        }

        public void k(int i11) {
            this.f7440a = i11;
        }

        public void l(float f11, float f12) {
            this.f7442c = f11;
            this.f7443d = f12;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f7444e = jCurrentAnimationTimeMillis;
            this.f7448i = -1L;
            this.f7445f = jCurrentAnimationTimeMillis;
            this.f7449j = 0.5f;
            this.f7446g = 0;
            this.f7447h = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f7437v) {
                if (aVar.f7435r) {
                    aVar.f7435r = false;
                    aVar.f7423a.m();
                }
                C0127a c0127a = a.this.f7423a;
                if (c0127a.h() || !a.this.u()) {
                    a.this.f7437v = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f7436s) {
                    aVar2.f7436s = false;
                    aVar2.c();
                }
                c0127a.a();
                a.this.j(c0127a.b(), c0127a.c());
                r0.d0(a.this.f7425c, this);
            }
        }
    }

    public a(View view) {
        this.f7425c = view;
        float f11 = Resources.getSystem().getDisplayMetrics().density;
        float f12 = (int) ((1575.0f * f11) + 0.5f);
        o(f12, f12);
        float f13 = (int) ((f11 * 315.0f) + 0.5f);
        p(f13, f13);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f7422y);
        r(500);
        q(500);
    }

    private float d(int i11, float f11, float f12, float f13) {
        float fH = h(this.f7427e[i11], f12, this.f7428f[i11], f11);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f14 = this.f7431i[i11];
        float f15 = this.f7432l[i11];
        float f16 = this.f7433m[i11];
        float f17 = f14 * f13;
        return fH > 0.0f ? e(fH * f17, f15, f16) : -e((-fH) * f17, f15, f16);
    }

    static float e(float f11, float f12, float f13) {
        return f11 > f13 ? f13 : f11 < f12 ? f12 : f11;
    }

    static int f(int i11, int i12, int i13) {
        return i11 > i13 ? i13 : i11 < i12 ? i12 : i11;
    }

    private float g(float f11, float f12) {
        if (f12 == 0.0f) {
            return 0.0f;
        }
        int i11 = this.f7429g;
        if (i11 == 0 || i11 == 1) {
            if (f11 < f12) {
                if (f11 >= 0.0f) {
                    return 1.0f - (f11 / f12);
                }
                if (this.f7437v && i11 == 1) {
                    return 1.0f;
                }
            }
        } else if (i11 == 2 && f11 < 0.0f) {
            return f11 / (-f12);
        }
        return 0.0f;
    }

    private float h(float f11, float f12, float f13, float f14) {
        float interpolation;
        float fE = e(f11 * f12, 0.0f, f13);
        float fG = g(f12 - f14, fE) - g(f14, fE);
        if (fG < 0.0f) {
            interpolation = -this.f7424b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f7424b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f7435r) {
            this.f7437v = false;
        } else {
            this.f7423a.i();
        }
    }

    private void v() {
        int i11;
        if (this.f7426d == null) {
            this.f7426d = new b();
        }
        this.f7437v = true;
        this.f7435r = true;
        if (this.f7434n || (i11 = this.f7430h) <= 0) {
            this.f7426d.run();
        } else {
            r0.e0(this.f7425c, this.f7426d, i11);
        }
        this.f7434n = true;
    }

    public abstract boolean a(int i11);

    public abstract boolean b(int i11);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f7425c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i11, int i12);

    public a k(int i11) {
        this.f7430h = i11;
        return this;
    }

    public a l(int i11) {
        this.f7429g = i11;
        return this;
    }

    public a m(boolean z11) {
        if (this.f7438w && !z11) {
            i();
        }
        this.f7438w = z11;
        return this;
    }

    public a n(float f11, float f12) {
        float[] fArr = this.f7428f;
        fArr[0] = f11;
        fArr[1] = f12;
        return this;
    }

    public a o(float f11, float f12) {
        float[] fArr = this.f7433m;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f7438w
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f7436s = r2
            r5.f7434n = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f7425c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f7425c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f7423a
            r7.l(r0, r6)
            boolean r6 = r5.f7437v
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f7439x
            if (r6 == 0) goto L61
            boolean r5 = r5.f7437v
            if (r5 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f11, float f12) {
        float[] fArr = this.f7432l;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    public a q(int i11) {
        this.f7423a.j(i11);
        return this;
    }

    public a r(int i11) {
        this.f7423a.k(i11);
        return this;
    }

    public a s(float f11, float f12) {
        float[] fArr = this.f7427e;
        fArr[0] = f11;
        fArr[1] = f12;
        return this;
    }

    public a t(float f11, float f12) {
        float[] fArr = this.f7431i;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    boolean u() {
        C0127a c0127a = this.f7423a;
        int iF = c0127a.f();
        int iD = c0127a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }
}
