package vt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f133292a = new f("UNKNOWN", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f133293b = new f("VALID", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f133294c = new f("INVALID", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ f[] f133295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f133296e;

    static {
        f[] fVarArrA = a();
        f133295d = fVarArrA;
        f133296e = cf0.b.a(fVarArrA);
    }

    private f(String str, int i11) {
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f133292a, f133293b, f133294c};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f133295d.clone();
    }
}
