package kp;

import com.google.crypto.tink.internal.TinkBugException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f112012a = Charset.forName("UTF-8");

    public static Integer a() {
        if (b()) {
            return a.a();
        }
        return null;
    }

    public static boolean b() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i11 = 0;
        while (i11 == 0) {
            secureRandom.nextBytes(bArr);
            i11 = ((bArr[0] & ByteCompanionObject.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i11;
    }

    private static final byte d(char c11) {
        if (c11 >= '!' && c11 <= '~') {
            return (byte) c11;
        }
        throw new TinkBugException("Not a printable ASCII character: " + c11);
    }

    public static final rp.a e(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i11 = 0; i11 < str.length(); i11++) {
            bArr[i11] = d(str.charAt(i11));
        }
        return rp.a.a(bArr);
    }
}
