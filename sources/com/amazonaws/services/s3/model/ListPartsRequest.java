package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ListPartsRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private String encodingType;
    private boolean isRequesterPays;
    private String key;
    private Integer maxParts;
    private Integer partNumberMarker;
    private String uploadId;

    public ListPartsRequest(String str, String str2, String str3) {
        this.bucketName = str;
        this.key = str2;
        this.uploadId = str3;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public String getEncodingType() {
        return this.encodingType;
    }

    public String getKey() {
        return this.key;
    }

    public Integer getMaxParts() {
        return this.maxParts;
    }

    public Integer getPartNumberMarker() {
        return this.partNumberMarker;
    }

    public String getUploadId() {
        return this.uploadId;
    }

    public boolean isRequesterPays() {
        return this.isRequesterPays;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setEncodingType(String str) {
        this.encodingType = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMaxParts(int i11) {
        this.maxParts = Integer.valueOf(i11);
    }

    public void setPartNumberMarker(Integer num) {
        this.partNumberMarker = num;
    }

    public void setRequesterPays(boolean z11) {
        this.isRequesterPays = z11;
    }

    public void setUploadId(String str) {
        this.uploadId = str;
    }

    public ListPartsRequest withBucketName(String str) {
        this.bucketName = str;
        return this;
    }

    public ListPartsRequest withEncodingType(String str) {
        setEncodingType(str);
        return this;
    }

    public ListPartsRequest withKey(String str) {
        this.key = str;
        return this;
    }

    public ListPartsRequest withMaxParts(int i11) {
        this.maxParts = Integer.valueOf(i11);
        return this;
    }

    public ListPartsRequest withPartNumberMarker(Integer num) {
        this.partNumberMarker = num;
        return this;
    }

    public ListPartsRequest withRequesterPays(boolean z11) {
        setRequesterPays(z11);
        return this;
    }

    public ListPartsRequest withUploadId(String str) {
        this.uploadId = str;
        return this;
    }
}
