package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5125a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f5126b = D(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f5127c = D(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f5128d = D(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f5129e = D(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f5130f = D(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f5131g = D(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f5132h = D(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f5133i = D(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f5134j = D(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f5135k = D(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f5136l = D(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f5137m = D(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f5138n = D(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f5139o = D(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f5140p = D(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f5141q = D(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f5142r = D(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f5143s = D(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f5144t = D(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f5145u = D(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f5146v = D(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f5147w = D(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f5148x = D(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f5149y = D(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f5150z = D(24);
    private static final int A = D(25);
    private static final int B = D(26);
    private static final int C = D(27);
    private static final int D = D(28);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int A() {
            return c.f5133i;
        }

        public final int B() {
            return c.f5129e;
        }

        public final int C() {
            return c.f5137m;
        }

        public final int a() {
            return c.f5126b;
        }

        public final int b() {
            return c.C;
        }

        public final int c() {
            return c.f5145u;
        }

        public final int d() {
            return c.f5144t;
        }

        public final int e() {
            return c.f5142r;
        }

        public final int f() {
            return c.f5148x;
        }

        public final int g() {
            return c.f5128d;
        }

        public final int h() {
            return c.f5136l;
        }

        public final int i() {
            return c.f5132h;
        }

        public final int j() {
            return c.f5134j;
        }

        public final int k() {
            return c.f5130f;
        }

        public final int l() {
            return c.f5149y;
        }

        public final int m() {
            return c.f5146v;
        }

        public final int n() {
            return c.A;
        }

        public final int o() {
            return c.f5143s;
        }

        public final int p() {
            return c.D;
        }

        public final int q() {
            return c.f5139o;
        }

        public final int r() {
            return c.f5150z;
        }

        public final int s() {
            return c.f5141q;
        }

        public final int t() {
            return c.f5138n;
        }

        public final int u() {
            return c.B;
        }

        public final int v() {
            return c.f5140p;
        }

        public final int w() {
            return c.f5147w;
        }

        public final int x() {
            return c.f5127c;
        }

        public final int y() {
            return c.f5135k;
        }

        public final int z() {
            return c.f5131g;
        }

        private a() {
        }
    }

    public static final boolean E(int i11, int i12) {
        return i11 == i12;
    }

    public static int F(int i11) {
        return Integer.hashCode(i11);
    }

    public static String G(int i11) {
        return E(i11, f5126b) ? "Clear" : E(i11, f5127c) ? "Src" : E(i11, f5128d) ? "Dst" : E(i11, f5129e) ? "SrcOver" : E(i11, f5130f) ? "DstOver" : E(i11, f5131g) ? "SrcIn" : E(i11, f5132h) ? "DstIn" : E(i11, f5133i) ? "SrcOut" : E(i11, f5134j) ? "DstOut" : E(i11, f5135k) ? "SrcAtop" : E(i11, f5136l) ? "DstAtop" : E(i11, f5137m) ? "Xor" : E(i11, f5138n) ? "Plus" : E(i11, f5139o) ? "Modulate" : E(i11, f5140p) ? "Screen" : E(i11, f5141q) ? "Overlay" : E(i11, f5142r) ? "Darken" : E(i11, f5143s) ? "Lighten" : E(i11, f5144t) ? "ColorDodge" : E(i11, f5145u) ? "ColorBurn" : E(i11, f5146v) ? "HardLight" : E(i11, f5147w) ? "Softlight" : E(i11, f5148x) ? "Difference" : E(i11, f5149y) ? "Exclusion" : E(i11, f5150z) ? "Multiply" : E(i11, A) ? "Hue" : E(i11, B) ? "Saturation" : E(i11, C) ? "Color" : E(i11, D) ? "Luminosity" : "Unknown";
    }

    public static int D(int i11) {
        return i11;
    }
}
