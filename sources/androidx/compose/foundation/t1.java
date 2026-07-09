package androidx.compose.foundation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1 f4088a = new t1("Default", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1 f4089b = new t1("UserInput", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1 f4090c = new t1("PreventUserInput", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ t1[] f4091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f4092e;

    static {
        t1[] t1VarArrA = a();
        f4091d = t1VarArrA;
        f4092e = cf0.b.a(t1VarArrA);
    }

    private t1(String str, int i11) {
    }

    private static final /* synthetic */ t1[] a() {
        return new t1[]{f4088a, f4089b, f4090c};
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) f4091d.clone();
    }
}
