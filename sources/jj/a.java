package jj;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f105717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f105718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f105719c;

    a(Integer num, Object obj, d dVar) {
        this.f105717a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f105718b = obj;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f105719c = dVar;
    }

    @Override // jj.c
    public Integer a() {
        return this.f105717a;
    }

    @Override // jj.c
    public Object b() {
        return this.f105718b;
    }

    @Override // jj.c
    public d c() {
        return this.f105719c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f105717a;
            if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
                if (this.f105718b.equals(cVar.b()) && this.f105719c.equals(cVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f105717a;
        return this.f105719c.hashCode() ^ (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f105718b.hashCode()) * 1000003);
    }

    public String toString() {
        return "Event{code=" + this.f105717a + ", payload=" + this.f105718b + ", priority=" + this.f105719c + "}";
    }
}
