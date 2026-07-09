package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class UpdateGlobalSecondaryIndexAction implements Serializable {
    private String indexName;
    private ProvisionedThroughput provisionedThroughput;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateGlobalSecondaryIndexAction)) {
            return false;
        }
        UpdateGlobalSecondaryIndexAction updateGlobalSecondaryIndexAction = (UpdateGlobalSecondaryIndexAction) obj;
        if ((updateGlobalSecondaryIndexAction.getIndexName() == null) ^ (getIndexName() == null)) {
            return false;
        }
        if (updateGlobalSecondaryIndexAction.getIndexName() != null && !updateGlobalSecondaryIndexAction.getIndexName().equals(getIndexName())) {
            return false;
        }
        if ((updateGlobalSecondaryIndexAction.getProvisionedThroughput() == null) ^ (getProvisionedThroughput() == null)) {
            return false;
        }
        return updateGlobalSecondaryIndexAction.getProvisionedThroughput() == null || updateGlobalSecondaryIndexAction.getProvisionedThroughput().equals(getProvisionedThroughput());
    }

    public String getIndexName() {
        return this.indexName;
    }

    public ProvisionedThroughput getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    public int hashCode() {
        return (((getIndexName() == null ? 0 : getIndexName().hashCode()) + 31) * 31) + (getProvisionedThroughput() != null ? getProvisionedThroughput().hashCode() : 0);
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getIndexName() != null) {
            sb2.append("IndexName: " + getIndexName() + ",");
        }
        if (getProvisionedThroughput() != null) {
            sb2.append("ProvisionedThroughput: " + getProvisionedThroughput());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public UpdateGlobalSecondaryIndexAction withIndexName(String str) {
        this.indexName = str;
        return this;
    }

    public UpdateGlobalSecondaryIndexAction withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }
}
