package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DescribeContinuousBackupsRequest extends AmazonWebServiceRequest implements Serializable {
    private String tableName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeContinuousBackupsRequest)) {
            return false;
        }
        DescribeContinuousBackupsRequest describeContinuousBackupsRequest = (DescribeContinuousBackupsRequest) obj;
        if ((describeContinuousBackupsRequest.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        return describeContinuousBackupsRequest.getTableName() == null || describeContinuousBackupsRequest.getTableName().equals(getTableName());
    }

    public String getTableName() {
        return this.tableName;
    }

    public int hashCode() {
        return 31 + (getTableName() == null ? 0 : getTableName().hashCode());
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getTableName() != null) {
            sb2.append("TableName: " + getTableName());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public DescribeContinuousBackupsRequest withTableName(String str) {
        this.tableName = str;
        return this;
    }
}
