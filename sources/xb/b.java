package xb;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f137292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f137293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f137294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f137295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f137296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f137297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f137298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f137299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f137300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f137301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f137302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f137303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f137304m;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f11, a aVar, int i11, float f12, float f13, int i12, int i13, float f14, boolean z11, PointF pointF, PointF pointF2) {
        a(str, str2, f11, aVar, i11, f12, f13, i12, i13, f14, z11, pointF, pointF2);
    }

    public void a(String str, String str2, float f11, a aVar, int i11, float f12, float f13, int i12, int i13, float f14, boolean z11, PointF pointF, PointF pointF2) {
        this.f137292a = str;
        this.f137293b = str2;
        this.f137294c = f11;
        this.f137295d = aVar;
        this.f137296e = i11;
        this.f137297f = f12;
        this.f137298g = f13;
        this.f137299h = i12;
        this.f137300i = i13;
        this.f137301j = f14;
        this.f137302k = z11;
        this.f137303l = pointF;
        this.f137304m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f137292a.hashCode() * 31) + this.f137293b.hashCode()) * 31) + this.f137294c)) * 31) + this.f137295d.ordinal()) * 31) + this.f137296e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f137297f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f137299h;
    }

    public b() {
    }
}
