package l7;

import com.comscore.android.ConnectivityType;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f113489a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f113490b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f113491c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f113492d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f113493e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f113494f = {32000, ConnectivityType.UNKNOWN, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f113495g = {8000, 16000, 24000, 32000, ConnectivityType.UNKNOWN, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f113496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f113497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f113498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f113499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f113500e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f113501f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f113502g;

        public a() {
        }

        public boolean a(int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (!f0.l(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
                return false;
            }
            this.f113496a = i12;
            this.f113497b = f0.f113489a[3 - i13];
            int i16 = f0.f113490b[i15];
            this.f113499d = i16;
            if (i12 == 2) {
                this.f113499d = i16 / 2;
            } else if (i12 == 0) {
                this.f113499d = i16 / 4;
            }
            int i17 = (i11 >>> 9) & 1;
            this.f113502g = f0.k(i12, i13);
            if (i13 == 3) {
                int i18 = i12 == 3 ? f0.f113491c[i14 - 1] : f0.f113492d[i14 - 1];
                this.f113501f = i18;
                this.f113498c = (((i18 * 12) / this.f113499d) + i17) * 4;
            } else {
                if (i12 == 3) {
                    int i19 = i13 == 2 ? f0.f113493e[i14 - 1] : f0.f113494f[i14 - 1];
                    this.f113501f = i19;
                    this.f113498c = ((i19 * 144) / this.f113499d) + i17;
                } else {
                    int i21 = f0.f113495g[i14 - 1];
                    this.f113501f = i21;
                    this.f113498c = (((i13 == 1 ? 72 : 144) * i21) / this.f113499d) + i17;
                }
            }
            this.f113500e = ((i11 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public a(a aVar) {
            this.f113496a = aVar.f113496a;
            this.f113497b = aVar.f113497b;
            this.f113498c = aVar.f113498c;
            this.f113499d = aVar.f113499d;
            this.f113500e = aVar.f113500e;
            this.f113501f = aVar.f113501f;
            this.f113502g = aVar.f113502g;
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
        int i16 = f113490b[i15];
        if (i12 == 2) {
            i16 /= 2;
        } else if (i12 == 0) {
            i16 /= 4;
        }
        int i17 = (i11 >>> 9) & 1;
        if (i13 == 3) {
            return ((((i12 == 3 ? f113491c[i14 - 1] : f113492d[i14 - 1]) * 12) / i16) + i17) * 4;
        }
        int i18 = i12 == 3 ? i13 == 2 ? f113493e[i14 - 1] : f113494f[i14 - 1] : f113495g[i14 - 1];
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
