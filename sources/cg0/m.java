package cg0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f17723a = new m("SUCCESSFUL", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f17724b = new m("REREGISTER", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f17725c = new m("CANCELLED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f17726d = new m("ALREADY_SELECTED", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ m[] f17727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f17728f;

    static {
        m[] mVarArrA = a();
        f17727e = mVarArrA;
        f17728f = cf0.b.a(mVarArrA);
    }

    private m(String str, int i11) {
    }

    private static final /* synthetic */ m[] a() {
        return new m[]{f17723a, f17724b, f17725c, f17726d};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f17727e.clone();
    }
}
