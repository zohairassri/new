package we0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f135188a = new q("SYNCHRONIZED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f135189b = new q("PUBLICATION", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f135190c = new q("NONE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ q[] f135191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f135192e;

    static {
        q[] qVarArrA = a();
        f135191d = qVarArrA;
        f135192e = cf0.b.a(qVarArrA);
    }

    private q(String str, int i11) {
    }

    private static final /* synthetic */ q[] a() {
        return new q[]{f135188a, f135189b, f135190c};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f135191d.clone();
    }
}
