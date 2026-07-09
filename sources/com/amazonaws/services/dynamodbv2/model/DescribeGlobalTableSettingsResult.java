package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DescribeGlobalTableSettingsResult implements Serializable {
    private String globalTableName;
    private List<ReplicaSettingsDescription> replicaSettings;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeGlobalTableSettingsResult)) {
            return false;
        }
        DescribeGlobalTableSettingsResult describeGlobalTableSettingsResult = (DescribeGlobalTableSettingsResult) obj;
        if ((describeGlobalTableSettingsResult.getGlobalTableName() == null) ^ (getGlobalTableName() == null)) {
            return false;
        }
        if (describeGlobalTableSettingsResult.getGlobalTableName() != null && !describeGlobalTableSettingsResult.getGlobalTableName().equals(getGlobalTableName())) {
            return false;
        }
        if ((describeGlobalTableSettingsResult.getReplicaSettings() == null) ^ (getReplicaSettings() == null)) {
            return false;
        }
        return describeGlobalTableSettingsResult.getReplicaSettings() == null || describeGlobalTableSettingsResult.getReplicaSettings().equals(getReplicaSettings());
    }

    public String getGlobalTableName() {
        return this.globalTableName;
    }

    public List<ReplicaSettingsDescription> getReplicaSettings() {
        return this.replicaSettings;
    }

    public int hashCode() {
        return (((getGlobalTableName() == null ? 0 : getGlobalTableName().hashCode()) + 31) * 31) + (getReplicaSettings() != null ? getReplicaSettings().hashCode() : 0);
    }

    public void setGlobalTableName(String str) {
        this.globalTableName = str;
    }

    public void setReplicaSettings(Collection<ReplicaSettingsDescription> collection) {
        if (collection == null) {
            this.replicaSettings = null;
        } else {
            this.replicaSettings = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getGlobalTableName() != null) {
            sb2.append("GlobalTableName: " + getGlobalTableName() + ",");
        }
        if (getReplicaSettings() != null) {
            sb2.append("ReplicaSettings: " + getReplicaSettings());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public DescribeGlobalTableSettingsResult withGlobalTableName(String str) {
        this.globalTableName = str;
        return this;
    }

    public DescribeGlobalTableSettingsResult withReplicaSettings(ReplicaSettingsDescription... replicaSettingsDescriptionArr) {
        if (getReplicaSettings() == null) {
            this.replicaSettings = new ArrayList(replicaSettingsDescriptionArr.length);
        }
        for (ReplicaSettingsDescription replicaSettingsDescription : replicaSettingsDescriptionArr) {
            this.replicaSettings.add(replicaSettingsDescription);
        }
        return this;
    }

    public DescribeGlobalTableSettingsResult withReplicaSettings(Collection<ReplicaSettingsDescription> collection) {
        setReplicaSettings(collection);
        return this;
    }
}
