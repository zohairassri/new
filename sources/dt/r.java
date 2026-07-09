package dt;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f90510a = 0;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f90511b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f90512c = 0;

        private a() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f90513b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f90514b;

        public c(int i11) {
            super(null);
            this.f90514b = i11;
        }

        public final int a() {
            return this.f90514b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f90514b == ((c) obj).f90514b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f90514b);
        }

        public String toString() {
            return "ShowResId(resId=" + this.f90514b + ")";
        }
    }

    public /* synthetic */ r(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private r() {
    }
}
