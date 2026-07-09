package com.amazonaws.services.s3.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class VersionListing {
    private String bucketName;
    private String delimiter;
    private String encodingType;
    private boolean isTruncated;
    private String keyMarker;
    private int maxKeys;
    private String nextKeyMarker;
    private String nextVersionIdMarker;
    private String prefix;
    private String versionIdMarker;
    private List<S3VersionSummary> versionSummaries = new ArrayList();
    private List<String> commonPrefixes = new ArrayList();

    public String getBucketName() {
        return this.bucketName;
    }

    public List<String> getCommonPrefixes() {
        return this.commonPrefixes;
    }

    public String getDelimiter() {
        return this.delimiter;
    }

    public String getEncodingType() {
        return this.encodingType;
    }

    public String getKeyMarker() {
        return this.keyMarker;
    }

    public int getMaxKeys() {
        return this.maxKeys;
    }

    public String getNextKeyMarker() {
        return this.nextKeyMarker;
    }

    public String getNextVersionIdMarker() {
        return this.nextVersionIdMarker;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getVersionIdMarker() {
        return this.versionIdMarker;
    }

    public List<S3VersionSummary> getVersionSummaries() {
        return this.versionSummaries;
    }

    public boolean isTruncated() {
        return this.isTruncated;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setCommonPrefixes(List<String> list) {
        this.commonPrefixes = list;
    }

    public void setDelimiter(String str) {
        this.delimiter = str;
    }

    public void setEncodingType(String str) {
        this.encodingType = str;
    }

    public void setKeyMarker(String str) {
        this.keyMarker = str;
    }

    public void setMaxKeys(int i11) {
        this.maxKeys = i11;
    }

    public void setNextKeyMarker(String str) {
        this.nextKeyMarker = str;
    }

    public void setNextVersionIdMarker(String str) {
        this.nextVersionIdMarker = str;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public void setTruncated(boolean z11) {
        this.isTruncated = z11;
    }

    public void setVersionIdMarker(String str) {
        this.versionIdMarker = str;
    }

    public void setVersionSummaries(List<S3VersionSummary> list) {
        this.versionSummaries = list;
    }
}
