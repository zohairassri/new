package xb;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f137289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f137290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f137291c;

    public a() {
        this.f137289a = new PointF();
        this.f137290b = new PointF();
        this.f137291c = new PointF();
    }

    public PointF a() {
        return this.f137289a;
    }

    public PointF b() {
        return this.f137290b;
    }

    public PointF c() {
        return this.f137291c;
    }

    public void d(float f11, float f12) {
        this.f137289a.set(f11, f12);
    }

    public void e(float f11, float f12) {
        this.f137290b.set(f11, f12);
    }

    public void f(float f11, float f12) {
        this.f137291c.set(f11, f12);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f137291c.x), Float.valueOf(this.f137291c.y), Float.valueOf(this.f137289a.x), Float.valueOf(this.f137289a.y), Float.valueOf(this.f137290b.x), Float.valueOf(this.f137290b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f137289a = pointF;
        this.f137290b = pointF2;
        this.f137291c = pointF3;
    }
}
