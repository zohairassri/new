package k2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f107235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f107236b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f107239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f107240f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f107241g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f107242h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f107243i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            boolean z13 = false;
            super(z13, z13, 3, null);
            this.f107237c = f11;
            this.f107238d = f12;
            this.f107239e = f13;
            this.f107240f = z11;
            this.f107241g = z12;
            this.f107242h = f14;
            this.f107243i = f15;
        }

        public final float c() {
            return this.f107242h;
        }

        public final float d() {
            return this.f107243i;
        }

        public final float e() {
            return this.f107237c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f107237c, aVar.f107237c) == 0 && Float.compare(this.f107238d, aVar.f107238d) == 0 && Float.compare(this.f107239e, aVar.f107239e) == 0 && this.f107240f == aVar.f107240f && this.f107241g == aVar.f107241g && Float.compare(this.f107242h, aVar.f107242h) == 0 && Float.compare(this.f107243i, aVar.f107243i) == 0;
        }

        public final float f() {
            return this.f107239e;
        }

        public final float g() {
            return this.f107238d;
        }

        public final boolean h() {
            return this.f107240f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f107237c) * 31) + Float.hashCode(this.f107238d)) * 31) + Float.hashCode(this.f107239e)) * 31) + Boolean.hashCode(this.f107240f)) * 31) + Boolean.hashCode(this.f107241g)) * 31) + Float.hashCode(this.f107242h)) * 31) + Float.hashCode(this.f107243i);
        }

        public final boolean i() {
            return this.f107241g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f107237c + ", verticalEllipseRadius=" + this.f107238d + ", theta=" + this.f107239e + ", isMoreThanHalf=" + this.f107240f + ", isPositiveArc=" + this.f107241g + ", arcStartX=" + this.f107242h + ", arcStartY=" + this.f107243i + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f107244c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        private b() {
            boolean z11 = false;
            super(z11, z11, 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f107247e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f107248f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f107249g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f107250h;

        public c(float f11, float f12, float f13, float f14, float f15, float f16) {
            super(true, false, 2, null);
            this.f107245c = f11;
            this.f107246d = f12;
            this.f107247e = f13;
            this.f107248f = f14;
            this.f107249g = f15;
            this.f107250h = f16;
        }

        public final float c() {
            return this.f107245c;
        }

        public final float d() {
            return this.f107247e;
        }

        public final float e() {
            return this.f107249g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f107245c, cVar.f107245c) == 0 && Float.compare(this.f107246d, cVar.f107246d) == 0 && Float.compare(this.f107247e, cVar.f107247e) == 0 && Float.compare(this.f107248f, cVar.f107248f) == 0 && Float.compare(this.f107249g, cVar.f107249g) == 0 && Float.compare(this.f107250h, cVar.f107250h) == 0;
        }

        public final float f() {
            return this.f107246d;
        }

        public final float g() {
            return this.f107248f;
        }

        public final float h() {
            return this.f107250h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f107245c) * 31) + Float.hashCode(this.f107246d)) * 31) + Float.hashCode(this.f107247e)) * 31) + Float.hashCode(this.f107248f)) * 31) + Float.hashCode(this.f107249g)) * 31) + Float.hashCode(this.f107250h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f107245c + ", y1=" + this.f107246d + ", x2=" + this.f107247e + ", y2=" + this.f107248f + ", x3=" + this.f107249g + ", y3=" + this.f107250h + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107251c;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(float f11) {
            boolean z11 = false;
            super(z11, z11, 3, null);
            this.f107251c = f11;
        }

        public final float c() {
            return this.f107251c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f107251c, ((d) obj).f107251c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f107251c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f107251c + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class e extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107253d;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(float f11, float f12) {
            boolean z11 = false;
            super(z11, z11, 3, null);
            this.f107252c = f11;
            this.f107253d = f12;
        }

        public final float c() {
            return this.f107252c;
        }

        public final float d() {
            return this.f107253d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f107252c, eVar.f107252c) == 0 && Float.compare(this.f107253d, eVar.f107253d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f107252c) * 31) + Float.hashCode(this.f107253d);
        }

        public String toString() {
            return "LineTo(x=" + this.f107252c + ", y=" + this.f107253d + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class f extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107255d;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(float f11, float f12) {
            boolean z11 = false;
            super(z11, z11, 3, null);
            this.f107254c = f11;
            this.f107255d = f12;
        }

        public final float c() {
            return this.f107254c;
        }

        public final float d() {
            return this.f107255d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f107254c, fVar.f107254c) == 0 && Float.compare(this.f107255d, fVar.f107255d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f107254c) * 31) + Float.hashCode(this.f107255d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f107254c + ", y=" + this.f107255d + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class g extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f107258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f107259f;

        public g(float f11, float f12, float f13, float f14) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f107256c = f11;
            this.f107257d = f12;
            this.f107258e = f13;
            this.f107259f = f14;
        }

        public final float c() {
            return this.f107256c;
        }

        public final float d() {
            return this.f107258e;
        }

        public final float e() {
            return this.f107257d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.f107256c, gVar.f107256c) == 0 && Float.compare(this.f107257d, gVar.f107257d) == 0 && Float.compare(this.f107258e, gVar.f107258e) == 0 && Float.compare(this.f107259f, gVar.f107259f) == 0;
        }

        public final float f() {
            return this.f107259f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f107256c) * 31) + Float.hashCode(this.f107257d)) * 31) + Float.hashCode(this.f107258e)) * 31) + Float.hashCode(this.f107259f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f107256c + ", y1=" + this.f107257d + ", x2=" + this.f107258e + ", y2=" + this.f107259f + ')';
        }
    }

    /* JADX INFO: renamed from: k2.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1312h extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f107262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f107263f;

        public C1312h(float f11, float f12, float f13, float f14) {
            super(true, false, 2, null);
            this.f107260c = f11;
            this.f107261d = f12;
            this.f107262e = f13;
            this.f107263f = f14;
        }

        public final float c() {
            return this.f107260c;
        }

        public final float d() {
            return this.f107262e;
        }

        public final float e() {
            return this.f107261d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1312h)) {
                return false;
            }
            C1312h c1312h = (C1312h) obj;
            return Float.compare(this.f107260c, c1312h.f107260c) == 0 && Float.compare(this.f107261d, c1312h.f107261d) == 0 && Float.compare(this.f107262e, c1312h.f107262e) == 0 && Float.compare(this.f107263f, c1312h.f107263f) == 0;
        }

        public final float f() {
            return this.f107263f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f107260c) * 31) + Float.hashCode(this.f107261d)) * 31) + Float.hashCode(this.f107262e)) * 31) + Float.hashCode(this.f107263f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f107260c + ", y1=" + this.f107261d + ", x2=" + this.f107262e + ", y2=" + this.f107263f + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class i extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107265d;

        public i(float f11, float f12) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f107264c = f11;
            this.f107265d = f12;
        }

        public final float c() {
            return this.f107264c;
        }

        public final float d() {
            return this.f107265d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f107264c, iVar.f107264c) == 0 && Float.compare(this.f107265d, iVar.f107265d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f107264c) * 31) + Float.hashCode(this.f107265d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f107264c + ", y=" + this.f107265d + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class j extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f107268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f107269f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f107270g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f107271h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f107272i;

        /* JADX WARN: Illegal instructions before constructor call */
        public j(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            boolean z13 = false;
            super(z13, z13, 3, null);
            this.f107266c = f11;
            this.f107267d = f12;
            this.f107268e = f13;
            this.f107269f = z11;
            this.f107270g = z12;
            this.f107271h = f14;
            this.f107272i = f15;
        }

        public final float c() {
            return this.f107271h;
        }

        public final float d() {
            return this.f107272i;
        }

        public final float e() {
            return this.f107266c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f107266c, jVar.f107266c) == 0 && Float.compare(this.f107267d, jVar.f107267d) == 0 && Float.compare(this.f107268e, jVar.f107268e) == 0 && this.f107269f == jVar.f107269f && this.f107270g == jVar.f107270g && Float.compare(this.f107271h, jVar.f107271h) == 0 && Float.compare(this.f107272i, jVar.f107272i) == 0;
        }

        public final float f() {
            return this.f107268e;
        }

        public final float g() {
            return this.f107267d;
        }

        public final boolean h() {
            return this.f107269f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f107266c) * 31) + Float.hashCode(this.f107267d)) * 31) + Float.hashCode(this.f107268e)) * 31) + Boolean.hashCode(this.f107269f)) * 31) + Boolean.hashCode(this.f107270g)) * 31) + Float.hashCode(this.f107271h)) * 31) + Float.hashCode(this.f107272i);
        }

        public final boolean i() {
            return this.f107270g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f107266c + ", verticalEllipseRadius=" + this.f107267d + ", theta=" + this.f107268e + ", isMoreThanHalf=" + this.f107269f + ", isPositiveArc=" + this.f107270g + ", arcStartDx=" + this.f107271h + ", arcStartDy=" + this.f107272i + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class k extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f107275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f107276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f107277g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f107278h;

        public k(float f11, float f12, float f13, float f14, float f15, float f16) {
            super(true, false, 2, null);
            this.f107273c = f11;
            this.f107274d = f12;
            this.f107275e = f13;
            this.f107276f = f14;
            this.f107277g = f15;
            this.f107278h = f16;
        }

        public final float c() {
            return this.f107273c;
        }

        public final float d() {
            return this.f107275e;
        }

        public final float e() {
            return this.f107277g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f107273c, kVar.f107273c) == 0 && Float.compare(this.f107274d, kVar.f107274d) == 0 && Float.compare(this.f107275e, kVar.f107275e) == 0 && Float.compare(this.f107276f, kVar.f107276f) == 0 && Float.compare(this.f107277g, kVar.f107277g) == 0 && Float.compare(this.f107278h, kVar.f107278h) == 0;
        }

        public final float f() {
            return this.f107274d;
        }

        public final float g() {
            return this.f107276f;
        }

        public final float h() {
            return this.f107278h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f107273c) * 31) + Float.hashCode(this.f107274d)) * 31) + Float.hashCode(this.f107275e)) * 31) + Float.hashCode(this.f107276f)) * 31) + Float.hashCode(this.f107277g)) * 31) + Float.hashCode(this.f107278h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f107273c + ", dy1=" + this.f107274d + ", dx2=" + this.f107275e + ", dy2=" + this.f107276f + ", dx3=" + this.f107277g + ", dy3=" + this.f107278h + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class l extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107279c;

        /* JADX WARN: Illegal instructions before constructor call */
        public l(float f11) {
            boolean z11 = false;
            super(z11, z11, 3, null);
            this.f107279c = f11;
        }

        public final float c() {
            return this.f107279c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f107279c, ((l) obj).f107279c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f107279c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f107279c + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class m extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107281d;

        /* JADX WARN: Illegal instructions before constructor call */
        public m(float f11, float f12) {
            boolean z11 = false;
            super(z11, z11, 3, null);
            this.f107280c = f11;
            this.f107281d = f12;
        }

        public final float c() {
            return this.f107280c;
        }

        public final float d() {
            return this.f107281d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f107280c, mVar.f107280c) == 0 && Float.compare(this.f107281d, mVar.f107281d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f107280c) * 31) + Float.hashCode(this.f107281d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f107280c + ", dy=" + this.f107281d + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class n extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107283d;

        /* JADX WARN: Illegal instructions before constructor call */
        public n(float f11, float f12) {
            boolean z11 = false;
            super(z11, z11, 3, null);
            this.f107282c = f11;
            this.f107283d = f12;
        }

        public final float c() {
            return this.f107282c;
        }

        public final float d() {
            return this.f107283d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f107282c, nVar.f107282c) == 0 && Float.compare(this.f107283d, nVar.f107283d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f107282c) * 31) + Float.hashCode(this.f107283d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f107282c + ", dy=" + this.f107283d + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class o extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107285d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f107286e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f107287f;

        public o(float f11, float f12, float f13, float f14) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f107284c = f11;
            this.f107285d = f12;
            this.f107286e = f13;
            this.f107287f = f14;
        }

        public final float c() {
            return this.f107284c;
        }

        public final float d() {
            return this.f107286e;
        }

        public final float e() {
            return this.f107285d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f107284c, oVar.f107284c) == 0 && Float.compare(this.f107285d, oVar.f107285d) == 0 && Float.compare(this.f107286e, oVar.f107286e) == 0 && Float.compare(this.f107287f, oVar.f107287f) == 0;
        }

        public final float f() {
            return this.f107287f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f107284c) * 31) + Float.hashCode(this.f107285d)) * 31) + Float.hashCode(this.f107286e)) * 31) + Float.hashCode(this.f107287f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f107284c + ", dy1=" + this.f107285d + ", dx2=" + this.f107286e + ", dy2=" + this.f107287f + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class p extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f107290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f107291f;

        public p(float f11, float f12, float f13, float f14) {
            super(true, false, 2, null);
            this.f107288c = f11;
            this.f107289d = f12;
            this.f107290e = f13;
            this.f107291f = f14;
        }

        public final float c() {
            return this.f107288c;
        }

        public final float d() {
            return this.f107290e;
        }

        public final float e() {
            return this.f107289d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f107288c, pVar.f107288c) == 0 && Float.compare(this.f107289d, pVar.f107289d) == 0 && Float.compare(this.f107290e, pVar.f107290e) == 0 && Float.compare(this.f107291f, pVar.f107291f) == 0;
        }

        public final float f() {
            return this.f107291f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f107288c) * 31) + Float.hashCode(this.f107289d)) * 31) + Float.hashCode(this.f107290e)) * 31) + Float.hashCode(this.f107291f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f107288c + ", dy1=" + this.f107289d + ", dx2=" + this.f107290e + ", dy2=" + this.f107291f + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class q extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f107293d;

        public q(float f11, float f12) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f107292c = f11;
            this.f107293d = f12;
        }

        public final float c() {
            return this.f107292c;
        }

        public final float d() {
            return this.f107293d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.f107292c, qVar.f107292c) == 0 && Float.compare(this.f107293d, qVar.f107293d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f107292c) * 31) + Float.hashCode(this.f107293d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f107292c + ", dy=" + this.f107293d + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class r extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107294c;

        /* JADX WARN: Illegal instructions before constructor call */
        public r(float f11) {
            boolean z11 = false;
            super(z11, z11, 3, null);
            this.f107294c = f11;
        }

        public final float c() {
            return this.f107294c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f107294c, ((r) obj).f107294c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f107294c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f107294c + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class s extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f107295c;

        /* JADX WARN: Illegal instructions before constructor call */
        public s(float f11) {
            boolean z11 = false;
            super(z11, z11, 3, null);
            this.f107295c = f11;
        }

        public final float c() {
            return this.f107295c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f107295c, ((s) obj).f107295c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f107295c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f107295c + ')';
        }
    }

    public /* synthetic */ h(boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, z12);
    }

    public final boolean a() {
        return this.f107235a;
    }

    public final boolean b() {
        return this.f107236b;
    }

    private h(boolean z11, boolean z12) {
        this.f107235a = z11;
        this.f107236b = z12;
    }

    public /* synthetic */ h(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, null);
    }
}
