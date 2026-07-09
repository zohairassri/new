package pr;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f121738a;

    a(Set set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f121738a = set;
    }

    @Override // pr.b
    public Set b() {
        return this.f121738a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f121738a.equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f121738a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f121738a + "}";
    }
}
