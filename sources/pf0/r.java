package pf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f121539a = new r("INVARIANT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f121540b = new r("IN", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f121541c = new r("OUT", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ r[] f121542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f121543e;

    static {
        r[] rVarArrA = a();
        f121542d = rVarArrA;
        f121543e = cf0.b.a(rVarArrA);
    }

    private r(String str, int i11) {
    }

    private static final /* synthetic */ r[] a() {
        return new r[]{f121539a, f121540b, f121541c};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f121542d.clone();
    }
}
