package y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f139140a = new o0("Closed", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f139141b = new o0("Open", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ o0[] f139142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f139143d;

    static {
        o0[] o0VarArrA = a();
        f139142c = o0VarArrA;
        f139143d = cf0.b.a(o0VarArrA);
    }

    private o0(String str, int i11) {
    }

    private static final /* synthetic */ o0[] a() {
        return new o0[]{f139140a, f139141b};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f139142c.clone();
    }
}
