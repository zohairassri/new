package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class CancelKeyDeletionRequest extends AmazonWebServiceRequest implements Serializable {
    private String keyId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CancelKeyDeletionRequest)) {
            return false;
        }
        CancelKeyDeletionRequest cancelKeyDeletionRequest = (CancelKeyDeletionRequest) obj;
        if ((cancelKeyDeletionRequest.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        return cancelKeyDeletionRequest.getKeyId() == null || cancelKeyDeletionRequest.getKeyId().equals(getKeyId());
    }

    public String getKeyId() {
        return this.keyId;
    }

    public int hashCode() {
        return 31 + (getKeyId() == null ? 0 : getKeyId().hashCode());
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getKeyId() != null) {
            sb2.append("KeyId: " + getKeyId());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public CancelKeyDeletionRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }
}
