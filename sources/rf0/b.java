package rf0;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f124825b = new b("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f124826c = new b("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f124827d = new b("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f124828e = new b("SECONDS", 3, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f124829f = new b("MINUTES", 4, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f124830g = new b("HOURS", 5, TimeUnit.HOURS);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f124831h = new b("DAYS", 6, TimeUnit.DAYS);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ b[] f124832i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f124833l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeUnit f124834a;

    static {
        b[] bVarArrA = a();
        f124832i = bVarArrA;
        f124833l = cf0.b.a(bVarArrA);
    }

    private b(String str, int i11, TimeUnit timeUnit) {
        this.f124834a = timeUnit;
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f124825b, f124826c, f124827d, f124828e, f124829f, f124830g, f124831h};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f124832i.clone();
    }

    public final TimeUnit b() {
        return this.f124834a;
    }
}
