package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f87850a = new u0("Horizontal", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f87851b = new u0("Vertical", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ u0[] f87852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f87853d;

    static {
        u0[] u0VarArrA = a();
        f87852c = u0VarArrA;
        f87853d = cf0.b.a(u0VarArrA);
    }

    private u0(String str, int i11) {
    }

    private static final /* synthetic */ u0[] a() {
        return new u0[]{f87850a, f87851b};
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) f87852c.clone();
    }
}
