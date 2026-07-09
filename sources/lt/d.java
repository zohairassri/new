package lt;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f114841a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f114842c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f114843b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String customTitle) {
            super(customTitle, null);
            Intrinsics.checkNotNullParameter(customTitle, "customTitle");
            this.f114843b = customTitle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f114843b, ((a) obj).f114843b);
        }

        public int hashCode() {
            return this.f114843b.hashCode();
        }

        public String toString() {
            return "Custom(customTitle=" + this.f114843b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f114844b = new b();

        private b() {
            super("Features", null);
        }
    }

    public /* synthetic */ d(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f114841a;
    }

    private d(String str) {
        this.f114841a = str;
    }
}
