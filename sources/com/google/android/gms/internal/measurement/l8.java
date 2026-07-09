package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class l8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f40499a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f40500b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f40501c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f40502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ByteBuffer f40503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final s7 f40504f;

    static {
        byte[] bArr = new byte[0];
        f40502d = bArr;
        f40503e = ByteBuffer.wrap(bArr);
        f40504f = s7.c(bArr, 0, bArr.length, false);
    }

    static int a(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    public static int b(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }

    public static int c(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int iA = a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static boolean g(r9 r9Var) {
        return false;
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f40500b);
    }

    public static boolean i(byte[] bArr) {
        return mb.d(bArr);
    }
}
