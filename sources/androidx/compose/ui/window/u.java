package androidx.compose.ui.window;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f6289a = new u("Inherit", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f6290b = new u("SecureOn", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f6291c = new u("SecureOff", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ u[] f6292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f6293e;

    static {
        u[] uVarArrA = a();
        f6292d = uVarArrA;
        f6293e = cf0.b.a(uVarArrA);
    }

    private u(String str, int i11) {
    }

    private static final /* synthetic */ u[] a() {
        return new u[]{f6289a, f6290b, f6291c};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f6292d.clone();
    }
}
