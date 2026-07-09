package mb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f115995a = new c("UNCHANGED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f115996b = new c("TRANSLUCENT", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f115997c = new c("OPAQUE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f115998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f115999e;

    static {
        c[] cVarArrA = a();
        f115998d = cVarArrA;
        f115999e = cf0.b.a(cVarArrA);
    }

    private c(String str, int i11) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f115995a, f115996b, f115997c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f115998d.clone();
    }
}
