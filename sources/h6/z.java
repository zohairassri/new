package h6;

import android.net.Uri;
import android.util.Pair;
import h6.b;
import h6.r;
import java.util.Objects;
import k6.n0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f100426a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f100427b = n0.B0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f100428c = n0.B0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f100429d = n0.B0(2);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends z {
        a() {
        }

        @Override // h6.z
        public int b(Object obj) {
            return -1;
        }

        @Override // h6.z
        public b g(int i11, b bVar, boolean z11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // h6.z
        public int i() {
            return 0;
        }

        @Override // h6.z
        public Object m(int i11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // h6.z
        public c o(int i11, c cVar, long j11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // h6.z
        public int p() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f100430h = n0.B0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f100431i = n0.B0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f100432j = n0.B0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f100433k = n0.B0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f100434l = n0.B0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f100435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f100436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f100437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f100438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f100439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f100440f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public h6.b f100441g = h6.b.f99961g;

        public int a(int i11) {
            return this.f100441g.c(i11).f99985b;
        }

        public long b(int i11, int i12) {
            b.a aVarC = this.f100441g.c(i11);
            if (aVarC.f99985b != -1) {
                return aVarC.f99990g[i12];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f100441g.f99968b;
        }

        public int d(long j11) {
            return this.f100441g.d(j11, this.f100438d);
        }

        public int e(long j11) {
            return this.f100441g.e(j11, this.f100438d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.f100435a, bVar.f100435a) && Objects.equals(this.f100436b, bVar.f100436b) && this.f100437c == bVar.f100437c && this.f100438d == bVar.f100438d && this.f100439e == bVar.f100439e && this.f100440f == bVar.f100440f && Objects.equals(this.f100441g, bVar.f100441g)) {
                    return true;
                }
            }
            return false;
        }

        public long f(int i11) {
            return this.f100441g.c(i11).f99984a;
        }

        public long g() {
            return this.f100441g.f99969c;
        }

        public int h(int i11, int i12) {
            b.a aVarC = this.f100441g.c(i11);
            if (aVarC.f99985b != -1) {
                return aVarC.f99989f[i12];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f100435a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f100436b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f100437c) * 31;
            long j11 = this.f100438d;
            int i11 = (iHashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f100439e;
            return ((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f100440f ? 1 : 0)) * 31) + this.f100441g.hashCode();
        }

        public Object i() {
            return this.f100441g.f99967a;
        }

        public long j(int i11) {
            return this.f100441g.c(i11).f99992i;
        }

        public long k() {
            return this.f100438d;
        }

        public int l(int i11) {
            return this.f100441g.c(i11).c();
        }

        public int m(int i11, int i12) {
            return this.f100441g.c(i11).d(i12);
        }

        public long n() {
            return n0.u1(this.f100439e);
        }

        public long o() {
            return this.f100439e;
        }

        public int p() {
            return this.f100441g.f99971e;
        }

        public boolean q(int i11) {
            return !this.f100441g.c(i11).e();
        }

        public boolean r(int i11) {
            return i11 == c() - 1 && this.f100441g.g(i11);
        }

        public boolean s(int i11) {
            return this.f100441g.c(i11).f99993j;
        }

        public b t(Object obj, Object obj2, int i11, long j11, long j12) {
            return u(obj, obj2, i11, j11, j12, h6.b.f99961g, false);
        }

        public b u(Object obj, Object obj2, int i11, long j11, long j12, h6.b bVar, boolean z11) {
            this.f100435a = obj;
            this.f100436b = obj2;
            this.f100437c = i11;
            this.f100438d = j11;
            this.f100439e = j12;
            this.f100441g = bVar;
            this.f100440f = z11;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f100453b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f100455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f100456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f100457f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f100458g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f100459h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f100460i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public r.g f100461j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f100462k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f100463l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f100464m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f100465n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f100466o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f100467p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Object f100442q = new Object();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final Object f100443r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final r f100444s = new r.c().e("androidx.media3.common.Timeline").i(Uri.EMPTY).a();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f100445t = n0.B0(1);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f100446u = n0.B0(2);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final String f100447v = n0.B0(3);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final String f100448w = n0.B0(4);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f100449x = n0.B0(5);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f100450y = n0.B0(6);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f100451z = n0.B0(7);
        private static final String A = n0.B0(8);
        private static final String B = n0.B0(9);
        private static final String C = n0.B0(10);
        private static final String D = n0.B0(11);
        private static final String E = n0.B0(12);
        private static final String F = n0.B0(13);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f100452a = f100442q;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r f100454c = f100444s;

        public long a() {
            return n0.e0(this.f100458g);
        }

        public long b() {
            return n0.u1(this.f100463l);
        }

        public long c() {
            return this.f100463l;
        }

        public long d() {
            return n0.u1(this.f100464m);
        }

        public long e() {
            return this.f100467p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class.equals(obj.getClass())) {
                c cVar = (c) obj;
                if (Objects.equals(this.f100452a, cVar.f100452a) && Objects.equals(this.f100454c, cVar.f100454c) && Objects.equals(this.f100455d, cVar.f100455d) && Objects.equals(this.f100461j, cVar.f100461j) && this.f100456e == cVar.f100456e && this.f100457f == cVar.f100457f && this.f100458g == cVar.f100458g && this.f100459h == cVar.f100459h && this.f100460i == cVar.f100460i && this.f100462k == cVar.f100462k && this.f100463l == cVar.f100463l && this.f100464m == cVar.f100464m && this.f100465n == cVar.f100465n && this.f100466o == cVar.f100466o && this.f100467p == cVar.f100467p) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f100461j != null;
        }

        public c g(Object obj, r rVar, Object obj2, long j11, long j12, long j13, boolean z11, boolean z12, r.g gVar, long j14, long j15, int i11, int i12, long j16) {
            r.h hVar;
            this.f100452a = obj;
            this.f100454c = rVar != null ? rVar : f100444s;
            this.f100453b = (rVar == null || (hVar = rVar.f100177b) == null) ? null : hVar.f100286i;
            this.f100455d = obj2;
            this.f100456e = j11;
            this.f100457f = j12;
            this.f100458g = j13;
            this.f100459h = z11;
            this.f100460i = z12;
            this.f100461j = gVar;
            this.f100463l = j14;
            this.f100464m = j15;
            this.f100465n = i11;
            this.f100466o = i12;
            this.f100467p = j16;
            this.f100462k = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f100452a.hashCode()) * 31) + this.f100454c.hashCode()) * 31;
            Object obj = this.f100455d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            r.g gVar = this.f100461j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j11 = this.f100456e;
            int i11 = (iHashCode3 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f100457f;
            int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f100458g;
            int i13 = (((((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f100459h ? 1 : 0)) * 31) + (this.f100460i ? 1 : 0)) * 31) + (this.f100462k ? 1 : 0)) * 31;
            long j14 = this.f100463l;
            int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
            long j15 = this.f100464m;
            int i15 = (((((i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + this.f100465n) * 31) + this.f100466o) * 31;
            long j16 = this.f100467p;
            return i15 + ((int) (j16 ^ (j16 >>> 32)));
        }
    }

    protected z() {
    }

    public int a(boolean z11) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z11) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i11, b bVar, c cVar, int i12, boolean z11) {
        int i13 = f(i11, bVar).f100437c;
        if (n(i13, cVar).f100466o != i11) {
            return i11 + 1;
        }
        int iE = e(i13, i12, z11);
        if (iE == -1) {
            return -1;
        }
        return n(iE, cVar).f100465n;
    }

    public int e(int i11, int i12, boolean z11) {
        if (i12 == 0) {
            if (i11 == c(z11)) {
                return -1;
            }
            return i11 + 1;
        }
        if (i12 == 1) {
            return i11;
        }
        if (i12 == 2) {
            return i11 == c(z11) ? a(z11) : i11 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (zVar.p() != p() || zVar.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i11 = 0; i11 < p(); i11++) {
            if (!n(i11, cVar).equals(zVar.n(i11, cVar2))) {
                return false;
            }
        }
        for (int i12 = 0; i12 < i(); i12++) {
            if (!g(i12, bVar, true).equals(zVar.g(i12, bVar2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != zVar.a(true) || (iC = c(true)) != zVar.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != zVar.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public final b f(int i11, b bVar) {
        return g(i11, bVar, false);
    }

    public abstract b g(int i11, b bVar, boolean z11);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iP = 217 + p();
        for (int i11 = 0; i11 < p(); i11++) {
            iP = (iP * 31) + n(i11, cVar).hashCode();
        }
        int i12 = (iP * 31) + i();
        for (int i13 = 0; i13 < i(); i13++) {
            i12 = (i12 * 31) + g(i13, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            i12 = (i12 * 31) + iA;
            iA = e(iA, 0, true);
        }
        return i12;
    }

    public abstract int i();

    public final Pair j(c cVar, b bVar, int i11, long j11) {
        return (Pair) k6.a.e(k(cVar, bVar, i11, j11, 0L));
    }

    public final Pair k(c cVar, b bVar, int i11, long j11, long j12) {
        k6.a.c(i11, 0, p());
        o(i11, cVar, j12);
        if (j11 == -9223372036854775807L) {
            j11 = cVar.c();
            if (j11 == -9223372036854775807L) {
                return null;
            }
        }
        int i12 = cVar.f100465n;
        f(i12, bVar);
        while (i12 < cVar.f100466o && bVar.f100439e != j11) {
            int i13 = i12 + 1;
            if (f(i13, bVar).f100439e > j11) {
                break;
            }
            i12 = i13;
        }
        g(i12, bVar, true);
        long jMin = j11 - bVar.f100439e;
        long j13 = bVar.f100438d;
        if (j13 != -9223372036854775807L) {
            jMin = Math.min(jMin, j13 - 1);
        }
        return Pair.create(k6.a.e(bVar.f100436b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int l(int i11, int i12, boolean z11) {
        if (i12 == 0) {
            if (i11 == a(z11)) {
                return -1;
            }
            return i11 - 1;
        }
        if (i12 == 1) {
            return i11;
        }
        if (i12 == 2) {
            return i11 == a(z11) ? c(z11) : i11 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i11);

    public final c n(int i11, c cVar) {
        return o(i11, cVar, 0L);
    }

    public abstract c o(int i11, c cVar, long j11);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i11, b bVar, c cVar, int i12, boolean z11) {
        return d(i11, bVar, cVar, i12, z11) == -1;
    }
}
