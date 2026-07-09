package tr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f130322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f130323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f130324c;

    public e(d performance, d crashlytics, double d11) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f130322a = performance;
        this.f130323b = crashlytics;
        this.f130324c = d11;
    }

    public final d a() {
        return this.f130323b;
    }

    public final d b() {
        return this.f130322a;
    }

    public final double c() {
        return this.f130324c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f130322a == eVar.f130322a && this.f130323b == eVar.f130323b && Intrinsics.areEqual((Object) Double.valueOf(this.f130324c), (Object) Double.valueOf(eVar.f130324c));
    }

    public int hashCode() {
        return (((this.f130322a.hashCode() * 31) + this.f130323b.hashCode()) * 31) + Double.hashCode(this.f130324c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f130322a + ", crashlytics=" + this.f130323b + ", sessionSamplingRate=" + this.f130324c + ')';
    }
}
