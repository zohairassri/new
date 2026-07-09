package jc0;

import io.agora.rtc2.internal.AudioRoutingController;
import java.util.Arrays;
import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f105523a = b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f105524b = a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean[] f105525c = c();

    private static byte[] a() {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i11 = 0; i11 < 16; i11++) {
            bArr["0123456789abcdef".charAt(i11)] = (byte) i11;
        }
        return bArr;
    }

    private static char[] b() {
        char[] cArr = new char[AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER];
        for (int i11 = 0; i11 < 256; i11++) {
            cArr[i11] = "0123456789abcdef".charAt(i11 >>> 4);
            cArr[i11 | 256] = "0123456789abcdef".charAt(i11 & 15);
        }
        return cArr;
    }

    private static boolean[] c() {
        boolean[] zArr = new boolean[Settings.DEFAULT_INITIAL_WINDOW_SIZE];
        int i11 = 0;
        while (i11 < 65535) {
            zArr[i11] = (48 <= i11 && i11 <= 57) || (97 <= i11 && i11 <= 102);
            i11++;
        }
        return zArr;
    }

    public static void d(byte b11, char[] cArr, int i11) {
        int i12 = b11 & 255;
        char[] cArr2 = f105523a;
        cArr[i11] = cArr2[i12];
        cArr[i11 + 1] = cArr2[i12 | 256];
    }

    public static boolean e(char c11) {
        return f105525c[c11];
    }

    public static boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!e(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static void g(long j11, char[] cArr, int i11) {
        d((byte) ((j11 >> 56) & 255), cArr, i11);
        d((byte) ((j11 >> 48) & 255), cArr, i11 + 2);
        d((byte) ((j11 >> 40) & 255), cArr, i11 + 4);
        d((byte) ((j11 >> 32) & 255), cArr, i11 + 6);
        d((byte) ((j11 >> 24) & 255), cArr, i11 + 8);
        d((byte) ((j11 >> 16) & 255), cArr, i11 + 10);
        d((byte) ((j11 >> 8) & 255), cArr, i11 + 12);
        d((byte) (j11 & 255), cArr, i11 + 14);
    }
}
