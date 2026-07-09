package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f111912c = new m("IGNORE_CASE", 0, 2, 0, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f111913d = new m("MULTILINE", 1, 8, 0, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f111914e = new m("LITERAL", 2, 16, 0, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f111915f = new m("UNIX_LINES", 3, 1, 0, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f111916g = new m("COMMENTS", 4, 4, 0, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f111917h = new m("DOT_MATCHES_ALL", 5, 32, 0, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f111918i = new m("CANON_EQ", 6, 128, 0, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ m[] f111919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f111920m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f111921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f111922b;

    static {
        m[] mVarArrA = a();
        f111919l = mVarArrA;
        f111920m = cf0.b.a(mVarArrA);
    }

    private m(String str, int i11, int i12, int i13) {
        this.f111921a = i12;
        this.f111922b = i13;
    }

    private static final /* synthetic */ m[] a() {
        return new m[]{f111912c, f111913d, f111914e, f111915f, f111916g, f111917h, f111918i};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f111919l.clone();
    }

    public int b() {
        return this.f111921a;
    }

    /* synthetic */ m(String str, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, i12, (i14 & 2) != 0 ? i12 : i13);
    }
}
