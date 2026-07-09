package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ListTablesRequest extends AmazonWebServiceRequest implements Serializable {
    private String exclusiveStartTableName;
    private Integer limit;

    public ListTablesRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTablesRequest)) {
            return false;
        }
        ListTablesRequest listTablesRequest = (ListTablesRequest) obj;
        if ((listTablesRequest.getExclusiveStartTableName() == null) ^ (getExclusiveStartTableName() == null)) {
            return false;
        }
        if (listTablesRequest.getExclusiveStartTableName() != null && !listTablesRequest.getExclusiveStartTableName().equals(getExclusiveStartTableName())) {
            return false;
        }
        if ((listTablesRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        return listTablesRequest.getLimit() == null || listTablesRequest.getLimit().equals(getLimit());
    }

    public String getExclusiveStartTableName() {
        return this.exclusiveStartTableName;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public int hashCode() {
        return (((getExclusiveStartTableName() == null ? 0 : getExclusiveStartTableName().hashCode()) + 31) * 31) + (getLimit() != null ? getLimit().hashCode() : 0);
    }

    public void setExclusiveStartTableName(String str) {
        this.exclusiveStartTableName = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getExclusiveStartTableName() != null) {
            sb2.append("ExclusiveStartTableName: " + getExclusiveStartTableName() + ",");
        }
        if (getLimit() != null) {
            sb2.append("Limit: " + getLimit());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ListTablesRequest withExclusiveStartTableName(String str) {
        this.exclusiveStartTableName = str;
        return this;
    }

    public ListTablesRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public ListTablesRequest(String str) {
        setExclusiveStartTableName(str);
    }

    public ListTablesRequest(String str, Integer num) {
        setExclusiveStartTableName(str);
        setLimit(num);
    }
}
