package jj;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f105720a;

    private b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f105720a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f105720a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f105720a.equals(((b) obj).f105720a);
        }
        return false;
    }

    public int hashCode() {
        return this.f105720a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f105720a + "\"}";
    }
}
