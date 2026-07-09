package ow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f120718a = new e("NO_OVERRIDE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f120719b = new e("SUCCESS", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f120720c = new e("FAILURE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ e[] f120721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f120722e;

    static {
        e[] eVarArrA = a();
        f120721d = eVarArrA;
        f120722e = cf0.b.a(eVarArrA);
    }

    private e(String str, int i11) {
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f120718a, f120719b, f120720c};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f120721d.clone();
    }
}
