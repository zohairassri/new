package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1 f112802a = new x1("Cursor", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x1 f112803b = new x1("SelectionStart", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x1 f112804c = new x1("SelectionEnd", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ x1[] f112805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f112806e;

    static {
        x1[] x1VarArrA = a();
        f112805d = x1VarArrA;
        f112806e = cf0.b.a(x1VarArrA);
    }

    private x1(String str, int i11) {
    }

    private static final /* synthetic */ x1[] a() {
        return new x1[]{f112802a, f112803b, f112804c};
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) f112805d.clone();
    }
}
