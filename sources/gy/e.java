package gy;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f99223a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String errorMessage) {
            super(null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.f99223a = errorMessage;
        }

        public final String a() {
            return this.f99223a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f99223a, ((a) obj).f99223a);
        }

        public int hashCode() {
            return this.f99223a.hashCode();
        }

        public String toString() {
            return "Error(errorMessage=" + this.f99223a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f99224a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f99225a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f99226a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gy.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1168e extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1168e f99227a = new C1168e();

        private C1168e() {
            super(null);
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
