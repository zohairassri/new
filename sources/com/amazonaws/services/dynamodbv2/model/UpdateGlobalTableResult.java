package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class UpdateGlobalTableResult implements Serializable {
    private GlobalTableDescription globalTableDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateGlobalTableResult)) {
            return false;
        }
        UpdateGlobalTableResult updateGlobalTableResult = (UpdateGlobalTableResult) obj;
        if ((updateGlobalTableResult.getGlobalTableDescription() == null) ^ (getGlobalTableDescription() == null)) {
            return false;
        }
        return updateGlobalTableResult.getGlobalTableDescription() == null || updateGlobalTableResult.getGlobalTableDescription().equals(getGlobalTableDescription());
    }

    public GlobalTableDescription getGlobalTableDescription() {
        return this.globalTableDescription;
    }

    public int hashCode() {
        return 31 + (getGlobalTableDescription() == null ? 0 : getGlobalTableDescription().hashCode());
    }

    public void setGlobalTableDescription(GlobalTableDescription globalTableDescription) {
        this.globalTableDescription = globalTableDescription;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getGlobalTableDescription() != null) {
            sb2.append("GlobalTableDescription: " + getGlobalTableDescription());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public UpdateGlobalTableResult withGlobalTableDescription(GlobalTableDescription globalTableDescription) {
        this.globalTableDescription = globalTableDescription;
        return this;
    }
}
