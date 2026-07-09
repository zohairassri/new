package jc0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements gc0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gc0.f f105520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f105521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f105522c;

    private e(gc0.f fVar, String str) {
        if (fVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f105520a = fVar;
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.f105521b = str;
        this.f105522c = e(fVar, str);
    }

    private static int e(gc0.f fVar, String str) {
        return ((fVar.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static gc0.e f(String str, gc0.f fVar) {
        if (str == null) {
            str = "";
        }
        return new e(fVar, str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f105520a.equals(eVar.g()) && this.f105521b.equals(eVar.getKey())) {
                return true;
            }
        }
        return false;
    }

    public gc0.f g() {
        return this.f105520a;
    }

    @Override // gc0.e
    public String getKey() {
        return this.f105521b;
    }

    public int hashCode() {
        return this.f105522c;
    }

    public String toString() {
        return this.f105521b;
    }
}
