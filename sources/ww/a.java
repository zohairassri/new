package ww;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: ww.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1904a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1904a f135958a = new C1904a();

        private C1904a() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f135959a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f135960a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String purchaseToken) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
            this.f135960a = purchaseToken;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f135960a, ((c) obj).f135960a);
        }

        public int hashCode() {
            return this.f135960a.hashCode();
        }

        public String toString() {
            return "SubscriptionStatusUpdated(purchaseToken=" + this.f135960a + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
