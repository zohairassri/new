package u4;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f130988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f130990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f130991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f130992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f130993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f130994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f130995h;

    public e(String str, String str2, String str3, List list) {
        this(str, str2, str3, list, null, null);
    }

    private String a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public List b() {
        return this.f130991d;
    }

    public int c() {
        return this.f130992e;
    }

    String d() {
        return this.f130995h;
    }

    public String e() {
        return this.f130988a;
    }

    public String f() {
        return this.f130989b;
    }

    public String g() {
        return this.f130990c;
    }

    public String h() {
        return this.f130993f;
    }

    public String i() {
        return this.f130994g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f130988a + ", mProviderPackage: " + this.f130989b + ", mQuery: " + this.f130990c + ", mSystemFont: " + this.f130993f + ", mVariationSettings: " + this.f130994g + ", mCertificates:");
        for (int i11 = 0; i11 < this.f130991d.size(); i11++) {
            sb2.append(" [");
            List list = (List) this.f130991d.get(i11);
            for (int i12 = 0; i12 < list.size(); i12++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i12), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f130992e);
        return sb2.toString();
    }

    public e(String str, String str2, String str3, List list, String str4, String str5) {
        this.f130988a = (String) w4.i.g(str);
        this.f130989b = (String) w4.i.g(str2);
        this.f130990c = (String) w4.i.g(str3);
        this.f130991d = (List) w4.i.g(list);
        this.f130992e = 0;
        this.f130993f = str4;
        this.f130994g = str5;
        this.f130995h = a(str, str2, str3, str4, str5);
    }
}
