package lb0;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1389a f113977e = new C1389a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f113978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f113979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f113980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f113981d;

    /* JADX INFO: renamed from: lb0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1389a {
        public /* synthetic */ C1389a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1389a() {
        }
    }

    public a(long j11, List list, Long l11, Integer num) {
        this.f113978a = j11;
        this.f113979b = list;
        this.f113980c = l11;
        this.f113981d = num;
    }

    public final Integer a() {
        return this.f113981d;
    }

    public final Long b() {
        return this.f113980c;
    }

    public final List c() {
        return this.f113979b;
    }

    public final long d() {
        return this.f113978a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f113978a == aVar.f113978a && Intrinsics.areEqual(this.f113979b, aVar.f113979b) && Intrinsics.areEqual(this.f113980c, aVar.f113980c) && Intrinsics.areEqual(this.f113981d, aVar.f113981d);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f113978a) * 31;
        List list = this.f113979b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l11 = this.f113980c;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.f113981d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AnrSample(timestamp=" + this.f113978a + ", threads=" + this.f113979b + ", sampleOverheadMs=" + this.f113980c + ", code=" + this.f113981d + ')';
    }

    public /* synthetic */ a(long j11, List list, Long l11, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, l11, (i11 & 8) != 0 ? 0 : num);
    }
}
