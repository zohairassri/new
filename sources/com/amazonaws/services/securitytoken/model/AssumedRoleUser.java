package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AssumedRoleUser implements Serializable {
    private String arn;
    private String assumedRoleId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumedRoleUser)) {
            return false;
        }
        AssumedRoleUser assumedRoleUser = (AssumedRoleUser) obj;
        if ((assumedRoleUser.getAssumedRoleId() == null) ^ (getAssumedRoleId() == null)) {
            return false;
        }
        if (assumedRoleUser.getAssumedRoleId() != null && !assumedRoleUser.getAssumedRoleId().equals(getAssumedRoleId())) {
            return false;
        }
        if ((assumedRoleUser.getArn() == null) ^ (getArn() == null)) {
            return false;
        }
        return assumedRoleUser.getArn() == null || assumedRoleUser.getArn().equals(getArn());
    }

    public String getArn() {
        return this.arn;
    }

    public String getAssumedRoleId() {
        return this.assumedRoleId;
    }

    public int hashCode() {
        return (((getAssumedRoleId() == null ? 0 : getAssumedRoleId().hashCode()) + 31) * 31) + (getArn() != null ? getArn().hashCode() : 0);
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public void setAssumedRoleId(String str) {
        this.assumedRoleId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getAssumedRoleId() != null) {
            sb2.append("AssumedRoleId: " + getAssumedRoleId() + ",");
        }
        if (getArn() != null) {
            sb2.append("Arn: " + getArn());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public AssumedRoleUser withArn(String str) {
        this.arn = str;
        return this;
    }

    public AssumedRoleUser withAssumedRoleId(String str) {
        this.assumedRoleId = str;
        return this;
    }
}
