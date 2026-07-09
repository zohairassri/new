package i3;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f103138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextPaint f103141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f103142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextDirectionHeuristic f103143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Layout.Alignment f103144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f103145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextUtils.TruncateAt f103146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f103147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f103148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f103149l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f103150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f103151n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f103152o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f103153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f103154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f103155r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f103156s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f103157t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int[] f103158u;

    public g0(CharSequence charSequence, int i11, int i12, TextPaint textPaint, int i13, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i14, TextUtils.TruncateAt truncateAt, int i15, float f11, float f12, int i16, boolean z11, boolean z12, int i17, int i18, int i19, int i21, int[] iArr, int[] iArr2) {
        this.f103138a = charSequence;
        this.f103139b = i11;
        this.f103140c = i12;
        this.f103141d = textPaint;
        this.f103142e = i13;
        this.f103143f = textDirectionHeuristic;
        this.f103144g = alignment;
        this.f103145h = i14;
        this.f103146i = truncateAt;
        this.f103147j = i15;
        this.f103148k = f11;
        this.f103149l = f12;
        this.f103150m = i16;
        this.f103151n = z11;
        this.f103152o = z12;
        this.f103153p = i17;
        this.f103154q = i18;
        this.f103155r = i19;
        this.f103156s = i21;
        this.f103157t = iArr;
        this.f103158u = iArr2;
        if (!(i11 >= 0 && i11 <= i12)) {
            n3.a.a("invalid start value");
        }
        if (!(i12 >= 0 && i12 <= charSequence.length())) {
            n3.a.a("invalid end value");
        }
        if (!(i14 >= 0)) {
            n3.a.a("invalid maxLines value");
        }
        if (!(i13 >= 0)) {
            n3.a.a("invalid width value");
        }
        if (!(i15 >= 0)) {
            n3.a.a("invalid ellipsizedWidth value");
        }
        if (f11 >= 0.0f) {
            return;
        }
        n3.a.a("invalid lineSpacingMultiplier value");
    }

    public final Layout.Alignment a() {
        return this.f103144g;
    }

    public final int b() {
        return this.f103153p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f103146i;
    }

    public final int d() {
        return this.f103147j;
    }

    public final int e() {
        return this.f103140c;
    }

    public final int f() {
        return this.f103156s;
    }

    public final boolean g() {
        return this.f103151n;
    }

    public final int h() {
        return this.f103150m;
    }

    public final int[] i() {
        return this.f103157t;
    }

    public final int j() {
        return this.f103154q;
    }

    public final int k() {
        return this.f103155r;
    }

    public final float l() {
        return this.f103149l;
    }

    public final float m() {
        return this.f103148k;
    }

    public final int n() {
        return this.f103145h;
    }

    public final TextPaint o() {
        return this.f103141d;
    }

    public final int[] p() {
        return this.f103158u;
    }

    public final int q() {
        return this.f103139b;
    }

    public final CharSequence r() {
        return this.f103138a;
    }

    public final TextDirectionHeuristic s() {
        return this.f103143f;
    }

    public final boolean t() {
        return this.f103152o;
    }

    public final int u() {
        return this.f103142e;
    }
}
