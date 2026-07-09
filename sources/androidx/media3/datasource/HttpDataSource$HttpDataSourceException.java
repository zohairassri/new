package androidx.media3.datasource;

import com.comscore.streaming.ContentMediaFormat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import n6.g;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f8945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8946c;

    public HttpDataSource$HttpDataSourceException(g gVar, int i11, int i12) {
        super(b(i11, i12));
        this.f8945b = gVar;
        this.f8946c = i12;
    }

    private static int b(int i11, int i12) {
        if (i11 == 2000 && i12 == 1) {
            return 2001;
        }
        return i11;
    }

    public static HttpDataSource$HttpDataSourceException c(final IOException iOException, final g gVar, int i11) {
        String message = iOException.getMessage();
        int i12 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? ContentMediaFormat.PARTIAL_CONTENT_GENERIC : (message == null || !zo.c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i12 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, gVar) { // from class: androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, gVar, i12, i11);
    }

    public HttpDataSource$HttpDataSourceException(String str, g gVar, int i11, int i12) {
        super(str, b(i11, i12));
        this.f8945b = gVar;
        this.f8946c = i12;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, g gVar, int i11, int i12) {
        super(iOException, b(i11, i12));
        this.f8945b = gVar;
        this.f8946c = i12;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, g gVar, int i11, int i12) {
        super(str, iOException, b(i11, i12));
        this.f8945b = gVar;
        this.f8946c = i12;
    }
}
