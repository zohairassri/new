package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f136379a = new m0("Left", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0 f136380b = new m0("Middle", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f136381c = new m0("Right", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ m0[] f136382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f136383e;

    static {
        m0[] m0VarArrA = a();
        f136382d = m0VarArrA;
        f136383e = cf0.b.a(m0VarArrA);
    }

    private m0(String str, int i11) {
    }

    private static final /* synthetic */ m0[] a() {
        return new m0[]{f136379a, f136380b, f136381c};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f136382d.clone();
    }
}
