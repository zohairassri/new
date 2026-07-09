package jb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f105354c = new b("ENABLED", 0, true, true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f105355d = new b("READ_ONLY", 1, true, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f105356e = new b("WRITE_ONLY", 2, false, true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f105357f = new b("DISABLED", 3, false, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ b[] f105358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f105359h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f105360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f105361b;

    static {
        b[] bVarArrA = a();
        f105358g = bVarArrA;
        f105359h = cf0.b.a(bVarArrA);
    }

    private b(String str, int i11, boolean z11, boolean z12) {
        this.f105360a = z11;
        this.f105361b = z12;
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f105354c, f105355d, f105356e, f105357f};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f105358g.clone();
    }

    public final boolean b() {
        return this.f105360a;
    }

    public final boolean c() {
        return this.f105361b;
    }
}
