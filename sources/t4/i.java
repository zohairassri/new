package t4;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i f129365b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f129366a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Locale[] f129367a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    private i(j jVar) {
        this.f129366a = jVar;
    }

    public static i a(Locale... localeArr) {
        return h(b.a(localeArr));
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i11 = 0; i11 < length; i11++) {
            localeArr[i11] = a.a(strArrSplit[i11]);
        }
        return a(localeArr);
    }

    public static i d() {
        return f129365b;
    }

    public static i h(LocaleList localeList) {
        return new i(new k(localeList));
    }

    public Locale c(int i11) {
        return this.f129366a.get(i11);
    }

    public boolean e() {
        return this.f129366a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f129366a.equals(((i) obj).f129366a);
    }

    public int f() {
        return this.f129366a.size();
    }

    public String g() {
        return this.f129366a.a();
    }

    public int hashCode() {
        return this.f129366a.hashCode();
    }

    public String toString() {
        return this.f129366a.toString();
    }
}
