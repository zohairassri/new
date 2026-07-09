package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AssumeRoleRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer durationSeconds;
    private String externalId;
    private String policy;
    private String roleArn;
    private String roleSessionName;
    private String serialNumber;
    private String tokenCode;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleRequest)) {
            return false;
        }
        AssumeRoleRequest assumeRoleRequest = (AssumeRoleRequest) obj;
        if ((assumeRoleRequest.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (assumeRoleRequest.getRoleArn() != null && !assumeRoleRequest.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((assumeRoleRequest.getRoleSessionName() == null) ^ (getRoleSessionName() == null)) {
            return false;
        }
        if (assumeRoleRequest.getRoleSessionName() != null && !assumeRoleRequest.getRoleSessionName().equals(getRoleSessionName())) {
            return false;
        }
        if ((assumeRoleRequest.getPolicy() == null) ^ (getPolicy() == null)) {
            return false;
        }
        if (assumeRoleRequest.getPolicy() != null && !assumeRoleRequest.getPolicy().equals(getPolicy())) {
            return false;
        }
        if ((assumeRoleRequest.getDurationSeconds() == null) ^ (getDurationSeconds() == null)) {
            return false;
        }
        if (assumeRoleRequest.getDurationSeconds() != null && !assumeRoleRequest.getDurationSeconds().equals(getDurationSeconds())) {
            return false;
        }
        if ((assumeRoleRequest.getExternalId() == null) ^ (getExternalId() == null)) {
            return false;
        }
        if (assumeRoleRequest.getExternalId() != null && !assumeRoleRequest.getExternalId().equals(getExternalId())) {
            return false;
        }
        if ((assumeRoleRequest.getSerialNumber() == null) ^ (getSerialNumber() == null)) {
            return false;
        }
        if (assumeRoleRequest.getSerialNumber() != null && !assumeRoleRequest.getSerialNumber().equals(getSerialNumber())) {
            return false;
        }
        if ((assumeRoleRequest.getTokenCode() == null) ^ (getTokenCode() == null)) {
            return false;
        }
        return assumeRoleRequest.getTokenCode() == null || assumeRoleRequest.getTokenCode().equals(getTokenCode());
    }

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getPolicy() {
        return this.policy;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String getTokenCode() {
        return this.tokenCode;
    }

    public int hashCode() {
        return (((((((((((((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getRoleSessionName() == null ? 0 : getRoleSessionName().hashCode())) * 31) + (getPolicy() == null ? 0 : getPolicy().hashCode())) * 31) + (getDurationSeconds() == null ? 0 : getDurationSeconds().hashCode())) * 31) + (getExternalId() == null ? 0 : getExternalId().hashCode())) * 31) + (getSerialNumber() == null ? 0 : getSerialNumber().hashCode())) * 31) + (getTokenCode() != null ? getTokenCode().hashCode() : 0);
    }

    public void setDurationSeconds(Integer num) {
        this.durationSeconds = num;
    }

    public void setExternalId(String str) {
        this.externalId = str;
    }

    public void setPolicy(String str) {
        this.policy = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setRoleSessionName(String str) {
        this.roleSessionName = str;
    }

    public void setSerialNumber(String str) {
        this.serialNumber = str;
    }

    public void setTokenCode(String str) {
        this.tokenCode = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getRoleArn() != null) {
            sb2.append("RoleArn: " + getRoleArn() + ",");
        }
        if (getRoleSessionName() != null) {
            sb2.append("RoleSessionName: " + getRoleSessionName() + ",");
        }
        if (getPolicy() != null) {
            sb2.append("Policy: " + getPolicy() + ",");
        }
        if (getDurationSeconds() != null) {
            sb2.append("DurationSeconds: " + getDurationSeconds() + ",");
        }
        if (getExternalId() != null) {
            sb2.append("ExternalId: " + getExternalId() + ",");
        }
        if (getSerialNumber() != null) {
            sb2.append("SerialNumber: " + getSerialNumber() + ",");
        }
        if (getTokenCode() != null) {
            sb2.append("TokenCode: " + getTokenCode());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public AssumeRoleRequest withDurationSeconds(Integer num) {
        this.durationSeconds = num;
        return this;
    }

    public AssumeRoleRequest withExternalId(String str) {
        this.externalId = str;
        return this;
    }

    public AssumeRoleRequest withPolicy(String str) {
        this.policy = str;
        return this;
    }

    public AssumeRoleRequest withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public AssumeRoleRequest withRoleSessionName(String str) {
        this.roleSessionName = str;
        return this;
    }

    public AssumeRoleRequest withSerialNumber(String str) {
        this.serialNumber = str;
        return this;
    }

    public AssumeRoleRequest withTokenCode(String str) {
        this.tokenCode = str;
        return this;
    }
}
