package com.google.android.gms.internal.ads;

import com.comscore.streaming.ContentMediaFormat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class zzhq extends zzhc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39784b;

    public zzhq(zb4 zb4Var, int i11, int i12) {
        super(b(2008, 1));
        this.f39784b = 1;
    }

    public static zzhq a(IOException iOException, zb4 zb4Var, int i11) {
        String message = iOException.getMessage();
        int i12 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? ContentMediaFormat.PARTIAL_CONTENT_GENERIC : (message == null || !sw3.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i12 == 2007 ? new zzhp(iOException, zb4Var) : new zzhq(iOException, zb4Var, i12, i11);
    }

    private static int b(int i11, int i12) {
        return i11 == 2000 ? i12 != 1 ? 2000 : 2001 : i11;
    }

    public zzhq(IOException iOException, zb4 zb4Var, int i11, int i12) {
        super(iOException, b(i11, i12));
        this.f39784b = i12;
    }

    public zzhq(String str, zb4 zb4Var, int i11, int i12) {
        super(str, b(i11, i12));
        this.f39784b = i12;
    }

    public zzhq(String str, IOException iOException, zb4 zb4Var, int i11, int i12) {
        super(str, iOException, b(i11, i12));
        this.f39784b = i12;
    }
}
