package yw;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f141020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f141021b;

    /* JADX INFO: renamed from: yw.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C2010a extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2010a(String errorMessage, Throwable throwable, int i11) {
            super(errorMessage, throwable, i11);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String errorMessage, Throwable throwable, int i11) {
            super(errorMessage, throwable, i11);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String errorMessage, Throwable throwable, int i11) {
            super(errorMessage, throwable, i11);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String errorMessage, Throwable throwable, int i11) {
            super(errorMessage, throwable, i11);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class e extends a {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            String message = throwable.getMessage();
            super(message == null ? "" : message, throwable, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class f extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String errorMessage, Throwable throwable, int i11) {
            super(errorMessage, throwable, i11);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class g extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f141022c;

        public /* synthetic */ g(String str, Throwable th2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th2, (i12 & 4) != 0 ? -1 : i11);
        }

        @Override // yw.a
        public String toString() {
            return "Error Code: " + this.f141022c + " - " + a();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String errorMessage, Throwable throwable, int i11) {
            super(errorMessage, throwable, null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f141022c = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class h extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String errorMessage, Throwable throwable) {
            super(errorMessage, throwable, null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
        }
    }

    public /* synthetic */ a(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2);
    }

    public final String a() {
        return this.f141020a;
    }

    public final Throwable b() {
        return this.f141021b;
    }

    public String toString() {
        return this.f141020a;
    }

    private a(String str, Throwable th2) {
        this.f141020a = str;
        this.f141021b = th2;
    }
}
