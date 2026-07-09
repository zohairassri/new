package nu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f119778a = new d("BACKGROUND", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f119779b = new d("FOREGROUND", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ d[] f119780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f119781d;

    static {
        d[] dVarArrA = a();
        f119780c = dVarArrA;
        f119781d = cf0.b.a(dVarArrA);
    }

    private d(String str, int i11) {
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f119778a, f119779b};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f119780c.clone();
    }
}
