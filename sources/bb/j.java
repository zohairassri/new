package bb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f14169a = new j("IGNORE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f14170b = new j("RESPECT_PERFORMANCE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f14171c = new j("RESPECT_ALL", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ j[] f14172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f14173e;

    static {
        j[] jVarArrA = a();
        f14172d = jVarArrA;
        f14173e = cf0.b.a(jVarArrA);
    }

    private j(String str, int i11) {
    }

    private static final /* synthetic */ j[] a() {
        return new j[]{f14169a, f14170b, f14171c};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f14172d.clone();
    }
}
