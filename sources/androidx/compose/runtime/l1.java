package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1 f4560a = new l1("IGNORED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l1 f4561b = new l1("SCHEDULED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l1 f4562c = new l1("DEFERRED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l1 f4563d = new l1("IMMINENT", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ l1[] f4564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f4565f;

    static {
        l1[] l1VarArrA = a();
        f4564e = l1VarArrA;
        f4565f = cf0.b.a(l1VarArrA);
    }

    private l1(String str, int i11) {
    }

    private static final /* synthetic */ l1[] a() {
        return new l1[]{f4560a, f4561b, f4562c, f4563d};
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) f4564e.clone();
    }
}
