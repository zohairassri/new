package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class GenericBucketRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucketName;

    public GenericBucketRequest(String str) {
        this.bucketName = str;
    }

    @Deprecated
    public String getBucket() {
        return this.bucketName;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public GenericBucketRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }
}
