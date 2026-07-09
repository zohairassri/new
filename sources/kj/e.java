package kj;

import kj.k;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k.b f111035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kj.a f111036b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k.b f111037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private kj.a f111038b;

        b() {
        }

        @Override // kj.k.a
        public k a() {
            return new e(this.f111037a, this.f111038b);
        }

        @Override // kj.k.a
        public k.a b(kj.a aVar) {
            this.f111038b = aVar;
            return this;
        }

        @Override // kj.k.a
        public k.a c(k.b bVar) {
            this.f111037a = bVar;
            return this;
        }
    }

    @Override // kj.k
    public kj.a b() {
        return this.f111036b;
    }

    @Override // kj.k
    public k.b c() {
        return this.f111035a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f111035a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                kj.a aVar = this.f111036b;
                if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f111035a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        kj.a aVar = this.f111036b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f111035a + ", androidClientInfo=" + this.f111036b + "}";
    }

    private e(k.b bVar, kj.a aVar) {
        this.f111035a = bVar;
        this.f111036b = aVar;
    }
}
