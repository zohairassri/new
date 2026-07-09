package ko;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import wn.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    n f111641c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f111639a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f111640b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    RectF f111642d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Path f111643e = new Path();

    public static r a(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new t(view) : new s(view);
    }

    private boolean d() {
        RectF rectF = this.f111642d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    private void k() {
        if (!d() || this.f111641c == null) {
            return;
        }
        o.k().d(this.f111641c, 1.0f, this.f111642d, this.f111643e);
    }

    abstract void b(View view);

    public boolean c() {
        return this.f111639a;
    }

    public void e(Canvas canvas, a.InterfaceC1901a interfaceC1901a) {
        if (!j() || this.f111643e.isEmpty()) {
            interfaceC1901a.a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f111643e);
        interfaceC1901a.a(canvas);
        canvas.restore();
    }

    public void f(View view, RectF rectF) {
        this.f111642d = rectF;
        k();
        b(view);
    }

    public void g(View view, n nVar) {
        this.f111641c = nVar;
        k();
        b(view);
    }

    public void h(View view, boolean z11) {
        if (z11 != this.f111639a) {
            this.f111639a = z11;
            b(view);
        }
    }

    public void i(View view, boolean z11) {
        this.f111640b = z11;
        b(view);
    }

    abstract boolean j();
}
