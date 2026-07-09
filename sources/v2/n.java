package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f132390a = new n("Min", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f132391b = new n("Max", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ n[] f132392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f132393d;

    static {
        n[] nVarArrA = a();
        f132392c = nVarArrA;
        f132393d = cf0.b.a(nVarArrA);
    }

    private n(String str, int i11) {
    }

    private static final /* synthetic */ n[] a() {
        return new n[]{f132390a, f132391b};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f132392c.clone();
    }
}
