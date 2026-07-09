package t4;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f129353a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f129354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f129355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f129356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f129357e;

    /* JADX INFO: renamed from: t4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class C1751a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1751a f129358a = new C1751a();

        private C1751a() {
        }

        public final int a(int i11) {
            return SdkExtensions.getExtensionVersion(i11);
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        f129354b = i11 >= 30 ? C1751a.f129358a.a(30) : 0;
        f129355c = i11 >= 30 ? C1751a.f129358a.a(31) : 0;
        f129356d = i11 >= 30 ? C1751a.f129358a.a(33) : 0;
        f129357e = i11 >= 30 ? C1751a.f129358a.a(1000000) : 0;
    }

    private a() {
    }

    public static final boolean a(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.areEqual("REL", buildCodename)) {
            return false;
        }
        Integer numB = b(buildCodename);
        Integer numB2 = b(codename);
        if (numB != null && numB2 != null) {
            return numB.intValue() >= numB2.intValue();
        }
        if (numB != null || numB2 != null) {
            return numB != null;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    private static final Integer b(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return Intrinsics.areEqual(upperCase, "BAKLAVA") ? 0 : null;
    }

    public static final boolean c() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            return true;
        }
        if (i11 < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("UpsideDownCake", CODENAME);
    }
}
