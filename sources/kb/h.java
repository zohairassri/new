package kb;

import kb.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f110343c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f110344d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f110345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f110346b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        c.b bVar = c.b.f110331a;
        f110344d = new h(bVar, bVar);
    }

    public h(c cVar, c cVar2) {
        this.f110345a = cVar;
        this.f110346b = cVar2;
    }

    public final c a() {
        return this.f110346b;
    }

    public final c b() {
        return this.f110345a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f110345a, hVar.f110345a) && Intrinsics.areEqual(this.f110346b, hVar.f110346b);
    }

    public int hashCode() {
        return (this.f110345a.hashCode() * 31) + this.f110346b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f110345a + ", height=" + this.f110346b + ')';
    }
}
