package x0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f136495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f136496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f136497c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s3.i f136498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f136499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f136500c;

        public a(s3.i iVar, int i11, long j11) {
            this.f136498a = iVar;
            this.f136499b = i11;
            this.f136500c = j11;
        }

        public static /* synthetic */ a b(a aVar, s3.i iVar, int i11, long j11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iVar = aVar.f136498a;
            }
            if ((i12 & 2) != 0) {
                i11 = aVar.f136499b;
            }
            if ((i12 & 4) != 0) {
                j11 = aVar.f136500c;
            }
            return aVar.a(iVar, i11, j11);
        }

        public final a a(s3.i iVar, int i11, long j11) {
            return new a(iVar, i11, j11);
        }

        public final int c() {
            return this.f136499b;
        }

        public final long d() {
            return this.f136500c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f136498a == aVar.f136498a && this.f136499b == aVar.f136499b && this.f136500c == aVar.f136500c;
        }

        public int hashCode() {
            return (((this.f136498a.hashCode() * 31) + Integer.hashCode(this.f136499b)) * 31) + Long.hashCode(this.f136500c);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.f136498a + ", offset=" + this.f136499b + ", selectableId=" + this.f136500c + ')';
        }
    }

    public y(a aVar, a aVar2, boolean z11) {
        this.f136495a = aVar;
        this.f136496b = aVar2;
        this.f136497c = z11;
    }

    public static /* synthetic */ y b(y yVar, a aVar, a aVar2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = yVar.f136495a;
        }
        if ((i11 & 2) != 0) {
            aVar2 = yVar.f136496b;
        }
        if ((i11 & 4) != 0) {
            z11 = yVar.f136497c;
        }
        return yVar.a(aVar, aVar2, z11);
    }

    public final y a(a aVar, a aVar2, boolean z11) {
        return new y(aVar, aVar2, z11);
    }

    public final a c() {
        return this.f136496b;
    }

    public final boolean d() {
        return this.f136497c;
    }

    public final a e() {
        return this.f136495a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.areEqual(this.f136495a, yVar.f136495a) && Intrinsics.areEqual(this.f136496b, yVar.f136496b) && this.f136497c == yVar.f136497c;
    }

    public int hashCode() {
        return (((this.f136495a.hashCode() * 31) + this.f136496b.hashCode()) * 31) + Boolean.hashCode(this.f136497c);
    }

    public String toString() {
        return "Selection(start=" + this.f136495a + ", end=" + this.f136496b + ", handlesCrossed=" + this.f136497c + ')';
    }
}
