package mc0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f116054a;

    c(List list) {
        if (list == null) {
            throw new NullPointerException("Null entries");
        }
        this.f116054a = list;
    }

    @Override // mc0.a
    List b() {
        return this.f116054a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return this.f116054a.equals(((a) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f116054a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ArrayBasedTraceState{entries=" + this.f116054a + "}";
    }
}
