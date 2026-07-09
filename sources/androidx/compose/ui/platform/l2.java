package androidx.compose.ui.platform;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 implements x2.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f5758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Float f5759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Float f5760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e3.j f5761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e3.j f5762f;

    public l2(int i11, List list, Float f11, Float f12, e3.j jVar, e3.j jVar2) {
        this.f5757a = i11;
        this.f5758b = list;
        this.f5759c = f11;
        this.f5760d = f12;
        this.f5761e = jVar;
        this.f5762f = jVar2;
    }

    public final e3.j a() {
        return this.f5761e;
    }

    public final Float b() {
        return this.f5759c;
    }

    public final Float c() {
        return this.f5760d;
    }

    public final int d() {
        return this.f5757a;
    }

    public final e3.j e() {
        return this.f5762f;
    }

    public final void f(e3.j jVar) {
        this.f5761e = jVar;
    }

    @Override // x2.r1
    public boolean f1() {
        return this.f5758b.contains(this);
    }

    public final void g(Float f11) {
        this.f5759c = f11;
    }

    public final void h(Float f11) {
        this.f5760d = f11;
    }

    public final void i(e3.j jVar) {
        this.f5762f = jVar;
    }
}
