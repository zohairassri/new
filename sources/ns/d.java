package ns;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f119576c = new d("Mastercard", "^5[1-5][0-9]{5,}|222[1-9][0-9]{3,}|22[3-9][0-9]{4,}|2[3-6][0-9]{5,}|27[01][0-9]{4,}|2720[0-9]{3,}$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f119577d = new d("American Express", "^3[47][0-9]{5,}$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f119578e = new d("Visa", "^4[0-9]{6,}$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f119579f = new d("Discover", "^6(?:011|5[0-9]{2})[0-9]{3,}$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f119580g = new d("Diners Club", "^3(?:0[0-5]|[68][0-9])[0-9]{4,}$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f119581h = new d("JCB", "^(?:2131|1800|35[0-9]{3})[0-9]{3,}$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f119582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f119583b;

    public d(String str, String str2) {
        this.f119582a = str;
        this.f119583b = Pattern.compile(str2);
    }

    public static Set a() {
        HashSet hashSet = new HashSet();
        hashSet.add(f119576c);
        hashSet.add(f119577d);
        hashSet.add(f119578e);
        hashSet.add(f119579f);
        hashSet.add(f119580g);
        hashSet.add(f119581h);
        return hashSet;
    }
}
