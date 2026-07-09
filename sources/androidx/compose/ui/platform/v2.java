package androidx.compose.ui.platform;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v2 f5897a = new v2("Shown", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v2 f5898b = new v2("Hidden", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ v2[] f5899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f5900d;

    static {
        v2[] v2VarArrA = a();
        f5899c = v2VarArrA;
        f5900d = cf0.b.a(v2VarArrA);
    }

    private v2(String str, int i11) {
    }

    private static final /* synthetic */ v2[] a() {
        return new v2[]{f5897a, f5898b};
    }

    public static v2 valueOf(String str) {
        return (v2) Enum.valueOf(v2.class, str);
    }

    public static v2[] values() {
        return (v2[]) f5899c.clone();
    }
}
