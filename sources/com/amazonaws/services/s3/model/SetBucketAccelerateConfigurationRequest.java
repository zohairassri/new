package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class SetBucketAccelerateConfigurationRequest extends AmazonWebServiceRequest implements S3AccelerateUnsupported {
    private BucketAccelerateConfiguration accelerateConfiguration;
    private String bucketName;

    public SetBucketAccelerateConfigurationRequest(String str, BucketAccelerateConfiguration bucketAccelerateConfiguration) {
        this.bucketName = str;
        this.accelerateConfiguration = bucketAccelerateConfiguration;
    }

    public BucketAccelerateConfiguration getAccelerateConfiguration() {
        return this.accelerateConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public void setAccelerateConfiguration(BucketAccelerateConfiguration bucketAccelerateConfiguration) {
        this.accelerateConfiguration = bucketAccelerateConfiguration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public SetBucketAccelerateConfigurationRequest withAccelerateConfiguration(BucketAccelerateConfiguration bucketAccelerateConfiguration) {
        setAccelerateConfiguration(bucketAccelerateConfiguration);
        return this;
    }

    public SetBucketAccelerateConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }
}
