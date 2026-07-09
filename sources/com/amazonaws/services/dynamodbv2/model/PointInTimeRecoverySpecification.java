package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class PointInTimeRecoverySpecification implements Serializable {
    private Boolean pointInTimeRecoveryEnabled;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PointInTimeRecoverySpecification)) {
            return false;
        }
        PointInTimeRecoverySpecification pointInTimeRecoverySpecification = (PointInTimeRecoverySpecification) obj;
        if ((pointInTimeRecoverySpecification.getPointInTimeRecoveryEnabled() == null) ^ (getPointInTimeRecoveryEnabled() == null)) {
            return false;
        }
        return pointInTimeRecoverySpecification.getPointInTimeRecoveryEnabled() == null || pointInTimeRecoverySpecification.getPointInTimeRecoveryEnabled().equals(getPointInTimeRecoveryEnabled());
    }

    public Boolean getPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled;
    }

    public int hashCode() {
        return 31 + (getPointInTimeRecoveryEnabled() == null ? 0 : getPointInTimeRecoveryEnabled().hashCode());
    }

    public Boolean isPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled;
    }

    public void setPointInTimeRecoveryEnabled(Boolean bool) {
        this.pointInTimeRecoveryEnabled = bool;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getPointInTimeRecoveryEnabled() != null) {
            sb2.append("PointInTimeRecoveryEnabled: " + getPointInTimeRecoveryEnabled());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public PointInTimeRecoverySpecification withPointInTimeRecoveryEnabled(Boolean bool) {
        this.pointInTimeRecoveryEnabled = bool;
        return this;
    }
}
