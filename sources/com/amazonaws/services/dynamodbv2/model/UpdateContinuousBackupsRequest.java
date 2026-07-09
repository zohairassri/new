package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class UpdateContinuousBackupsRequest extends AmazonWebServiceRequest implements Serializable {
    private PointInTimeRecoverySpecification pointInTimeRecoverySpecification;
    private String tableName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateContinuousBackupsRequest)) {
            return false;
        }
        UpdateContinuousBackupsRequest updateContinuousBackupsRequest = (UpdateContinuousBackupsRequest) obj;
        if ((updateContinuousBackupsRequest.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (updateContinuousBackupsRequest.getTableName() != null && !updateContinuousBackupsRequest.getTableName().equals(getTableName())) {
            return false;
        }
        if ((updateContinuousBackupsRequest.getPointInTimeRecoverySpecification() == null) ^ (getPointInTimeRecoverySpecification() == null)) {
            return false;
        }
        return updateContinuousBackupsRequest.getPointInTimeRecoverySpecification() == null || updateContinuousBackupsRequest.getPointInTimeRecoverySpecification().equals(getPointInTimeRecoverySpecification());
    }

    public PointInTimeRecoverySpecification getPointInTimeRecoverySpecification() {
        return this.pointInTimeRecoverySpecification;
    }

    public String getTableName() {
        return this.tableName;
    }

    public int hashCode() {
        return (((getTableName() == null ? 0 : getTableName().hashCode()) + 31) * 31) + (getPointInTimeRecoverySpecification() != null ? getPointInTimeRecoverySpecification().hashCode() : 0);
    }

    public void setPointInTimeRecoverySpecification(PointInTimeRecoverySpecification pointInTimeRecoverySpecification) {
        this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getTableName() != null) {
            sb2.append("TableName: " + getTableName() + ",");
        }
        if (getPointInTimeRecoverySpecification() != null) {
            sb2.append("PointInTimeRecoverySpecification: " + getPointInTimeRecoverySpecification());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public UpdateContinuousBackupsRequest withPointInTimeRecoverySpecification(PointInTimeRecoverySpecification pointInTimeRecoverySpecification) {
        this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
        return this;
    }

    public UpdateContinuousBackupsRequest withTableName(String str) {
        this.tableName = str;
        return this;
    }
}
