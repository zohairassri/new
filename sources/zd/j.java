package zd;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class f142265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class f142266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class f142267c;

    public j() {
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f142265a = cls;
        this.f142266b = cls2;
        this.f142267c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f142265a.equals(jVar.f142265a) && this.f142266b.equals(jVar.f142266b) && l.e(this.f142267c, jVar.f142267c);
    }

    public int hashCode() {
        int iHashCode = ((this.f142265a.hashCode() * 31) + this.f142266b.hashCode()) * 31;
        Class cls = this.f142267c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f142265a + ", second=" + this.f142266b + '}';
    }

    public j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
