package fq;

import fq.g0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class b0 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0.a f94659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0.c f94660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0.b f94661c;

    b0(g0.a aVar, g0.c cVar, g0.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f94659a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f94660b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f94661c = bVar;
    }

    @Override // fq.g0
    public g0.a a() {
        return this.f94659a;
    }

    @Override // fq.g0
    public g0.b c() {
        return this.f94661c;
    }

    @Override // fq.g0
    public g0.c d() {
        return this.f94660b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (this.f94659a.equals(g0Var.a()) && this.f94660b.equals(g0Var.d()) && this.f94661c.equals(g0Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f94661c.hashCode() ^ ((((this.f94659a.hashCode() ^ 1000003) * 1000003) ^ this.f94660b.hashCode()) * 1000003);
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f94659a + ", osData=" + this.f94660b + ", deviceData=" + this.f94661c + "}";
    }
}
