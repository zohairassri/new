package mg0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f116249c = new m0("OBJ", 0, '{', '}');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m0 f116250d = new m0("LIST", 1, '[', ']');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0 f116251e = new m0("MAP", 2, '{', '}');

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m0 f116252f = new m0("POLY_OBJ", 3, '[', ']');

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ m0[] f116253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f116254h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f116255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f116256b;

    static {
        m0[] m0VarArrA = a();
        f116253g = m0VarArrA;
        f116254h = cf0.b.a(m0VarArrA);
    }

    private m0(String str, int i11, char c11, char c12) {
        this.f116255a = c11;
        this.f116256b = c12;
    }

    private static final /* synthetic */ m0[] a() {
        return new m0[]{f116249c, f116250d, f116251e, f116252f};
    }

    public static cf0.a b() {
        return f116254h;
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f116253g.clone();
    }
}
