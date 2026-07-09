package com.amazonaws.services.s3.model;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class S3VersionSummary {
    protected String bucketName;
    private String eTag;
    private boolean isDeleteMarker;
    private boolean isLatest;
    private String key;
    private Date lastModified;
    private Owner owner;
    private long size;
    private String storageClass;
    private String versionId;

    public String getBucketName() {
        return this.bucketName;
    }

    public String getETag() {
        return this.eTag;
    }

    public String getKey() {
        return this.key;
    }

    public Date getLastModified() {
        return this.lastModified;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public long getSize() {
        return this.size;
    }

    public String getStorageClass() {
        return this.storageClass;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public boolean isDeleteMarker() {
        return this.isDeleteMarker;
    }

    public boolean isLatest() {
        return this.isLatest;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setETag(String str) {
        this.eTag = str;
    }

    public void setIsDeleteMarker(boolean z11) {
        this.isDeleteMarker = z11;
    }

    public void setIsLatest(boolean z11) {
        this.isLatest = z11;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLastModified(Date date) {
        this.lastModified = date;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setSize(long j11) {
        this.size = j11;
    }

    public void setStorageClass(String str) {
        this.storageClass = str;
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }
}
