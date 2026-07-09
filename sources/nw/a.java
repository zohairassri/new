package nw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f119798a = new a("NO_OVERRIDE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f119799b = new a("ALL_ACCESS", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f119800c = new a("THE_ATHLETIC", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f119801d = new a("NEWS", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f119802e = new a("COOKING", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f119803f = new a("GAMES", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ a[] f119804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f119805h;

    static {
        a[] aVarArrA = a();
        f119804g = aVarArrA;
        f119805h = cf0.b.a(aVarArrA);
    }

    private a(String str, int i11) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f119798a, f119799b, f119800c, f119801d, f119802e, f119803f};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f119804g.clone();
    }
}
