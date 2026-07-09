package k2;

import java.util.ArrayList;
import java.util.List;
import k2.h;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f107212a = new ArrayList(32);

    public final f a() {
        this.f107212a.add(h.b.f107244c);
        return this;
    }

    public final f b(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f107212a.add(new h.c(f11, f12, f13, f14, f15, f16));
        return this;
    }

    public final f c(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f107212a.add(new h.k(f11, f12, f13, f14, f15, f16));
        return this;
    }

    public final List d() {
        return this.f107212a;
    }

    public final f e(float f11) {
        this.f107212a.add(new h.d(f11));
        return this;
    }

    public final f f(float f11) {
        this.f107212a.add(new h.l(f11));
        return this;
    }

    public final f g(float f11, float f12) {
        this.f107212a.add(new h.e(f11, f12));
        return this;
    }

    public final f h(float f11, float f12) {
        this.f107212a.add(new h.m(f11, f12));
        return this;
    }

    public final f i(float f11, float f12) {
        this.f107212a.add(new h.f(f11, f12));
        return this;
    }

    public final f j(float f11, float f12, float f13, float f14) {
        this.f107212a.add(new h.C1312h(f11, f12, f13, f14));
        return this;
    }

    public final f k(float f11, float f12, float f13, float f14) {
        this.f107212a.add(new h.p(f11, f12, f13, f14));
        return this;
    }

    public final f l(float f11) {
        this.f107212a.add(new h.s(f11));
        return this;
    }

    public final f m(float f11) {
        this.f107212a.add(new h.r(f11));
        return this;
    }
}
