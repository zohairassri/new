package androidx.compose.foundation;

import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f2 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Magnifier f3038a;

    public f2(Magnifier magnifier) {
        this.f3038a = magnifier;
    }

    public final Magnifier a() {
        return this.f3038a;
    }

    @Override // androidx.compose.foundation.d2
    public long b() {
        return z3.r.c((((long) this.f3038a.getWidth()) << 32) | (((long) this.f3038a.getHeight()) & 4294967295L));
    }

    @Override // androidx.compose.foundation.d2
    public void d() {
        this.f3038a.update();
    }

    @Override // androidx.compose.foundation.d2
    public void dismiss() {
        this.f3038a.dismiss();
    }
}
