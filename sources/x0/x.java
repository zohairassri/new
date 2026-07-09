package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f136487a = new x("EditableText", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f136488b = new x("StaticText", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ x[] f136489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f136490d;

    static {
        x[] xVarArrA = a();
        f136489c = xVarArrA;
        f136490d = cf0.b.a(xVarArrA);
    }

    private x(String str, int i11) {
    }

    private static final /* synthetic */ x[] a() {
        return new x[]{f136487a, f136488b};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f136489c.clone();
    }
}
