package ed;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class h implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t.a f92473b = new zd.b();

    private static void f(g gVar, Object obj, MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    @Override // ed.e
    public void a(MessageDigest messageDigest) {
        for (int i11 = 0; i11 < this.f92473b.size(); i11++) {
            f((g) this.f92473b.h(i11), this.f92473b.l(i11), messageDigest);
        }
    }

    public Object c(g gVar) {
        return this.f92473b.containsKey(gVar) ? this.f92473b.get(gVar) : gVar.c();
    }

    public void d(h hVar) {
        this.f92473b.i(hVar.f92473b);
    }

    public h e(g gVar, Object obj) {
        this.f92473b.put(gVar, obj);
        return this;
    }

    @Override // ed.e
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f92473b.equals(((h) obj).f92473b);
        }
        return false;
    }

    @Override // ed.e
    public int hashCode() {
        return this.f92473b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f92473b + '}';
    }
}
