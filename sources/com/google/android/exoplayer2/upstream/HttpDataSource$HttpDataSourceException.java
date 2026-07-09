package com.google.android.exoplayer2.upstream;

import com.comscore.streaming.ContentMediaFormat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import ll.k;
import zo.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f21636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21637c;

    public HttpDataSource$HttpDataSourceException(k kVar, int i11, int i12) {
        super(b(i11, i12));
        this.f21636b = kVar;
        this.f21637c = i12;
    }

    private static int b(int i11, int i12) {
        if (i11 == 2000 && i12 == 1) {
            return 2001;
        }
        return i11;
    }

    public static HttpDataSource$HttpDataSourceException c(final IOException iOException, final k kVar, int i11) {
        String message = iOException.getMessage();
        int i12 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? ContentMediaFormat.PARTIAL_CONTENT_GENERIC : (message == null || !c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i12 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, kVar) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, kVar, i12, i11);
    }

    public HttpDataSource$HttpDataSourceException(String str, k kVar, int i11, int i12) {
        super(str, b(i11, i12));
        this.f21636b = kVar;
        this.f21637c = i12;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, k kVar, int i11, int i12) {
        super(iOException, b(i11, i12));
        this.f21636b = kVar;
        this.f21637c = i12;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, k kVar, int i11, int i12) {
        super(str, iOException, b(i11, i12));
        this.f21636b = kVar;
        this.f21637c = i12;
    }
}
