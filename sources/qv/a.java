package qv;

import cf0.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f123059a = new a("UiImpression", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f123060b = new a("UiDismiss", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f123061c = new a("UiUpdateApp", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f123062d = new a("UiUnableToUpdateApp", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f123063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f123064f;

    static {
        a[] aVarArrA = a();
        f123063e = aVarArrA;
        f123064f = b.a(aVarArrA);
    }

    private a(String str, int i11) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f123059a, f123060b, f123061c, f123062d};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f123063e.clone();
    }
}
