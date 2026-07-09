package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class SetBucketTaggingConfigurationRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private BucketTaggingConfiguration taggingConfiguration;

    public SetBucketTaggingConfigurationRequest(String str, BucketTaggingConfiguration bucketTaggingConfiguration) {
        this.bucketName = str;
        this.taggingConfiguration = bucketTaggingConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public BucketTaggingConfiguration getTaggingConfiguration() {
        return this.taggingConfiguration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setTaggingConfiguration(BucketTaggingConfiguration bucketTaggingConfiguration) {
        this.taggingConfiguration = bucketTaggingConfiguration;
    }

    public SetBucketTaggingConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public SetBucketTaggingConfigurationRequest withTaggingConfiguration(BucketTaggingConfiguration bucketTaggingConfiguration) {
        setTaggingConfiguration(bucketTaggingConfiguration);
        return this;
    }
}
