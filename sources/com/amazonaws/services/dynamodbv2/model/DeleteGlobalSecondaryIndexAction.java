package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DeleteGlobalSecondaryIndexAction implements Serializable {
    private String indexName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteGlobalSecondaryIndexAction)) {
            return false;
        }
        DeleteGlobalSecondaryIndexAction deleteGlobalSecondaryIndexAction = (DeleteGlobalSecondaryIndexAction) obj;
        if ((deleteGlobalSecondaryIndexAction.getIndexName() == null) ^ (getIndexName() == null)) {
            return false;
        }
        return deleteGlobalSecondaryIndexAction.getIndexName() == null || deleteGlobalSecondaryIndexAction.getIndexName().equals(getIndexName());
    }

    public String getIndexName() {
        return this.indexName;
    }

    public int hashCode() {
        return 31 + (getIndexName() == null ? 0 : getIndexName().hashCode());
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getIndexName() != null) {
            sb2.append("IndexName: " + getIndexName());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public DeleteGlobalSecondaryIndexAction withIndexName(String str) {
        this.indexName = str;
        return this;
    }
}
