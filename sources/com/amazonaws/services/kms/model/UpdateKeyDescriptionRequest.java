package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class UpdateKeyDescriptionRequest extends AmazonWebServiceRequest implements Serializable {
    private String description;
    private String keyId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateKeyDescriptionRequest)) {
            return false;
        }
        UpdateKeyDescriptionRequest updateKeyDescriptionRequest = (UpdateKeyDescriptionRequest) obj;
        if ((updateKeyDescriptionRequest.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (updateKeyDescriptionRequest.getKeyId() != null && !updateKeyDescriptionRequest.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((updateKeyDescriptionRequest.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        return updateKeyDescriptionRequest.getDescription() == null || updateKeyDescriptionRequest.getDescription().equals(getDescription());
    }

    public String getDescription() {
        return this.description;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public int hashCode() {
        return (((getKeyId() == null ? 0 : getKeyId().hashCode()) + 31) * 31) + (getDescription() != null ? getDescription().hashCode() : 0);
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getKeyId() != null) {
            sb2.append("KeyId: " + getKeyId() + ",");
        }
        if (getDescription() != null) {
            sb2.append("Description: " + getDescription());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public UpdateKeyDescriptionRequest withDescription(String str) {
        this.description = str;
        return this;
    }

    public UpdateKeyDescriptionRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }
}
