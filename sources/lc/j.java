package lc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f114080a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f114080a = value;
        }

        public final Object a() {
            return this.f114080a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f114080a, ((a) obj).f114080a);
        }

        public int hashCode() {
            return this.f114080a.hashCode();
        }

        public String toString() {
            return "Element(value=" + this.f114080a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f114081a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f114082a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private j() {
    }
}
