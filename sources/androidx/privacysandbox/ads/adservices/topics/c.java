package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11714c;

    public c(long j11, long j12, int i11) {
        this.f11712a = j11;
        this.f11713b = j12;
        this.f11714c = i11;
    }

    public final long a() {
        return this.f11713b;
    }

    public final long b() {
        return this.f11712a;
    }

    public final int c() {
        return this.f11714c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11712a == cVar.f11712a && this.f11713b == cVar.f11713b && this.f11714c == cVar.f11714c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f11712a) * 31) + Long.hashCode(this.f11713b)) * 31) + Integer.hashCode(this.f11714c);
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f11712a + ", ModelVersion=" + this.f11713b + ", TopicCode=" + this.f11714c + " }");
    }
}
