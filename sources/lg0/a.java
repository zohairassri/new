package lg0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f114272a = new a("NONE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f114273b = new a("ALL_JSON_OBJECTS", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f114274c = new a("POLYMORPHIC", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f114275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f114276e;

    static {
        a[] aVarArrA = a();
        f114275d = aVarArrA;
        f114276e = cf0.b.a(aVarArrA);
    }

    private a(String str, int i11) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f114272a, f114273b, f114274c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f114275d.clone();
    }
}
