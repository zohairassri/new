package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ListObjectsV2Request extends AmazonWebServiceRequest {
    private String bucketName;
    private String continuationToken;
    private String delimiter;
    private String encodingType;
    private boolean fetchOwner;
    private Integer maxKeys;
    private String prefix;
    private String startAfter;

    public String getBucketName() {
        return this.bucketName;
    }

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public String getDelimiter() {
        return this.delimiter;
    }

    public String getEncodingType() {
        return this.encodingType;
    }

    public Integer getMaxKeys() {
        return this.maxKeys;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getStartAfter() {
        return this.startAfter;
    }

    public boolean isFetchOwner() {
        return this.fetchOwner;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setContinuationToken(String str) {
        this.continuationToken = str;
    }

    public void setDelimiter(String str) {
        this.delimiter = str;
    }

    public void setEncodingType(String str) {
        this.encodingType = str;
    }

    public void setFetchOwner(boolean z11) {
        this.fetchOwner = z11;
    }

    public void setMaxKeys(Integer num) {
        this.maxKeys = num;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public void setStartAfter(String str) {
        this.startAfter = str;
    }

    public ListObjectsV2Request withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public ListObjectsV2Request withContinuationToken(String str) {
        setContinuationToken(str);
        return this;
    }

    public ListObjectsV2Request withDelimiter(String str) {
        setDelimiter(str);
        return this;
    }

    public ListObjectsV2Request withEncodingType(String str) {
        setEncodingType(str);
        return this;
    }

    public ListObjectsV2Request withFetchOwner(boolean z11) {
        setFetchOwner(z11);
        return this;
    }

    public ListObjectsV2Request withMaxKeys(Integer num) {
        setMaxKeys(num);
        return this;
    }

    public ListObjectsV2Request withPrefix(String str) {
        setPrefix(str);
        return this;
    }

    public ListObjectsV2Request withStartAfter(String str) {
        setStartAfter(str);
        return this;
    }
}
