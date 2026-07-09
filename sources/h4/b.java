package h4;

import androidx.constraintlayout.motion.widget.n;
import d4.k;
import d4.m;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class b extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d4.n f99932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f99933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f99934c;

    public b() {
        d4.n nVar = new d4.n();
        this.f99932a = nVar;
        this.f99934c = nVar;
    }

    @Override // androidx.constraintlayout.motion.widget.n
    public float a() {
        return this.f99934c.a();
    }

    public void b(float f11, float f12, float f13, float f14, float f15, float f16) {
        d4.n nVar = this.f99932a;
        this.f99934c = nVar;
        nVar.d(f11, f12, f13, f14, f15, f16);
    }

    public boolean c() {
        return this.f99934c.b();
    }

    public void d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i11) {
        if (this.f99933b == null) {
            this.f99933b = new k();
        }
        k kVar = this.f99933b;
        this.f99934c = kVar;
        kVar.d(f11, f12, f13, f14, f15, f16, f17, i11);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        return this.f99934c.getInterpolation(f11);
    }
}
