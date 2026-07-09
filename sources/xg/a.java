package xg;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f137640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f137641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f137642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f137643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f137644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f137645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f137646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f137647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f137648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f137649j;

    public a(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21) {
        this.f137640a = j11;
        this.f137641b = j12;
        this.f137642c = j13;
        this.f137643d = j14;
        this.f137644e = j15;
        this.f137645f = j16;
        this.f137646g = j17;
        this.f137647h = j18;
        this.f137648i = j19;
        this.f137649j = j21;
    }

    public final long a() {
        return this.f137643d;
    }

    public final long b() {
        return this.f137642c;
    }

    public final long c() {
        return this.f137641b;
    }

    public final long d() {
        return this.f137640a;
    }

    public final long e() {
        return this.f137649j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f137640a == aVar.f137640a && this.f137641b == aVar.f137641b && this.f137642c == aVar.f137642c && this.f137643d == aVar.f137643d && this.f137644e == aVar.f137644e && this.f137645f == aVar.f137645f && this.f137646g == aVar.f137646g && this.f137647h == aVar.f137647h && this.f137648i == aVar.f137648i && this.f137649j == aVar.f137649j;
    }

    public final long f() {
        return this.f137648i;
    }

    public final long g() {
        return this.f137647h;
    }

    public final long h() {
        return this.f137646g;
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.f137640a) * 31) + Long.hashCode(this.f137641b)) * 31) + Long.hashCode(this.f137642c)) * 31) + Long.hashCode(this.f137643d)) * 31) + Long.hashCode(this.f137644e)) * 31) + Long.hashCode(this.f137645f)) * 31) + Long.hashCode(this.f137646g)) * 31) + Long.hashCode(this.f137647h)) * 31) + Long.hashCode(this.f137648i)) * 31) + Long.hashCode(this.f137649j);
    }

    public final long i() {
        return this.f137645f;
    }

    public final long j() {
        return this.f137644e;
    }

    public String toString() {
        return "ResourceTiming(dnsStart=" + this.f137640a + ", dnsDuration=" + this.f137641b + ", connectStart=" + this.f137642c + ", connectDuration=" + this.f137643d + ", sslStart=" + this.f137644e + ", sslDuration=" + this.f137645f + ", firstByteStart=" + this.f137646g + ", firstByteDuration=" + this.f137647h + ", downloadStart=" + this.f137648i + ", downloadDuration=" + this.f137649j + ")";
    }
}
