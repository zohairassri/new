package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f87842a = new t0("Min", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t0 f87843b = new t0("Max", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ t0[] f87844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f87845d;

    static {
        t0[] t0VarArrA = a();
        f87844c = t0VarArrA;
        f87845d = cf0.b.a(t0VarArrA);
    }

    private t0(String str, int i11) {
    }

    private static final /* synthetic */ t0[] a() {
        return new t0[]{f87842a, f87843b};
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) f87844c.clone();
    }
}
