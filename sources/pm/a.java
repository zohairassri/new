package pm;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f121644a = 1;

    public a a(Object obj) {
        this.f121644a = (this.f121644a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f121644a;
    }

    public final a c(boolean z11) {
        this.f121644a = (this.f121644a * 31) + (z11 ? 1 : 0);
        return this;
    }
}
