package lw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f114907a = new c("NO_OVERRIDE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f114908b = new c("SUCCESS_ENTITLED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f114909c = new c("SUCCESS_NON_SUBSCRIBER", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f114910d = new c("SOFT_CANCELLED_OWNER_UNKNOWN", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f114911e = new c("INVALID_DATES", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f114912f = new c("FAILURE", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f114913g = new c("FAILURE_SOCKET_EXCEPTION", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f114914h = new c("FAILURE_INVALID_APOLLO_RESPONSE", 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f114915i = new c("FAIL_OPEN_USER_EMPTY", 8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f114916l = new c("FAIL_OPEN_SUBSCRIPTIONS_EMPTY", 9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ c[] f114917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f114918n;

    static {
        c[] cVarArrA = a();
        f114917m = cVarArrA;
        f114918n = cf0.b.a(cVarArrA);
    }

    private c(String str, int i11) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f114907a, f114908b, f114909c, f114910d, f114911e, f114912f, f114913g, f114914h, f114915i, f114916l};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f114917m.clone();
    }
}
