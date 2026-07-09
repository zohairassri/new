package h6;

import java.util.Arrays;
import k6.n0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f100119h = new b().d(1).c(2).e(3).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f100120i = new b().d(1).c(1).e(2).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f100121j = n0.B0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f100122k = n0.B0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f100123l = n0.B0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f100124m = n0.B0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f100125n = n0.B0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f100126o = n0.B0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f100129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f100130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f100131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f100132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f100133g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f100134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f100135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f100136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f100137d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f100138e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f100139f;

        public h a() {
            return new h(this.f100134a, this.f100135b, this.f100136c, this.f100137d, this.f100138e, this.f100139f);
        }

        public b b(int i11) {
            this.f100139f = i11;
            return this;
        }

        public b c(int i11) {
            this.f100135b = i11;
            return this;
        }

        public b d(int i11) {
            this.f100134a = i11;
            return this;
        }

        public b e(int i11) {
            this.f100136c = i11;
            return this;
        }

        public b f(byte[] bArr) {
            this.f100137d = bArr;
            return this;
        }

        public b g(int i11) {
            this.f100138e = i11;
            return this;
        }

        public b() {
            this.f100134a = -1;
            this.f100135b = -1;
            this.f100136c = -1;
            this.f100138e = -1;
            this.f100139f = -1;
        }

        private b(h hVar) {
            this.f100134a = hVar.f100127a;
            this.f100135b = hVar.f100128b;
            this.f100136c = hVar.f100129c;
            this.f100137d = hVar.f100130d;
            this.f100138e = hVar.f100131e;
            this.f100139f = hVar.f100132f;
        }
    }

    private static String b(int i11) {
        if (i11 == -1) {
            return "NA";
        }
        return i11 + "bit Chroma";
    }

    private static String c(int i11) {
        if (i11 == -1) {
            return "Unset color range";
        }
        if (i11 == 1) {
            return "Full range";
        }
        if (i11 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i11;
    }

    private static String d(int i11) {
        if (i11 == -1) {
            return "Unset color space";
        }
        if (i11 == 6) {
            return "BT2020";
        }
        if (i11 == 1) {
            return "BT709";
        }
        if (i11 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i11;
    }

    private static String e(int i11) {
        if (i11 == -1) {
            return "Unset color transfer";
        }
        if (i11 == 10) {
            return "Gamma 2.2";
        }
        if (i11 == 1) {
            return "Linear";
        }
        if (i11 == 2) {
            return "sRGB";
        }
        if (i11 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i11 == 6) {
            return "ST2084 PQ";
        }
        if (i11 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i11;
    }

    public static boolean h(h hVar) {
        if (hVar == null) {
            return true;
        }
        int i11 = hVar.f100127a;
        if (i11 != -1 && i11 != 1 && i11 != 2) {
            return false;
        }
        int i12 = hVar.f100128b;
        if (i12 != -1 && i12 != 2) {
            return false;
        }
        int i13 = hVar.f100129c;
        if ((i13 != -1 && i13 != 3) || hVar.f100130d != null) {
            return false;
        }
        int i14 = hVar.f100132f;
        if (i14 != -1 && i14 != 8) {
            return false;
        }
        int i15 = hVar.f100131e;
        return i15 == -1 || i15 == 8;
    }

    public static int j(int i11) {
        if (i11 == 1) {
            return 1;
        }
        if (i11 != 9) {
            return (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i11) {
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 4) {
            return 10;
        }
        if (i11 == 13) {
            return 2;
        }
        if (i11 == 16) {
            return 6;
        }
        if (i11 != 18) {
            return (i11 == 6 || i11 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String l(int i11) {
        if (i11 == -1) {
            return "NA";
        }
        return i11 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f100127a == hVar.f100127a && this.f100128b == hVar.f100128b && this.f100129c == hVar.f100129c && Arrays.equals(this.f100130d, hVar.f100130d) && this.f100131e == hVar.f100131e && this.f100132f == hVar.f100132f) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return (this.f100131e == -1 || this.f100132f == -1) ? false : true;
    }

    public boolean g() {
        return (this.f100127a == -1 || this.f100128b == -1 || this.f100129c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f100133g == 0) {
            this.f100133g = ((((((((((527 + this.f100127a) * 31) + this.f100128b) * 31) + this.f100129c) * 31) + Arrays.hashCode(this.f100130d)) * 31) + this.f100131e) * 31) + this.f100132f;
        }
        return this.f100133g;
    }

    public boolean i() {
        return f() || g();
    }

    public String m() {
        String str;
        String strE = g() ? n0.E("%s/%s/%s", d(this.f100127a), c(this.f100128b), e(this.f100129c)) : "NA/NA/NA";
        if (f()) {
            str = this.f100131e + "/" + this.f100132f;
        } else {
            str = "NA/NA";
        }
        return strE + "/" + str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f100127a));
        sb2.append(", ");
        sb2.append(c(this.f100128b));
        sb2.append(", ");
        sb2.append(e(this.f100129c));
        sb2.append(", ");
        sb2.append(this.f100130d != null);
        sb2.append(", ");
        sb2.append(l(this.f100131e));
        sb2.append(", ");
        sb2.append(b(this.f100132f));
        sb2.append(")");
        return sb2.toString();
    }

    private h(int i11, int i12, int i13, byte[] bArr, int i14, int i15) {
        this.f100127a = i11;
        this.f100128b = i12;
        this.f100129c = i13;
        this.f100130d = bArr;
        this.f100131e = i14;
        this.f100132f = i15;
    }
}
