package com.amazonaws.services.cognitosync.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class UnsubscribeFromDatasetRequest extends AmazonWebServiceRequest implements Serializable {
    private String datasetName;
    private String deviceId;
    private String identityId;
    private String identityPoolId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnsubscribeFromDatasetRequest)) {
            return false;
        }
        UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest = (UnsubscribeFromDatasetRequest) obj;
        if ((unsubscribeFromDatasetRequest.getIdentityPoolId() == null) ^ (getIdentityPoolId() == null)) {
            return false;
        }
        if (unsubscribeFromDatasetRequest.getIdentityPoolId() != null && !unsubscribeFromDatasetRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if ((unsubscribeFromDatasetRequest.getIdentityId() == null) ^ (getIdentityId() == null)) {
            return false;
        }
        if (unsubscribeFromDatasetRequest.getIdentityId() != null && !unsubscribeFromDatasetRequest.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if ((unsubscribeFromDatasetRequest.getDatasetName() == null) ^ (getDatasetName() == null)) {
            return false;
        }
        if (unsubscribeFromDatasetRequest.getDatasetName() != null && !unsubscribeFromDatasetRequest.getDatasetName().equals(getDatasetName())) {
            return false;
        }
        if ((unsubscribeFromDatasetRequest.getDeviceId() == null) ^ (getDeviceId() == null)) {
            return false;
        }
        return unsubscribeFromDatasetRequest.getDeviceId() == null || unsubscribeFromDatasetRequest.getDeviceId().equals(getDeviceId());
    }

    public String getDatasetName() {
        return this.datasetName;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public int hashCode() {
        return (((((((getIdentityPoolId() == null ? 0 : getIdentityPoolId().hashCode()) + 31) * 31) + (getIdentityId() == null ? 0 : getIdentityId().hashCode())) * 31) + (getDatasetName() == null ? 0 : getDatasetName().hashCode())) * 31) + (getDeviceId() != null ? getDeviceId().hashCode() : 0);
    }

    public void setDatasetName(String str) {
        this.datasetName = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
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
            sb2.append("DatasetName: " + getDatasetName() + ",");
        }
        if (getDeviceId() != null) {
            sb2.append("DeviceId: " + getDeviceId());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public UnsubscribeFromDatasetRequest withDatasetName(String str) {
        this.datasetName = str;
        return this;
    }

    public UnsubscribeFromDatasetRequest withDeviceId(String str) {
        this.deviceId = str;
        return this;
    }

    public UnsubscribeFromDatasetRequest withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public UnsubscribeFromDatasetRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }
}
