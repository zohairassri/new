package zj;

import com.google.android.exoplayer2.ParserException;
import ml.z;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f142372a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f142373b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f142374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f142375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f142376c;

        private b(int i11, int i12, String str) {
            this.f142374a = i11;
            this.f142375b = i12;
            this.f142376c = str;
        }
    }

    public static byte[] a(int i11, int i12, int i13) {
        return new byte[]{(byte) (((i11 << 3) & 248) | ((i12 >> 1) & 7)), (byte) (((i12 << 7) & 128) | ((i13 << 3) & 120))};
    }

    private static int b(z zVar) {
        int iH = zVar.h(5);
        return iH == 31 ? zVar.h(6) + 32 : iH;
    }

    private static int c(z zVar) throws ParserException {
        int iH = zVar.h(4);
        if (iH == 15) {
            if (zVar.b() >= 24) {
                return zVar.h(24);
            }
            throw ParserException.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f142372a[iH];
        }
        throw ParserException.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b d(z zVar, boolean z11) throws ParserException {
        int iB = b(zVar);
        int iC = c(zVar);
        int iH = zVar.h(4);
        String str = "mp4a.40." + iB;
        if (iB == 5 || iB == 29) {
            iC = c(zVar);
            iB = b(zVar);
            if (iB == 22) {
                iH = zVar.h(4);
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
                        throw ParserException.c("Unsupported audio object type: " + iB);
                }
            }
            f(zVar, iB, iH);
            switch (iB) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = zVar.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i11 = f142373b[iH];
        if (i11 != -1) {
            return new b(iC, i11, str);
        }
        throw ParserException.a(null, null);
    }

    public static b e(byte[] bArr) {
        return d(new z(bArr), false);
    }

    private static void f(z zVar, int i11, int i12) {
        if (zVar.g()) {
            ml.q.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (zVar.g()) {
            zVar.r(14);
        }
        boolean zG = zVar.g();
        if (i12 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i11 == 6 || i11 == 20) {
            zVar.r(3);
        }
        if (zG) {
            if (i11 == 22) {
                zVar.r(16);
            }
            if (i11 == 17 || i11 == 19 || i11 == 20 || i11 == 23) {
                zVar.r(3);
            }
            zVar.r(1);
        }
    }
}
