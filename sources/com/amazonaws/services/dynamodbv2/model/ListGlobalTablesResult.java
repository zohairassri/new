package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ListGlobalTablesResult implements Serializable {
    private List<GlobalTable> globalTables;
    private String lastEvaluatedGlobalTableName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListGlobalTablesResult)) {
            return false;
        }
        ListGlobalTablesResult listGlobalTablesResult = (ListGlobalTablesResult) obj;
        if ((listGlobalTablesResult.getGlobalTables() == null) ^ (getGlobalTables() == null)) {
            return false;
        }
        if (listGlobalTablesResult.getGlobalTables() != null && !listGlobalTablesResult.getGlobalTables().equals(getGlobalTables())) {
            return false;
        }
        if ((listGlobalTablesResult.getLastEvaluatedGlobalTableName() == null) ^ (getLastEvaluatedGlobalTableName() == null)) {
            return false;
        }
        return listGlobalTablesResult.getLastEvaluatedGlobalTableName() == null || listGlobalTablesResult.getLastEvaluatedGlobalTableName().equals(getLastEvaluatedGlobalTableName());
    }

    public List<GlobalTable> getGlobalTables() {
        return this.globalTables;
    }

    public String getLastEvaluatedGlobalTableName() {
        return this.lastEvaluatedGlobalTableName;
    }

    public int hashCode() {
        return (((getGlobalTables() == null ? 0 : getGlobalTables().hashCode()) + 31) * 31) + (getLastEvaluatedGlobalTableName() != null ? getLastEvaluatedGlobalTableName().hashCode() : 0);
    }

    public void setGlobalTables(Collection<GlobalTable> collection) {
        if (collection == null) {
            this.globalTables = null;
        } else {
            this.globalTables = new ArrayList(collection);
        }
    }

    public void setLastEvaluatedGlobalTableName(String str) {
        this.lastEvaluatedGlobalTableName = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getGlobalTables() != null) {
            sb2.append("GlobalTables: " + getGlobalTables() + ",");
        }
        if (getLastEvaluatedGlobalTableName() != null) {
            sb2.append("LastEvaluatedGlobalTableName: " + getLastEvaluatedGlobalTableName());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ListGlobalTablesResult withGlobalTables(GlobalTable... globalTableArr) {
        if (getGlobalTables() == null) {
            this.globalTables = new ArrayList(globalTableArr.length);
        }
        for (GlobalTable globalTable : globalTableArr) {
            this.globalTables.add(globalTable);
        }
        return this;
    }

    public ListGlobalTablesResult withLastEvaluatedGlobalTableName(String str) {
        this.lastEvaluatedGlobalTableName = str;
        return this;
    }

    public ListGlobalTablesResult withGlobalTables(Collection<GlobalTable> collection) {
        setGlobalTables(collection);
        return this;
    }
}
