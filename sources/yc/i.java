package yc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f140325a = new i("Text", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f140326b = new i("Binary", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ i[] f140327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f140328d;

    static {
        i[] iVarArrA = a();
        f140327c = iVarArrA;
        f140328d = cf0.b.a(iVarArrA);
    }

    private i(String str, int i11) {
    }

    private static final /* synthetic */ i[] a() {
        return new i[]{f140325a, f140326b};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f140327c.clone();
    }
}
