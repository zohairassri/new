package hy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f102691a = new a("DISABLED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f102692b = new a("ENABLED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f102693c = new a("LOADING", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f102694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f102695e;

    static {
        a[] aVarArrA = a();
        f102694d = aVarArrA;
        f102695e = cf0.b.a(aVarArrA);
    }

    private a(String str, int i11) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f102691a, f102692b, f102693c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f102694d.clone();
    }
}
