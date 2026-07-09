package n6;

import android.net.Uri;
import h6.s;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f117400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f117401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f117402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f117403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f117404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f117405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f117406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f117407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f117408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f117409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f117410k;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f117411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f117412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f117413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f117414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f117415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f117416f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f117417g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f117418h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f117419i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f117420j;

        public g a() {
            k6.a.j(this.f117411a, "The uri must be set.");
            return new g(this.f117411a, this.f117412b, this.f117413c, this.f117414d, this.f117415e, this.f117416f, this.f117417g, this.f117418h, this.f117419i, this.f117420j);
        }

        public b b(int i11) {
            this.f117419i = i11;
            return this;
        }

        public b c(byte[] bArr) {
            this.f117414d = bArr;
            return this;
        }

        public b d(int i11) {
            this.f117413c = i11;
            return this;
        }

        public b e(Map map) {
            this.f117415e = map;
            return this;
        }

        public b f(String str) {
            this.f117418h = str;
            return this;
        }

        public b g(long j11) {
            this.f117417g = j11;
            return this;
        }

        public b h(long j11) {
            this.f117416f = j11;
            return this;
        }

        public b i(Uri uri) {
            this.f117411a = uri;
            return this;
        }

        public b j(String str) {
            this.f117411a = Uri.parse(str);
            return this;
        }

        public b k(long j11) {
            this.f117412b = j11;
            return this;
        }

        public b() {
            this.f117413c = 1;
            this.f117415e = Collections.EMPTY_MAP;
            this.f117417g = -1L;
        }

        private b(g gVar) {
            this.f117411a = gVar.f117400a;
            this.f117412b = gVar.f117401b;
            this.f117413c = gVar.f117402c;
            this.f117414d = gVar.f117403d;
            this.f117415e = gVar.f117404e;
            this.f117416f = gVar.f117406g;
            this.f117417g = gVar.f117407h;
            this.f117418h = gVar.f117408i;
            this.f117419i = gVar.f117409j;
            this.f117420j = gVar.f117410k;
        }
    }

    static {
        s.a("media3.datasource");
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
        return c(this.f117402c);
    }

    public boolean d(int i11) {
        return (this.f117409j & i11) == i11;
    }

    public g e(long j11) {
        long j12 = this.f117407h;
        return f(j11, j12 != -1 ? j12 - j11 : -1L);
    }

    public g f(long j11, long j12) {
        return (j11 == 0 && this.f117407h == j12) ? this : new g(this.f117400a, this.f117401b, this.f117402c, this.f117403d, this.f117404e, this.f117406g + j11, j12, this.f117408i, this.f117409j, this.f117410k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f117400a + ", " + this.f117406g + ", " + this.f117407h + ", " + this.f117408i + ", " + this.f117409j + "]";
    }

    public g(Uri uri) {
        this(uri, 0L, -1L);
    }

    public g(Uri uri, long j11, long j12) {
        this(uri, j11, j12, null);
    }

    public g(Uri uri, long j11, long j12, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j11, j12, str, 0, null);
    }

    private g(Uri uri, long j11, int i11, byte[] bArr, Map map, long j12, long j13, String str, int i12, Object obj) {
        byte[] bArr2 = bArr;
        long j14 = j11 + j12;
        k6.a.a(j14 >= 0);
        k6.a.a(j12 >= 0);
        k6.a.a(j13 > 0 || j13 == -1);
        this.f117400a = (Uri) k6.a.e(uri);
        this.f117401b = j11;
        this.f117402c = i11;
        this.f117403d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f117404e = Collections.unmodifiableMap(new HashMap(map));
        this.f117406g = j12;
        this.f117405f = j14;
        this.f117407h = j13;
        this.f117408i = str;
        this.f117409j = i12;
        this.f117410k = obj;
    }
}
