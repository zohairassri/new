package lc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f114147a = new b(null);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends t0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f114148b = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f114148b;
        }

        public final c b(Object obj) {
            return new c(obj);
        }

        public final t0 c(Object obj) {
            return obj == null ? a.f114148b : new c(obj);
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends t0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f114149b;

        public c(Object obj) {
            super(null);
            this.f114149b = obj;
        }

        public final Object a() {
            return this.f114149b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f114149b, ((c) obj).f114149b);
        }

        public int hashCode() {
            Object obj = this.f114149b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Present(value=" + this.f114149b + ')';
        }
    }

    public /* synthetic */ t0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private t0() {
    }
}
