package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f42533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f42534b;

    static {
        Charset.forName("US-ASCII");
        f42533a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f42534b = bArr;
        ByteBuffer.wrap(bArr);
        int i11 = s5.f42587a;
        try {
            new q5(bArr, 0, 0, false, null).c(0);
        } catch (zzhr e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static int a(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    static int b(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
