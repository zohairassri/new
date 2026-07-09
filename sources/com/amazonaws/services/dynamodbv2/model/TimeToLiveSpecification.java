package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class TimeToLiveSpecification implements Serializable {
    private String attributeName;
    private Boolean enabled;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TimeToLiveSpecification)) {
            return false;
        }
        TimeToLiveSpecification timeToLiveSpecification = (TimeToLiveSpecification) obj;
        if ((timeToLiveSpecification.getEnabled() == null) ^ (getEnabled() == null)) {
            return false;
        }
        if (timeToLiveSpecification.getEnabled() != null && !timeToLiveSpecification.getEnabled().equals(getEnabled())) {
            return false;
        }
        if ((timeToLiveSpecification.getAttributeName() == null) ^ (getAttributeName() == null)) {
            return false;
        }
        return timeToLiveSpecification.getAttributeName() == null || timeToLiveSpecification.getAttributeName().equals(getAttributeName());
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return (((getEnabled() == null ? 0 : getEnabled().hashCode()) + 31) * 31) + (getAttributeName() != null ? getAttributeName().hashCode() : 0);
    }

    public Boolean isEnabled() {
        return this.enabled;
    }

    public void setAttributeName(String str) {
        this.attributeName = str;
    }

    public void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getEnabled() != null) {
            sb2.append("Enabled: " + getEnabled() + ",");
        }
        if (getAttributeName() != null) {
            sb2.append("AttributeName: " + getAttributeName());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public TimeToLiveSpecification withAttributeName(String str) {
        this.attributeName = str;
        return this;
    }

    public TimeToLiveSpecification withEnabled(Boolean bool) {
        this.enabled = bool;
        return this;
    }
}
