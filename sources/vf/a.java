package vf;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xf.g;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: vf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class AbstractC1851a extends a {

        /* JADX INFO: renamed from: vf.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C1852a extends AbstractC1851a {
            public abstract boolean b();

            public abstract boolean c();

            public abstract boolean d();
        }

        public abstract Map a();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f132983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f132984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f132985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f132986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f132987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f132988f;

        public b(boolean z11, long j11, long j12, boolean z12, boolean z13, int i11) {
            super(null);
            this.f132983a = z11;
            this.f132984b = j11;
            this.f132985c = j12;
            this.f132986d = z12;
            this.f132987e = z13;
            this.f132988f = i11;
        }

        public final int a() {
            return this.f132988f;
        }

        public final long b() {
            return this.f132984b;
        }

        public final long c() {
            return this.f132985c;
        }

        public final boolean d() {
            return this.f132983a;
        }

        public final boolean e() {
            return this.f132987e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f132983a == bVar.f132983a && this.f132984b == bVar.f132984b && this.f132985c == bVar.f132985c && this.f132986d == bVar.f132986d && this.f132987e == bVar.f132987e && this.f132988f == bVar.f132988f;
        }

        public final boolean f() {
            return this.f132986d;
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.f132983a) * 31) + Long.hashCode(this.f132984b)) * 31) + Long.hashCode(this.f132985c)) * 31) + Boolean.hashCode(this.f132986d)) * 31) + Boolean.hashCode(this.f132987e)) * 31) + Integer.hashCode(this.f132988f);
        }

        public String toString() {
            return "Configuration(trackErrors=" + this.f132983a + ", batchSize=" + this.f132984b + ", batchUploadFrequency=" + this.f132985c + ", useProxy=" + this.f132986d + ", useLocalEncryption=" + this.f132987e + ", batchProcessingLevel=" + this.f132988f + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f132989a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f132990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f132991b;

        /* JADX INFO: renamed from: vf.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C1853a extends d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1853a(String message, Map map) {
                super(message, map, null);
                Intrinsics.checkNotNullParameter(message, "message");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class b extends d {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Throwable f132992c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f132993d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f132994e;

            public /* synthetic */ b(String str, Map map, Throwable th2, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? null : map, (i11 & 4) != 0 ? null : th2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3);
            }

            public final String c() {
                return this.f132994e;
            }

            public final String d() {
                String canonicalName = this.f132994e;
                if (canonicalName == null) {
                    Throwable th2 = this.f132992c;
                    canonicalName = th2 != null ? th2.getClass().getCanonicalName() : null;
                    if (canonicalName == null) {
                        Throwable th3 = this.f132992c;
                        if (th3 != null) {
                            return th3.getClass().getSimpleName();
                        }
                        return null;
                    }
                }
                return canonicalName;
            }

            public final String e() {
                String str = this.f132993d;
                if (str != null) {
                    return str;
                }
                Throwable th2 = this.f132992c;
                if (th2 != null) {
                    return g.a(th2);
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String message, Map map, Throwable th2, String str, String str2) {
                super(message, map, null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.f132992c = th2;
                this.f132993d = str;
                this.f132994e = str2;
            }
        }

        public /* synthetic */ d(String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, map);
        }

        public final Map a() {
            return this.f132991b;
        }

        public final String b() {
            return this.f132990a;
        }

        private d(String str, Map map) {
            super(null);
            this.f132990a = str;
            this.f132991b = map;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f132995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f132996b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String message, Map map) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f132995a = message;
            this.f132996b = map;
        }

        public final Map a() {
            return this.f132996b;
        }

        public final String b() {
            return this.f132995a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f132995a, eVar.f132995a) && Intrinsics.areEqual(this.f132996b, eVar.f132996b);
        }

        public int hashCode() {
            int iHashCode = this.f132995a.hashCode() * 31;
            Map map = this.f132996b;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "Metric(message=" + this.f132995a + ", additionalProperties=" + this.f132996b + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
