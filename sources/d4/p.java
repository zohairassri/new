package d4;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f89251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f89252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f89253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f89254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f89255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f89256f;

    public void a(float f11, float f12, int i11, int i12, float[] fArr) {
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = (f12 - 0.5f) * 2.0f;
        float f17 = f13 + this.f89253c;
        float f18 = f14 + this.f89254d;
        float f19 = f17 + (this.f89251a * f15);
        float f21 = f18 + (this.f89252b * f16);
        float radians = (float) Math.toRadians(this.f89256f);
        float radians2 = (float) Math.toRadians(this.f89255e);
        double d11 = radians;
        double d12 = i12 * f16;
        float fSin = f19 + (((float) ((((double) ((-i11) * f15)) * Math.sin(d11)) - (Math.cos(d11) * d12))) * radians2);
        float fCos = f21 + (radians2 * ((float) ((((double) (i11 * f15)) * Math.cos(d11)) - (d12 * Math.sin(d11)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void b() {
        this.f89255e = 0.0f;
        this.f89254d = 0.0f;
        this.f89253c = 0.0f;
        this.f89252b = 0.0f;
        this.f89251a = 0.0f;
    }

    public void c(e eVar, float f11) {
        if (eVar != null) {
            this.f89255e = eVar.b(f11);
        }
    }

    public void d(j jVar, float f11) {
        if (jVar != null) {
            this.f89255e = jVar.b(f11);
            this.f89256f = jVar.a(f11);
        }
    }

    public void e(e eVar, e eVar2, float f11) {
        if (eVar != null) {
            this.f89251a = eVar.b(f11);
        }
        if (eVar2 != null) {
            this.f89252b = eVar2.b(f11);
        }
    }

    public void f(j jVar, j jVar2, float f11) {
        if (jVar != null) {
            this.f89251a = jVar.b(f11);
        }
        if (jVar2 != null) {
            this.f89252b = jVar2.b(f11);
        }
    }

    public void g(e eVar, e eVar2, float f11) {
        if (eVar != null) {
            this.f89253c = eVar.b(f11);
        }
        if (eVar2 != null) {
            this.f89254d = eVar2.b(f11);
        }
    }

    public void h(j jVar, j jVar2, float f11) {
        if (jVar != null) {
            this.f89253c = jVar.b(f11);
        }
        if (jVar2 != null) {
            this.f89254d = jVar2.b(f11);
        }
    }
}
