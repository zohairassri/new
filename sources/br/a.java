package br;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f14984p = new C0248a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f14988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f14989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f14990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f14991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f14992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f14993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f14994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f14995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f14996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f14997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f14998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f14999o;

    /* JADX INFO: renamed from: br.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C0248a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f15000a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f15001b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f15002c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f15003d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f15004e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f15005f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f15006g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f15007h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f15008i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f15009j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f15010k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private b f15011l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f15012m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f15013n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f15014o = "";

        C0248a() {
        }

        public a a() {
            return new a(this.f15000a, this.f15001b, this.f15002c, this.f15003d, this.f15004e, this.f15005f, this.f15006g, this.f15007h, this.f15008i, this.f15009j, this.f15010k, this.f15011l, this.f15012m, this.f15013n, this.f15014o);
        }

        public C0248a b(String str) {
            this.f15012m = str;
            return this;
        }

        public C0248a c(String str) {
            this.f15006g = str;
            return this;
        }

        public C0248a d(String str) {
            this.f15014o = str;
            return this;
        }

        public C0248a e(b bVar) {
            this.f15011l = bVar;
            return this;
        }

        public C0248a f(String str) {
            this.f15002c = str;
            return this;
        }

        public C0248a g(String str) {
            this.f15001b = str;
            return this;
        }

        public C0248a h(c cVar) {
            this.f15003d = cVar;
            return this;
        }

        public C0248a i(String str) {
            this.f15005f = str;
            return this;
        }

        public C0248a j(long j11) {
            this.f15000a = j11;
            return this;
        }

        public C0248a k(d dVar) {
            this.f15004e = dVar;
            return this;
        }

        public C0248a l(String str) {
            this.f15009j = str;
            return this;
        }

        public C0248a m(int i11) {
            this.f15008i = i11;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum b implements rq.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15019a;

        b(int i11) {
            this.f15019a = i11;
        }

        @Override // rq.c
        public int getNumber() {
            return this.f15019a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum c implements rq.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15025a;

        c(int i11) {
            this.f15025a = i11;
        }

        @Override // rq.c
        public int getNumber() {
            return this.f15025a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum d implements rq.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15031a;

        d(int i11) {
            this.f15031a = i11;
        }

        @Override // rq.c
        public int getNumber() {
            return this.f15031a;
        }
    }

    a(long j11, String str, String str2, c cVar, d dVar, String str3, String str4, int i11, int i12, String str5, long j12, b bVar, String str6, long j13, String str7) {
        this.f14985a = j11;
        this.f14986b = str;
        this.f14987c = str2;
        this.f14988d = cVar;
        this.f14989e = dVar;
        this.f14990f = str3;
        this.f14991g = str4;
        this.f14992h = i11;
        this.f14993i = i12;
        this.f14994j = str5;
        this.f14995k = j12;
        this.f14996l = bVar;
        this.f14997m = str6;
        this.f14998n = j13;
        this.f14999o = str7;
    }

    public static C0248a p() {
        return new C0248a();
    }

    public String a() {
        return this.f14997m;
    }

    public long b() {
        return this.f14995k;
    }

    public long c() {
        return this.f14998n;
    }

    public String d() {
        return this.f14991g;
    }

    public String e() {
        return this.f14999o;
    }

    public b f() {
        return this.f14996l;
    }

    public String g() {
        return this.f14987c;
    }

    public String h() {
        return this.f14986b;
    }

    public c i() {
        return this.f14988d;
    }

    public String j() {
        return this.f14990f;
    }

    public int k() {
        return this.f14992h;
    }

    public long l() {
        return this.f14985a;
    }

    public d m() {
        return this.f14989e;
    }

    public String n() {
        return this.f14994j;
    }

    public int o() {
        return this.f14993i;
    }
}
