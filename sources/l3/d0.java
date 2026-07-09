package l3;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Comparable {
    private static final d0 B;
    private static final d0 N;
    private static final List S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f113094b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d0 f113095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d0 f113096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d0 f113097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d0 f113098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d0 f113099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d0 f113100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final d0 f113101i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final d0 f113102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final d0 f113103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final d0 f113104n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final d0 f113105r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final d0 f113106s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final d0 f113107v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final d0 f113108w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final d0 f113109x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final d0 f113110y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f113111a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d0 a() {
            return d0.f113110y;
        }

        public final d0 b() {
            return d0.B;
        }

        public final d0 c() {
            return d0.f113105r;
        }

        public final d0 d() {
            return d0.f113106s;
        }

        public final d0 e() {
            return d0.f113108w;
        }

        public final d0 f() {
            return d0.f113107v;
        }

        public final d0 g() {
            return d0.f113109x;
        }

        public final d0 h() {
            return d0.f113098f;
        }

        public final d0 i() {
            return d0.f113099g;
        }

        public final d0 j() {
            return d0.f113100h;
        }

        public final d0 k() {
            return d0.f113101i;
        }

        private a() {
        }
    }

    static {
        d0 d0Var = new d0(100);
        f113095c = d0Var;
        d0 d0Var2 = new d0(200);
        f113096d = d0Var2;
        d0 d0Var3 = new d0(300);
        f113097e = d0Var3;
        d0 d0Var4 = new d0(400);
        f113098f = d0Var4;
        d0 d0Var5 = new d0(500);
        f113099g = d0Var5;
        d0 d0Var6 = new d0(600);
        f113100h = d0Var6;
        d0 d0Var7 = new d0(700);
        f113101i = d0Var7;
        d0 d0Var8 = new d0(800);
        f113102l = d0Var8;
        d0 d0Var9 = new d0(900);
        f113103m = d0Var9;
        f113104n = d0Var;
        f113105r = d0Var2;
        f113106s = d0Var3;
        f113107v = d0Var4;
        f113108w = d0Var5;
        f113109x = d0Var6;
        f113110y = d0Var7;
        B = d0Var8;
        N = d0Var9;
        S = CollectionsKt.r(d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9);
    }

    public d0(int i11) {
        this.f113111a = i11;
        boolean z11 = false;
        if (1 <= i11 && i11 < 1001) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        n3.a.a("Font weight can be in range [1, 1000]. Current value: " + i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && this.f113111a == ((d0) obj).f113111a;
    }

    public int hashCode() {
        return this.f113111a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int compareTo(d0 d0Var) {
        return Intrinsics.compare(this.f113111a, d0Var.f113111a);
    }

    public final int p() {
        return this.f113111a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f113111a + ')';
    }
}
