package xb;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f137328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f137329b;

    private static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void b(Object obj, Object obj2) {
        this.f137328a = obj;
        this.f137329b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w4.d)) {
            return false;
        }
        w4.d dVar = (w4.d) obj;
        return a(dVar.f134036a, this.f137328a) && a(dVar.f134037b, this.f137329b);
    }

    public int hashCode() {
        Object obj = this.f137328a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f137329b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f137328a + " " + this.f137329b + "}";
    }
}
