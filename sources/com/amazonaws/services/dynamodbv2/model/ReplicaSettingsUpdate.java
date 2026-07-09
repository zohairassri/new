package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ReplicaSettingsUpdate implements Serializable {
    private String regionName;
    private List<ReplicaGlobalSecondaryIndexSettingsUpdate> replicaGlobalSecondaryIndexSettingsUpdate;
    private AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingSettingsUpdate;
    private Long replicaProvisionedReadCapacityUnits;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ReplicaSettingsUpdate)) {
            return false;
        }
        ReplicaSettingsUpdate replicaSettingsUpdate = (ReplicaSettingsUpdate) obj;
        if ((replicaSettingsUpdate.getRegionName() == null) ^ (getRegionName() == null)) {
            return false;
        }
        if (replicaSettingsUpdate.getRegionName() != null && !replicaSettingsUpdate.getRegionName().equals(getRegionName())) {
            return false;
        }
        if ((replicaSettingsUpdate.getReplicaProvisionedReadCapacityUnits() == null) ^ (getReplicaProvisionedReadCapacityUnits() == null)) {
            return false;
        }
        if (replicaSettingsUpdate.getReplicaProvisionedReadCapacityUnits() != null && !replicaSettingsUpdate.getReplicaProvisionedReadCapacityUnits().equals(getReplicaProvisionedReadCapacityUnits())) {
            return false;
        }
        if ((replicaSettingsUpdate.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() == null) ^ (getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() == null)) {
            return false;
        }
        if (replicaSettingsUpdate.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() != null && !replicaSettingsUpdate.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate().equals(getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate())) {
            return false;
        }
        if ((replicaSettingsUpdate.getReplicaGlobalSecondaryIndexSettingsUpdate() == null) ^ (getReplicaGlobalSecondaryIndexSettingsUpdate() == null)) {
            return false;
        }
        return replicaSettingsUpdate.getReplicaGlobalSecondaryIndexSettingsUpdate() == null || replicaSettingsUpdate.getReplicaGlobalSecondaryIndexSettingsUpdate().equals(getReplicaGlobalSecondaryIndexSettingsUpdate());
    }

    public String getRegionName() {
        return this.regionName;
    }

    public List<ReplicaGlobalSecondaryIndexSettingsUpdate> getReplicaGlobalSecondaryIndexSettingsUpdate() {
        return this.replicaGlobalSecondaryIndexSettingsUpdate;
    }

    public AutoScalingSettingsUpdate getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() {
        return this.replicaProvisionedReadCapacityAutoScalingSettingsUpdate;
    }

    public Long getReplicaProvisionedReadCapacityUnits() {
        return this.replicaProvisionedReadCapacityUnits;
    }

    public int hashCode() {
        return (((((((getRegionName() == null ? 0 : getRegionName().hashCode()) + 31) * 31) + (getReplicaProvisionedReadCapacityUnits() == null ? 0 : getReplicaProvisionedReadCapacityUnits().hashCode())) * 31) + (getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() == null ? 0 : getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate().hashCode())) * 31) + (getReplicaGlobalSecondaryIndexSettingsUpdate() != null ? getReplicaGlobalSecondaryIndexSettingsUpdate().hashCode() : 0);
    }

    public void setRegionName(String str) {
        this.regionName = str;
    }

    public void setReplicaGlobalSecondaryIndexSettingsUpdate(Collection<ReplicaGlobalSecondaryIndexSettingsUpdate> collection) {
        if (collection == null) {
            this.replicaGlobalSecondaryIndexSettingsUpdate = null;
        } else {
            this.replicaGlobalSecondaryIndexSettingsUpdate = new ArrayList(collection);
        }
    }

    public void setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(AutoScalingSettingsUpdate autoScalingSettingsUpdate) {
        this.replicaProvisionedReadCapacityAutoScalingSettingsUpdate = autoScalingSettingsUpdate;
    }

    public void setReplicaProvisionedReadCapacityUnits(Long l11) {
        this.replicaProvisionedReadCapacityUnits = l11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getRegionName() != null) {
            sb2.append("RegionName: " + getRegionName() + ",");
        }
        if (getReplicaProvisionedReadCapacityUnits() != null) {
            sb2.append("ReplicaProvisionedReadCapacityUnits: " + getReplicaProvisionedReadCapacityUnits() + ",");
        }
        if (getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() != null) {
            sb2.append("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: " + getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() + ",");
        }
        if (getReplicaGlobalSecondaryIndexSettingsUpdate() != null) {
            sb2.append("ReplicaGlobalSecondaryIndexSettingsUpdate: " + getReplicaGlobalSecondaryIndexSettingsUpdate());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ReplicaSettingsUpdate withRegionName(String str) {
        this.regionName = str;
        return this;
    }

    public ReplicaSettingsUpdate withReplicaGlobalSecondaryIndexSettingsUpdate(ReplicaGlobalSecondaryIndexSettingsUpdate... replicaGlobalSecondaryIndexSettingsUpdateArr) {
        if (getReplicaGlobalSecondaryIndexSettingsUpdate() == null) {
            this.replicaGlobalSecondaryIndexSettingsUpdate = new ArrayList(replicaGlobalSecondaryIndexSettingsUpdateArr.length);
        }
        for (ReplicaGlobalSecondaryIndexSettingsUpdate replicaGlobalSecondaryIndexSettingsUpdate : replicaGlobalSecondaryIndexSettingsUpdateArr) {
            this.replicaGlobalSecondaryIndexSettingsUpdate.add(replicaGlobalSecondaryIndexSettingsUpdate);
        }
        return this;
    }

    public ReplicaSettingsUpdate withReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(AutoScalingSettingsUpdate autoScalingSettingsUpdate) {
        this.replicaProvisionedReadCapacityAutoScalingSettingsUpdate = autoScalingSettingsUpdate;
        return this;
    }

    public ReplicaSettingsUpdate withReplicaProvisionedReadCapacityUnits(Long l11) {
        this.replicaProvisionedReadCapacityUnits = l11;
        return this;
    }

    public ReplicaSettingsUpdate withReplicaGlobalSecondaryIndexSettingsUpdate(Collection<ReplicaGlobalSecondaryIndexSettingsUpdate> collection) {
        setReplicaGlobalSecondaryIndexSettingsUpdate(collection);
        return this;
    }
}
