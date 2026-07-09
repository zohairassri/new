package a2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a3.d f134d;

    public g(int i11, long j11, h hVar, a3.d dVar) {
        this.f131a = i11;
        this.f132b = j11;
        this.f133c = hVar;
        this.f134d = dVar;
    }

    public final int a() {
        return this.f131a;
    }

    public final a3.d b() {
        return this.f134d;
    }

    public final h c() {
        return this.f133c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f131a == gVar.f131a && this.f132b == gVar.f132b && this.f133c == gVar.f133c && Intrinsics.areEqual(this.f134d, gVar.f134d);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f131a) * 31) + Long.hashCode(this.f132b)) * 31) + this.f133c.hashCode()) * 31;
        a3.d dVar = this.f134d;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.f131a + ", timestamp=" + this.f132b + ", type=" + this.f133c + ", structureCompat=" + this.f134d + ')';
    }
}
