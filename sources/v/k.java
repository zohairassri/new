package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f132116a = new k("PreEnter", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f132117b = new k("Visible", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f132118c = new k("PostExit", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ k[] f132119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f132120e;

    static {
        k[] kVarArrA = a();
        f132119d = kVarArrA;
        f132120e = cf0.b.a(kVarArrA);
    }

    private k(String str, int i11) {
    }

    private static final /* synthetic */ k[] a() {
        return new k[]{f132116a, f132117b, f132118c};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f132119d.clone();
    }
}
