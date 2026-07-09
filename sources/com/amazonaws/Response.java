package com.amazonaws;

import com.amazonaws.http.HttpResponse;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class Response<T> {
    private final HttpResponse httpResponse;
    private final T response;

    public Response(T t11, HttpResponse httpResponse) {
        this.response = t11;
        this.httpResponse = httpResponse;
    }

    public T getAwsResponse() {
        return this.response;
    }

    public HttpResponse getHttpResponse() {
        return this.httpResponse;
    }
}
