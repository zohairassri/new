package sr;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f127303a;

    c(Set set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f127303a = set;
    }

    @Override // sr.e
    public Set b() {
        return this.f127303a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f127303a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f127303a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f127303a + "}";
    }
}
