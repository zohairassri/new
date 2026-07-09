package androidx.media3.datasource;

import java.io.IOException;
import java.util.Map;
import n6.g;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f8950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f8951g;

    public HttpDataSource$InvalidResponseCodeException(int i11, String str, IOException iOException, Map map, g gVar, byte[] bArr) {
        super("Response code: " + i11, iOException, gVar, 2004, 1);
        this.f8948d = i11;
        this.f8949e = str;
        this.f8950f = map;
        this.f8951g = bArr;
    }
}
