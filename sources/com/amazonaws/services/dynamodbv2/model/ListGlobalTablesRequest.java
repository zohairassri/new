package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ListGlobalTablesRequest extends AmazonWebServiceRequest implements Serializable {
    private String exclusiveStartGlobalTableName;
    private Integer limit;
    private String regionName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListGlobalTablesRequest)) {
            return false;
        }
        ListGlobalTablesRequest listGlobalTablesRequest = (ListGlobalTablesRequest) obj;
        if ((listGlobalTablesRequest.getExclusiveStartGlobalTableName() == null) ^ (getExclusiveStartGlobalTableName() == null)) {
            return false;
        }
        if (listGlobalTablesRequest.getExclusiveStartGlobalTableName() != null && !listGlobalTablesRequest.getExclusiveStartGlobalTableName().equals(getExclusiveStartGlobalTableName())) {
            return false;
        }
        if ((listGlobalTablesRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        if (listGlobalTablesRequest.getLimit() != null && !listGlobalTablesRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if ((listGlobalTablesRequest.getRegionName() == null) ^ (getRegionName() == null)) {
            return false;
        }
        return listGlobalTablesRequest.getRegionName() == null || listGlobalTablesRequest.getRegionName().equals(getRegionName());
    }

    public String getExclusiveStartGlobalTableName() {
        return this.exclusiveStartGlobalTableName;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public int hashCode() {
        return (((((getExclusiveStartGlobalTableName() == null ? 0 : getExclusiveStartGlobalTableName().hashCode()) + 31) * 31) + (getLimit() == null ? 0 : getLimit().hashCode())) * 31) + (getRegionName() != null ? getRegionName().hashCode() : 0);
    }

    public void setExclusiveStartGlobalTableName(String str) {
        this.exclusiveStartGlobalTableName = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setRegionName(String str) {
        this.regionName = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getExclusiveStartGlobalTableName() != null) {
            sb2.append("ExclusiveStartGlobalTableName: " + getExclusiveStartGlobalTableName() + ",");
        }
        if (getLimit() != null) {
            sb2.append("Limit: " + getLimit() + ",");
        }
        if (getRegionName() != null) {
            sb2.append("RegionName: " + getRegionName());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ListGlobalTablesRequest withExclusiveStartGlobalTableName(String str) {
        this.exclusiveStartGlobalTableName = str;
        return this;
    }

    public ListGlobalTablesRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public ListGlobalTablesRequest withRegionName(String str) {
        this.regionName = str;
        return this;
    }
}
