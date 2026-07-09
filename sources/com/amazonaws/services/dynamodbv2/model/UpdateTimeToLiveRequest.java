package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class UpdateTimeToLiveRequest extends AmazonWebServiceRequest implements Serializable {
    private String tableName;
    private TimeToLiveSpecification timeToLiveSpecification;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateTimeToLiveRequest)) {
            return false;
        }
        UpdateTimeToLiveRequest updateTimeToLiveRequest = (UpdateTimeToLiveRequest) obj;
        if ((updateTimeToLiveRequest.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (updateTimeToLiveRequest.getTableName() != null && !updateTimeToLiveRequest.getTableName().equals(getTableName())) {
            return false;
        }
        if ((updateTimeToLiveRequest.getTimeToLiveSpecification() == null) ^ (getTimeToLiveSpecification() == null)) {
            return false;
        }
        return updateTimeToLiveRequest.getTimeToLiveSpecification() == null || updateTimeToLiveRequest.getTimeToLiveSpecification().equals(getTimeToLiveSpecification());
    }

    public String getTableName() {
        return this.tableName;
    }

    public TimeToLiveSpecification getTimeToLiveSpecification() {
        return this.timeToLiveSpecification;
    }

    public int hashCode() {
        return (((getTableName() == null ? 0 : getTableName().hashCode()) + 31) * 31) + (getTimeToLiveSpecification() != null ? getTimeToLiveSpecification().hashCode() : 0);
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public void setTimeToLiveSpecification(TimeToLiveSpecification timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getTableName() != null) {
            sb2.append("TableName: " + getTableName() + ",");
        }
        if (getTimeToLiveSpecification() != null) {
            sb2.append("TimeToLiveSpecification: " + getTimeToLiveSpecification());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public UpdateTimeToLiveRequest withTableName(String str) {
        this.tableName = str;
        return this;
    }

    public UpdateTimeToLiveRequest withTimeToLiveSpecification(TimeToLiveSpecification timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
        return this;
    }
}
