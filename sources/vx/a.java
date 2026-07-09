package vx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f133351a = new a("Horizontal", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f133352b = new a("Vertical", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a[] f133353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f133354d;

    static {
        a[] aVarArrA = a();
        f133353c = aVarArrA;
        f133354d = cf0.b.a(aVarArrA);
    }

    private a(String str, int i11) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f133351a, f133352b};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f133353c.clone();
    }
}
