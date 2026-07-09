package kj;

import kj.o;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.c f111068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.b f111069b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o.c f111070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o.b f111071b;

        b() {
        }

        @Override // kj.o.a
        public o a() {
            return new i(this.f111070a, this.f111071b);
        }

        @Override // kj.o.a
        public o.a b(o.b bVar) {
            this.f111071b = bVar;
            return this;
        }

        @Override // kj.o.a
        public o.a c(o.c cVar) {
            this.f111070a = cVar;
            return this;
        }
    }

    @Override // kj.o
    public o.b b() {
        return this.f111069b;
    }

    @Override // kj.o
    public o.c c() {
        return this.f111068a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.c cVar = this.f111068a;
            if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
                o.b bVar = this.f111069b;
                if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f111068a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f111069b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f111068a + ", mobileSubtype=" + this.f111069b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.f111068a = cVar;
        this.f111069b = bVar;
    }
}
