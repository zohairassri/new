package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f136374a = new m("CROSSED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f136375b = new m("NOT_CROSSED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f136376c = new m("COLLAPSED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ m[] f136377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f136378e;

    static {
        m[] mVarArrA = a();
        f136377d = mVarArrA;
        f136378e = cf0.b.a(mVarArrA);
    }

    private m(String str, int i11) {
    }

    private static final /* synthetic */ m[] a() {
        return new m[]{f136374a, f136375b, f136376c};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f136377d.clone();
    }
}
