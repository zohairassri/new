package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ReplicaGlobalSecondaryIndexSettingsDescription implements Serializable {
    private String indexName;
    private String indexStatus;
    private AutoScalingSettingsDescription provisionedReadCapacityAutoScalingSettings;
    private Long provisionedReadCapacityUnits;
    private AutoScalingSettingsDescription provisionedWriteCapacityAutoScalingSettings;
    private Long provisionedWriteCapacityUnits;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ReplicaGlobalSecondaryIndexSettingsDescription)) {
            return false;
        }
        ReplicaGlobalSecondaryIndexSettingsDescription replicaGlobalSecondaryIndexSettingsDescription = (ReplicaGlobalSecondaryIndexSettingsDescription) obj;
        if ((replicaGlobalSecondaryIndexSettingsDescription.getIndexName() == null) ^ (getIndexName() == null)) {
            return false;
        }
        if (replicaGlobalSecondaryIndexSettingsDescription.getIndexName() != null && !replicaGlobalSecondaryIndexSettingsDescription.getIndexName().equals(getIndexName())) {
            return false;
        }
        if ((replicaGlobalSecondaryIndexSettingsDescription.getIndexStatus() == null) ^ (getIndexStatus() == null)) {
            return false;
        }
        if (replicaGlobalSecondaryIndexSettingsDescription.getIndexStatus() != null && !replicaGlobalSecondaryIndexSettingsDescription.getIndexStatus().equals(getIndexStatus())) {
            return false;
        }
        if ((replicaGlobalSecondaryIndexSettingsDescription.getProvisionedReadCapacityUnits() == null) ^ (getProvisionedReadCapacityUnits() == null)) {
            return false;
        }
        if (replicaGlobalSecondaryIndexSettingsDescription.getProvisionedReadCapacityUnits() != null && !replicaGlobalSecondaryIndexSettingsDescription.getProvisionedReadCapacityUnits().equals(getProvisionedReadCapacityUnits())) {
            return false;
        }
        if ((replicaGlobalSecondaryIndexSettingsDescription.getProvisionedReadCapacityAutoScalingSettings() == null) ^ (getProvisionedReadCapacityAutoScalingSettings() == null)) {
            return false;
        }
        if (replicaGlobalSecondaryIndexSettingsDescription.getProvisionedReadCapacityAutoScalingSettings() != null && !replicaGlobalSecondaryIndexSettingsDescription.getProvisionedReadCapacityAutoScalingSettings().equals(getProvisionedReadCapacityAutoScalingSettings())) {
            return false;
        }
        if ((replicaGlobalSecondaryIndexSettingsDescription.getProvisionedWriteCapacityUnits() == null) ^ (getProvisionedWriteCapacityUnits() == null)) {
            return false;
        }
        if (replicaGlobalSecondaryIndexSettingsDescription.getProvisionedWriteCapacityUnits() != null && !replicaGlobalSecondaryIndexSettingsDescription.getProvisionedWriteCapacityUnits().equals(getProvisionedWriteCapacityUnits())) {
            return false;
        }
        if ((replicaGlobalSecondaryIndexSettingsDescription.getProvisionedWriteCapacityAutoScalingSettings() == null) ^ (getProvisionedWriteCapacityAutoScalingSettings() == null)) {
            return false;
        }
        return replicaGlobalSecondaryIndexSettingsDescription.getProvisionedWriteCapacityAutoScalingSettings() == null || replicaGlobalSecondaryIndexSettingsDescription.getProvisionedWriteCapacityAutoScalingSettings().equals(getProvisionedWriteCapacityAutoScalingSettings());
    }

    public String getIndexName() {
        return this.indexName;
    }

    public String getIndexStatus() {
        return this.indexStatus;
    }

    public AutoScalingSettingsDescription getProvisionedReadCapacityAutoScalingSettings() {
        return this.provisionedReadCapacityAutoScalingSettings;
    }

    public Long getProvisionedReadCapacityUnits() {
        return this.provisionedReadCapacityUnits;
    }

    public AutoScalingSettingsDescription getProvisionedWriteCapacityAutoScalingSettings() {
        return this.provisionedWriteCapacityAutoScalingSettings;
    }

    public Long getProvisionedWriteCapacityUnits() {
        return this.provisionedWriteCapacityUnits;
    }

    public int hashCode() {
        return (((((((((((getIndexName() == null ? 0 : getIndexName().hashCode()) + 31) * 31) + (getIndexStatus() == null ? 0 : getIndexStatus().hashCode())) * 31) + (getProvisionedReadCapacityUnits() == null ? 0 : getProvisionedReadCapacityUnits().hashCode())) * 31) + (getProvisionedReadCapacityAutoScalingSettings() == null ? 0 : getProvisionedReadCapacityAutoScalingSettings().hashCode())) * 31) + (getProvisionedWriteCapacityUnits() == null ? 0 : getProvisionedWriteCapacityUnits().hashCode())) * 31) + (getProvisionedWriteCapacityAutoScalingSettings() != null ? getProvisionedWriteCapacityAutoScalingSettings().hashCode() : 0);
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    public void setIndexStatus(String str) {
        this.indexStatus = str;
    }

    public void setProvisionedReadCapacityAutoScalingSettings(AutoScalingSettingsDescription autoScalingSettingsDescription) {
        this.provisionedReadCapacityAutoScalingSettings = autoScalingSettingsDescription;
    }

    public void setProvisionedReadCapacityUnits(Long l11) {
        this.provisionedReadCapacityUnits = l11;
    }

    public void setProvisionedWriteCapacityAutoScalingSettings(AutoScalingSettingsDescription autoScalingSettingsDescription) {
        this.provisionedWriteCapacityAutoScalingSettings = autoScalingSettingsDescription;
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
        if (getIndexStatus() != null) {
            sb2.append("IndexStatus: " + getIndexStatus() + ",");
        }
        if (getProvisionedReadCapacityUnits() != null) {
            sb2.append("ProvisionedReadCapacityUnits: " + getProvisionedReadCapacityUnits() + ",");
        }
        if (getProvisionedReadCapacityAutoScalingSettings() != null) {
            sb2.append("ProvisionedReadCapacityAutoScalingSettings: " + getProvisionedReadCapacityAutoScalingSettings() + ",");
        }
        if (getProvisionedWriteCapacityUnits() != null) {
            sb2.append("ProvisionedWriteCapacityUnits: " + getProvisionedWriteCapacityUnits() + ",");
        }
        if (getProvisionedWriteCapacityAutoScalingSettings() != null) {
            sb2.append("ProvisionedWriteCapacityAutoScalingSettings: " + getProvisionedWriteCapacityAutoScalingSettings());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ReplicaGlobalSecondaryIndexSettingsDescription withIndexName(String str) {
        this.indexName = str;
        return this;
    }

    public ReplicaGlobalSecondaryIndexSettingsDescription withIndexStatus(String str) {
        this.indexStatus = str;
        return this;
    }

    public ReplicaGlobalSecondaryIndexSettingsDescription withProvisionedReadCapacityAutoScalingSettings(AutoScalingSettingsDescription autoScalingSettingsDescription) {
        this.provisionedReadCapacityAutoScalingSettings = autoScalingSettingsDescription;
        return this;
    }

    public ReplicaGlobalSecondaryIndexSettingsDescription withProvisionedReadCapacityUnits(Long l11) {
        this.provisionedReadCapacityUnits = l11;
        return this;
    }

    public ReplicaGlobalSecondaryIndexSettingsDescription withProvisionedWriteCapacityAutoScalingSettings(AutoScalingSettingsDescription autoScalingSettingsDescription) {
        this.provisionedWriteCapacityAutoScalingSettings = autoScalingSettingsDescription;
        return this;
    }

    public ReplicaGlobalSecondaryIndexSettingsDescription withProvisionedWriteCapacityUnits(Long l11) {
        this.provisionedWriteCapacityUnits = l11;
        return this;
    }

    public void setIndexStatus(IndexStatus indexStatus) {
        this.indexStatus = indexStatus.toString();
    }

    public ReplicaGlobalSecondaryIndexSettingsDescription withIndexStatus(IndexStatus indexStatus) {
        this.indexStatus = indexStatus.toString();
        return this;
    }
}
