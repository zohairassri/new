package l7;

import androidx.media3.common.ParserException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f113398a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f113399b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f113400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f113401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f113402c;

        private b(int i11, int i12, String str) {
            this.f113400a = i11;
            this.f113401b = i12;
            this.f113402c = str;
        }
    }

    public static byte[] a(int i11, int i12, int i13) {
        return new byte[]{(byte) (((i11 << 3) & 248) | ((i12 >> 1) & 7)), (byte) (((i12 << 7) & 128) | ((i13 << 3) & 120))};
    }

    private static int b(k6.b0 b0Var) {
        int iH = b0Var.h(5);
        return iH == 31 ? b0Var.h(6) + 32 : iH;
    }

    private static int c(k6.b0 b0Var) throws ParserException {
        int iH = b0Var.h(4);
        if (iH == 15) {
            if (b0Var.b() >= 24) {
                return b0Var.h(24);
            }
            throw ParserException.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f113398a[iH];
        }
        throw ParserException.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b d(k6.b0 b0Var, boolean z11) throws ParserException {
        int iB = b(b0Var);
        int iC = c(b0Var);
        int iH = b0Var.h(4);
        String str = "mp4a.40." + iB;
        if (iB == 5 || iB == 29) {
            iC = c(b0Var);
            iB = b(b0Var);
            if (iB == 22) {
                iH = b0Var.h(4);
            }
        }
        if (z11) {
            if (iB != 1 && iB != 2 && iB != 3 && iB != 4 && iB != 6 && iB != 7 && iB != 17) {
                switch (iB) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.d("Unsupported audio object type: " + iB);
                }
            }
            f(b0Var, iB, iH);
            switch (iB) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = b0Var.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw ParserException.d("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i11 = f113399b[iH];
        if (i11 != -1) {
            return new b(iC, i11, str);
        }
        throw ParserException.a(null, null);
    }

    public static b e(byte[] bArr) {
        return d(new k6.b0(bArr), false);
    }

    private static void f(k6.b0 b0Var, int i11, int i12) {
        if (b0Var.g()) {
            k6.s.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (b0Var.g()) {
            b0Var.r(14);
        }
        boolean zG = b0Var.g();
        if (i12 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i11 == 6 || i11 == 20) {
            b0Var.r(3);
        }
        if (zG) {
            if (i11 == 22) {
                b0Var.r(16);
            }
            if (i11 == 17 || i11 == 19 || i11 == 20 || i11 == 23) {
                b0Var.r(3);
            }
            b0Var.r(1);
        }
    }
}
