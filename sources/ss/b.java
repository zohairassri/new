package ss;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b extends ss.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f127307c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f127308d;

        public a(String str) {
            super(str, null);
            this.f127308d = str;
        }

        @Override // ss.b
        public String a() {
            return this.f127308d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f127308d, ((a) obj).f127308d);
        }

        public int hashCode() {
            String str = this.f127308d;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "AlsRequest(pageType=" + this.f127308d + ")";
        }
    }

    /* JADX INFO: renamed from: ss.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1740b extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f127309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Throwable f127310e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1740b(String str, Throwable error) {
            super(str, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f127309d = str;
            this.f127310e = error;
        }

        @Override // ss.b
        public String a() {
            return this.f127309d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1740b)) {
                return false;
            }
            C1740b c1740b = (C1740b) obj;
            return Intrinsics.areEqual(this.f127309d, c1740b.f127309d) && Intrinsics.areEqual(this.f127310e, c1740b.f127310e);
        }

        public int hashCode() {
            String str = this.f127309d;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f127310e.hashCode();
        }

        public String toString() {
            return "AlsResponseFailed(pageType=" + this.f127309d + ", error=" + this.f127310e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f127311d;

        public c(String str) {
            super(str, null);
            this.f127311d = str;
        }

        @Override // ss.b
        public String a() {
            return this.f127311d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f127311d, ((c) obj).f127311d);
        }

        public int hashCode() {
            String str = this.f127311d;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "AlsResponseSuccess(pageType=" + this.f127311d + ")";
        }
    }

    public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public abstract String a();

    private b(String str) {
        super(null, str, null);
        this.f127307c = str;
    }
}
