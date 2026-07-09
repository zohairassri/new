package oa;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f120177a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oa.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1568b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f120178a;

        public C1568b(int i11) {
            super(null);
            this.f120178a = i11;
        }

        public final int a() {
            return this.f120178a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1568b) && this.f120178a == ((C1568b) obj).f120178a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f120178a);
        }

        public String toString() {
            return "ConstraintsNotMet(reason=" + this.f120178a + ')';
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
