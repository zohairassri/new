package tq;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f130212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f130213b;

    a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f130212a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f130213b = list;
    }

    @Override // tq.l
    public List b() {
        return this.f130213b;
    }

    @Override // tq.l
    public String c() {
        return this.f130212a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f130212a.equals(lVar.c()) && this.f130213b.equals(lVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f130213b.hashCode() ^ ((this.f130212a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f130212a + ", usedDates=" + this.f130213b + "}";
    }
}
