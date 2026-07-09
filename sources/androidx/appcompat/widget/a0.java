package androidx.appcompat.widget;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2329a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2330b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2331c = IntCompanionObject.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2332d = IntCompanionObject.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2333e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2334f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2335g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2336h = false;

    a0() {
    }

    public int a() {
        return this.f2335g ? this.f2329a : this.f2330b;
    }

    public int b() {
        return this.f2329a;
    }

    public int c() {
        return this.f2330b;
    }

    public int d() {
        return this.f2335g ? this.f2330b : this.f2329a;
    }

    public void e(int i11, int i12) {
        this.f2336h = false;
        if (i11 != Integer.MIN_VALUE) {
            this.f2333e = i11;
            this.f2329a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f2334f = i12;
            this.f2330b = i12;
        }
    }

    public void f(boolean z11) {
        if (z11 == this.f2335g) {
            return;
        }
        this.f2335g = z11;
        if (!this.f2336h) {
            this.f2329a = this.f2333e;
            this.f2330b = this.f2334f;
            return;
        }
        if (z11) {
            int i11 = this.f2332d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f2333e;
            }
            this.f2329a = i11;
            int i12 = this.f2331c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = this.f2334f;
            }
            this.f2330b = i12;
            return;
        }
        int i13 = this.f2331c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f2333e;
        }
        this.f2329a = i13;
        int i14 = this.f2332d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = this.f2334f;
        }
        this.f2330b = i14;
    }

    public void g(int i11, int i12) {
        this.f2331c = i11;
        this.f2332d = i12;
        this.f2336h = true;
        if (this.f2335g) {
            if (i12 != Integer.MIN_VALUE) {
                this.f2329a = i12;
            }
            if (i11 != Integer.MIN_VALUE) {
                this.f2330b = i11;
                return;
            }
            return;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f2329a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f2330b = i12;
        }
    }
}
