package com.amazonaws.handlers;

import com.amazonaws.Request;
import com.amazonaws.util.TimingInfo;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public interface RequestHandler {
    void afterError(Request<?> request, Exception exc);

    void afterResponse(Request<?> request, Object obj, TimingInfo timingInfo);

    void beforeRequest(Request<?> request);
}
