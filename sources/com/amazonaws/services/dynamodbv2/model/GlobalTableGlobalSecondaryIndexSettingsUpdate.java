package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class GlobalTableGlobalSecondaryIndexSettingsUpdate implements Serializable {
    private String indexName;
    private AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingSettingsUpdate;
    private Long provisionedWriteCapacityUnits;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GlobalTableGlobalSecondaryIndexSettingsUpdate)) {
            return false;
        }
        GlobalTableGlobalSecondaryIndexSettingsUpdate globalTableGlobalSecondaryIndexSettingsUpdate = (GlobalTableGlobalSecondaryIndexSettingsUpdate) obj;
        if ((globalTableGlobalSecondaryIndexSettingsUpdate.getIndexName() == null) ^ (getIndexName() == null)) {
            return false;
        }
        if (globalTableGlobalSecondaryIndexSettingsUpdate.getIndexName() != null && !globalTableGlobalSecondaryIndexSettingsUpdate.getIndexName().equals(getIndexName())) {
            return false;
        }
        if ((globalTableGlobalSecondaryIndexSettingsUpdate.getProvisionedWriteCapacityUnits() == null) ^ (getProvisionedWriteCapacityUnits() == null)) {
            return false;
        }
        if (globalTableGlobalSecondaryIndexSettingsUpdate.getProvisionedWriteCapacityUnits() != null && !globalTableGlobalSecondaryIndexSettingsUpdate.getProvisionedWriteCapacityUnits().equals(getProvisionedWriteCapacityUnits())) {
            return false;
        }
        if ((globalTableGlobalSecondaryIndexSettingsUpdate.getProvisionedWriteCapacityAutoScalingSettingsUpdate() == null) ^ (getProvisionedWriteCapacityAutoScalingSettingsUpdate() == null)) {
            return false;
        }
        return globalTableGlobalSecondaryIndexSettingsUpdate.getProvisionedWriteCapacityAutoScalingSettingsUpdate() == null || globalTableGlobalSecondaryIndexSettingsUpdate.getProvisionedWriteCapacityAutoScalingSettingsUpdate().equals(getProvisionedWriteCapacityAutoScalingSettingsUpdate());
    }

    public String getIndexName() {
        return this.indexName;
    }

    public AutoScalingSettingsUpdate getProvisionedWriteCapacityAutoScalingSettingsUpdate() {
        return this.provisionedWriteCapacityAutoScalingSettingsUpdate;
    }

    public Long getProvisionedWriteCapacityUnits() {
        return this.provisionedWriteCapacityUnits;
    }

    public int hashCode() {
        return (((((getIndexName() == null ? 0 : getIndexName().hashCode()) + 31) * 31) + (getProvisionedWriteCapacityUnits() == null ? 0 : getProvisionedWriteCapacityUnits().hashCode())) * 31) + (getProvisionedWriteCapacityAutoScalingSettingsUpdate() != null ? getProvisionedWriteCapacityAutoScalingSettingsUpdate().hashCode() : 0);
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    public void setProvisionedWriteCapacityAutoScalingSettingsUpdate(AutoScalingSettingsUpdate autoScalingSettingsUpdate) {
        this.provisionedWriteCapacityAutoScalingSettingsUpdate = autoScalingSettingsUpdate;
    }

    public void setProvisionedWriteCapacityUnits(Long l11) {
        this.provisionedWriteCapacityUnits = l11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getIndexName() != null) {
            sb2.append("IndexName: " + getIndexName() + ",");
        }
        if (getProvisionedWriteCapacityUnits() != null) {
            sb2.append("ProvisionedWriteCapacityUnits: " + getProvisionedWriteCapacityUnits() + ",");
        }
        if (getProvisionedWriteCapacityAutoScalingSettingsUpdate() != null) {
            sb2.append("ProvisionedWriteCapacityAutoScalingSettingsUpdate: " + getProvisionedWriteCapacityAutoScalingSettingsUpdate());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public GlobalTableGlobalSecondaryIndexSettingsUpdate withIndexName(String str) {
        this.indexName = str;
        return this;
    }

    public GlobalTableGlobalSecondaryIndexSettingsUpdate withProvisionedWriteCapacityAutoScalingSettingsUpdate(AutoScalingSettingsUpdate autoScalingSettingsUpdate) {
        this.provisionedWriteCapacityAutoScalingSettingsUpdate = autoScalingSettingsUpdate;
        return this;
    }

    public GlobalTableGlobalSecondaryIndexSettingsUpdate withProvisionedWriteCapacityUnits(Long l11) {
        this.provisionedWriteCapacityUnits = l11;
        return this;
    }
}
