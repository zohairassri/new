package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f132394a = new o("Width", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f132395b = new o("Height", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ o[] f132396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f132397d;

    static {
        o[] oVarArrA = a();
        f132396c = oVarArrA;
        f132397d = cf0.b.a(oVarArrA);
    }

    private o(String str, int i11) {
    }

    private static final /* synthetic */ o[] a() {
        return new o[]{f132394a, f132395b};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f132396c.clone();
    }
}
