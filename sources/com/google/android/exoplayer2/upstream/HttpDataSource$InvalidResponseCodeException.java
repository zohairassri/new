package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.util.Map;
import ll.k;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f21641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f21642g;

    public HttpDataSource$InvalidResponseCodeException(int i11, String str, IOException iOException, Map map, k kVar, byte[] bArr) {
        super("Response code: " + i11, iOException, kVar, 2004, 1);
        this.f21639d = i11;
        this.f21640e = str;
        this.f21641f = map;
        this.f21642g = bArr;
    }
}
