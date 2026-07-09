package ge;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f98507e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f98508f = new d(524288, 500, 4194304, 64800000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f98509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f98510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f98511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f98512d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return d.f98508f;
        }

        private a() {
        }
    }

    public d(long j11, int i11, long j12, long j13) {
        this.f98509a = j11;
        this.f98510b = i11;
        this.f98511c = j12;
        this.f98512d = j13;
    }

    public static /* synthetic */ d c(d dVar, long j11, int i11, long j12, long j13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = dVar.f98509a;
        }
        long j14 = j11;
        if ((i12 & 2) != 0) {
            i11 = dVar.f98510b;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            j12 = dVar.f98511c;
        }
        long j15 = j12;
        if ((i12 & 8) != 0) {
            j13 = dVar.f98512d;
        }
        return dVar.b(j14, i13, j15, j13);
    }

    public final d b(long j11, int i11, long j12, long j13) {
        return new d(j11, i11, j12, j13);
    }

    public final long d() {
        return this.f98511c;
    }

    public final long e() {
        return this.f98509a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f98509a == dVar.f98509a && this.f98510b == dVar.f98510b && this.f98511c == dVar.f98511c && this.f98512d == dVar.f98512d;
    }

    public final int f() {
        return this.f98510b;
    }

    public final long g() {
        return this.f98512d;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f98509a) * 31) + Integer.hashCode(this.f98510b)) * 31) + Long.hashCode(this.f98511c)) * 31) + Long.hashCode(this.f98512d);
    }

    public String toString() {
        return "FeatureStorageConfiguration(maxItemSize=" + this.f98509a + ", maxItemsPerBatch=" + this.f98510b + ", maxBatchSize=" + this.f98511c + ", oldBatchThreshold=" + this.f98512d + ")";
    }
}
