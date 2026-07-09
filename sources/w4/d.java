package w4;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f134036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f134037b;

    public d(Object obj, Object obj2) {
        this.f134036a = obj;
        this.f134037b = obj2;
    }

    public static d a(Object obj, Object obj2) {
        return new d(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f134036a, this.f134036a) && c.a(dVar.f134037b, this.f134037b);
    }

    public int hashCode() {
        Object obj = this.f134036a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f134037b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f134036a + " " + this.f134037b + "}";
    }
}
