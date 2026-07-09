package ky;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f112150f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f112151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f112152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f112153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f112154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f112155e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class b extends f {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a extends b {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final String f112156g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final String f112157h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String version, String lireClientId) {
                super("version", version, lireClientId, null);
                Intrinsics.checkNotNullParameter(version, "version");
                Intrinsics.checkNotNullParameter(lireClientId, "lireClientId");
                this.f112156g = version;
                this.f112157h = lireClientId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f112156g, aVar.f112156g) && Intrinsics.areEqual(this.f112157h, aVar.f112157h);
            }

            public int hashCode() {
                return (this.f112156g.hashCode() * 31) + this.f112157h.hashCode();
            }

            public String toString() {
                return "OnTOSBlockerCardShown(version=" + this.f112156g + ", lireClientId=" + this.f112157h + ")";
            }
        }

        public /* synthetic */ b(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3);
        }

        private b(String str, String str2, String str3) {
            super(str, str2, str3, null);
        }
    }

    public /* synthetic */ f(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    private f(String str, String str2, String str3) {
        this.f112151a = str;
        this.f112152b = str2;
        this.f112153c = "entryView";
        this.f112154d = "tos";
        String str4 = String.format("client_id:[%s]", Arrays.copyOf(new Object[]{str3}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        this.f112155e = str4;
    }
}
