package di0;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f89972e = new g('0', '+', '-', '.');

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap f89973f = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f89974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f89975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f89976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char f89977d;

    private g(char c11, char c12, char c13, char c14) {
        this.f89974a = c11;
        this.f89975b = c12;
        this.f89976c = c13;
        this.f89977d = c14;
    }

    String a(String str) {
        char c11 = this.f89974a;
        if (c11 == '0') {
            return str;
        }
        int i11 = c11 - '0';
        char[] charArray = str.toCharArray();
        for (int i12 = 0; i12 < charArray.length; i12++) {
            charArray[i12] = (char) (charArray[i12] + i11);
        }
        return new String(charArray);
    }

    int b(char c11) {
        int i11 = c11 - this.f89974a;
        if (i11 < 0 || i11 > 9) {
            return -1;
        }
        return i11;
    }

    public char c() {
        return this.f89977d;
    }

    public char d() {
        return this.f89976c;
    }

    public char e() {
        return this.f89975b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f89974a == gVar.f89974a && this.f89975b == gVar.f89975b && this.f89976c == gVar.f89976c && this.f89977d == gVar.f89977d) {
                return true;
            }
        }
        return false;
    }

    public char f() {
        return this.f89974a;
    }

    public int hashCode() {
        return this.f89974a + this.f89975b + this.f89976c + this.f89977d;
    }

    public String toString() {
        return "DecimalStyle[" + this.f89974a + this.f89975b + this.f89976c + this.f89977d + "]";
    }
}
