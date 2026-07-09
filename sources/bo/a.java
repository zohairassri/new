package bo;

import android.content.Context;
import android.graphics.Color;
import ho.b;
import o4.e;
import tn.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f14950f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f14951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f14955e;

    public a(Context context) {
        this(b.b(context, c.elevationOverlayEnabled, false), zn.a.b(context, c.elevationOverlayColor, 0), zn.a.b(context, c.elevationOverlayAccentColor, 0), zn.a.b(context, c.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean f(int i11) {
        return e.l(i11, 255) == this.f14954d;
    }

    public float a(float f11) {
        if (this.f14955e <= 0.0f || f11 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f11 / r2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i11, float f11) {
        int i12;
        float fA = a(f11);
        int iAlpha = Color.alpha(i11);
        int iJ = zn.a.j(e.l(i11, 255), this.f14952b, fA);
        if (fA > 0.0f && (i12 = this.f14953c) != 0) {
            iJ = zn.a.i(iJ, e.l(i12, f14950f));
        }
        return e.l(iJ, iAlpha);
    }

    public int c(int i11, float f11) {
        return (this.f14951a && f(i11)) ? b(i11, f11) : i11;
    }

    public int d(float f11) {
        return c(this.f14954d, f11);
    }

    public boolean e() {
        return this.f14951a;
    }

    public a(boolean z11, int i11, int i12, int i13, float f11) {
        this.f14951a = z11;
        this.f14952b = i11;
        this.f14953c = i12;
        this.f14954d = i13;
        this.f14955e = f11;
    }
}
