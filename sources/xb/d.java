package xb;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f137314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f137315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f137316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f137317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f137318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f137319f;

    public d(List list, char c11, double d11, double d12, String str, String str2) {
        this.f137314a = list;
        this.f137315b = c11;
        this.f137316c = d11;
        this.f137317d = d12;
        this.f137318e = str;
        this.f137319f = str2;
    }

    public static int c(char c11, String str, String str2) {
        return (((c11 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List a() {
        return this.f137314a;
    }

    public double b() {
        return this.f137317d;
    }

    public int hashCode() {
        return c(this.f137315b, this.f137319f, this.f137318e);
    }
}
