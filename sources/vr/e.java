package vr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f133235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f133236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f133237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f133238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f133239e;

    public e(Boolean bool, Double d11, Integer num, Integer num2, Long l11) {
        this.f133235a = bool;
        this.f133236b = d11;
        this.f133237c = num;
        this.f133238d = num2;
        this.f133239e = l11;
    }

    public final Integer a() {
        return this.f133238d;
    }

    public final Long b() {
        return this.f133239e;
    }

    public final Boolean c() {
        return this.f133235a;
    }

    public final Integer d() {
        return this.f133237c;
    }

    public final Double e() {
        return this.f133236b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f133235a, eVar.f133235a) && Intrinsics.areEqual((Object) this.f133236b, (Object) eVar.f133236b) && Intrinsics.areEqual(this.f133237c, eVar.f133237c) && Intrinsics.areEqual(this.f133238d, eVar.f133238d) && Intrinsics.areEqual(this.f133239e, eVar.f133239e);
    }

    public int hashCode() {
        Boolean bool = this.f133235a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d11 = this.f133236b;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Integer num = this.f133237c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133238d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l11 = this.f133239e;
        return iHashCode4 + (l11 != null ? l11.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f133235a + ", sessionSamplingRate=" + this.f133236b + ", sessionRestartTimeout=" + this.f133237c + ", cacheDuration=" + this.f133238d + ", cacheUpdatedTime=" + this.f133239e + ')';
    }
}
