package com.amazonaws.services.s3.model;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class MultipartUpload {
    private Date initiated;
    private Owner initiator;
    private String key;
    private Owner owner;
    private String storageClass;
    private String uploadId;

    public Date getInitiated() {
        return this.initiated;
    }

    public Owner getInitiator() {
        return this.initiator;
    }

    public String getKey() {
        return this.key;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public String getStorageClass() {
        return this.storageClass;
    }

    public String getUploadId() {
        return this.uploadId;
    }

    public void setInitiated(Date date) {
        this.initiated = date;
    }

    public void setInitiator(Owner owner) {
        this.initiator = owner;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setStorageClass(String str) {
        this.storageClass = str;
    }

    public void setUploadId(String str) {
        this.uploadId = str;
    }
}
