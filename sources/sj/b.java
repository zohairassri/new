package sj;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vj.a f126995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f126996b;

    b(vj.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f126995a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f126996b = map;
    }

    @Override // sj.f
    vj.a e() {
        return this.f126995a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f126995a.equals(fVar.e()) && this.f126996b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // sj.f
    Map h() {
        return this.f126996b;
    }

    public int hashCode() {
        return this.f126996b.hashCode() ^ ((this.f126995a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f126995a + ", values=" + this.f126996b + "}";
    }
}
