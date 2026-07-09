package yw;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f141025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f141026b;

        public /* synthetic */ a(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? false : z11);
        }

        public final String a() {
            return this.f141025a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f141025a, aVar.f141025a) && this.f141026b == aVar.f141026b;
        }

        public int hashCode() {
            String str = this.f141025a;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f141026b);
        }

        public String toString() {
            return "Error(errorMessage=" + this.f141025a + ", isNetworkConnectivityError=" + this.f141026b + ")";
        }

        public a(String str, boolean z11) {
            super(null);
            this.f141025a = str;
            this.f141026b = z11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f141027a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f141028a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map entitlements) {
            super(null);
            Intrinsics.checkNotNullParameter(entitlements, "entitlements");
            this.f141028a = entitlements;
        }

        public final Map a() {
            return this.f141028a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f141028a, ((c) obj).f141028a);
        }

        public int hashCode() {
            return this.f141028a.hashCode();
        }

        public String toString() {
            return "Success(entitlements=" + this.f141028a + ")";
        }
    }

    /* JADX INFO: renamed from: yw.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C2011d extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2011d f141029a = new C2011d();

        private C2011d() {
            super(null);
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}
