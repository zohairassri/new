package z3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f141746e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p f141747f = new p(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f141748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f141749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f141750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f141751d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a() {
            return p.f141747f;
        }

        private a() {
        }
    }

    public p(int i11, int i12, int i13, int i14) {
        this.f141748a = i11;
        this.f141749b = i12;
        this.f141750c = i13;
        this.f141751d = i14;
    }

    public static /* synthetic */ p c(p pVar, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = pVar.f141748a;
        }
        if ((i15 & 2) != 0) {
            i12 = pVar.f141749b;
        }
        if ((i15 & 4) != 0) {
            i13 = pVar.f141750c;
        }
        if ((i15 & 8) != 0) {
            i14 = pVar.f141751d;
        }
        return pVar.b(i11, i12, i13, i14);
    }

    public final p b(int i11, int i12, int i13, int i14) {
        return new p(i11, i12, i13, i14);
    }

    public final int d() {
        return this.f141751d;
    }

    public final long e() {
        return n.f((((long) (this.f141749b + (f() / 2))) & 4294967295L) | (((long) (this.f141748a + (l() / 2))) << 32));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f141748a == pVar.f141748a && this.f141749b == pVar.f141749b && this.f141750c == pVar.f141750c && this.f141751d == pVar.f141751d;
    }

    public final int f() {
        return this.f141751d - this.f141749b;
    }

    public final int g() {
        return this.f141748a;
    }

    public final int h() {
        return this.f141750c;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f141748a) * 31) + Integer.hashCode(this.f141749b)) * 31) + Integer.hashCode(this.f141750c)) * 31) + Integer.hashCode(this.f141751d);
    }

    public final long i() {
        return r.c((((long) l()) << 32) | (((long) f()) & 4294967295L));
    }

    public final int j() {
        return this.f141749b;
    }

    public final long k() {
        return n.f((((long) this.f141748a) << 32) | (((long) this.f141749b) & 4294967295L));
    }

    public final int l() {
        return this.f141750c - this.f141748a;
    }

    public final boolean m() {
        return this.f141748a >= this.f141750c || this.f141749b >= this.f141751d;
    }

    public final p n(int i11, int i12) {
        return new p(this.f141748a + i11, this.f141749b + i12, this.f141750c + i11, this.f141751d + i12);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f141748a + ", " + this.f141749b + ", " + this.f141750c + ", " + this.f141751d + ')';
    }
}
