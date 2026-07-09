package ll;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f114572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f114573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f114575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f114576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f114577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f114578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f114579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f114580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f114581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f114582k;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f114583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f114584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f114585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f114586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f114587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f114588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f114589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f114590h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f114591i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f114592j;

        public k a() {
            ml.a.i(this.f114583a, "The uri must be set.");
            return new k(this.f114583a, this.f114584b, this.f114585c, this.f114586d, this.f114587e, this.f114588f, this.f114589g, this.f114590h, this.f114591i, this.f114592j);
        }

        public b b(int i11) {
            this.f114591i = i11;
            return this;
        }

        public b c(byte[] bArr) {
            this.f114586d = bArr;
            return this;
        }

        public b d(int i11) {
            this.f114585c = i11;
            return this;
        }

        public b e(Map map) {
            this.f114587e = map;
            return this;
        }

        public b f(String str) {
            this.f114590h = str;
            return this;
        }

        public b g(long j11) {
            this.f114588f = j11;
            return this;
        }

        public b h(Uri uri) {
            this.f114583a = uri;
            return this;
        }

        public b i(String str) {
            this.f114583a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f114585c = 1;
            this.f114587e = Collections.EMPTY_MAP;
            this.f114589g = -1L;
        }

        private b(k kVar) {
            this.f114583a = kVar.f114572a;
            this.f114584b = kVar.f114573b;
            this.f114585c = kVar.f114574c;
            this.f114586d = kVar.f114575d;
            this.f114587e = kVar.f114576e;
            this.f114588f = kVar.f114578g;
            this.f114589g = kVar.f114579h;
            this.f114590h = kVar.f114580i;
            this.f114591i = kVar.f114581j;
            this.f114592j = kVar.f114582k;
        }
    }

    static {
        xj.q.a("goog.exo.datasource");
    }

    public static String c(int i11) {
        if (i11 == 1) {
            return "GET";
        }
        if (i11 == 2) {
            return "POST";
        }
        if (i11 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f114574c);
    }

    public boolean d(int i11) {
        return (this.f114581j & i11) == i11;
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f114572a + ", " + this.f114578g + ", " + this.f114579h + ", " + this.f114580i + ", " + this.f114581j + "]";
    }

    private k(Uri uri, long j11, int i11, byte[] bArr, Map map, long j12, long j13, String str, int i12, Object obj) {
        byte[] bArr2 = bArr;
        long j14 = j11 + j12;
        ml.a.a(j14 >= 0);
        ml.a.a(j12 >= 0);
        ml.a.a(j13 > 0 || j13 == -1);
        this.f114572a = uri;
        this.f114573b = j11;
        this.f114574c = i11;
        this.f114575d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f114576e = Collections.unmodifiableMap(new HashMap(map));
        this.f114578g = j12;
        this.f114577f = j14;
        this.f114579h = j13;
        this.f114580i = str;
        this.f114581j = i12;
        this.f114582k = obj;
    }
}
