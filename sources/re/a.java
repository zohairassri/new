package re;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.g;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1662a f124765f = new C1662a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f124766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f124767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f124768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f124769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f124770e;

    /* JADX INFO: renamed from: re.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1662a {
        public /* synthetic */ C1662a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1662a() {
        }
    }

    public a(g frequency, int i11) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f124766a = frequency;
        this.f124767b = i11;
        this.f124768c = frequency.b();
        this.f124769d = ((long) 10) * frequency.b();
        this.f124770e = ((long) 5) * frequency.b();
    }

    public final long a() {
        return this.f124770e;
    }

    public final int b() {
        return this.f124767b;
    }

    public final long c() {
        return this.f124769d;
    }

    public final long d() {
        return this.f124768c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f124766a == aVar.f124766a && this.f124767b == aVar.f124767b;
    }

    public int hashCode() {
        return (this.f124766a.hashCode() * 31) + Integer.hashCode(this.f124767b);
    }

    public String toString() {
        return "DataUploadConfiguration(frequency=" + this.f124766a + ", maxBatchesPerUploadJob=" + this.f124767b + ")";
    }
}
