package mg0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f116240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f116241b;

    public h(o writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f116240a = writer;
        this.f116241b = true;
    }

    public final boolean a() {
        return this.f116241b;
    }

    public void b() {
        this.f116241b = true;
    }

    public void c() {
        this.f116241b = false;
    }

    public void d() {
        this.f116241b = false;
    }

    public void e(byte b11) {
        this.f116240a.writeLong(b11);
    }

    public final void f(char c11) {
        this.f116240a.a(c11);
    }

    public void g(double d11) {
        this.f116240a.c(String.valueOf(d11));
    }

    public void h(float f11) {
        this.f116240a.c(String.valueOf(f11));
    }

    public void i(int i11) {
        this.f116240a.writeLong(i11);
    }

    public void j(long j11) {
        this.f116240a.writeLong(j11);
    }

    public final void k(String v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        this.f116240a.c(v11);
    }

    public void l(short s11) {
        this.f116240a.writeLong(s11);
    }

    public void m(boolean z11) {
        this.f116240a.c(String.valueOf(z11));
    }

    public void n(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f116240a.b(value);
    }

    protected final void o(boolean z11) {
        this.f116241b = z11;
    }

    public void p() {
    }

    public void q() {
    }
}
