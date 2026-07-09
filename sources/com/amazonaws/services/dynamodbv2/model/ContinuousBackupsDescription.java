package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ContinuousBackupsDescription implements Serializable {
    private String continuousBackupsStatus;
    private PointInTimeRecoveryDescription pointInTimeRecoveryDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ContinuousBackupsDescription)) {
            return false;
        }
        ContinuousBackupsDescription continuousBackupsDescription = (ContinuousBackupsDescription) obj;
        if ((continuousBackupsDescription.getContinuousBackupsStatus() == null) ^ (getContinuousBackupsStatus() == null)) {
            return false;
        }
        if (continuousBackupsDescription.getContinuousBackupsStatus() != null && !continuousBackupsDescription.getContinuousBackupsStatus().equals(getContinuousBackupsStatus())) {
            return false;
        }
        if ((continuousBackupsDescription.getPointInTimeRecoveryDescription() == null) ^ (getPointInTimeRecoveryDescription() == null)) {
            return false;
        }
        return continuousBackupsDescription.getPointInTimeRecoveryDescription() == null || continuousBackupsDescription.getPointInTimeRecoveryDescription().equals(getPointInTimeRecoveryDescription());
    }

    public String getContinuousBackupsStatus() {
        return this.continuousBackupsStatus;
    }

    public PointInTimeRecoveryDescription getPointInTimeRecoveryDescription() {
        return this.pointInTimeRecoveryDescription;
    }

    public int hashCode() {
        return (((getContinuousBackupsStatus() == null ? 0 : getContinuousBackupsStatus().hashCode()) + 31) * 31) + (getPointInTimeRecoveryDescription() != null ? getPointInTimeRecoveryDescription().hashCode() : 0);
    }

    public void setContinuousBackupsStatus(String str) {
        this.continuousBackupsStatus = str;
    }

    public void setPointInTimeRecoveryDescription(PointInTimeRecoveryDescription pointInTimeRecoveryDescription) {
        this.pointInTimeRecoveryDescription = pointInTimeRecoveryDescription;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getContinuousBackupsStatus() != null) {
            sb2.append("ContinuousBackupsStatus: " + getContinuousBackupsStatus() + ",");
        }
        if (getPointInTimeRecoveryDescription() != null) {
            sb2.append("PointInTimeRecoveryDescription: " + getPointInTimeRecoveryDescription());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ContinuousBackupsDescription withContinuousBackupsStatus(String str) {
        this.continuousBackupsStatus = str;
        return this;
    }

    public ContinuousBackupsDescription withPointInTimeRecoveryDescription(PointInTimeRecoveryDescription pointInTimeRecoveryDescription) {
        this.pointInTimeRecoveryDescription = pointInTimeRecoveryDescription;
        return this;
    }

    public void setContinuousBackupsStatus(ContinuousBackupsStatus continuousBackupsStatus) {
        this.continuousBackupsStatus = continuousBackupsStatus.toString();
    }

    public ContinuousBackupsDescription withContinuousBackupsStatus(ContinuousBackupsStatus continuousBackupsStatus) {
        this.continuousBackupsStatus = continuousBackupsStatus.toString();
        return this;
    }
}
