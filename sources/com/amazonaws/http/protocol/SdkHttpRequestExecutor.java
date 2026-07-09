package com.amazonaws.http.protocol;

import com.amazonaws.util.AWSRequestMetrics;
import java.io.IOException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestExecutor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class SdkHttpRequestExecutor extends HttpRequestExecutor {
    @Override // org.apache.http.protocol.HttpRequestExecutor
    protected HttpResponse doReceiveResponse(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws HttpException, IOException {
        AWSRequestMetrics aWSRequestMetrics = (AWSRequestMetrics) httpContext.getAttribute(AWSRequestMetrics.class.getSimpleName());
        if (aWSRequestMetrics == null) {
            return super.doReceiveResponse(httpRequest, httpClientConnection, httpContext);
        }
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.HttpClientReceiveResponseTime;
        aWSRequestMetrics.startEvent(field);
        try {
            HttpResponse httpResponseDoReceiveResponse = super.doReceiveResponse(httpRequest, httpClientConnection, httpContext);
            aWSRequestMetrics.endEvent(field);
            return httpResponseDoReceiveResponse;
        } catch (Throwable th2) {
            aWSRequestMetrics.endEvent(AWSRequestMetrics.Field.HttpClientReceiveResponseTime);
            throw th2;
        }
    }

    @Override // org.apache.http.protocol.HttpRequestExecutor
    protected HttpResponse doSendRequest(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws HttpException, IOException {
        AWSRequestMetrics aWSRequestMetrics = (AWSRequestMetrics) httpContext.getAttribute(AWSRequestMetrics.class.getSimpleName());
        if (aWSRequestMetrics == null) {
            return super.doSendRequest(httpRequest, httpClientConnection, httpContext);
        }
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.HttpClientSendRequestTime;
        aWSRequestMetrics.startEvent(field);
        try {
            HttpResponse httpResponseDoSendRequest = super.doSendRequest(httpRequest, httpClientConnection, httpContext);
            aWSRequestMetrics.endEvent(field);
            return httpResponseDoSendRequest;
        } catch (Throwable th2) {
            aWSRequestMetrics.endEvent(AWSRequestMetrics.Field.HttpClientSendRequestTime);
            throw th2;
        }
    }
}
