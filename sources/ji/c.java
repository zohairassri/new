package ji;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f105637d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f105638e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f105639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f105640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f105641c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return c.f105638e;
        }

        private a() {
        }
    }

    static {
        String string = new UUID(0L, 0L).toString();
        Intrinsics.checkNotNullExpressionValue(string, "UUID(0, 0).toString()");
        f105638e = string;
    }

    public c(String applicationId, String sessionId, String sessionState) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(sessionState, "sessionState");
        this.f105639a = applicationId;
        this.f105640b = sessionId;
        this.f105641c = sessionState;
    }

    public final String b() {
        return this.f105639a;
    }

    public final String c() {
        return this.f105640b;
    }

    public final String d() {
        return this.f105641c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f105639a, cVar.f105639a) && Intrinsics.areEqual(this.f105640b, cVar.f105640b) && Intrinsics.areEqual(this.f105641c, cVar.f105641c);
    }

    public int hashCode() {
        return (((this.f105639a.hashCode() * 31) + this.f105640b.hashCode()) * 31) + this.f105641c.hashCode();
    }

    public String toString() {
        return "RumContext(applicationId=" + this.f105639a + ", sessionId=" + this.f105640b + ", sessionState=" + this.f105641c + ")";
    }
}
