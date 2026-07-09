package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class jz4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f29316a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f29317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f29318c;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f29317b = bArr;
        f29318c = ByteBuffer.wrap(bArr);
        ay4.e(bArr, 0, 0, false);
    }

    static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int b(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    static int c(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }
}
