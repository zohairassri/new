package wf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f135303a = new k0("START", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k0 f135304b = new k0("STOP", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f135305c = new k0("STOP_AND_RESET_REPLAY_CACHE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ k0[] f135306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f135307e;

    static {
        k0[] k0VarArrA = a();
        f135306d = k0VarArrA;
        f135307e = cf0.b.a(k0VarArrA);
    }

    private k0(String str, int i11) {
    }

    private static final /* synthetic */ k0[] a() {
        return new k0[]{f135303a, f135304b, f135305c};
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f135306d.clone();
    }
}
