package yv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f141014a = new a("None", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f141015b = new a("NoneNoPurchaseDependency", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f141016c = new a("Success", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f141017d = new a("Failure", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f141018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f141019f;

    static {
        a[] aVarArrA = a();
        f141018e = aVarArrA;
        f141019f = cf0.b.a(aVarArrA);
    }

    private a(String str, int i11) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f141014a, f141015b, f141016c, f141017d};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f141018e.clone();
    }
}
