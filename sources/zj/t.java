package zj;

import com.comscore.android.ConnectivityType;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f142434a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f142435b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f142436c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f142437d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f142438e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f142439f = {32000, ConnectivityType.UNKNOWN, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f142440g = {8000, 16000, 24000, 32000, ConnectivityType.UNKNOWN, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f142442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f142443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f142444d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f142445e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f142446f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f142447g;

        public boolean a(int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (!t.l(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
                return false;
            }
            this.f142441a = i12;
            this.f142442b = t.f142434a[3 - i13];
            int i16 = t.f142435b[i15];
            this.f142444d = i16;
            if (i12 == 2) {
                this.f142444d = i16 / 2;
            } else if (i12 == 0) {
                this.f142444d = i16 / 4;
            }
            int i17 = (i11 >>> 9) & 1;
            this.f142447g = t.k(i12, i13);
            if (i13 == 3) {
                int i18 = i12 == 3 ? t.f142436c[i14 - 1] : t.f142437d[i14 - 1];
                this.f142446f = i18;
                this.f142443c = (((i18 * 12) / this.f142444d) + i17) * 4;
            } else {
                if (i12 == 3) {
                    int i19 = i13 == 2 ? t.f142438e[i14 - 1] : t.f142439f[i14 - 1];
                    this.f142446f = i19;
                    this.f142443c = ((i19 * 144) / this.f142444d) + i17;
                } else {
                    int i21 = t.f142440g[i14 - 1];
                    this.f142446f = i21;
                    this.f142443c = (((i13 == 1 ? 72 : 144) * i21) / this.f142444d) + i17;
                }
            }
            this.f142445e = ((i11 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int j(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (!l(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f142435b[i15];
        if (i12 == 2) {
            i16 /= 2;
        } else if (i12 == 0) {
            i16 /= 4;
        }
        int i17 = (i11 >>> 9) & 1;
        if (i13 == 3) {
            return ((((i12 == 3 ? f142436c[i14 - 1] : f142437d[i14 - 1]) * 12) / i16) + i17) * 4;
        }
        int i18 = i12 == 3 ? i13 == 2 ? f142438e[i14 - 1] : f142439f[i14 - 1] : f142440g[i14 - 1];
        if (i12 == 3) {
            return ((i18 * 144) / i16) + i17;
        }
        return (((i13 == 1 ? 72 : 144) * i18) / i16) + i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i11, int i12) {
        if (i12 == 1) {
            return i11 == 3 ? 1152 : 576;
        }
        if (i12 == 2) {
            return 1152;
        }
        if (i12 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i11) {
        return (i11 & (-2097152)) == -2097152;
    }

    public static int m(int i11) {
        int i12;
        int i13;
        if (!l(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0) {
            return -1;
        }
        int i14 = (i11 >>> 12) & 15;
        int i15 = (i11 >>> 10) & 3;
        if (i14 == 0 || i14 == 15 || i15 == 3) {
            return -1;
        }
        return k(i12, i13);
    }
}
