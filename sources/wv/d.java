package wv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f135951a = new d("ANONYMOUS", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f135952b = new d("ANONYMOUSLY_SUBSCRIBED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f135953c = new d("REGISTERED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f135954d = new d("REGISTERED_SUBSCRIBED_UNLINKED", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f135955e = new d("REGISTERED_SUBSCRIBED_LINKED", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ d[] f135956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f135957g;

    static {
        d[] dVarArrA = a();
        f135956f = dVarArrA;
        f135957g = cf0.b.a(dVarArrA);
    }

    private d(String str, int i11) {
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f135951a, f135952b, f135953c, f135954d, f135955e};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f135956f.clone();
    }
}
