package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class SSESpecification implements Serializable {
    private Boolean enabled;
    private String kMSMasterKeyId;
    private String sSEType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SSESpecification)) {
            return false;
        }
        SSESpecification sSESpecification = (SSESpecification) obj;
        if ((sSESpecification.getEnabled() == null) ^ (getEnabled() == null)) {
            return false;
        }
        if (sSESpecification.getEnabled() != null && !sSESpecification.getEnabled().equals(getEnabled())) {
            return false;
        }
        if ((sSESpecification.getSSEType() == null) ^ (getSSEType() == null)) {
            return false;
        }
        if (sSESpecification.getSSEType() != null && !sSESpecification.getSSEType().equals(getSSEType())) {
            return false;
        }
        if ((sSESpecification.getKMSMasterKeyId() == null) ^ (getKMSMasterKeyId() == null)) {
            return false;
        }
        return sSESpecification.getKMSMasterKeyId() == null || sSESpecification.getKMSMasterKeyId().equals(getKMSMasterKeyId());
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public String getKMSMasterKeyId() {
        return this.kMSMasterKeyId;
    }

    public String getSSEType() {
        return this.sSEType;
    }

    public int hashCode() {
        return (((((getEnabled() == null ? 0 : getEnabled().hashCode()) + 31) * 31) + (getSSEType() == null ? 0 : getSSEType().hashCode())) * 31) + (getKMSMasterKeyId() != null ? getKMSMasterKeyId().hashCode() : 0);
    }

    public Boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public void setKMSMasterKeyId(String str) {
        this.kMSMasterKeyId = str;
    }

    public void setSSEType(String str) {
        this.sSEType = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getEnabled() != null) {
            sb2.append("Enabled: " + getEnabled() + ",");
        }
        if (getSSEType() != null) {
            sb2.append("SSEType: " + getSSEType() + ",");
        }
        if (getKMSMasterKeyId() != null) {
            sb2.append("KMSMasterKeyId: " + getKMSMasterKeyId());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public SSESpecification withEnabled(Boolean bool) {
        this.enabled = bool;
        return this;
    }

    public SSESpecification withKMSMasterKeyId(String str) {
        this.kMSMasterKeyId = str;
        return this;
    }

    public SSESpecification withSSEType(String str) {
        this.sSEType = str;
        return this;
    }

    public void setSSEType(SSEType sSEType) {
        this.sSEType = sSEType.toString();
    }

    public SSESpecification withSSEType(SSEType sSEType) {
        this.sSEType = sSEType.toString();
        return this;
    }
}
