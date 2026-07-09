package com.amazonaws.mobileconnectors.s3.transfermanager.model;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class CopyResult {
    private String destinationBucketName;
    private String destinationKey;
    private String eTag;
    private String sourceBucketName;
    private String sourceKey;
    private String versionId;

    public String getDestinationBucketName() {
        return this.destinationBucketName;
    }

    public String getDestinationKey() {
        return this.destinationKey;
    }

    public String getETag() {
        return this.eTag;
    }

    public String getSourceBucketName() {
        return this.sourceBucketName;
    }

    public String getSourceKey() {
        return this.sourceKey;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public void setDestinationBucketName(String str) {
        this.destinationBucketName = str;
    }

    public void setDestinationKey(String str) {
        this.destinationKey = str;
    }

    public void setETag(String str) {
        this.eTag = str;
    }

    public void setSourceBucketName(String str) {
        this.sourceBucketName = str;
    }

    public void setSourceKey(String str) {
        this.sourceKey = str;
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }
}
