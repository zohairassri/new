package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class SetBucketPolicyRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private String policyText;

    public SetBucketPolicyRequest(String str, String str2) {
        this.bucketName = str;
        this.policyText = str2;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public String getPolicyText() {
        return this.policyText;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setPolicyText(String str) {
        this.policyText = str;
    }

    public SetBucketPolicyRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public SetBucketPolicyRequest withPolicyText(String str) {
        setPolicyText(str);
        return this;
    }
}
