package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f7790a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f7791b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f7792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f7793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f7794e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        boolean a(int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b extends List, RandomAccess {
        b c(int i11);

        void g();

        boolean k();
    }

    static {
        byte[] bArr = new byte[0];
        f7792c = bArr;
        f7793d = ByteBuffer.wrap(bArr);
        f7794e = h.h(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i11, int i12) {
        int i13 = i(i12, bArr, i11, i12);
        if (i13 == 0) {
            return 1;
        }
        return i13;
    }

    public static int f(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return m1.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((m0) obj).e().M((m0) obj2).j();
    }

    static int i(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f7790a);
    }
}
