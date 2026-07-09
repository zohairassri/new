package af;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f889h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f896g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(long j11, long j12, long j13, int i11, long j14, long j15, long j16) {
        this.f890a = j11;
        this.f891b = j12;
        this.f892c = j13;
        this.f893d = i11;
        this.f894e = j14;
        this.f895f = j15;
        this.f896g = j16;
    }

    public final e a(long j11, long j12, long j13, int i11, long j14, long j15, long j16) {
        return new e(j11, j12, j13, i11, j14, j15, j16);
    }

    public final long c() {
        return this.f896g;
    }

    public final long d() {
        return this.f891b;
    }

    public final long e() {
        return this.f895f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f890a == eVar.f890a && this.f891b == eVar.f891b && this.f892c == eVar.f892c && this.f893d == eVar.f893d && this.f894e == eVar.f894e && this.f895f == eVar.f895f && this.f896g == eVar.f896g;
    }

    public final long f() {
        return this.f892c;
    }

    public final int g() {
        return this.f893d;
    }

    public final long h() {
        return this.f894e;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.f890a) * 31) + Long.hashCode(this.f891b)) * 31) + Long.hashCode(this.f892c)) * 31) + Integer.hashCode(this.f893d)) * 31) + Long.hashCode(this.f894e)) * 31) + Long.hashCode(this.f895f)) * 31) + Long.hashCode(this.f896g);
    }

    public final long i() {
        return this.f890a;
    }

    public String toString() {
        return "FilePersistenceConfig(recentDelayMs=" + this.f890a + ", maxBatchSize=" + this.f891b + ", maxItemSize=" + this.f892c + ", maxItemsPerBatch=" + this.f893d + ", oldFileThreshold=" + this.f894e + ", maxDiskSpace=" + this.f895f + ", cleanupFrequencyThreshold=" + this.f896g + ")";
    }

    public /* synthetic */ e(long j11, long j12, long j13, int i11, long j14, long j15, long j16, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 5000L : j11, (i12 & 2) != 0 ? 4194304L : j12, (i12 & 4) != 0 ? 524288L : j13, (i12 & 8) != 0 ? 500 : i11, (i12 & 16) != 0 ? 64800000L : j14, (i12 & 32) != 0 ? 536870912L : j15, (i12 & 64) != 0 ? 5000L : j16);
    }
}
