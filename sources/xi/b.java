package xi;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class b extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f137708f = new b(-1, "18446744073709551615");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f137709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f137710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f137711e;

    b(long j11, String str) {
        this.f137709c = j11;
        this.f137710d = str;
    }

    static b c(long j11, String str) {
        c cVar;
        return (j11 != 0 || (cVar = c.f137712a) == null) ? j11 == -1 ? f137708f : new b(j11, str) : (b) cVar;
    }

    public static b d(long j11) {
        return c(j11, null);
    }

    @Override // xi.c
    public String b() {
        String str = this.f137711e;
        if (str != null) {
            return str;
        }
        String strE = yi.a.e(this.f137709c, 32);
        this.f137711e = strE;
        return strE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f137709c == ((b) obj).f137709c;
    }

    public int hashCode() {
        long j11 = this.f137709c;
        return (int) (j11 ^ (j11 >>> 32));
    }

    public String toString() {
        String str = this.f137710d;
        if (str != null) {
            return str;
        }
        String unsignedString = Long.toUnsignedString(this.f137709c);
        this.f137710d = unsignedString;
        return unsignedString;
    }
}
