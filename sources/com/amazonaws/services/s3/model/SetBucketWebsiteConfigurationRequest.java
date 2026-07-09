package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class SetBucketWebsiteConfigurationRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private BucketWebsiteConfiguration configuration;

    public SetBucketWebsiteConfigurationRequest(String str, BucketWebsiteConfiguration bucketWebsiteConfiguration) {
        this.bucketName = str;
        this.configuration = bucketWebsiteConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public BucketWebsiteConfiguration getConfiguration() {
        return this.configuration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setConfiguration(BucketWebsiteConfiguration bucketWebsiteConfiguration) {
        this.configuration = bucketWebsiteConfiguration;
    }

    public SetBucketWebsiteConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public SetBucketWebsiteConfigurationRequest withConfiguration(BucketWebsiteConfiguration bucketWebsiteConfiguration) {
        setConfiguration(bucketWebsiteConfiguration);
        return this;
    }
}
