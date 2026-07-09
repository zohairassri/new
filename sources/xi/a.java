package xi;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class a extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f137703g = new a(0, 0, "00000000000000000000000000000000");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f137704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f137705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f137706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f137707f;

    private a(long j11, long j12, String str) {
        this.f137704c = j11;
        this.f137705d = j12;
        this.f137706e = str;
    }

    public static a c(long j11, long j12) {
        return new a(j11, j12, null);
    }

    @Override // xi.c
    public String b() {
        String str = this.f137706e;
        if (str != null) {
            return str;
        }
        String strF = yi.a.f(this.f137704c, this.f137705d, 32);
        this.f137706e = strF;
        return strF;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f137704c == aVar.f137704c && this.f137705d == aVar.f137705d;
    }

    public int hashCode() {
        long j11 = this.f137704c;
        long j12 = j11 ^ (j11 >>> 32);
        long j13 = this.f137705d;
        return (int) ((j12 ^ j13) ^ (j13 >>> 32));
    }

    public String toString() {
        String str = this.f137707f;
        if (str != null) {
            return str;
        }
        String unsignedString = Long.toUnsignedString(this.f137705d);
        this.f137707f = unsignedString;
        return unsignedString;
    }
}
