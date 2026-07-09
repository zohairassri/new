package xp;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f137941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f137942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f137943c;

    private q(Class cls, int i11, int i12) {
        this(a0.b(cls), i11, i12);
    }

    public static q a(Class cls) {
        return new q(cls, 0, 2);
    }

    private static String b(int i11) {
        if (i11 == 0) {
            return "direct";
        }
        if (i11 == 1) {
            return "provider";
        }
        if (i11 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i11);
    }

    public static q h(Class cls) {
        return new q(cls, 0, 0);
    }

    public static q i(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q j(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q k(a0 a0Var) {
        return new q(a0Var, 1, 0);
    }

    public static q l(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q m(a0 a0Var) {
        return new q(a0Var, 1, 1);
    }

    public static q n(Class cls) {
        return new q(cls, 2, 0);
    }

    public a0 c() {
        return this.f137941a;
    }

    public boolean d() {
        return this.f137943c == 2;
    }

    public boolean e() {
        return this.f137943c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f137941a.equals(qVar.f137941a) && this.f137942b == qVar.f137942b && this.f137943c == qVar.f137943c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f137942b == 1;
    }

    public boolean g() {
        return this.f137942b == 2;
    }

    public int hashCode() {
        return this.f137943c ^ ((((this.f137941a.hashCode() ^ 1000003) * 1000003) ^ this.f137942b) * 1000003);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f137941a);
        sb2.append(", type=");
        int i11 = this.f137942b;
        sb2.append(i11 == 1 ? "required" : i11 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(b(this.f137943c));
        sb2.append("}");
        return sb2.toString();
    }

    private q(a0 a0Var, int i11, int i12) {
        this.f137941a = (a0) z.c(a0Var, "Null dependency anInterface.");
        this.f137942b = i11;
        this.f137943c = i12;
    }
}
