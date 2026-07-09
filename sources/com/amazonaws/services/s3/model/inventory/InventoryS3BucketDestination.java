package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class InventoryS3BucketDestination implements Serializable {
    private String accountId;
    private String bucketArn;
    private String format;
    private String prefix;

    public String getAccountId() {
        return this.accountId;
    }

    public String getBucketArn() {
        return this.bucketArn;
    }

    public String getFormat() {
        return this.format;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setAccountId(String str) {
        this.accountId = str;
    }

    public void setBucketArn(String str) {
        this.bucketArn = str;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public InventoryS3BucketDestination withAccountId(String str) {
        setAccountId(str);
        return this;
    }

    public InventoryS3BucketDestination withBucketArn(String str) {
        setBucketArn(str);
        return this;
    }

    public InventoryS3BucketDestination withFormat(String str) {
        setFormat(str);
        return this;
    }

    public InventoryS3BucketDestination withPrefix(String str) {
        setPrefix(str);
        return this;
    }

    public void setFormat(InventoryFormat inventoryFormat) {
        setFormat(inventoryFormat == null ? null : inventoryFormat.toString());
    }

    public InventoryS3BucketDestination withFormat(InventoryFormat inventoryFormat) {
        setFormat(inventoryFormat);
        return this;
    }
}
