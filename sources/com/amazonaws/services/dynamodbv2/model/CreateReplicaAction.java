package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class CreateReplicaAction implements Serializable {
    private String regionName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateReplicaAction)) {
            return false;
        }
        CreateReplicaAction createReplicaAction = (CreateReplicaAction) obj;
        if ((createReplicaAction.getRegionName() == null) ^ (getRegionName() == null)) {
            return false;
        }
        return createReplicaAction.getRegionName() == null || createReplicaAction.getRegionName().equals(getRegionName());
    }

    public String getRegionName() {
        return this.regionName;
    }

    public int hashCode() {
        return 31 + (getRegionName() == null ? 0 : getRegionName().hashCode());
    }

    public void setRegionName(String str) {
        this.regionName = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getRegionName() != null) {
            sb2.append("RegionName: " + getRegionName());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public CreateReplicaAction withRegionName(String str) {
        this.regionName = str;
        return this;
    }
}
