package h3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f99801a = new h("Paragraph", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f99802b = new h("Span", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f99803c = new h("VerbatimTts", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f99804d = new h("Url", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f99805e = new h("Link", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f99806f = new h("Clickable", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f99807g = new h("String", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ h[] f99808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f99809i;

    static {
        h[] hVarArrA = a();
        f99808h = hVarArrA;
        f99809i = cf0.b.a(hVarArrA);
    }

    private h(String str, int i11) {
    }

    private static final /* synthetic */ h[] a() {
        return new h[]{f99801a, f99802b, f99803c, f99804d, f99805e, f99806f, f99807g};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f99808h.clone();
    }
}
