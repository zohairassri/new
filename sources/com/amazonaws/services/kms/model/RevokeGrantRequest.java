package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class RevokeGrantRequest extends AmazonWebServiceRequest implements Serializable {
    private String grantId;
    private String keyId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RevokeGrantRequest)) {
            return false;
        }
        RevokeGrantRequest revokeGrantRequest = (RevokeGrantRequest) obj;
        if ((revokeGrantRequest.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (revokeGrantRequest.getKeyId() != null && !revokeGrantRequest.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((revokeGrantRequest.getGrantId() == null) ^ (getGrantId() == null)) {
            return false;
        }
        return revokeGrantRequest.getGrantId() == null || revokeGrantRequest.getGrantId().equals(getGrantId());
    }

    public String getGrantId() {
        return this.grantId;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public int hashCode() {
        return (((getKeyId() == null ? 0 : getKeyId().hashCode()) + 31) * 31) + (getGrantId() != null ? getGrantId().hashCode() : 0);
    }

    public void setGrantId(String str) {
        this.grantId = str;
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
        if (getGrantId() != null) {
            sb2.append("GrantId: " + getGrantId());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public RevokeGrantRequest withGrantId(String str) {
        this.grantId = str;
        return this;
    }

    public RevokeGrantRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }
}
