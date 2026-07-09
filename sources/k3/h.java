package k3;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f107405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f107406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f107407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f107408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f107409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f107410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f107411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f107412h = IntCompanionObject.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f107413i = IntCompanionObject.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f107414l = IntCompanionObject.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f107415m = IntCompanionObject.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f107416n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f107417r;

    public h(float f11, int i11, int i12, boolean z11, boolean z12, float f12, boolean z13) {
        this.f107405a = f11;
        this.f107406b = i11;
        this.f107407c = i12;
        this.f107408d = z11;
        this.f107409e = z12;
        this.f107410f = f12;
        this.f107411g = z13;
        if ((0.0f <= f12 && f12 <= 1.0f) || f12 == -1.0f) {
            return;
        }
        n3.a.c("topRatio should be in [0..1] range or -1");
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        int iCeil = (int) Math.ceil(this.f107405a);
        int iA = iCeil - i.a(fontMetricsInt);
        if (this.f107411g && iA <= 0) {
            int i11 = fontMetricsInt.ascent;
            this.f107413i = i11;
            int i12 = fontMetricsInt.descent;
            this.f107414l = i12;
            this.f107412h = i11;
            this.f107415m = i12;
            this.f107416n = 0;
            this.f107417r = 0;
            return;
        }
        float fAbs = this.f107410f;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / i.a(fontMetricsInt);
        }
        int iCeil2 = (int) (iA <= 0 ? Math.ceil(iA * fAbs) : Math.ceil(iA * (1.0f - fAbs)));
        int i13 = fontMetricsInt.descent;
        int i14 = iCeil2 + i13;
        this.f107414l = i14;
        int i15 = i14 - iCeil;
        this.f107413i = i15;
        if (this.f107408d) {
            i15 = fontMetricsInt.ascent;
        }
        this.f107412h = i15;
        if (this.f107409e) {
            i14 = i13;
        }
        this.f107415m = i14;
        this.f107416n = fontMetricsInt.ascent - i15;
        this.f107417r = i14 - i13;
    }

    public final h b(int i11, int i12, boolean z11) {
        return new h(this.f107405a, i11, i12, z11, this.f107409e, this.f107410f, this.f107411g);
    }

    public final int c() {
        return this.f107416n;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i11, int i12, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z11 = i11 == this.f107406b;
        boolean z12 = i12 == this.f107407c;
        if (z11 && z12 && this.f107408d && this.f107409e) {
            return;
        }
        if (this.f107412h == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z11 ? this.f107412h : this.f107413i;
        fontMetricsInt.descent = z12 ? this.f107415m : this.f107414l;
    }

    public final int d() {
        return this.f107417r;
    }

    public final boolean e() {
        return this.f107409e;
    }
}
