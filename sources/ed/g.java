package ed;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f92468e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f92469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f92470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f92471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile byte[] f92472d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private g(String str, Object obj, b bVar) {
        this.f92471c = zd.k.b(str);
        this.f92469a = obj;
        this.f92470b = (b) zd.k.d(bVar);
    }

    public static g a(String str, Object obj, b bVar) {
        return new g(str, obj, bVar);
    }

    private static b b() {
        return f92468e;
    }

    private byte[] d() {
        if (this.f92472d == null) {
            this.f92472d = this.f92471c.getBytes(e.f92466a);
        }
        return this.f92472d;
    }

    public static g e(String str) {
        return new g(str, null, b());
    }

    public static g f(String str, Object obj) {
        return new g(str, obj, b());
    }

    public Object c() {
        return this.f92469a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f92471c.equals(((g) obj).f92471c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f92470b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f92471c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f92471c + "'}";
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements b {
        a() {
        }

        @Override // ed.g.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
