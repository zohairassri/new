package ow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f120710a = new c("NO_OVERRIDE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f120711b = new c("NO_TCF_HIDE_TCF", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f120712c = new c("NO_TCF_SHOW_TCF", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f120713d = new c("TCF_HASHES_SAME", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f120714e = new c("TCF_HASHES_DIFF", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f120715f = new c("FAILURE", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ c[] f120716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f120717h;

    static {
        c[] cVarArrA = a();
        f120716g = cVarArrA;
        f120717h = cf0.b.a(cVarArrA);
    }

    private c(String str, int i11) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f120710a, f120711b, f120712c, f120713d, f120714e, f120715f};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f120716g.clone();
    }
}
