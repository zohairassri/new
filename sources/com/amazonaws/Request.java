package com.amazonaws;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface Request<T> {
    void addHeader(String str, String str2);

    void addParameter(String str, String str2);

    AWSRequestMetrics getAWSRequestMetrics();

    InputStream getContent();

    URI getEndpoint();

    Map<String, String> getHeaders();

    HttpMethodName getHttpMethod();

    AmazonWebServiceRequest getOriginalRequest();

    Map<String, String> getParameters();

    String getResourcePath();

    String getServiceName();

    int getTimeOffset();

    boolean isStreaming();

    void setAWSRequestMetrics(AWSRequestMetrics aWSRequestMetrics);

    void setContent(InputStream inputStream);

    void setEndpoint(URI uri);

    void setHeaders(Map<String, String> map);

    void setHttpMethod(HttpMethodName httpMethodName);

    void setParameters(Map<String, String> map);

    void setResourcePath(String str);

    void setStreaming(boolean z11);

    void setTimeOffset(int i11);

    Request<T> withParameter(String str, String str2);

    Request<T> withTimeOffset(int i11);
}
