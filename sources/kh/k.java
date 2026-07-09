package kh;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f110940e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k f110941f = new k(0, Double.MAX_VALUE, -1.7976931348623157E308d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f110942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f110943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f110944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f110945d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return k.f110941f;
        }

        private a() {
        }
    }

    public k(int i11, double d11, double d12, double d13) {
        this.f110942a = i11;
        this.f110943b = d11;
        this.f110944c = d12;
        this.f110945d = d13;
    }

    public final double b() {
        return this.f110944c;
    }

    public final double c() {
        return this.f110945d;
    }

    public final double d() {
        return this.f110943b;
    }

    public final int e() {
        return this.f110942a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f110942a == kVar.f110942a && Double.compare(this.f110943b, kVar.f110943b) == 0 && Double.compare(this.f110944c, kVar.f110944c) == 0 && Double.compare(this.f110945d, kVar.f110945d) == 0;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f110942a) * 31) + Double.hashCode(this.f110943b)) * 31) + Double.hashCode(this.f110944c)) * 31) + Double.hashCode(this.f110945d);
    }

    public String toString() {
        return "VitalInfo(sampleCount=" + this.f110942a + ", minValue=" + this.f110943b + ", maxValue=" + this.f110944c + ", meanValue=" + this.f110945d + ")";
    }
}
