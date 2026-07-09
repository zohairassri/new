package d90;

import androidx.lifecycle.i0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d6.a f89508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i0 f89509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f89510c;

    public f(d6.a aVar) {
        this.f89510c = aVar != null;
        this.f89508a = aVar;
    }

    public void a() {
        this.f89508a = null;
    }

    public boolean b() {
        return this.f89509b == null && this.f89508a == null;
    }

    public void c(d6.a aVar) {
        g90.c.b(this.f89510c, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
        if (this.f89509b != null) {
            return;
        }
        this.f89508a = aVar;
    }
}
