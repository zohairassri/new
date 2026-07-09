package g3;

import com.amazonaws.services.s3.model.BucketVersioningConfiguration;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f98027a = new a("On", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f98028b = new a(BucketVersioningConfiguration.OFF, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f98029c = new a("Indeterminate", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f98030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cf0.a f98031e;

    static {
        a[] aVarArrA = a();
        f98030d = aVarArrA;
        f98031e = cf0.b.a(aVarArrA);
    }

    private a(String str, int i11) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f98027a, f98028b, f98029c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f98030d.clone();
    }
}
