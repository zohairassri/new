package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p2 f4692a = new p2("Invalid", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p2 f4693b = new p2("Cancelled", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2 f4694c = new p2("InitialPending", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p2 f4695d = new p2("RecomposePending", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p2 f4696e = new p2("Recomposing", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p2 f4697f = new p2("ApplyPending", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p2 f4698g = new p2("Applied", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ p2[] f4699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f4700i;

    static {
        p2[] p2VarArrA = a();
        f4699h = p2VarArrA;
        f4700i = cf0.b.a(p2VarArrA);
    }

    private p2(String str, int i11) {
    }

    private static final /* synthetic */ p2[] a() {
        return new p2[]{f4692a, f4693b, f4694c, f4695d, f4696e, f4697f, f4698g};
    }

    public static p2 valueOf(String str) {
        return (p2) Enum.valueOf(p2.class, str);
    }

    public static p2[] values() {
        return (p2[]) f4699h.clone();
    }
}
