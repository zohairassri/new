package com.amazonaws.services.kms.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AliasListEntry implements Serializable {
    private String aliasArn;
    private String aliasName;
    private String targetKeyId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AliasListEntry)) {
            return false;
        }
        AliasListEntry aliasListEntry = (AliasListEntry) obj;
        if ((aliasListEntry.getAliasName() == null) ^ (getAliasName() == null)) {
            return false;
        }
        if (aliasListEntry.getAliasName() != null && !aliasListEntry.getAliasName().equals(getAliasName())) {
            return false;
        }
        if ((aliasListEntry.getAliasArn() == null) ^ (getAliasArn() == null)) {
            return false;
        }
        if (aliasListEntry.getAliasArn() != null && !aliasListEntry.getAliasArn().equals(getAliasArn())) {
            return false;
        }
        if ((aliasListEntry.getTargetKeyId() == null) ^ (getTargetKeyId() == null)) {
            return false;
        }
        return aliasListEntry.getTargetKeyId() == null || aliasListEntry.getTargetKeyId().equals(getTargetKeyId());
    }

    public String getAliasArn() {
        return this.aliasArn;
    }

    public String getAliasName() {
        return this.aliasName;
    }

    public String getTargetKeyId() {
        return this.targetKeyId;
    }

    public int hashCode() {
        return (((((getAliasName() == null ? 0 : getAliasName().hashCode()) + 31) * 31) + (getAliasArn() == null ? 0 : getAliasArn().hashCode())) * 31) + (getTargetKeyId() != null ? getTargetKeyId().hashCode() : 0);
    }

    public void setAliasArn(String str) {
        this.aliasArn = str;
    }

    public void setAliasName(String str) {
        this.aliasName = str;
    }

    public void setTargetKeyId(String str) {
        this.targetKeyId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getAliasName() != null) {
            sb2.append("AliasName: " + getAliasName() + ",");
        }
        if (getAliasArn() != null) {
            sb2.append("AliasArn: " + getAliasArn() + ",");
        }
        if (getTargetKeyId() != null) {
            sb2.append("TargetKeyId: " + getTargetKeyId());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public AliasListEntry withAliasArn(String str) {
        this.aliasArn = str;
        return this;
    }

    public AliasListEntry withAliasName(String str) {
        this.aliasName = str;
        return this;
    }

    public AliasListEntry withTargetKeyId(String str) {
        this.targetKeyId = str;
        return this;
    }
}
