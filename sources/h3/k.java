package h3;

import h3.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements e.a {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f99839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x2 f99840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l f99841c;

        public /* synthetic */ a(String str, x2 x2Var, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : x2Var, lVar);
        }

        @Override // h3.k
        public l a() {
            return this.f99841c;
        }

        @Override // h3.k
        public x2 b() {
            return this.f99840b;
        }

        public final String c() {
            return this.f99839a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f99839a, aVar.f99839a) && Intrinsics.areEqual(b(), aVar.b()) && Intrinsics.areEqual(a(), aVar.a());
        }

        public int hashCode() {
            int iHashCode = this.f99839a.hashCode() * 31;
            x2 x2VarB = b();
            int iHashCode2 = (iHashCode + (x2VarB != null ? x2VarB.hashCode() : 0)) * 31;
            l lVarA = a();
            return iHashCode2 + (lVarA != null ? lVarA.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.f99839a + ')';
        }

        public a(String str, x2 x2Var, l lVar) {
            super(null);
            this.f99839a = str;
            this.f99840b = x2Var;
            this.f99841c = lVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f99842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x2 f99843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l f99844c;

        public /* synthetic */ b(String str, x2 x2Var, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : x2Var, (i11 & 4) != 0 ? null : lVar);
        }

        @Override // h3.k
        public l a() {
            return this.f99844c;
        }

        @Override // h3.k
        public x2 b() {
            return this.f99843b;
        }

        public final String c() {
            return this.f99842a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f99842a, bVar.f99842a) && Intrinsics.areEqual(b(), bVar.b()) && Intrinsics.areEqual(a(), bVar.a());
        }

        public int hashCode() {
            int iHashCode = this.f99842a.hashCode() * 31;
            x2 x2VarB = b();
            int iHashCode2 = (iHashCode + (x2VarB != null ? x2VarB.hashCode() : 0)) * 31;
            l lVarA = a();
            return iHashCode2 + (lVarA != null ? lVarA.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.f99842a + ')';
        }

        public b(String str, x2 x2Var, l lVar) {
            super(null);
            this.f99842a = str;
            this.f99843b = x2Var;
            this.f99844c = lVar;
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract l a();

    public abstract x2 b();

    private k() {
    }
}
