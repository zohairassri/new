package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class InventoryDestination implements Serializable {
    private InventoryS3BucketDestination s3BucketDestination;

    public InventoryS3BucketDestination getS3BucketDestination() {
        return this.s3BucketDestination;
    }

    public void setS3BucketDestination(InventoryS3BucketDestination inventoryS3BucketDestination) {
        this.s3BucketDestination = inventoryS3BucketDestination;
    }

    public InventoryDestination withS3BucketDestination(InventoryS3BucketDestination inventoryS3BucketDestination) {
        setS3BucketDestination(inventoryS3BucketDestination);
        return this;
    }
}
