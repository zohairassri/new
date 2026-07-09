package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class RestoreObjectRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private int expirationInDays;
    private boolean isRequesterPays;
    private String key;
    private String versionId;

    public RestoreObjectRequest(String str, String str2) {
        this(str, str2, -1);
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public int getExpirationInDays() {
        return this.expirationInDays;
    }

    public String getKey() {
        return this.key;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public boolean isRequesterPays() {
        return this.isRequesterPays;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setExpirationInDays(int i11) {
        this.expirationInDays = i11;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setRequesterPays(boolean z11) {
        this.isRequesterPays = z11;
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }

    public RestoreObjectRequest withBucketName(String str) {
        this.bucketName = str;
        return this;
    }

    public RestoreObjectRequest withExpirationInDays(int i11) {
        this.expirationInDays = i11;
        return this;
    }

    public RestoreObjectRequest withKey(String str) {
        this.key = str;
        return this;
    }

    public RestoreObjectRequest withRequesterPays(boolean z11) {
        setRequesterPays(z11);
        return this;
    }

    public RestoreObjectRequest withVersionId(String str) {
        this.versionId = str;
        return this;
    }

    public RestoreObjectRequest(String str, String str2, int i11) {
        this.bucketName = str;
        this.key = str2;
        this.expirationInDays = i11;
    }
}
