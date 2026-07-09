package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DeleteObjectsResponse implements S3RequesterChargedResult {
    private List<DeleteObjectsResult.DeletedObject> deletedObjects;
    private List<MultiObjectDeleteException.DeleteError> errors;
    private boolean isRequesterCharged;

    public DeleteObjectsResponse() {
        this(new ArrayList(), new ArrayList());
    }

    public List<DeleteObjectsResult.DeletedObject> getDeletedObjects() {
        return this.deletedObjects;
    }

    public List<MultiObjectDeleteException.DeleteError> getErrors() {
        return this.errors;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public boolean isRequesterCharged() {
        return this.isRequesterCharged;
    }

    public void setDeletedObjects(List<DeleteObjectsResult.DeletedObject> list) {
        this.deletedObjects = list;
    }

    public void setErrors(List<MultiObjectDeleteException.DeleteError> list) {
        this.errors = list;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public void setRequesterCharged(boolean z11) {
        this.isRequesterCharged = z11;
    }

    public DeleteObjectsResponse(List<DeleteObjectsResult.DeletedObject> list, List<MultiObjectDeleteException.DeleteError> list2) {
        this.deletedObjects = list;
        this.errors = list2;
    }
}
