package fc;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.i;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f94129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f94130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f94131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f94132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f94133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f94134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f94135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f94136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f94137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f94138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f94139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f94140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f94141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f94142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f94143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f94144p;

    public a(i iVar, Object obj, Object obj2, Interpolator interpolator, float f11, Float f12) {
        this.f94137i = -3987645.8f;
        this.f94138j = -3987645.8f;
        this.f94139k = 784923401;
        this.f94140l = 784923401;
        this.f94141m = Float.MIN_VALUE;
        this.f94142n = Float.MIN_VALUE;
        this.f94143o = null;
        this.f94144p = null;
        this.f94129a = iVar;
        this.f94130b = obj;
        this.f94131c = obj2;
        this.f94132d = interpolator;
        this.f94133e = null;
        this.f94134f = null;
        this.f94135g = f11;
        this.f94136h = f12;
    }

    public boolean a(float f11) {
        return f11 >= f() && f11 < c();
    }

    public a b(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    public float c() {
        if (this.f94129a == null) {
            return 1.0f;
        }
        if (this.f94142n == Float.MIN_VALUE) {
            if (this.f94136h == null) {
                this.f94142n = 1.0f;
            } else {
                this.f94142n = f() + ((this.f94136h.floatValue() - this.f94135g) / this.f94129a.e());
            }
        }
        return this.f94142n;
    }

    public float d() {
        if (this.f94138j == -3987645.8f) {
            this.f94138j = ((Float) this.f94131c).floatValue();
        }
        return this.f94138j;
    }

    public int e() {
        if (this.f94140l == 784923401) {
            this.f94140l = ((Integer) this.f94131c).intValue();
        }
        return this.f94140l;
    }

    public float f() {
        i iVar = this.f94129a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f94141m == Float.MIN_VALUE) {
            this.f94141m = (this.f94135g - iVar.p()) / this.f94129a.e();
        }
        return this.f94141m;
    }

    public float g() {
        if (this.f94137i == -3987645.8f) {
            this.f94137i = ((Float) this.f94130b).floatValue();
        }
        return this.f94137i;
    }

    public int h() {
        if (this.f94139k == 784923401) {
            this.f94139k = ((Integer) this.f94130b).intValue();
        }
        return this.f94139k;
    }

    public boolean i() {
        return this.f94132d == null && this.f94133e == null && this.f94134f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f94130b + ", endValue=" + this.f94131c + ", startFrame=" + this.f94135g + ", endFrame=" + this.f94136h + ", interpolator=" + this.f94132d + '}';
    }

    public a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f11, Float f12) {
        this.f94137i = -3987645.8f;
        this.f94138j = -3987645.8f;
        this.f94139k = 784923401;
        this.f94140l = 784923401;
        this.f94141m = Float.MIN_VALUE;
        this.f94142n = Float.MIN_VALUE;
        this.f94143o = null;
        this.f94144p = null;
        this.f94129a = iVar;
        this.f94130b = obj;
        this.f94131c = obj2;
        this.f94132d = null;
        this.f94133e = interpolator;
        this.f94134f = interpolator2;
        this.f94135g = f11;
        this.f94136h = f12;
    }

    protected a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f11, Float f12) {
        this.f94137i = -3987645.8f;
        this.f94138j = -3987645.8f;
        this.f94139k = 784923401;
        this.f94140l = 784923401;
        this.f94141m = Float.MIN_VALUE;
        this.f94142n = Float.MIN_VALUE;
        this.f94143o = null;
        this.f94144p = null;
        this.f94129a = iVar;
        this.f94130b = obj;
        this.f94131c = obj2;
        this.f94132d = interpolator;
        this.f94133e = interpolator2;
        this.f94134f = interpolator3;
        this.f94135g = f11;
        this.f94136h = f12;
    }

    public a(Object obj) {
        this.f94137i = -3987645.8f;
        this.f94138j = -3987645.8f;
        this.f94139k = 784923401;
        this.f94140l = 784923401;
        this.f94141m = Float.MIN_VALUE;
        this.f94142n = Float.MIN_VALUE;
        this.f94143o = null;
        this.f94144p = null;
        this.f94129a = null;
        this.f94130b = obj;
        this.f94131c = obj;
        this.f94132d = null;
        this.f94133e = null;
        this.f94134f = null;
        this.f94135g = Float.MIN_VALUE;
        this.f94136h = Float.valueOf(Float.MAX_VALUE);
    }

    private a(Object obj, Object obj2) {
        this.f94137i = -3987645.8f;
        this.f94138j = -3987645.8f;
        this.f94139k = 784923401;
        this.f94140l = 784923401;
        this.f94141m = Float.MIN_VALUE;
        this.f94142n = Float.MIN_VALUE;
        this.f94143o = null;
        this.f94144p = null;
        this.f94129a = null;
        this.f94130b = obj;
        this.f94131c = obj2;
        this.f94132d = null;
        this.f94133e = null;
        this.f94134f = null;
        this.f94135g = Float.MIN_VALUE;
        this.f94136h = Float.valueOf(Float.MAX_VALUE);
    }
}
