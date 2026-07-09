package bb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f14154a = new d("MEMORY_CACHE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f14155b = new d("MEMORY", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f14156c = new d("DISK", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f14157d = new d("NETWORK", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ d[] f14158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f14159f;

    static {
        d[] dVarArrA = a();
        f14158e = dVarArrA;
        f14159f = cf0.b.a(dVarArrA);
    }

    private d(String str, int i11) {
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f14154a, f14155b, f14156c, f14157d};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14158e.clone();
    }
}
