package us;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f131593a;

    /* JADX INFO: renamed from: us.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1812a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1812a f131594b = new C1812a();

        private C1812a() {
            super("full", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f131595b = new b();

        private b() {
            super("ltd", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f131596b = new c();

        private c() {
            super("npa", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f131597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f131598c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String name, String tcfString) {
            super(name, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(tcfString, "tcfString");
            this.f131597b = name;
            this.f131598c = tcfString;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f131597b, dVar.f131597b) && Intrinsics.areEqual(this.f131598c, dVar.f131598c);
        }

        public int hashCode() {
            return (this.f131597b.hashCode() * 31) + this.f131598c.hashCode();
        }

        public String toString() {
            return "TCF(name=" + this.f131597b + ", tcfString=" + this.f131598c + ")";
        }
    }

    public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String a() {
        return this.f131593a;
    }

    private a(String str) {
        this.f131593a = str;
    }
}
