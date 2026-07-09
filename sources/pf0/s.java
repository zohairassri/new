package pf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f121544a = new s("PUBLIC", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f121545b = new s("PROTECTED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f121546c = new s("INTERNAL", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f121547d = new s("PRIVATE", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ s[] f121548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f121549f;

    static {
        s[] sVarArrA = a();
        f121548e = sVarArrA;
        f121549f = cf0.b.a(sVarArrA);
    }

    private s(String str, int i11) {
    }

    private static final /* synthetic */ s[] a() {
        return new s[]{f121544a, f121545b, f121546c, f121547d};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f121548e.clone();
    }
}
