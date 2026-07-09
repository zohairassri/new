package xv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f138011a = new c("ORIG_PURCHASE_LINK", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f138012b = new c("LINK_PURCHASE_AFTER_LOGIN", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f138013c = new c("RE_LINK_ON_APP_OPEN", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f138014d = new c("RE_LINK_USER_INIT", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ c[] f138015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f138016f;

    static {
        c[] cVarArrA = a();
        f138015e = cVarArrA;
        f138016f = cf0.b.a(cVarArrA);
    }

    private c(String str, int i11) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f138011a, f138012b, f138013c, f138014d};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f138015e.clone();
    }
}
