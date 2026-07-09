package com.amazonaws;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AmazonWebServiceResponse<T> {
    private ResponseMetadata responseMetadata;
    private T result;

    public String getRequestId() {
        ResponseMetadata responseMetadata = this.responseMetadata;
        if (responseMetadata == null) {
            return null;
        }
        return responseMetadata.getRequestId();
    }

    public ResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
    }

    public T getResult() {
        return this.result;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public void setResult(T t11) {
        this.result = t11;
    }
}
