package mc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f116025a = new h("Get", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f116026b = new h("Post", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ h[] f116027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f116028d;

    static {
        h[] hVarArrA = a();
        f116027c = hVarArrA;
        f116028d = cf0.b.a(hVarArrA);
    }

    private h(String str, int i11) {
    }

    private static final /* synthetic */ h[] a() {
        return new h[]{f116025a, f116026b};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f116027c.clone();
    }
}
