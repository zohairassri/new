package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonServiceException;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AmazonS3Exception extends AmazonServiceException implements Serializable {
    private static final long serialVersionUID = 7573680383273658477L;
    private Map<String, String> additionalDetails;
    private String cloudFrontId;
    private final String errorResponseXml;
    private String extendedRequestId;

    public AmazonS3Exception(String str) {
        super(str);
        this.errorResponseXml = null;
    }

    public Map<String, String> getAdditionalDetails() {
        return this.additionalDetails;
    }

    public String getCloudFrontId() {
        return this.cloudFrontId;
    }

    public String getErrorResponseXml() {
        return this.errorResponseXml;
    }

    public String getExtendedRequestId() {
        return this.extendedRequestId;
    }

    public void setAdditionalDetails(Map<String, String> map) {
        this.additionalDetails = map;
    }

    public void setCloudFrontId(String str) {
        this.cloudFrontId = str;
    }

    public void setExtendedRequestId(String str) {
        this.extendedRequestId = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ", S3 Extended Request ID: " + getExtendedRequestId();
    }

    public AmazonS3Exception(String str, Exception exc) {
        super(str, exc);
        this.errorResponseXml = null;
    }

    public AmazonS3Exception(String str, String str2) {
        super(str);
        if (str2 != null) {
            this.errorResponseXml = str2;
            return;
        }
        throw new IllegalArgumentException("Error Response XML cannot be null");
    }
}
