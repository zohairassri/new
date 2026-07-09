package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f133565a = new f1("Restart", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f133566b = new f1("Reverse", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ f1[] f133567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f133568d;

    static {
        f1[] f1VarArrA = a();
        f133567c = f1VarArrA;
        f133568d = cf0.b.a(f1VarArrA);
    }

    private f1(String str, int i11) {
    }

    private static final /* synthetic */ f1[] a() {
        return new f1[]{f133565a, f133566b};
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) f133567c.clone();
    }
}
