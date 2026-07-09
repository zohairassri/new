package com.amazonaws.handlers;

import com.amazonaws.Request;
import com.amazonaws.Response;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class RequestHandler2 {
    public static RequestHandler2 adapt(RequestHandler requestHandler) {
        return new RequestHandler2Adaptor(requestHandler);
    }

    public abstract void afterError(Request<?> request, Response<?> response, Exception exc);

    public abstract void afterResponse(Request<?> request, Response<?> response);

    public abstract void beforeRequest(Request<?> request);
}
