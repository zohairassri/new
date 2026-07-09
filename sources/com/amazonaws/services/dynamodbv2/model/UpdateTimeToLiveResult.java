package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class UpdateTimeToLiveResult implements Serializable {
    private TimeToLiveSpecification timeToLiveSpecification;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateTimeToLiveResult)) {
            return false;
        }
        UpdateTimeToLiveResult updateTimeToLiveResult = (UpdateTimeToLiveResult) obj;
        if ((updateTimeToLiveResult.getTimeToLiveSpecification() == null) ^ (getTimeToLiveSpecification() == null)) {
            return false;
        }
        return updateTimeToLiveResult.getTimeToLiveSpecification() == null || updateTimeToLiveResult.getTimeToLiveSpecification().equals(getTimeToLiveSpecification());
    }

    public TimeToLiveSpecification getTimeToLiveSpecification() {
        return this.timeToLiveSpecification;
    }

    public int hashCode() {
        return 31 + (getTimeToLiveSpecification() == null ? 0 : getTimeToLiveSpecification().hashCode());
    }

    public void setTimeToLiveSpecification(TimeToLiveSpecification timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getTimeToLiveSpecification() != null) {
            sb2.append("TimeToLiveSpecification: " + getTimeToLiveSpecification());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public UpdateTimeToLiveResult withTimeToLiveSpecification(TimeToLiveSpecification timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
        return this;
    }
}
