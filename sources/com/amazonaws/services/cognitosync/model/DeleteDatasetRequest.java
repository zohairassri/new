package com.amazonaws.services.cognitosync.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class DeleteDatasetRequest extends AmazonWebServiceRequest implements Serializable {
    private String datasetName;
    private String identityId;
    private String identityPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteDatasetRequest)) {
            return false;
        }
        DeleteDatasetRequest deleteDatasetRequest = (DeleteDatasetRequest) obj;
        if ((deleteDatasetRequest.getIdentityPoolId() == null) ^ (getIdentityPoolId() == null)) {
            return false;
        }
        if (deleteDatasetRequest.getIdentityPoolId() != null && !deleteDatasetRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if ((deleteDatasetRequest.getIdentityId() == null) ^ (getIdentityId() == null)) {
            return false;
        }
        if (deleteDatasetRequest.getIdentityId() != null && !deleteDatasetRequest.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if ((deleteDatasetRequest.getDatasetName() == null) ^ (getDatasetName() == null)) {
            return false;
        }
        return deleteDatasetRequest.getDatasetName() == null || deleteDatasetRequest.getDatasetName().equals(getDatasetName());
    }

    public String getDatasetName() {
        return this.datasetName;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public int hashCode() {
        return (((((getIdentityPoolId() == null ? 0 : getIdentityPoolId().hashCode()) + 31) * 31) + (getIdentityId() == null ? 0 : getIdentityId().hashCode())) * 31) + (getDatasetName() != null ? getDatasetName().hashCode() : 0);
    }

    public void setDatasetName(String str) {
        this.datasetName = str;
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getIdentityPoolId() != null) {
            sb2.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        }
        if (getIdentityId() != null) {
            sb2.append("IdentityId: " + getIdentityId() + ",");
        }
        if (getDatasetName() != null) {
            sb2.append("DatasetName: " + getDatasetName());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public DeleteDatasetRequest withDatasetName(String str) {
        this.datasetName = str;
        return this;
    }

    public DeleteDatasetRequest withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public DeleteDatasetRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }
}
